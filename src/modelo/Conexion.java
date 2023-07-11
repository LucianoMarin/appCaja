/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Luciano
 */
public class Conexion {

    String host = "jdbc:mysql://localhost:3306/sistemaventas?zeroDateTimeBehavior=convertToNull";
    String usuario = "root";
    String clave = "";

    public Connection CrearConexion() throws ClassNotFoundException, SQLException {
        Connection cn;
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection(host, usuario, clave);
        return cn;

    }

}
