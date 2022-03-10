package com.edu.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsultaPreparadaSelectFrom {

	public static void main(String[] args) {
		try {
			Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplos", "root", "");

			// PreparedStatement myPreparedStatement = myConnection.prepareStatement("SELECT
			// * FROM datos WHERE Apellido_Paterno=? ");
			PreparedStatement myPreparedStatement = myConnection
					.prepareStatement("SELECT Nombre, Edad FROM datos WHERE Apellido_Paterno=? ");

			myPreparedStatement.setString(1, "De la cruz");
			// myPreparedStatement.setString(2, "3");
			ResultSet myResultSet = myPreparedStatement.executeQuery();

			while (myResultSet.next()) {
				System.out.println("Nombre: " + myResultSet.getString(1) + " - " + " Apellido Paterno: "
						+ myResultSet.getString(2) + " - " + " Edad: " + myResultSet.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
