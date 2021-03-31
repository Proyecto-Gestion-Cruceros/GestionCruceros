/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormulariosCrucero;

import Clases.dbConnection;
import java.awt.Color;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OscarM
 */
public class frmSeleccionViaje extends javax.swing.JFrame {

    /**
     * Creates new form frmSeleccionViaje
     */
    public frmSeleccionViaje() {
        initComponents();
    }

    clsVariablesViaje variables = new clsVariablesViaje();

    dbConnection conexion = new dbConnection();
    Statement st;
    PreparedStatement ps;
    ResultSetMetaData rsmd;
    DefaultTableModel model;
    ResultSet result = null;
    public static int codigoViajeSeleccionado = 0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaViajes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDatosViaje = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(1635, 1035));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("SELECCION DE VIAJE");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(640, 80, 510, 50);

        btnAtras.setBackground(new java.awt.Color(255, 204, 51));
        btnAtras.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(0, 970, 210, 60);

        btnSiguiente.setBackground(new java.awt.Color(255, 204, 51));
        btnSiguiente.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(1420, 970, 210, 60);

        tablaViajes.setFont(new java.awt.Font("Doppio One", 0, 14)); // NOI18N
        tablaViajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO VIAJE", "BUQUE", "PUERTO DE SALIDA", "DESTINO", "FECHA SALIDA", "FECHA REGRESO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaViajes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaViajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaViajesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaViajes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 160, 1480, 430);

        txtDatosViaje.setEditable(false);
        txtDatosViaje.setBackground(new java.awt.Color(0, 79, 129));
        txtDatosViaje.setColumns(20);
        txtDatosViaje.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        txtDatosViaje.setForeground(new java.awt.Color(255, 204, 51));
        txtDatosViaje.setRows(5);
        txtDatosViaje.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204)));
        txtDatosViaje.setFocusable(false);
        jScrollPane2.setViewportView(txtDatosViaje);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(600, 680, 460, 220);

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Detalles del Viaje");
        jLabel2.setFocusTraversalPolicyProvider(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(710, 610, 260, 49);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        codigoViajeSeleccionado = 0;
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if(codigoViajeSeleccionado > 0){
            variables.setCodigoViaje(codigoViajeSeleccionado);
            frmSeleccionNivel selectorNivel = new frmSeleccionNivel();
            selectorNivel.setVisible(true);
        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void tablaViajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaViajesMouseClicked
        int row1 = tablaViajes.rowAtPoint(evt.getPoint());
        int col1 = tablaViajes.columnAtPoint(evt.getPoint());
        codigoViajeSeleccionado = 0;
        codigoViajeSeleccionado = Integer.parseInt(tablaViajes.getModel().getValueAt(row1, 0).toString());
        retornarDatosViaje(codigoViajeSeleccionado);
    }//GEN-LAST:event_tablaViajesMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarDatos();
    }//GEN-LAST:event_formWindowOpened

    public void retornarDatosViaje(int codigoViaje) {
        try {

            int idViaje;
            String nombreBuque;
            String nombrePuerto;
            String nombreDestino;
            String fechaSalida;
            String fechaRegreso;
            txtDatosViaje.setText(null);
            
            ps = conexion.dbConexion().prepareStatement("SELECT A.idViaje as id, B.nombreBuque as nb, C.nombrePuerto as np, D.nombreDestino as nd, A.fechaSalida as fs, A.fechaRegreso as fr FROM [dbo].[viajesDisponibles] A INNER JOIN [dbo].[buques] B  ON A.codigoBuque = B.codigoBuque INNER JOIN [dbo].[puertosSalida] C ON A.codigoPuertoSalida = C.codigoPuerto INNER JOIN [dbo].[destinosTuristicos] D ON A.codigoDestino = D.codigoDestino WHERE A.idViaje = " + codigoViaje);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                idViaje = Integer.parseInt(result.getString("id"));
                nombreBuque = result.getString("nb");
                nombrePuerto = result.getString("np");
                nombreDestino = result.getString("nd");
                fechaSalida = result.getString("fs");
                fechaRegreso = result.getString("fr");

                txtDatosViaje.append(" Codigo de Viaje: " + idViaje);
                txtDatosViaje.append("\n Nombre del Buque: " + nombreBuque);
                txtDatosViaje.append("\n Puerto de Salida: " + nombrePuerto);
                txtDatosViaje.append("\n Destino: " + nombreDestino);
                txtDatosViaje.append("\n Fecha de Salida: " + fechaSalida);
                txtDatosViaje.append("\n Fecha de Retorno: " + fechaRegreso);

            }

        } catch (SQLException ex) {
            System.out.println("" + ex.getMessage());
        }
    }

    
    private void cargarDatos() {
        model = (DefaultTableModel) tablaViajes.getModel();
        model.setRowCount(0);

        try {
            ps = conexion.dbConexion().prepareStatement("SELECT A.idViaje, B.nombreBuque, C.nombrePuerto, D.nombreDestino, A.fechaSalida, A.fechaRegreso FROM [dbo].[viajesDisponibles] A INNER JOIN [dbo].[buques] B  ON A.codigoBuque = B.codigoBuque INNER JOIN [dbo].[puertosSalida] C ON A.codigoPuertoSalida = C.codigoPuerto INNER JOIN [dbo].[destinosTuristicos] D ON A.codigoDestino = D.codigoDestino");

            ResultSet result = ps.executeQuery();
            rsmd = result.getMetaData();

            int columna = rsmd.getColumnCount();

            while (result.next()) {
                Object fil[] = new Object[columna];
                for (int i = 0; i < columna; i++) {
                    fil[i] = result.getObject(i + 1);
                }
                model.addRow(fil);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos en la tabla" + ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmSeleccionViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSeleccionViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSeleccionViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSeleccionViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSeleccionViaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaViajes;
    private javax.swing.JTextArea txtDatosViaje;
    // End of variables declaration//GEN-END:variables
}
