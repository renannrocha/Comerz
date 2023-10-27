package com.project.easystock.dao;

import com.project.easystock.model.Usuario;
import com.project.easystock.utils.PostgresSQLConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class UsuarioDao{
	
	public boolean criarTabelaUsuario() {
        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "CREATE TABLE IF NOT EXISTS usuario (" +
                    "id SERIAL PRIMARY KEY," +
                    "nome VARCHAR(255) NOT NULL," +
                    "email VARCHAR(255) NOT NULL," +
                    "senha VARCHAR(255) NOT NULL" +
                    ")";

            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public boolean inserirUsuario(Usuario usuario) {
        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "INSERT INTO usuario (nome, email, senha) VALUES (?, ?, ?)";

            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, usuario.getNome());
                preparedStatement.setString(2, usuario.getEmail());
                preparedStatement.setString(3, usuario.getSenha());

                int linhasAfetadas = preparedStatement.executeUpdate();

                return linhasAfetadas > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
	
	public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "SELECT id, nome, email, senha FROM usuario";

            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Long id = resultSet.getLong("id");
                        String nome = resultSet.getString("nome");
                        String email = resultSet.getString("email");
                        String senha = resultSet.getString("senha");

                        Usuario usuario = new Usuario(id, nome, email, senha);
                        usuarios.add(usuario);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }
	
	public boolean validarUsuarioPorEmail(Usuario usuario) {
        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "SELECT 1 FROM usuario WHERE email = ? AND senha = ? ";

            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, usuario.getEmail());
                preparedStatement.setString(2, usuario.getSenha());

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next(); // Retorna true se encontrou um usu�rio com o email especificado.
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
