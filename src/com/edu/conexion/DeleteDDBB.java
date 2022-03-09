package com.edu.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteDDBB {

	public static void main(String[] args) {
		
		try {
			Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplos", "root", "");

			Statement myStatement = myConnection.createStatement();

			String SqlInstruction = "DELETE FROM datos WHERE Nombre='Eugenio'";
			
			int filaAfectada = myStatement.executeUpdate(SqlInstruction);
			
			System.out.println("Registro eliminado correctamente");
			System.out.println("Fila eliminada " + filaAfectada);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
