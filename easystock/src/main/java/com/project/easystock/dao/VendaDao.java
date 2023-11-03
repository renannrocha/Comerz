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
                    "dataVenda TIMESTAMP NOT NULL," +
                    "enderecoEntrega VARCHAR(255) NOT NULL," +
                    "dataEntregaEstimada TIMESTAMP," +
                    "dataEntregaExata TIMESTAMP," +
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
            String sql = "SELECT * FROM Venda";

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
                            resultSet.getTimestamp("dataVenda"),
                            resultSet.getString("enderecoEntrega"),
                            resultSet.getTimestamp("dataEntregaEstimada"),
                            resultSet.getTimestamp("dataEntregaExata"),
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
}