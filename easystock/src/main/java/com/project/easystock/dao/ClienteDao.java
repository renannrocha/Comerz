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
    
    public boolean inserirCliente(Cliente cliente) {
        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "INSERT INTO cliente (nome, tipo, endereco, cpfCnpj, contato, statusPedido, statusCliente) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setString(1, cliente.getNome());
                preparedStatement.setString(2, cliente.getTipo());
                preparedStatement.setString(3, cliente.getEndereco());
                preparedStatement.setString(4, cliente.getCpfCnpj());
                preparedStatement.setString(5, cliente.getContato());
                preparedStatement.setString(6, cliente.getStatusPedido());
                preparedStatement.setString(7, cliente.getStatusCliente());

                int linhasAfetadas = preparedStatement.executeUpdate();

                return linhasAfetadas > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Cliente> buscarClientes(Cliente cliente) {
        List<Cliente> clientes = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM cliente WHERE 1=1 ");

        if (cliente.getId() != 0) {
            sql.append("AND id = ").append(cliente.getId()).append(" ");
        }

        if (cliente.getNome() != null) {
            sql.append("AND nome = '").append(cliente.getNome()).append("' ");
        }

        if (cliente.getTipo() != null) {
            sql.append("AND tipo = '").append(cliente.getTipo()).append("' ");
        }

        if (cliente.getEndereco() != null) {
            sql.append("AND endereco = '").append(cliente.getEndereco()).append("' ");
        }

        if (cliente.getCpfCnpj() != null) {
            sql.append("AND cpfCnpj = '").append(cliente.getCpfCnpj()).append("' ");
        }

        if (cliente.getContato() != null) {
            sql.append("AND contato = '").append(cliente.getContato()).append("' ");
        }

        if (cliente.getStatusPedido() != null) {
            sql.append("AND statusPedido = '").append(cliente.getStatusPedido()).append("' ");
        }

        if (cliente.getStatusCliente() != null) {
            sql.append("AND statusCliente = '").append(cliente.getStatusCliente()).append("' ");
        }

        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao();
             PreparedStatement preparedStatement = conexao.prepareStatement(sql.toString())) {

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    Cliente clienteResultado = new Cliente(resultSet.getInt("id"), resultSet.getString("nome"),
                            resultSet.getString("tipo"), resultSet.getString("endereco"),
                            resultSet.getString("cpfCnpj"), resultSet.getString("contato"),
                            resultSet.getString("statusPedido"), resultSet.getString("statusCliente"));
                    clientes.add(clienteResultado);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }
    
    public boolean editarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET nome = ?, tipo = ?, endereco = ?, cpfCnpj = ?, contato = ?, statusPedido = ?, statusCliente = ? WHERE id = ?";

        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao();
             PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {

            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getTipo());
            preparedStatement.setString(3, cliente.getEndereco());
            preparedStatement.setString(4, cliente.getCpfCnpj());
            preparedStatement.setString(5, cliente.getContato());
            preparedStatement.setString(6, cliente.getStatusPedido());
            preparedStatement.setString(7, cliente.getStatusCliente());
            preparedStatement.setInt(8, cliente.getId());

            int linhasAfetadas = preparedStatement.executeUpdate();

            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean deletarCliente(int id) {
        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "DELETE FROM cliente WHERE id = ?";

            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setInt(1, id);

                int linhasAfetadas = preparedStatement.executeUpdate();

                return linhasAfetadas > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
