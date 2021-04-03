package Clases.BuquesyViajesDisponibles;

import Clases.dbConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClsBuques extends dbConnection {

    PreparedStatement ps;
    
    String nombreBuque, estado, estadoIn;
    int codigoBuque, numNivel, numCamarotes;
    
    public void setEstadoIn(String estadoIn) {
        this.estadoIn = estadoIn;
    }

    public String getNombreBuque() {
        return nombreBuque;
    }

    public void setNombreBuque(String nombreBuque) {
        this.nombreBuque = nombreBuque;
    }

    public int getNumNivel() {
        return numNivel;
    }

    public void setNumNivel(int numNivel) {
        this.numNivel = numNivel;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCodigoBuque() {
        return codigoBuque;
    }

    public void setCodigoBuque(int codigoBuque) {
        this.codigoBuque = codigoBuque;
    }
    
    
    public boolean RegistrarBuque() {
        
        int resultado = 0;
            
            try {
            ps = dbConnection.dbConexion().prepareStatement("EXEC PARegistroBuque ?,?,?,?");
            ps.setString(1, nombreBuque);
            ps.setInt(2, numCamarotes);
            ps.setInt(3, numNivel);
            ps.setString(4, estado);
            resultado = ps.executeUpdate();

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

            return false;
        }
    }
    
    public boolean ActualizarBuque() {
        
        int resultado = 0;
            
            try {
            ps = dbConnection.dbConexion().prepareStatement("EXEC PAActualizarBuque ?,?,?,?");
            ps.setInt(1, codigoBuque);
            ps.setString(2, nombreBuque);
            ps.setInt(3, numCamarotes);
            ps.setInt(4, numNivel);
            
            resultado = ps.executeUpdate();

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

            return false;
        }
        
    }
    
    public boolean EliminarBuque() {
        int resultado = 0;
        try {
            ps = dbConnection.dbConexion().prepareStatement("UPDATE [dbo].[buques] SET estado = ? WHERE [nombreBuque] = ?");
            ps.setString(1, estado);
            ps.setString(2, nombreBuque);

            resultado = ps.executeUpdate();

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

            return false;
        }
    }
    
    public boolean verificarEstadoAc() {
    
        if(estadoIn.equals("Activo")){
            return true;
            
        }else{
            return false;
            
        }
        
    }
    
    public boolean verificarEstadoInac() {
    
        if(estadoIn.equals("Inactivo")){
            return true;
            
        }else{
            return false;
        }
        
    }
    
}
