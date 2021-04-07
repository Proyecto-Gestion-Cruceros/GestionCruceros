
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class dbConnection {
    
    public static Connection conn = null;
    
    public static Connection dbConexion(){
        String url = "jdbc:sqlserver://DESKTOP-2KKKGON:1433;databaseName=agenciaCruceros";
        
        try{
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        
        try{
           conn = DriverManager.getConnection(url, "sa", "1234");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }  
        return conn;
    }
    
    public void llenarJCombobox(JComboBox Jcmb, String instruccion, String campo){
        
    }
    
    public void llenarJTable(JTable tabla, String instruccion){
        
    }
    
}
