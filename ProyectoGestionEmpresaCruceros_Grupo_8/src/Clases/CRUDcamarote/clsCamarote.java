
package Clases.CRUDcamarote;

import Clases.dbConnection;
import java.sql.*;


import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class clsCamarote extends dbConnection {
    
   PreparedStatement ps;
   ResultSet result = null;

   
    //Metodo publico para cargar JcomboBox
    public void extraer_codigoBuque(JComboBox cbCodigoBuque) {

        //Consulta SQL
        String SSQL = "SELECT codigoBuque FROM buques ORDER BY codigoBuque ASC";

        try {
            //Establecemos conexión con la BD 
            conn = dbConnection.dbConexion();

            //Preparamos la consulta SQL
            ps = conn.prepareStatement(SSQL);
            //Ejecutamos la consulta
            result = ps.executeQuery();

            while (result.next()) {
                cbCodigoBuque.addItem(result.getString("codigoBuque"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
    
  
}
    
    
   
    

