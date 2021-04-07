package Formularios.InicioSesion;

import Clases.dbConnection;
import java.sql.*;

public class ClsInicioSesion extends dbConnection {

    PreparedStatement ps;
    protected int codigoEntra;

    public boolean verificarInicio(String user, char[] pass) {
        try {
            ps = dbConnection.dbConexion().prepareStatement("SELECT identidadUsuario, cargo c FROM dbo.usuarios WHERE identidadUsuario = ? AND contraseniaUsuario = ? AND estado <> 'Inactivo'");
            ps.setString(1, user);
            ps.setString(2, String.valueOf(pass));
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                codigoEntra = rs.getInt("c");
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(""+ex.getMessage());
            return false;
        }
        
    }
}
