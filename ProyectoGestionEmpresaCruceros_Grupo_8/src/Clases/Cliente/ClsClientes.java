package Clases.Cliente;

import Clases.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import Clases.Personas.ClsPersona;

/**
 *
 * @author edmej
 */
public class ClsClientes extends ClsPersona{
    
    PreparedStatement ps;
    ResultSet rs = null;
   
    
    @Override
    public boolean AgregarPersona()
    {
        
        int resultado = 0;
        
        try{
            
            ps = dbConnection.dbConexion().prepareStatement("Execute agregarCliente ?,?,?,?,?,?,?,?");
            ps.setString(1, Identidad);
            ps.setString(2, Nombres);
            ps.setString(3, Apellidos);
            ps.setString(4, Telefono);
            ps.setString(5, CorreoElectronico);
            ps.setString(6, fechaNacimiento);
            ps.setString(7, direccionCliente);
            ps.setString(8, Estado);
            
             resultado = ps.executeUpdate();
             
             if(resultado > 0)
             {
                 return true; 
             }
             else 
             {
                 return false;
             }
        }
        catch(SQLException ex){
            
            System.out.println(ex);
            
        }
        return false;
        
    }
    
    @Override
    public boolean ActualizarPersona()
    {
        
        int resultado = 0;
        
        try{
            
            ps = dbConnection.dbConexion().prepareStatement("Execute modificarCliente ?,?,?,?,?,?,?,?");
            ps.setString(1, Identidad);
            ps.setString(2, Nombres);
            ps.setString(3, Apellidos);
            ps.setString(4, Telefono);
            ps.setString(5, CorreoElectronico);
            ps.setString(6, fechaNacimiento);
            ps.setString(7, direccionCliente);
            ps.setString(8, Estado);
            
             resultado = ps.executeUpdate();
             
             if(resultado > 0)
             {
                 return true; 
             }
             else 
             {
                 return false;
             }
        }
        catch(SQLException ex){
            
            System.out.println(ex);
            
        }
        return false;
        
    }
    
    @Override
    public boolean EliminarPersona()
    {
        
        int resultado = 0;
        
        try{
            
            ps = dbConnection.dbConexion().prepareStatement("Execute eliminarCliente ?");
            
            ps.setString(1, Identidad);
            
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
            System.out.println(ex);
        }
        return false;
    }

}
