package Clases.BuquesyViajesDisponibles;

import Clases.dbConnection;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ClsViajesDisponibles extends dbConnection {
     
    PreparedStatement ps;
    
    int idViaje, codBuque, codPuertoSalida, codDestino;
    String fechaPartida, fechaRegreso, estado, estadoIn;

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public int getCodBuque() {
        return codBuque;
    }

    public void setCodBuque(int codBuque) {
        this.codBuque = codBuque;
    }

    public int getCodPuertoSalida() {
        return codPuertoSalida;
    }

    public void setCodPuertoSalida(int codPuertoSalida) {
        this.codPuertoSalida = codPuertoSalida;
    }

    public int getCodDestino() {
        return codDestino;
    }

    public void setCodDestino(int codDestino) {
        this.codDestino = codDestino;
    }

    public String getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(String fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEstadoIn(String estadoIn) {
        this.estadoIn = estadoIn;
    }
    
    
    
    public boolean RegistrarViajeDisponible() {
        
        int resultado = 0;
            
            try {
            ps = dbConnection.dbConexion().prepareStatement("EXEC ?,?,?,?,?");
            ps.setInt(1, codBuque);
            ps.setInt(2, codPuertoSalida);
            ps.setInt(3, codDestino);
            ps.setString(4, fechaPartida);
            ps.setString(5, fechaRegreso);
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

    
    public boolean ActualizarViajeDisponible() {
        
        int resultado = 0;
            
            try {
            ps = dbConnection.dbConexion().prepareStatement("EXEC  ?,?,?,?,?,?");
            ps.setInt(1, idViaje);
            ps.setInt(2, codBuque);
            ps.setInt(3, codPuertoSalida);
            ps.setInt(4, codDestino);
            ps.setString(5, fechaPartida);
            ps.setString(6, fechaRegreso);
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
    
    public void llenarCombobox(JComboBox cmb) {
        
        int resultado = 0;
        /*
        try
        {
            ps = dbConnection.dbConexion().prepareStatement("SELECT b.[nombreBuque] FROM [dbo].[buques]b inner join [dbo].[viajesDisponibles]vd on vd.codigoBuque = b.codigoBuque");
            
            
        }catch{
            
        }
        */
            
        
        
    }
    
    public boolean EliminarViaje() {
        int resultado = 0;
        try {
            ps = dbConnection.dbConexion().prepareStatement("UPDATE [dbo].[viajesDisponibles] SET [estado] = ? WHERE [idViaje] = ?");
            ps.setString(1, estado);
            ps.setInt(2, idViaje);

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
    
    public boolean verificarEstadoIn() {
    
        if(estadoIn.equals("Disponible")){
            return true;
            
        }else{
            return false;
            
        }
        
    }
    
}
