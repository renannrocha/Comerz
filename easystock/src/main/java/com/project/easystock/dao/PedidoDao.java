package com.project.easystock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.project.easystock.model.Pedido;
import com.project.easystock.utils.PostgresSQLConnectionUtil;

public class PedidoDao {
	public boolean criarTabelaPedidos() {
	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "CREATE TABLE IF NOT EXISTS pedidos (" +
	                "id SERIAL PRIMARY KEY," +
	                "idCliente INTEGER NOT NULL," +
	                "idProduto INTEGER NOT NULL," +
	                "dataPedido DATE NOT NULL," +
	                "dataEntregaEstimada DATE NOT NULL," +
	                "dataEntregaReal DATE," +
	                "quantidade INTEGER NOT NULL," +
	                "statusPedido VARCHAR(255) NOT NULL," +
	                "precoUnitario DECIMAL NOT NULL," +
	                "totalPedido DECIMAL NOT NULL," +
	                "enderecoEntrega VARCHAR(255) NOT NULL," +
	                "custoEnvio DECIMAL NOT NULL," +
	                "statusPagamento VARCHAR(255) NOT NULL," +
	                "metodoEnvio VARCHAR(255) NOT NULL," +
	                "codigoRastreio VARCHAR(255) NOT NULL" +
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

	public List<Pedido> listarPedidos() {
	    List<Pedido> pedidos = new ArrayList<>();

	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "SELECT * FROM pedidos";

	        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {

	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                while (resultSet.next()) {
	                    Pedido pedido = new Pedido(
	                        resultSet.getInt("id"),
	                        resultSet.getInt("idCliente"),
	                        resultSet.getInt("idProduto"),
	                        resultSet.getDate("dataPedido"),
	                        resultSet.getDate("dataEntregaEstimada"),
	                        resultSet.getDate("dataEntregaReal"),
	                        resultSet.getInt("quantidade"),
	                        resultSet.getString("statusPedido"),
	                        resultSet.getDouble("precoUnitario"),
	                        resultSet.getDouble("totalPedido"),
	                        resultSet.getString("enderecoEntrega"),
	                        resultSet.getDouble("custoEnvio"),
	                        resultSet.getString("statusPagamento"),
	                        resultSet.getString("metodoEnvio"),
	                        resultSet.getString("codigoRastreio")
	                    );
	                    pedidos.add(pedido);
	                }
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return pedidos;
	}
}
