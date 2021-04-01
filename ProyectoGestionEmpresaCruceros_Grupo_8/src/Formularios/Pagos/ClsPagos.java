package Formularios.Pagos;

import Clases.dbConnection;
import FormulariosCrucero.clsVariablesViaje;
import java.sql.*;

/**
 *
 * @author Hacknel
 */
public class ClsPagos {
    
    clsVariablesViaje variablesViaje = new clsVariablesViaje();
    
    private double subtotal;
    private double isv;
    private double descuento;
    private double propina;
    private double total;
    
    PreparedStatement ps;
    private double precioCamarote;
    private double edadCliente;
    
    
    /*private void obtenerDatos(){
        try {
            //Obtener precio del camarote
            ps = dbConnection.dbConexion().prepareStatement("SELECT precioCamarote pc FROM [dbo].[camarotes] WHERE codigoCamarote = ?");
            ps.setInt(1, variablesViaje.getNumeroCamarote());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                precioCamarote = rs.getInt("pc");
            }
            rs = null;
            
            //Obtiene la de edad del cliente
            ps = dbConnection.dbConexion().prepareStatement("SELECT DATEDIFF(YEAR, fechaNacimiento, GETDATE())edad FROM clientes WHERE identidadCliente = ?");
            ps.setString(1, );
            rs = ps.executeQuery();
            
            if(rs.next()){
                precioCamarote = rs.getInt("pc");
            }
            
        } catch (SQLException e) {
            System.out.println("");
        }
    }
    
    public double calcSubTotal(int numeroCamarote, int, double cantPersonas){
        
        subtotal = 
        
        return subtotal;
    }*/
    
}
