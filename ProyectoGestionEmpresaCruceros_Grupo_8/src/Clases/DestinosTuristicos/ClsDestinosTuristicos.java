package Clases.DestinosTuristicos;

import Clases.dbConnection;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author edmej
 */
public class ClsDestinosTuristicos {
    
    
    protected static String Nombre_Destino;
    protected static String Descripcion;
    protected static String Estado;
    
    
    PreparedStatement ps;
    ResultSet result = null;

    public static String getNombre_Destino() {
        return Nombre_Destino;
    }

    public static void setNombre_Destino(String Nombre_Destino) {
        ClsDestinosTuristicos.Nombre_Destino = Nombre_Destino;
    }

    public static String getDescripcion() {
        return Descripcion;
    }

    public static void setDescripcion(String Descripcion) {
        ClsDestinosTuristicos.Descripcion = Descripcion;
    }

    public static String getEstado() {
        return Estado;
    }

    public static void setEstado(String Estado) {
        ClsDestinosTuristicos.Estado = Estado;
    }
    
    
    
    
    public boolean AgregarDestino()
    {
        
        int resultado = 0;
        
        try{
            
            ps = dbConnection.dbConexion().prepareStatement("Execute agregarDestino ?,?");
            
            ps.setString(1, Nombre_Destino);
            ps.setString(2, Estado);
            
            resultado = ps.executeUpdate();

            if (resultado > 0) 
            {
                return true;    
            } else 
            {
                return false;
            }
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
    }
    
    
    public boolean ActualizarDestino()
    {
        
        int resultado = 0;
        
        try{
            
            ps = dbConnection.dbConexion().prepareStatement("Execute modificarDestino ?, ?");
            
            ps.setString(1, Nombre_Destino);
            ps.setString(2, Estado);
            
            resultado = ps.executeUpdate();

            if (resultado > 0) 
            {
                return true;    
            } else 
            {
                return false;
            }
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
        
    }
    
    
    /*public boolean EliminarDestino()
    {
        
        int resultado = 0;
        
        try{
            
            ps = dbConnection.dbConexion().prepareStatement("Update destinosTuristicos set estado = 'Inactivo' Where nombreDestino = ?");
            
            ps.setString(2, Nombre_Destino);
            ps.setString(3, Descripcion);
            ps.setString(4, Estado);
            
            resultado = ps.executeUpdate();

            if (resultado > 0) 
            {
                return true;    
            } else 
            {
                return false;
            }
            
        }
        catch(SQLException ex)
        {
            
        }
        return false;
    }*/
    
    
}
