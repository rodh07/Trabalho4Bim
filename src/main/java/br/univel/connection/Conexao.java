package br.univel.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {

		private static final String URL = "           ";
		private static final String USER = "        ";
		private static final String PASSWORD = "          ";

		public static Connection getConnection() throws SQLException{
			return DriverManager.getConnection(URL, USER, PASSWORD);
		}
		
	}
