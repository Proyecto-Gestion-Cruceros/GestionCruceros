/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioBase;

import Clases.ClsValidaciones;
import Clases.PuertosSalida.clsPuertosSalidas;
import Clases.dbConnection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class frmCrudPuertosDeSalida extends javax.swing.JFrame {

    /**
     * Creates new form frmCrudPuertosDeSalida
     */
    public frmCrudPuertosDeSalida() {
        initComponents();
    }

    dbConnection conexion = new dbConnection();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    DefaultTableModel temp;

    ClsValidaciones validar = new ClsValidaciones();
    clsPuertosSalidas puerto = new clsPuertosSalidas();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoPuertoSalida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombrePuertoSalida = new javax.swing.JTextField();
        btnActualizarPuertoSalida = new javax.swing.JButton();
        btnAgregarPuertoSalida = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPuertosSalida = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("CRUD PUERTOS DE SALIDA");

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código de Puerto de Salida");

        txtCodigoPuertoSalida.setEditable(false);
        txtCodigoPuertoSalida.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre del Puerto");

        txtNombrePuertoSalida.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        btnActualizarPuertoSalida.setBackground(new java.awt.Color(255, 204, 51));
        btnActualizarPuertoSalida.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnActualizarPuertoSalida.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarPuertoSalida.setText("ACTUALIZAR");
        btnActualizarPuertoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPuertoSalidaActionPerformed(evt);
            }
        });

        btnAgregarPuertoSalida.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregarPuertoSalida.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAgregarPuertoSalida.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarPuertoSalida.setText("AGREGAR");
        btnAgregarPuertoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPuertoSalidaActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 51));
        btnEliminar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPuertosSalida.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jPuertosSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Puerto", "Nombre Puerto", "Estado Puerto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jPuertosSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPuertosSalidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jPuertosSalida);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(537, 537, 537)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnActualizarPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(312, 312, 312)
                                .addComponent(btnAgregarPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNombrePuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCodigoPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(110, 110, 110)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(216, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigoPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombrePuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarPuertoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPuertoSalidaActionPerformed
        if (!txtCodigoPuertoSalida.getText().isBlank()) {
            if (!txtNombrePuertoSalida.getText().isBlank()) {
                if (validar.isLetras(txtNombrePuertoSalida.getText())) {
                    try {
                        puerto.setCodigoPuerto(Integer.parseInt(txtCodigoPuertoSalida.getText()));
                        puerto.setNombrePuerto(txtNombrePuertoSalida.getText());
                        if (puerto.ActualizarPuertoSalida()) {
                            JOptionPane.showMessageDialog(null, "Puerto Actualizado Correctamente");
                            limpiaTabla();
                            MostrarPuertosSalida();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al Actualizar");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese correctamente El nombre del puerto");
                }
            } else {
                JOptionPane.showMessageDialog(null, "No puede dejar en blanco el nombre del puerto");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un puerto a modificar");
        }

    }//GEN-LAST:event_btnActualizarPuertoSalidaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!txtCodigoPuertoSalida.getText().isBlank()) {
            puerto.setCodigoPuerto(Integer.parseInt(txtCodigoPuertoSalida.getText()));
            puerto.EliminarPuertoSalida();
            limpiaTabla();
            MostrarPuertosSalida();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el puerto a eliminar");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarPuertoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPuertoSalidaActionPerformed
        if (!txtNombrePuertoSalida.getText().isBlank())
            if (validar.isLetras(txtNombrePuertoSalida.getText())) {
                puerto.setNombrePuerto(txtNombrePuertoSalida.getText());
                try {
                    if (puerto.AgregarPuertoSalida()) {
                        JOptionPane.showMessageDialog(null, "Puerto Ingresado Correctamente");
                        limpiaTabla();
                        MostrarPuertosSalida();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al ingresar");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese correctamente El nombre del puerto");
            }
        else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos necesarios");
        }
    }//GEN-LAST:event_btnAgregarPuertoSalidaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        MostrarPuertosSalida();
        CodigoNuevoPuerto();
    }//GEN-LAST:event_formWindowOpened

    private void jPuertosSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPuertosSalidaMouseClicked
        int seleccionar = jPuertosSalida.rowAtPoint(evt.getPoint());
        txtCodigoPuertoSalida.setText(String.valueOf(jPuertosSalida.getValueAt(seleccionar, 0)));
        txtNombrePuertoSalida.setText(String.valueOf(jPuertosSalida.getValueAt(seleccionar, 1)));
    }//GEN-LAST:event_jPuertosSalidaMouseClicked

    void limpiaTabla() {
        try {
            temp = (DefaultTableModel) jPuertosSalida.getModel();
            int a = temp.getRowCount() - 1;
            temp.setRowCount(0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void MostrarPuertosSalida() {
        try {
            ps = dbConnection.dbConexion().prepareStatement("SELECT [codigoPuerto], [nombrePuerto], [estado] FROM [agenciaCruceros].[dbo].[puertosSalida]");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();

            ArrayList<Object[]> data = new ArrayList<>();

            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++) {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }

            dtm = (DefaultTableModel) this.jPuertosSalida.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void CodigoNuevoPuerto() {
        try {
            String obtenerUltimoCodigo;
            int UltimoCodigo;
            ps = dbConnection.dbConexion().prepareStatement("SELECT TOP 1 [codigoPuerto] FROM [agenciaCruceros].[dbo].[puertosSalida] order by [codigoPuerto] desc");
            rs = ps.executeQuery();

            if (rs.next()) {
                obtenerUltimoCodigo = rs.getString("codigoPuerto").trim();
                UltimoCodigo = Integer.parseInt(obtenerUltimoCodigo) + 1;
                txtCodigoPuertoSalida.setText("" + UltimoCodigo);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void Limpiar() {
        txtCodigoPuertoSalida.setText(null);
        txtNombrePuertoSalida.setText(null);
        CodigoNuevoPuerto();
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
            java.util.logging.Logger.getLogger(frmCrudPuertosDeSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrudPuertosDeSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrudPuertosDeSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrudPuertosDeSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrudPuertosDeSalida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarPuertoSalida;
    private javax.swing.JButton btnAgregarPuertoSalida;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jPuertosSalida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoPuertoSalida;
    private javax.swing.JTextField txtNombrePuertoSalida;
    // End of variables declaration//GEN-END:variables
}
