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

}
