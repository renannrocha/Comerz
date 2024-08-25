package com.project.easystock.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresSQLConnectionUtil {
	private static final String URL = "jdbc:postgresql://ep-restless-fog-18487980.us-east-2.aws.neon.tech/easystock";
	private static final String USUARIO = "renannrocha";
	private static final String SENHA = "MZw5rdmlc2Tu";
	
	public static Connection obterConexao() throws SQLException {
		try{
			Class.forName("org.postgresql.Driver");
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
			throw new SQLException("driver do PostgreSQL não encontrado");
		}
		return DriverManager.getConnection(URL, USUARIO, SENHA); 
	}
}
