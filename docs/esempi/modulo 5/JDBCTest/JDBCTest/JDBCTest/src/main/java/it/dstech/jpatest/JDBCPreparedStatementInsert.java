package it.dstech.jpatest;

import it.dstech.jpatest.utility.DBUtilityConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCPreparedStatementInsert {

	public static void main(String[] argv) throws Exception {

		try {

			insertRecordIntoTable();

		} catch (SQLException e) {

			System.err.println(e.getMessage());

		}

	}

	private static void insertRecordIntoTable() throws Exception {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String insertTableSQL = "INSERT INTO REGISTRATION" + "(ID, NOME, COGNOME, ETA) VALUES" + "(default,?,?,?)";

		try {
			dbConnection = DBUtilityConnection.getDBConnection();
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);

			preparedStatement.setString(1, "filippo");
			preparedStatement.setString(2, "anticoli");
			preparedStatement.setInt(3, 19);

			// execute insert SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record inserito nella tabella REGISTRATION!");

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
