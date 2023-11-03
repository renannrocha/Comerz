package com.project.easystock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import com.project.easystock.model.Produto;
import com.project.easystock.utils.PostgresSQLConnectionUtil;

public class ProdutoDao {

	public boolean criarTabelaProdutos() {
		try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
			String sql = "CREATE TABLE IF NOT EXISTS Produtos (" + 
				    "id SERIAL PRIMARY KEY NOT NULL," + 
				    "nome VARCHAR(255) NOT NULL," + 
				    "categoria VARCHAR(255) NOT NULL," + 
				    "precoVenda DECIMAL(10, 2) NOT NULL," + 
				    "precoCusto DECIMAL(10, 2) NOT NULL," + 
				    "quantidadeEstoque INT NOT NULL," + 
				    "fornecedor VARCHAR(255) NOT NULL," + 
				    "dataEntrada DATE NOT NULL," + 
				    "localizacao VARCHAR(255) NOT NULL," + 
				    "codigoBarras VARCHAR(255) NOT NULL," + 
				    "peso DECIMAL(10, 2) NOT NULL," + 
				    "dimensoes VARCHAR(255) NOT NULL," + 
				    "statusProduto VARCHAR(255) NOT NULL," + 
				    "sku VARCHAR(255) NOT NULL," + 
				    "marca VARCHAR(255) NOT NULL" + 
				    ");";

			try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
				preparedStatement.executeUpdate();
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	// insert
	public boolean inserirProduto(Produto produto) {
	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "INSERT INTO Produtos (nome, categoria, precoVenda, precoCusto, quantidadeEstoque, fornecedor, dataEntrada, localizacaoArmazem, codigoBarras, peso, dimensoes, statusProduto, SKU, marca) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
	            preparedStatement.setString(1, produto.getNome());
	            preparedStatement.setString(2, produto.getCategoria());
	            preparedStatement.setDouble(3, produto.getPrecoVenda());
	            preparedStatement.setDouble(4, produto.getPrecoCusto());
	            preparedStatement.setInt(5, produto.getQuantidadeEstoque());
	            preparedStatement.setString(6, produto.getFornecedor());
	            preparedStatement.setDate(7, new java.sql.Date(produto.getDataEntrada().getTime()));
	            preparedStatement.setString(8, produto.getLocalizacao());
	            preparedStatement.setString(9, produto.getCodigoBarras());
	            preparedStatement.setDouble(10, produto.getPeso());
	            preparedStatement.setString(11, produto.getDimensoes());
	            preparedStatement.setString(12, produto.getStatusProduto());
	            preparedStatement.setString(13, produto.getSku());
	            preparedStatement.setString(14, produto.getMarca());

	            int linhasAfetadas = preparedStatement.executeUpdate();

	            return linhasAfetadas > 0;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	// busca por id
	public Produto buscarProdutoPorId(Long id) {
	    Produto produto = null;
	    String sql = "SELECT * FROM Produtos WHERE id = ?";

	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao();
	         PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
	        preparedStatement.setLong(1, id);

	        try (ResultSet resultSet = preparedStatement.executeQuery()) {
	            if (resultSet.next()) {
	                produto = new Produto(
	                    resultSet.getLong("id"),
	                    resultSet.getString("nome"),
	                    resultSet.getString("categoria"),
	                    resultSet.getDouble("precoVenda"),
	                    resultSet.getDouble("precoCusto"),
	                    resultSet.getInt("quantidadeEstoque"),
	                    resultSet.getString("fornecedor"),
	                    resultSet.getDate("data_entrada"),
	                    resultSet.getString("localizacao"),
	                    resultSet.getString("codigoBarras"),
	                    resultSet.getDouble("peso"),
	                    resultSet.getString("dimensoes"),
	                    resultSet.getString("statusProduto"),
	                    resultSet.getString("SKU"),
	                    resultSet.getString("marca")
	                );
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return produto;
	}

	// listar
	public List<Produto> listarProdutos() {
	    List<Produto> produtos = new ArrayList<>();

	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "SELECT * FROM Produtos";

	        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {

	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                while (resultSet.next()) {
	                    Produto produto = new Produto(
	                        resultSet.getLong("id"),
	                        resultSet.getString("nome"),
	                        resultSet.getString("categoria"),
	                        resultSet.getDouble("precoVenda"),
	                        resultSet.getDouble("precoCusto"),
	                        resultSet.getInt("quantidadeEstoque"),
	                        resultSet.getString("fornecedor"),
	                        resultSet.getDate("dataEntrada"),
	                        resultSet.getString("localizacao"),
	                        resultSet.getString("codigoBarras"),
	                        resultSet.getDouble("peso"),
	                        resultSet.getString("dimensoes"),
	                        resultSet.getString("statusProduto"),
	                        resultSet.getString("sku"),
	                        resultSet.getString("marca")
	                    );
	                    produtos.add(produto);
	                }
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return produtos;
	}
	
	// editar
	public boolean atualizarProduto(Produto produto) {
	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "UPDATE Produtos SET nome = ?, categoria = ?, preco_venda = ?, preco_custo = ?, quantidade_estoque = ?, fornecedor = ?, data_entrada = ?, localizacao_armazem = ?, codigo_barras = ?, peso = ?, dimensoes = ?, status_produto = ?, SKU = ?, marca = ? WHERE id = ?";

	        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
	            preparedStatement.setString(1, produto.getNome());
	            preparedStatement.setString(2, produto.getCategoria());
	            preparedStatement.setDouble(3, produto.getPrecoVenda());
	            preparedStatement.setDouble(4, produto.getPrecoCusto());
	            preparedStatement.setInt(5, produto.getQuantidadeEstoque());
	            preparedStatement.setString(6, produto.getFornecedor());
	            preparedStatement.setDate(7, new java.sql.Date(produto.getDataEntrada().getTime()));
	            preparedStatement.setString(8, produto.getLocalizacao());
	            preparedStatement.setString(9, produto.getCodigoBarras());
	            preparedStatement.setDouble(10, produto.getPeso());
	            preparedStatement.setString(11, produto.getDimensoes());
	            preparedStatement.setString(12, produto.getStatusProduto());
	            preparedStatement.setString(13, produto.getSku());
	            preparedStatement.setString(14, produto.getMarca());
	            preparedStatement.setLong(15, produto.getId());

	            int linhasAfetadas = preparedStatement.executeUpdate();

	            return linhasAfetadas > 0;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	// delete
	public boolean deletarProduto(Long id) {
	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "DELETE FROM Produtos WHERE id = ?";

	        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
	            preparedStatement.setLong(1, id);

	            int linhasAfetadas = preparedStatement.executeUpdate();

	            return linhasAfetadas > 0;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}

}