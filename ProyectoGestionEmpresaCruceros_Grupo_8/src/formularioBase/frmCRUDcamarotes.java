/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioBase;

import Clases.CRUDcamarote.clsCamarote;
import Clases.dbConnection;
import static Clases.dbConnection.conn;
import static Clases.dbConnection.dbConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class frmCRUDcamarotes extends javax.swing.JFrame {
    DecimalFormat nd = new DecimalFormat("#.00");
     
    clsCamarote camarote = new clsCamarote();
    dbConnection conexion = new dbConnection();
    PreparedStatement ps;
    ResultSet result = null;
    
    private int retornarCodigoCamarote;
    
    public frmCRUDcamarotes() {
        initComponents();
        
       camarote.extraer_codigoBuque(cmbCodigoBuque);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCamarote = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoCamarote = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreBuque = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spNivel = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        cmbTipoCamarote = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbCodigoBuque = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmbEstadoCamarote = new javax.swing.JComboBox<>();
        spCapacidadPersonas = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panCamarote.setBackground(new java.awt.Color(0, 79, 129));

        lblImagen.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        lblImagen.setForeground(new java.awt.Color(255, 255, 255));
        lblImagen.setText("    Imagen de camarote según el tipo");

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        btnAgregar.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nivel");

        txtCodigoCamarote.setEditable(false);
        txtCodigoCamarote.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código de Camarote");

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("CRUD CAMAROTES");

        jLabel6.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre de Buque");

        txtNombreBuque.setEditable(false);
        txtNombreBuque.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Camarote");

        spNivel.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        spNivel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));
        spNivel.setVerifyInputWhenFocusTarget(false);

        jLabel8.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Capacidad Máxima de Personas");

        cmbTipoCamarote.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbTipoCamarote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opción", "Interior", "Vista al Oceáno ", "Balcón", "Suite " }));
        cmbTipoCamarote.setInheritsPopupMenu(true);
        cmbTipoCamarote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoCamaroteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Código de Buque");

        cmbCodigoBuque.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbCodigoBuque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opción" }));
        cmbCodigoBuque.setToolTipText("");
        cmbCodigoBuque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoBuqueActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado ");

        cmbEstadoCamarote.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbEstadoCamarote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desocupado", "Ocupado" }));
        cmbEstadoCamarote.setToolTipText("");
        cmbEstadoCamarote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoCamaroteActionPerformed(evt);
            }
        });

        spCapacidadPersonas.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        spCapacidadPersonas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));
        spCapacidadPersonas.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panCamaroteLayout = new javax.swing.GroupLayout(panCamarote);
        panCamarote.setLayout(panCamaroteLayout);
        panCamaroteLayout.setHorizontalGroup(
            panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCamaroteLayout.createSequentialGroup()
                .addGap(549, 549, 549)
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCamaroteLayout.createSequentialGroup()
                        .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCodigoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreBuque)
                                .addComponent(cmbCodigoBuque, 0, 211, Short.MAX_VALUE))
                            .addComponent(spNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panCamaroteLayout.createSequentialGroup()
                        .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTipoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEstadoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spCapacidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCamaroteLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCamaroteLayout.createSequentialGroup()
                .addGap(0, 540, Short.MAX_VALUE)
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCamaroteLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(511, 511, 511))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCamaroteLayout.createSequentialGroup()
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(607, 607, 607))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCamaroteLayout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(272, 272, 272)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(433, 433, 433))))
        );
        panCamaroteLayout.setVerticalGroup(
            panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCamaroteLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbCodigoBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(36, 36, 36)
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spCapacidadPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbEstadoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCamaroteLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(231, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCamaroteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panCamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCamarote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panCamarote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cmbCodigoBuque.setSelectedIndex(0);
        txtNombreBuque.setText(null);
        spNivel.setValue(1);
        cmbTipoCamarote.setSelectedIndex(0);
        spCapacidadPersonas.setValue(1);
        txtPrecio.setText(null);
        cmbEstadoCamarote.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void cmbEstadoCamaroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoCamaroteActionPerformed

    }//GEN-LAST:event_cmbEstadoCamaroteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Retornar codigoCamarote 
        if (camarote.retornarUltimoIdCamarote() > 0) {
            retornarCodigoCamarote = camarote.retornarUltimoIdCamarote() + 1;
            txtCodigoCamarote.setText(Integer.toString(retornarCodigoCamarote));
        } else {
            retornarCodigoCamarote = 0;
            txtCodigoCamarote.setText(Integer.toString(retornarCodigoCamarote));

        }
    }//GEN-LAST:event_formWindowOpened

    private void cmbCodigoBuqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoBuqueActionPerformed
        
       try {
              if (cmbCodigoBuque.getSelectedIndex()!= 0) {
               ps = dbConexion().prepareStatement("SELECT nombreBuque FROM buques WHERE codigoBuque = '" + this.cmbCodigoBuque.getSelectedItem() + "'");
               ResultSet result = ps.executeQuery();
               result.next();
               this.txtNombreBuque.setText(result.getString("nombreBuque"));
           }
                
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex);
         
        }
        
        
    }//GEN-LAST:event_cmbCodigoBuqueActionPerformed

    private void cmbTipoCamaroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoCamaroteActionPerformed
        try {

            if (cmbTipoCamarote.getSelectedIndex() != 0) {
                ps = dbConexion().prepareStatement("SELECT precioCamarote FROM camarotes WHERE tipoCamarote = '" + this.cmbTipoCamarote.getSelectedItem() + "'");
                ResultSet result = ps.executeQuery();
                result.next();
                this.txtPrecio.setText(String.valueOf(result.getString("precioCamarote")));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }

    }//GEN-LAST:event_cmbTipoCamaroteActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        try {
            ps = dbConexion().prepareStatement("INSERT INTO camarotes VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, String.valueOf(cmbCodigoBuque.getSelectedItem()));
            ps.setString(2, String.valueOf(spNivel.getValue()));
            ps.setString(3, String.valueOf(cmbTipoCamarote.getSelectedItem()));
            ps.setString(4, String.valueOf(spCapacidadPersonas.getValue()));
            ps.setString(5, txtPrecio.getText());
            ps.setString(6, String.valueOf(cmbEstadoCamarote.getSelectedItem()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ingresado Correctamente");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Registrar los datos" + ex);
        } finally {
            cmbCodigoBuque.setSelectedIndex(0);
            txtNombreBuque.setText(null);
            spNivel.setValue(1);
            cmbTipoCamarote.setSelectedIndex(0);
            spCapacidadPersonas.setValue(1);
            txtPrecio.setText(null);
            cmbEstadoCamarote.setSelectedIndex(0);
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(frmCRUDcamarotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCRUDcamarotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCRUDcamarotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCRUDcamarotes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCRUDcamarotes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbCodigoBuque;
    private javax.swing.JComboBox<String> cmbEstadoCamarote;
    private javax.swing.JComboBox<String> cmbTipoCamarote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JPanel panCamarote;
    private javax.swing.JSpinner spCapacidadPersonas;
    private javax.swing.JSpinner spNivel;
    private javax.swing.JTextField txtCodigoCamarote;
    private javax.swing.JTextField txtNombreBuque;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
