package Clases.Personas;

import Clases.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class clsUsuarios extends ClsPersona {

    PreparedStatement ps;
    ResultSet result = null;
    Icon icon = new ImageIcon(getClass().getResource("/Resources/Error.png"));

    @Override
    public boolean AgregarPersona() {

        int resultado = 0;
        try {
            ps = dbConnection.dbConexion().prepareStatement("execute ActualizarAgregarUsuario ?,?,?,?,?,?,?,?");
            ps.setInt(1, 1);
            ps.setString(2, Identidad);
            ps.setString(3, Nombres);
            ps.setString(4, Apellidos);
            ps.setString(5, Telefono);
            ps.setString(6, CorreoElectronico);
            ps.setInt(7, Cargo);
            ps.setString(8, Contrasenia);

            resultado = ps.executeUpdate();

            return resultado > 0;

        } catch (SQLException ex) {

            return false;
        }

    }

    @Override
    public boolean ActualizarPersona() {

        int resultado = 0;
        try {
            ps = dbConnection.dbConexion().prepareStatement("execute ActualizarAgregarUsuario ?,?,?,?,?,?,?,?");
            ps.setInt(1, 2);
            ps.setString(2, Identidad);
            ps.setString(3, Nombres);
            ps.setString(4, Apellidos);
            ps.setString(5, Telefono);
            ps.setString(6, CorreoElectronico);
            ps.setInt(7, Cargo);
            ps.setString(8, Contrasenia);

            resultado = ps.executeUpdate();

            return resultado > 0;

        } catch (SQLException ex) {

            return false;
        }

    }

    @Override
    public boolean EliminarPersona() {
        int resultado = 0;
        try {
            ps = dbConnection.dbConexion().prepareStatement("update usuarios set estado = 'Inactivo' where identidadUsuario =? and estado = 'Activo'");
            ps.setString(1, Identidad);

            resultado = ps.executeUpdate();

            return resultado > 0;

        } catch (SQLException ex) {

            return false;
        }
    }

}
