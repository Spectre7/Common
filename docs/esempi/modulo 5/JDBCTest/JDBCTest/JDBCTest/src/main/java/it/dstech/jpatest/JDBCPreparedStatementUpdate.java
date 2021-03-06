package it.dstech.jpatest;

import it.dstech.jpatest.utility.DBUtilityConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCPreparedStatementUpdate {
	
	public static void main(String[] argv) throws Exception {

		try {

			updateRecordIntoTable();

		} catch (SQLException e) {

			System.err.println(e.getMessage());

		}

	}

	private static void updateRecordIntoTable() throws Exception {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String insertTableSQL = "UPDATE REGISTRATION SET" + " NOME = ?, COGNOME=?, ETA = ?" + " WHERE ID = ?";

		try {
			dbConnection = DBUtilityConnection.getDBConnection();
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);

			preparedStatement.setString(1, "antonio");
			preparedStatement.setString(2, "pallino");
			preparedStatement.setInt(3, 44);

			preparedStatement.setInt(4, 1);

			// execute insert SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record aggiornato nella tabella REGISTRATION!");

		} catch (SQLException e) {

			System.err.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}
}
