package com.edu.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ConsultaPreparadaSelectFrom {

	public static void main(String[] args) {
		try {
			Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplos", "root", "");

			// PreparedStatement myPreparedStatement = myConnection.prepareStatement("SELECT
			// * FROM datos WHERE Apellido_Paterno=? ");
			PreparedStatement myPreparedStatement = myConnection
					.prepareStatement("SELECT * FROM datos WHERE Apellido_Materno=? ");

			System.out.print("Introduzca el apellido a buscar: ");
			Scanner myScan = new Scanner(System.in);
			
			String apellido = myScan.nextLine();
			
			myPreparedStatement.setString(1, apellido);
			
			//myPreparedStatement.setString(1, "De la cruz");
			// myPreparedStatement.setString(2, "3");
			ResultSet myResultSet = myPreparedStatement.executeQuery();

			while (myResultSet.next()) {
				System.out.println("Nombre: " + myResultSet.getString(1) + " - " + " Apellido Paterno: "
						+ myResultSet.getString(2) + " - " + " Edad: " + myResultSet.getString(4));
			}
			
			myScan.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
