package Clases.PuertosSalida;

import Clases.dbConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class clsPuertosSalidas {

    PreparedStatement ps;
    ResultSet result = null;

    protected static String NombrePuerto;
    protected static int CodigoPuerto;

    public static String getNombrePuerto() {
        return NombrePuerto;
    }

    public static void setNombrePuerto(String NombrePuerto) {
        clsPuertosSalidas.NombrePuerto = NombrePuerto;
    }

    public static int getCodigoPuerto() {
        return CodigoPuerto;
    }

    public static void setCodigoPuerto(int CodigoPuerto) {
        clsPuertosSalidas.CodigoPuerto = CodigoPuerto;
    }

    public boolean AgregarPuertoSalida() {
        
        int resultado = 0;
        try {
            ps = dbConnection.dbConexion().prepareStatement("insert into puertosSalida(nombrePuerto,estado) values(?, 1)");
            ps.setString(1, NombrePuerto);

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
    /*
        public boolean AgregarPuertoSalida() {
        
        int resultado = 0;
        try {
            ps = dbConnection.dbConexion().prepareStatement("insert into puertosSalida(nombrePuerto,estado) values(?, 1)");
            ps.setString(1, NombrePuerto);

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
    */
    
    public boolean ActualizarPuertoSalida() {
        int resultado = 0;
        try {
            ps = dbConnection.dbConexion().prepareStatement("update puertosSalida set nombrePuerto = ? where [codigoPuerto] = ?");
            ps.setString(1, NombrePuerto);
            ps.setInt(2, CodigoPuerto);
          
            resultado = ps.executeUpdate();

            if (resultado > 0) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

            return false;
        }

    }
    


}
