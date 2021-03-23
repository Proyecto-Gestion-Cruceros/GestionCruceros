/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases.InicioSesion;

import Clases.dbConnection;
import java.sql.*;
/**
 *
 * @author Hacknel
 */

public class ClsInicioSesion extends dbConnection {

    PreparedStatement ps;

    public boolean verificarInicio(String user, char[] pass) {
        try {
            ps = dbConnection.dbConexion().prepareStatement("SELECT identidadUsuario FROM dbo.usuarios WHERE identidadUsuario = ? AND contraseniaUsuario = ?");
            ps.setString(1, user);
            ps.setString(2, String.valueOf(pass));
            ResultSet result = ps.executeQuery();
            if (result.next()) {
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
