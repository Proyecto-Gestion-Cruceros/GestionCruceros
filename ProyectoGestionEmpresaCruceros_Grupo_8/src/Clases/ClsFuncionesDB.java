package Clases;

import static Clases.dbConnection.conn;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ClsFuncionesDB extends dbConnection{
    
    private PreparedStatement ps;
    private ResultSetMetaData rsmd;
    
    @Override
    public void llenarJCombobox(JComboBox Jcmb, String instruccion, String campo) {
        ResultSet resultado = null;
        String SSQL = instruccion;

        try {
            conn = dbConnection.dbConexion();

            ps = conn.prepareStatement(SSQL);
            resultado = ps.executeQuery();

            while (resultado.next()) {
                Jcmb.addItem(resultado.getString(campo));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @Override
    public void llenarJTable(JTable tabla, String instruccion){
        PreparedStatement ps;
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        try{

            ps = dbConnection.dbConexion().prepareStatement(instruccion);
            ResultSet rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            int columnas = rsmd.getColumnCount();
            while (rs.next()) {
                Object filas[] = new Object[columnas];
                for (int j = 0; j < columnas; j++) {
                    filas[j] = rs.getObject(j + 1);
                }
                model.addRow(filas);
            }

        }catch(SQLException ex){
            System.out.println("Error al llenar tabla " + ex.getMessage());
        }
    }
    
}
