/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hacknel
 */
public class dbConnection {
    
    public static Connection conn = null;
    
    public static Connection dbConexion(){
        String url = "jdbc:sqlserver://HACKNEL:1433;databaseName=agenciaCruceros";
        
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch(Exception ex){
            System.out.println("ERROR DE CONEXIÓN");
        }
        
        try{
           conn = DriverManager.getConnection(url, "sa", "15263");
        }catch(Exception ex){
            System.out.println("ERROR DE CONEXIÓN");
        }
        
        return conn;
    }
    
}
