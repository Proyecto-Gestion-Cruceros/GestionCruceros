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

        int resultado;
        try {
            ps = dbConnection.dbConexion().prepareStatement("insert into puertosSalida(nombrePuerto,estado) values(?, ?)");
            ps.setString(1, NombrePuerto);
            ps.setString(2, "Activo");
                
            resultado = ps.executeUpdate();

            return resultado > 0;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

            return false;
        }

    }

    public boolean ActualizarPuertoSalida() {
        int resultado = 0;
        try {
            ps = dbConnection.dbConexion().prepareStatement("update puertosSalida set nombrePuerto = ? where [codigoPuerto] = ?");
            ps.setString(1, NombrePuerto);
            ps.setInt(2, CodigoPuerto);

            resultado = ps.executeUpdate();

            return resultado > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

            return false;
        }

    }
    
        public boolean EliminarPuertoSalida() {
        int resultado = 0;
        try {
            ps = dbConnection.dbConexion().prepareStatement("  UPDATE [agenciaCruceros].[dbo].[puertosSalida] set estado = 'Inactivo' where codigoPuerto = ?");
            ps.setInt(1, CodigoPuerto);

            resultado = ps.executeUpdate();

            return resultado > 0;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

            return false;
        }

    }
    

}
