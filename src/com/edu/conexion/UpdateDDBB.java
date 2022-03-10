package com.edu.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateDDBB {

	public static void main(String[] args) {
		
		try {
			Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplos", "root", "");

			Statement myStatement = myConnection.createStatement();

			String SqlInstruction = "UPDATE datos SET Edad=3 WHERE Nombre='Sebastián'";
			
			int filaAfectada = myStatement.executeUpdate(SqlInstruction);
			
			System.out.println("Registro actualizado correctamente");
			System.out.println("Fila agregada " + filaAfectada);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
