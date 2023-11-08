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
	
	public boolean inserirPedido(Pedido pedido) {
	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "INSERT INTO pedidos (idCliente, idProduto, quantidade, statusPedido, precoUnitario, totalPedido, enderecoEntrega, custoEnvio, statusPagamento, metodoEnvio, codigoRastreio) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
	            preparedStatement.setInt(1, pedido.getIdCliente());
	            preparedStatement.setInt(2, pedido.getIdProduto());
	            preparedStatement.setInt(3, pedido.getQuantidade());
	            preparedStatement.setString(4, pedido.getStatusPedido());
	            preparedStatement.setDouble(5, pedido.getPrecoUnitario());
	            preparedStatement.setDouble(6, pedido.getTotalPedido());
	            preparedStatement.setString(7, pedido.getEnderecoEntrega());
	            preparedStatement.setDouble(8, pedido.getCustoEnvio());
	            preparedStatement.setString(9, pedido.getStatusPagamento());
	            preparedStatement.setString(10, pedido.getMetodoEnvio());
	            preparedStatement.setString(11, pedido.getCodigoRastreio());

	            int linhasAfetadas = preparedStatement.executeUpdate();

	            return linhasAfetadas > 0;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public List<Pedido> buscarPedidos(Pedido pedido) {
	    List<Pedido> pedidos = new ArrayList<>();
	    StringBuilder sql = new StringBuilder("SELECT * FROM pedidos WHERE 1=1 ");

	    if (pedido.getId() != 0) {
	        sql.append("AND id = ").append(pedido.getId()).append(" ");
	    }

	    if (pedido.getIdCliente() != 0) {
	        sql.append("AND idCliente = ").append(pedido.getIdCliente()).append(" ");
	    }

	    if (pedido.getIdProduto() != 0) {
	        sql.append("AND idProduto = ").append(pedido.getIdProduto()).append(" ");
	    }

	    if (pedido.getQuantidade() != 0) {
	        sql.append("AND quantidade = ").append(pedido.getQuantidade()).append(" ");
	    }

	    if (pedido.getStatusPedido() != null) {
	        sql.append("AND statusPedido = '").append(pedido.getStatusPedido()).append("' ");
	    }

	    // Adicione mais campos conforme necessário...

	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao();
	         PreparedStatement preparedStatement = conexao.prepareStatement(sql.toString())) {

	        try (ResultSet resultSet = preparedStatement.executeQuery()) {
	            while (resultSet.next()) {
	                Pedido pedidoResultado = new Pedido(resultSet.getInt("id"), resultSet.getInt("idCliente"),
	                        resultSet.getInt("idProduto"), resultSet.getInt("quantidade"),
	                        resultSet.getString("statusPedido"), resultSet.getDouble("precoUnitario"),
	                        resultSet.getDouble("totalPedido"), resultSet.getString("enderecoEntrega"),
	                        resultSet.getDouble("custoEnvio"), resultSet.getString("statusPagamento"),
	                        resultSet.getString("metodoEnvio"), resultSet.getString("codigoRastreio"));
	                pedidos.add(pedidoResultado);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return pedidos;
	}
	
	public boolean editarPedido(Pedido pedido) {
	    String sql = "UPDATE pedidos SET idCliente = ?, idProduto = ?, quantidade = ?, statusPedido = ?, precoUnitario = ?, totalPedido = ?, enderecoEntrega = ?, custoEnvio = ?, statusPagamento = ?, metodoEnvio = ?, codigoRastreio = ? WHERE id = ?";

	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao();
	         PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {

	        preparedStatement.setInt(1, pedido.getIdCliente());
	        preparedStatement.setInt(2, pedido.getIdProduto());
	        preparedStatement.setInt(3, pedido.getQuantidade());
	        preparedStatement.setString(4, pedido.getStatusPedido());
	        preparedStatement.setDouble(5, pedido.getPrecoUnitario());
	        preparedStatement.setDouble(6, pedido.getTotalPedido());
	        preparedStatement.setString(7, pedido.getEnderecoEntrega());
	        preparedStatement.setDouble(8, pedido.getCustoEnvio());
	        preparedStatement.setString(9, pedido.getStatusPagamento());
	        preparedStatement.setString(10, pedido.getMetodoEnvio());
	        preparedStatement.setString(11, pedido.getCodigoRastreio());
	        preparedStatement.setInt(12, pedido.getId());

	        int linhasAfetadas = preparedStatement.executeUpdate();

	        return linhasAfetadas > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public boolean deletarPedido(int id) {
	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "DELETE FROM pedidos WHERE id = ?";

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
