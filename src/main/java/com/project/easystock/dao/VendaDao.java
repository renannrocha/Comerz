package com.project.easystock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.project.easystock.model.Venda;
import com.project.easystock.utils.PostgresSQLConnectionUtil;

public class VendaDao {
    public boolean criarTabelaVenda() {
        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "CREATE TABLE IF NOT EXISTS venda (" +
                    "id SERIAL PRIMARY KEY," +
                    "idProduto INTEGER NOT NULL," +
                    "idCliente INTEGER NOT NULL," +
                    "quantidade INTEGER NOT NULL," +
                    "precoUnitario DOUBLE PRECISION NOT NULL," +
                    "totalVenda DOUBLE PRECISION NOT NULL," +
                    "enderecoEntrega VARCHAR(255) NOT NULL," +
                    "statusPagamento VARCHAR(255) NOT NULL," +
                    "statusEntrega VARCHAR(255) NOT NULL," +
                    "custoEnvio DOUBLE PRECISION NOT NULL" +
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

    public List<Venda> listarVendas() {
        List<Venda> vendas = new ArrayList<>();

        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "SELECT * FROM venda";

            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        Venda venda = new Venda(
                            resultSet.getInt("id"),
                            resultSet.getInt("idProduto"),
                            resultSet.getInt("idCliente"),
                            resultSet.getInt("quantidade"),
                            resultSet.getDouble("precoUnitario"),
                            resultSet.getDouble("totalVenda"),
                            resultSet.getString("enderecoEntrega"),
                            resultSet.getString("statusPagamento"),
                            resultSet.getString("statusEntrega"),
                            resultSet.getDouble("custoEnvio")
                        );
                        vendas.add(venda);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vendas;
    }
    
    public boolean inserirVenda(Venda venda) {
        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "INSERT INTO venda (idCliente, idProduto, quantidade, statusEntrega, precoUnitario, totalVenda, enderecoEntrega, custoEnvio, statusPagamento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
                preparedStatement.setInt(1, venda.getIdCliente());
                preparedStatement.setInt(2, venda.getIdProduto());
                preparedStatement.setInt(3, venda.getQuantidade());
                preparedStatement.setString(4, venda.getStatusEntrega());
                preparedStatement.setDouble(5, venda.getPrecoUnitario());
                preparedStatement.setDouble(6, venda.getTotalVenda());
                preparedStatement.setString(7, venda.getEnderecoEntrega());
                preparedStatement.setDouble(8, venda.getCustoEnvio());
                preparedStatement.setString(9, venda.getStatusPagamento());

                int linhasAfetadas = preparedStatement.executeUpdate();

                return linhasAfetadas > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Venda> buscarVendas(Venda venda) {
        List<Venda> vendas = new ArrayList<>();
        StringBuilder sql = new StringBuilder("SELECT * FROM venda WHERE 1=1 ");

        if (venda.getId() != 0) {
            sql.append("AND id = ").append(venda.getId()).append(" ");
        }

        if (venda.getIdCliente() != 0) {
            sql.append("AND idCliente = ").append(venda.getIdCliente()).append(" ");
        }

        if (venda.getIdProduto() != 0) {
            sql.append("AND idProduto = ").append(venda.getIdProduto()).append(" ");
        }

        if (venda.getQuantidade() != 0) {
            sql.append("AND quantidade = ").append(venda.getQuantidade()).append(" ");
        }

        if (venda.getPrecoUnitario() != 0) {
            sql.append("AND precoUnitario = ").append(venda.getPrecoUnitario()).append(" ");
        }

        if (venda.getTotalVenda() != 0) {
            sql.append("AND totalVenda = ").append(venda.getTotalVenda()).append(" ");
        }

        if (venda.getEnderecoEntrega() != null) {
            sql.append("AND enderecoEntrega = '").append(venda.getEnderecoEntrega()).append("' ");
        }

        if (venda.getCustoEnvio() != 0) {
            sql.append("AND custoEnvio = ").append(venda.getCustoEnvio()).append(" ");
        }

        if (venda.getStatusPagamento() != null) {
            sql.append("AND statusPagamento = '").append(venda.getStatusPagamento()).append("' ");
        }

        if (venda.getStatusEntrega() != null) {
            sql.append("AND statusEntrega = '").append(venda.getStatusEntrega()).append("' ");
        }

        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao();
             PreparedStatement preparedStatement = conexao.prepareStatement(sql.toString())) {

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                	Venda vendaResultado = new Venda(
                		    resultSet.getInt("id"),
                		    resultSet.getInt("idProduto"),
                		    resultSet.getInt("idCliente"),
                		    resultSet.getInt("quantidade"),
                		    resultSet.getDouble("precoUnitario"),
                		    resultSet.getDouble("totalVenda"),
                		    resultSet.getString("enderecoEntrega"),
                		    resultSet.getString("statusPagamento"),
                		    resultSet.getString("statusEntrega"),
                		    resultSet.getDouble("custoEnvio")
                		);
                		vendas.add(vendaResultado);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vendas;
    }

    public boolean editarVenda(Venda venda) {
        String sql = "UPDATE venda SET idCliente = ?, idProduto = ?, quantidade = ?, statusEntrega = ?, precoUnitario = ?, totalVenda = ?, enderecoEntrega = ?, custoEnvio = ?, statusPagamento = ? WHERE id = ?";

        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao();
             PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {

            preparedStatement.setInt(1, venda.getIdCliente());
            preparedStatement.setInt(2, venda.getIdProduto());
            preparedStatement.setInt(3, venda.getQuantidade());
            preparedStatement.setString(4, venda.getStatusEntrega());
            preparedStatement.setDouble(5, venda.getPrecoUnitario());
            preparedStatement.setDouble(6, venda.getTotalVenda());
            preparedStatement.setString(7, venda.getEnderecoEntrega());
            preparedStatement.setDouble(8, venda.getCustoEnvio());
            preparedStatement.setString(9, venda.getStatusPagamento());
            preparedStatement.setInt(10, venda.getId());

            int linhasAfetadas = preparedStatement.executeUpdate();

            return linhasAfetadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean deletarVenda(int id) {
        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "DELETE FROM venda WHERE id = ?";

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