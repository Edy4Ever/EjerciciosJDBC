package com.edu.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertIntoDDBB {

	public static void main(String[] args) {
		try {
			Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplos", "root", "");

			Statement myStatement = myConnection.createStatement();

			String SqlInstruction = "INSERT INTO datos (Nombre,Apellido_Paterno,Apellido_Materno,Edad) VALUES('Eugenio','Derbez','Chavez',55)";
			
			int filaAfectada = myStatement.executeUpdate(SqlInstruction);
			
			System.out.println("Registro insertado correctamente");
			System.out.println("Fila agregada " + filaAfectada);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
