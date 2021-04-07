package Clases.BuquesyViajesDisponibles;

import Clases.ClsFuncionesDB;
import Clases.dbConnection;
import java.sql.*;
import javax.swing.JOptionPane;

public class ClsViajesDisponibles extends ClsFuncionesDB {
     
   PreparedStatement ps;

    int idViaje, codBuque, codPuertoSalida, codDestino, codigoBuque, codigoSalida, codigoDestino, idBuque, buque;
    String estado, estadoIn, fechaPartida, fechaRegreso, nombreBuque, nombreDestino, nombreSalida, estadoBuque;

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

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEstadoIn(String estadoIn) {
        this.estadoIn = estadoIn;
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

    public void setCodigoBuque(int codigoBuque) {
        this.codigoBuque = codigoBuque;
    }

    public void setCodigoSalida(int codigoSalida) {
        this.codigoSalida = codigoSalida;
    }

    public void setCodigoDestino(int codigoDestino) {
        this.codigoDestino = codigoDestino;
    }

    public void setNombreBuque(String nombreBuque) {
        this.nombreBuque = nombreBuque;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public void setNombreSalida(String nombreSalida) {
        this.nombreSalida = nombreSalida;
    }

    public void setEstadoBuque(String estadoBuque) {
        this.estadoBuque = estadoBuque;
    }

    public void setIdBuque(int idBuque) {
        this.idBuque = idBuque;
    }

    public void setBuque(int buque) {
        this.buque = buque;
    }

    public boolean RegistrarViajeDisponible() {

        int resultado = 0;

        try {
            ps = dbConnection.dbConexion().prepareStatement("EXEC [PARegistroViaje] ?,?,?,?,?,?");
            ps.setInt(1, codBuque);
            ps.setInt(2, codPuertoSalida);
            ps.setInt(3, codDestino);
            ps.setString(4, fechaPartida);
            ps.setString(5, fechaRegreso);
            ps.setString(6, estado);
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
            ps = dbConnection.dbConexion().prepareStatement("EXEC PAActualizarViaje ?,?,?,?,?,?");
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

    public boolean verificarEstadoAct() {

        if (estadoIn.equals("Activo")) {
            return true;

        } else {
            return false;

        }

    }

    public boolean verificarEstadoInac() {

        if (estadoIn.equals("Inactivo")) {
            return true;

        } else {
            return false;

        }

    }
    
    public boolean actulizarEstadoBuque() {
        int resultado = 0;

        try {
            ps = dbConnection.dbConexion().prepareStatement("UPDATE [dbo].[buques] SET [estado] = ? WHERE [codigoBuque] = ?");
            ps.setString(1, estadoBuque);
            ps.setInt(2, idBuque);

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
    
    public boolean verificarEstadoBuqueOcu(){
        if (estadoBuque.equals("Ocupado")) {
            return false;

        } else {
            return true;

        }
    }

    public String obtenerFechaRegresoBuque(){
        try {

            String fechaRegreso;

            ps = dbConnection.dbConexion().prepareStatement("SELECT vd.fechaRegreso FROM dbo.buques b INNER JOIN dbo.viajesDisponibles vd ON b.codigoBuque = vd.codigoBuque WHERE b.[codigoBuque] = ?");
            ps.setInt(1, buque);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                fechaRegreso = result.getString("fechaRegreso");
            } else {
                fechaRegreso = null;
            }
            return fechaRegreso;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return null;
    }
    
    public String obtenerNombreBuque() {
        try {

            String nombreBuque;

            ps = dbConnection.dbConexion().prepareStatement("SELECT [nombreBuque] FROM [dbo].[buques] WHERE [codigoBuque] = ?");
            ps.setInt(1, codigoBuque);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                nombreBuque = result.getString("nombreBuque");
            } else {
                nombreBuque = null;
            }
            return nombreBuque;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return null;
    }

    public int obtenerIdBuque() {
        try {

            int idBuque;

            ps = dbConnection.dbConexion().prepareStatement("SELECT [codigoBuque] FROM [dbo].[buques] WHERE [nombreBuque] = ?");
            ps.setString(1, nombreBuque);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                idBuque = result.getInt("codigoBuque");
            } else {
                idBuque = 0;
            }
            return idBuque;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return 0;
    }

    public String obtenerNombreSalida() {
        try {

            String nombreBuque;

            ps = dbConnection.dbConexion().prepareStatement("SELECT [nombrePuerto] FROM [dbo].[puertosSalida] WHERE [codigoPuerto] = ?");
            ps.setInt(1, codigoSalida);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                nombreBuque = result.getString("nombrePuerto");
            } else {
                nombreBuque = null;
            }
            return nombreBuque;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return null;
    }

    public int obtenerIdSalida() {
        try {

            int idSalida;

            ps = dbConnection.dbConexion().prepareStatement("SELECT [codigoPuerto] FROM [dbo].[puertosSalida] WHERE [nombrePuerto] = ?");
            ps.setString(1, nombreSalida);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                idSalida = result.getInt("codigoPuerto");
            } else {
                idSalida = 0;
            }
            return idSalida;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return 0;
    }

    public String obtenerNombreDestino() {
        try {

            String nombreBuque;

            ps = dbConnection.dbConexion().prepareStatement("SELECT [nombreDestino] FROM [dbo].[destinosTuristicos] WHERE [codigoDestino] = ?");
            ps.setInt(1, codigoDestino);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                nombreBuque = result.getString("nombreDestino");
            } else {
                nombreBuque = null;
            }
            return nombreBuque;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return null;
    }

    public int obtenerIdDestino() {
        try {

            int idDestino;

            ps = dbConnection.dbConexion().prepareStatement("SELECT [codigoDestino] FROM [dbo].[destinosTuristicos] WHERE [nombreDestino] = ?");
            ps.setString(1, nombreDestino);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                idDestino = result.getInt("codigoDestino");
            } else {
                idDestino = 0;
            }
            return idDestino;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
        return 0;
    }
}
