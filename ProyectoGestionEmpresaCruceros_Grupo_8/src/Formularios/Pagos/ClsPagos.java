package Formularios.Pagos;

import Clases.dbConnection;
import FormulariosCrucero.clsVariablesViaje;
import FormulariosCrucero.frmSeleccionClientes;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hacknel
 */
public class ClsPagos {
    
    clsVariablesViaje variablesViaje = new clsVariablesViaje();
    
    private double subtotal;
    private double impuestoPortuario;
    private double isv;
    private double descuento;
    private double propina;
    private double total;
    
    private PreparedStatement ps;
    private PreparedStatement ps2;
    private PreparedStatement ps3;
    private double precioCamarote;
    private int edadCliente;

    public double getPrecioCamarote() {
        return precioCamarote;
    }

    public int getEdadCliente() {
        return edadCliente;
    }
    
    
    protected void obtenerDatosClase(String identidadC){
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
            ps.setString(1, identidadC);
            rs = ps.executeQuery();
            
            if(rs.next()){
                edadCliente = rs.getInt("edad");
            }
            
        } catch (SQLException e) {
            System.out.println("");
        }
    }
    
    protected double calcSubTotal(){
        subtotal = precioCamarote * variablesViaje.getNumeroPersonas();
        return subtotal;
    }
    
    protected double calcImpuestoPortuario(){
        
        impuestoPortuario = subtotal * 0.05;
        
        return impuestoPortuario;
    }
    
    protected double calcISV(){
        isv = subtotal * 0.07;
        return isv;
    }
    
    protected double calcDescuento(){
        if(edadCliente > 60){
            descuento = subtotal * 0.25;
        }
        else{
            descuento = 0;
        }
        return descuento;
    }
    
    protected double calcPropina(){
        propina = subtotal * 0.1;
        return propina;
    }
    
    protected double calcTotal(){
        total = (subtotal + impuestoPortuario + isv + propina) - descuento;
        return total;
    }
    
    protected boolean insertarViajeBD(int cFactura, String identC, String identEmp, int cBuque, int idViaje, int cCamarote) {
        boolean isComplete = false;
        try {
            ps = dbConnection.dbConexion().prepareStatement("INSERT INTO facturaFinal VALUES (GETDATE(), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, identC);
            ps.setString(2, identEmp);
            ps.setInt(3, cBuque);
            ps.setInt(4, idViaje);
            ps.setInt(5, cCamarote);
            ps.setDouble(6, subtotal);
            ps.setDouble(7, impuestoPortuario);
            ps.setDouble(8, isv);
            ps.setDouble(9, descuento);
            ps.setDouble(10, propina);
            ps.setDouble(11, total);
            
            ps3 = dbConnection.dbConexion().prepareStatement("UPDATE camarotes SET estadoCamarote = 'Ocupado' WHERE codigoCamarote = ? AND codigoBuque = ?");
            ps3.setInt(1, cCamarote);
            ps3.setInt(2, cBuque);
            
            if (ps.executeUpdate() == 1 && ps3.executeUpdate() == 1) {
                for (int i = 0; i < frmSeleccionClientes.model1.getRowCount(); i++) 
                {
                    ps2 = dbConnection.dbConexion().prepareStatement("INSERT INTO detalleClientes VALUES (?, ?)");
                    ps2.setInt(1, cFactura);
                    ps2.setString(2, frmSeleccionClientes.model1.getValueAt(i, 0).toString());
                    if (ps2.executeUpdate() == 1) 
                    {
                        isComplete = true;
                    }
                }
                if (isComplete) 
                {
                    return true;
                } 
                else 
                {
                    return false;
                }
            } 
            else 
            {
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("Error de insercion de viaje " + ex.getMessage());
            return false;
        }

    }
    
}
