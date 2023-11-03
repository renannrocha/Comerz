package com.project.easystock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.project.easystock.model.Cliente;
import com.project.easystock.utils.PostgresSQLConnectionUtil;

public class ClienteDao {
	
	public boolean criarTabelaCliente() {
        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "CREATE TABLE IF NOT EXISTS cliente (" +
                    "id SERIAL PRIMARY KEY," +
                    "nome VARCHAR(255) NOT NULL," +
                    "tipo VARCHAR(255) NOT NULL," +
                    "endereco VARCHAR(255) NOT NULL," +
                    "cpfCnpj VARCHAR(255) NOT NULL," +
                    "contato VARCHAR(255) NOT NULL," +
                    "statusPedido VARCHAR(255) NOT NULL," +
                    "statusCliente VARCHAR(255) NOT NULL" +
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

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();

        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "SELECT * FROM Cliente";

            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Cliente cliente = new Cliente(
                            resultSet.getInt("id"),
                            resultSet.getString("nome"),
                            resultSet.getString("tipo"),
                            resultSet.getString("endereco"),
                            resultSet.getString("cpfCnpj"),
                            resultSet.getString("contato"),
                            resultSet.getString("statusPedido"),
                            resultSet.getString("statusCliente")
                        );
                        clientes.add(cliente);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }
}
