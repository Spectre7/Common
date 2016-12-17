package it.dstech.jpatest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.dstech.jpatest.utility.DBUtilityConnection;

public class JDBCPreparedStatementSelect {
	
	public static void main(String[] args) throws Exception {
		try {
			selectRecordIntoTable();
		} catch (SQLException e) {
			System.err.println(e.getMessage());

		}
	}

	public static void selectRecordIntoTable() throws Exception {
		Connection dbConnection = null;
		Statement Statement = null;
		String selectTableSQL = "SELECT* FROM REGISTRATION";
		try {
			dbConnection = DBUtilityConnection.getDBConnection();
			Statement = dbConnection.prepareStatement(selectTableSQL);

			ResultSet executeQuery = Statement.executeQuery(selectTableSQL);
			while (executeQuery.next()) {
				String nome = executeQuery.getString("NOME");
				String cognome = executeQuery.getString("COGNOME");
				int eta = executeQuery.getInt("ETA");
				int id = executeQuery.getInt("ID");

				System.out.println(id + " " + nome + " " + cognome + " " + eta + " ");
			}

		} catch (SQLException e) {

			System.err.println(e.getMessage());

		} finally {

			if (Statement != null) {
				Statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}
		}
	}
}
