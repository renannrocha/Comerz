package com.project.easystock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.project.easystock.utils.PostgresSQLConnectionUtil;
import com.project.easystock.model.Fornecedor;

public class FornecedorDao {

	public boolean criarTabelaFornecedor() {
		try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
        	String sql = "CREATE TABLE IF NOT EXISTS fornecedor (" +
                    "id SERIAL PRIMARY KEY," +
                    "nome VARCHAR(255) NOT NULL," +
                    "tipo VARCHAR(255) NOT NULL," +
                    "telefone VARCHAR(255) NOT NULL," +
                    "email VARCHAR(255) NOT NULL," +
                    "produtos VARCHAR(255) NOT NULL," +
                    "tempoEntrega VARCHAR(255) NOT NULL," +
                    "cnpj VARCHAR(255) NOT NULL," +
                    "metodoEnvio VARCHAR(255) NOT NULL" +
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

	public List<Fornecedor> listarFornecedores() {
	    List<Fornecedor> fornecedores = new ArrayList<>();
	
	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "SELECT * FROM Fornecedor";
	
	        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
	
	            try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                while (resultSet.next()) {
	                    Fornecedor fornecedor = new Fornecedor(
	                        resultSet.getInt("id"),
	                        resultSet.getString("nome"),
	                        resultSet.getString("tipo"),
	                        resultSet.getString("telefone"),
	                        resultSet.getString("email"),
	                        resultSet.getString("produtos"),
	                        resultSet.getString("tempoEntrega"),
	                        resultSet.getString("cnpj"),
	                        resultSet.getString("metodoEnvio")
	                    );
	                    fornecedores.add(fornecedor);
	                }
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	
	    return fornecedores;
	}
	
	public boolean inserirFornecedor(Fornecedor fornecedor) {
	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "INSERT INTO fornecedor (nome, tipo, telefone, email, produtos, tempoEntrega, cnpj, metodoEnvio) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

	        try (PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {
	            preparedStatement.setString(1, fornecedor.getNome());
	            preparedStatement.setString(2, fornecedor.getTipo());
	            preparedStatement.setString(3, fornecedor.getTelefone());
	            preparedStatement.setString(4, fornecedor.getEmail());
	            preparedStatement.setString(5, fornecedor.getProdutos());
	            preparedStatement.setString(6, fornecedor.getTempoEntrega());
	            preparedStatement.setString(7, fornecedor.getCnpj());
	            preparedStatement.setString(8, fornecedor.getMetodoEnvio());

	            int linhasAfetadas = preparedStatement.executeUpdate();

	            return linhasAfetadas > 0;
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public List<Fornecedor> buscarFornecedores(Fornecedor fornecedor) {
	    List<Fornecedor> fornecedores = new ArrayList<>();
	    StringBuilder sql = new StringBuilder("SELECT * FROM fornecedor WHERE 1=1 ");

	    if (fornecedor.getId() != 0) {
	        sql.append("AND id = ").append(fornecedor.getId()).append(" ");
	    }

	    if (fornecedor.getNome() != null) {
	        sql.append("AND nome = '").append(fornecedor.getNome()).append("' ");
	    }

	    if (fornecedor.getTipo() != null) {
	        sql.append("AND tipo = '").append(fornecedor.getTipo()).append("' ");
	    }

	    if (fornecedor.getTelefone() != null) {
	        sql.append("AND telefone = '").append(fornecedor.getTelefone()).append("' ");
	    }

	    if (fornecedor.getEmail() != null) {
	        sql.append("AND email = '").append(fornecedor.getEmail()).append("' ");
	    }

	    if (fornecedor.getProdutos() != null) {
	        sql.append("AND produtos = '").append(fornecedor.getProdutos()).append("' ");
	    }

	    if (fornecedor.getTempoEntrega() != null) {
	        sql.append("AND tempoEntrega = '").append(fornecedor.getTempoEntrega()).append("' ");
	    }

	    if (fornecedor.getCnpj() != null) {
	        sql.append("AND cnpj = '").append(fornecedor.getCnpj()).append("' ");
	    }

	    if (fornecedor.getMetodoEnvio() != null) {
	        sql.append("AND metodoEnvio = '").append(fornecedor.getMetodoEnvio()).append("' ");
	    }

	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao();
	         PreparedStatement preparedStatement = conexao.prepareStatement(sql.toString())) {

	        try (ResultSet resultSet = preparedStatement.executeQuery()) {
	            while (resultSet.next()) {
	                Fornecedor fornecedorResultado = new Fornecedor(resultSet.getInt("id"), resultSet.getString("nome"),
	                        resultSet.getString("tipo"), resultSet.getString("telefone"),
	                        resultSet.getString("email"), resultSet.getString("produtos"),
	                        resultSet.getString("tempoEntrega"), resultSet.getString("cnpj"),
	                        resultSet.getString("metodoEnvio"));
	                fornecedores.add(fornecedorResultado);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }

	    return fornecedores;
	}
	
	public boolean editarFornecedor(Fornecedor fornecedor) {
	    String sql = "UPDATE fornecedor SET nome = ?, tipo = ?, telefone = ?, email = ?, produtos = ?, tempoEntrega = ?, cnpj = ?, metodoEnvio = ? WHERE id = ?";

	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao();
	         PreparedStatement preparedStatement = conexao.prepareStatement(sql)) {

	        preparedStatement.setString(1, fornecedor.getNome());
	        preparedStatement.setString(2, fornecedor.getTipo());
	        preparedStatement.setString(3, fornecedor.getTelefone());
	        preparedStatement.setString(4, fornecedor.getEmail());
	        preparedStatement.setString(5, fornecedor.getProdutos());
	        preparedStatement.setString(6, fornecedor.getTempoEntrega());
	        preparedStatement.setString(7, fornecedor.getCnpj());
	        preparedStatement.setString(8, fornecedor.getMetodoEnvio());
	        preparedStatement.setInt(9, fornecedor.getId());

	        int linhasAfetadas = preparedStatement.executeUpdate();

	        return linhasAfetadas > 0;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public boolean deletarFornecedor(int id) {
	    try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
	        String sql = "DELETE FROM fornecedor WHERE id = ?";

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