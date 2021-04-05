
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
//import javax.sql.DataSource;

public class dbConnection {
    
    public static Connection conn = null;
    //public DataSource dataSoorce;
    
    public static Connection dbConexion(){
        String url = "jdbc:sqlserver://DESKTOP-7MB4NES;databaseName=agenciaCruceros";
        
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
        try{
           conn = DriverManager.getConnection(url, "sa", "12345");
          //  JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }  
        return conn;
    }
    
}
