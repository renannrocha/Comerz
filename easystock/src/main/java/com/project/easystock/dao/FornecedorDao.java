package com.project.easystock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project.easystock.utils.PostgresSQLConnectionUtil;

public class FornecedorDao {
	public boolean criarTabelaFornecedor() {
        try (Connection conexao = PostgresSQLConnectionUtil.obterConexao()) {
            String sql = "CREATE TABLE IF NOT EXISTS fornecedor (" +
                    "id SERIAL PRIMARY KEY," +
                    "nome VARCHAR(255) NOT NULL," +
                    "tipo VARCHAR(255) NOT NULL," +
                    "contato VARCHAR(255) NOT NULL," +
                    "email VARCHAR(255) NOT NULL," +
                    "endereco VARCHAR(255) NOT NULL," +
                    "produtos VARCHAR(255) NOT NULL," +
                    "tpentrega TIMESTAMP NOT NULL," +
                    "CNPJ VARCHAR(255) NOT NULL" +
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
}
