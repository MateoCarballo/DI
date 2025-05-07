/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pruebas_jasper;

/**
 *
 * @author mateo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Pruebas_Jasper {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hospitaldb"; //Usar aqui el nombre de la database
        String usuario = "root";
        String contraseña = "abc123.";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contraseña)) {
            System.out.println("Conexion exitosa!");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos:");
        }
    }
}
