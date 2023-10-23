package com.inmueblescompany.conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase para la conexion a la base de datos
 * @author Marce
 */
public class ConexionMySql {
    Connection conn;
    /**
     * MySQL: com.mysql.jdbc.Driver	
     * Connection String: jdbc:mysql://hostname:port/databaseName
     */
    public ConexionMySql(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           String connectionString = "jdbc:mysql://sql5.freesqldatabase.com:3306/sql5526733";
           String username = "sql5526733";
           String pwd = "TUB38jg62w";
           conn=DriverManager.getConnection(connectionString, username, pwd);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error en ConexionMySql" );
            System.err.println(e.getMessage());
            //e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }
    
    
}