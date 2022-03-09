package com.edu.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionJavaJdbc {
	{
		try {
			Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplos", "root", "");

			Statement myStatement = myConnection.createStatement();

			ResultSet myResultSet = myStatement.executeQuery("SELECT * FROM datos");

			while (myResultSet.next()) {
				System.out.println("Nombre: " + myResultSet.getString(1) + " - " + " Edad: "+ myResultSet.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
