/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormularioCRUDcamarote;

import Clases.CRUDcamarote.clsCamarote;
import Clases.ClsValidaciones;
import Clases.dbConnection;

import static Clases.dbConnection.dbConexion;
import java.awt.Color;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;

public class frmCRUDActualizacion extends javax.swing.JFrame {

    clsCamarote camarote = new clsCamarote();
    dbConnection conexion = new dbConnection();
    ClsValidaciones validar = new ClsValidaciones();

    PreparedStatement ps, pss, pps;
    ResultSet result = null;

    Statement st;
    ResultSetMetaData rsmd;
    DefaultTableModel model;

    private int retornarCodigoCamarote;

    public frmCRUDActualizacion() {
        initComponents();

        camarote.extraer_codigoBuque(cmbCodigoBuque);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panActualizar = new javax.swing.JPanel();
        lblPrecio = new javax.swing.JLabel();
        txtPrecioCamarote = new javax.swing.JTextField();
        btnActualizarCamarote = new javax.swing.JButton();
        lblNivel = new javax.swing.JLabel();
        txtIDCamarote = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        lblCRUD = new javax.swing.JLabel();
        lblNombreBuque = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        spNiveel = new javax.swing.JSpinner();
        lblCapacidad = new javax.swing.JLabel();
        lblBuque = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        spCapacidad = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtTipoCamarote = new javax.swing.JTextField();
        txtNombreBuque = new javax.swing.JTextField();
        btnRegreesar = new javax.swing.JButton();
        cmbCodigoBuque = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panActualizar.setBackground(new java.awt.Color(0, 79, 129));
        panActualizar.setLayout(null);

        lblPrecio.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio");
        panActualizar.add(lblPrecio);
        lblPrecio.setBounds(880, 470, 57, 26);

        txtPrecioCamarote.setEditable(false);
        txtPrecioCamarote.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        panActualizar.add(txtPrecioCamarote);
        txtPrecioCamarote.setBounds(950, 470, 89, 29);

        btnActualizarCamarote.setBackground(new java.awt.Color(255, 204, 51));
        btnActualizarCamarote.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnActualizarCamarote.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarCamarote.setText("ACTUALIZAR");
        btnActualizarCamarote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCamaroteActionPerformed(evt);
            }
        });
        panActualizar.add(btnActualizarCamarote);
        btnActualizarCamarote.setBounds(1120, 910, 195, 63);

        lblNivel.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(255, 255, 255));
        lblNivel.setText("Nivel");
        panActualizar.add(lblNivel);
        lblNivel.setBounds(890, 350, 48, 26);

        txtIDCamarote.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtIDCamarote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDCamaroteActionPerformed(evt);
            }
        });
        txtIDCamarote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDCamaroteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDCamaroteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDCamaroteKeyTyped(evt);
            }
        });
        panActualizar.add(txtIDCamarote);
        txtIDCamarote.setBounds(950, 290, 80, 26);

        lblCodigo.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código de Camarote");
        panActualizar.add(lblCodigo);
        lblCodigo.setBounds(750, 290, 189, 26);

        lblCRUD.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        lblCRUD.setForeground(new java.awt.Color(255, 204, 51));
        lblCRUD.setText("CRUD CAMAROTES");
        panActualizar.add(lblCRUD);
        lblCRUD.setBounds(730, 50, 390, 68);

        lblNombreBuque.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblNombreBuque.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreBuque.setText("Nombre de Buque");
        panActualizar.add(lblNombreBuque);
        lblNombreBuque.setBounds(740, 230, 166, 26);

        lblTipo.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo de Camarote");
        panActualizar.add(lblTipo);
        lblTipo.setBounds(770, 410, 164, 26);

        spNiveel.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        spNiveel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));
        spNiveel.setEnabled(false);
        spNiveel.setVerifyInputWhenFocusTarget(false);
        panActualizar.add(spNiveel);
        spNiveel.setBounds(950, 350, 62, 26);

        lblCapacidad.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidad.setText("Capacidad Máxima de Personas");
        panActualizar.add(lblCapacidad);
        lblCapacidad.setBounds(640, 530, 297, 26);

        lblBuque.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblBuque.setForeground(new java.awt.Color(255, 255, 255));
        lblBuque.setText("Código de Buque");
        panActualizar.add(lblBuque);
        lblBuque.setBounds(750, 170, 156, 26);

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panActualizar.add(btnLimpiar);
        btnLimpiar.setBounds(660, 910, 195, 60);

        lblEstado.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado ");
        panActualizar.add(lblEstado);
        lblEstado.setBounds(870, 580, 69, 26);

        cmbEstado.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desocupado", "Ocupado" }));
        cmbEstado.setToolTipText("");
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });
        panActualizar.add(cmbEstado);
        cmbEstado.setBounds(950, 580, 290, 30);

        spCapacidad.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        spCapacidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));
        spCapacidad.setVerifyInputWhenFocusTarget(false);
        panActualizar.add(spCapacidad);
        spCapacidad.setBounds(950, 530, 62, 26);

        tablaDatos.setFont(new java.awt.Font("Doppio One", 0, 14)); // NOI18N
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Códiigo Camarote", "Nivel", "Tipo de Camarote", "Capacidad Máxima de Personas", "Precio", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaDatos);

        panActualizar.add(jScrollPane1);
        jScrollPane1.setBounds(300, 660, 1330, 190);

        btnBuscar.setBackground(new java.awt.Color(255, 204, 51));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lupa (2).png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panActualizar.add(btnBuscar);
        btnBuscar.setBounds(1040, 280, 40, 40);

        txtTipoCamarote.setEditable(false);
        txtTipoCamarote.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        panActualizar.add(txtTipoCamarote);
        txtTipoCamarote.setBounds(950, 410, 211, 26);

        txtNombreBuque.setEditable(false);
        txtNombreBuque.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        panActualizar.add(txtNombreBuque);
        txtNombreBuque.setBounds(920, 230, 211, 26);

        btnRegreesar.setBackground(new java.awt.Color(255, 204, 51));
        btnRegreesar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnRegreesar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegreesar.setText("REGRESAR");
        btnRegreesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegreesarActionPerformed(evt);
            }
        });
        panActualizar.add(btnRegreesar);
        btnRegreesar.setBounds(0, 1030, 195, 50);

        cmbCodigoBuque.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbCodigoBuque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opción" }));
        cmbCodigoBuque.setToolTipText("");
        cmbCodigoBuque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCodigoBuqueMouseClicked(evt);
            }
        });
        cmbCodigoBuque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodigoBuqueActionPerformed(evt);
            }
        });
        panActualizar.add(cmbCodigoBuque);
        cmbCodigoBuque.setBounds(920, 170, 230, 31);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cmbEstado.setEnabled(false);
        spCapacidad.setEnabled(false);
        btnActualizarCamarote.setEnabled(false);
        ((JSpinner.DefaultEditor) spCapacidad.getEditor()).getTextField().setEditable(false);
        txtIDCamarote.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void limpiarCampos() {
        txtIDCamarote.setText(null);
        txtNombreBuque.setText(null);
        spNiveel.setValue(1);
        txtTipoCamarote.setText(null);
        spCapacidad.setValue(1);
        txtPrecioCamarote.setText(null);
        cmbCodigoBuque.setSelectedIndex(0);
        cmbEstado.setSelectedIndex(0);
        cmbEstado.setEnabled(false);
        spCapacidad.setEnabled(false);
        model.setRowCount(0);
    }

    private void limpiar() {
        spNiveel.setValue(1);
        txtTipoCamarote.setText(null);
        spCapacidad.setValue(1);
        txtPrecioCamarote.setText(null);
        cmbEstado.setSelectedIndex(0);
    }

    private void limpiarCambio() {
        txtIDCamarote.setText(null);
        spNiveel.setValue(1);
        txtTipoCamarote.setText(null);
        spCapacidad.setValue(1);
        txtPrecioCamarote.setText(null);
        cmbEstado.setSelectedIndex(0);
        //model.setRowCount(0);
    }

    private void buscarCamarote() {
        try {
            ps = dbConexion().prepareStatement("SELECT * FROM camarotes WHERE codigoCamarote = " + this.txtIDCamarote.getText() + " AND codigoBuque = " + this.cmbCodigoBuque.getSelectedItem());

            ResultSet result = ps.executeQuery();

            if (result.next()) {
                txtIDCamarote.setText(String.valueOf(result.getString("codigoCamarote").trim()));
                txtTipoCamarote.setText(result.getString("tipoCamarote").trim());
                spNiveel.setValue(result.getInt("nivel"));
                spCapacidad.setValue(result.getInt("capacidadMaxima"));
                cmbEstado.setSelectedItem(result.getString("estadoCamarote").trim());

                pps = dbConexion().prepareStatement("SELECT precioCamarote FROM camarotes WHERE tipoCamarote = '" + this.txtTipoCamarote.getText() + "'");
                ResultSet rs = pps.executeQuery();

                while (rs.next()) {
                    this.txtPrecioCamarote.setText(String.valueOf(result.getString("precioCamarote")));
                }

                cmbEstado.setEnabled(true);
                spCapacidad.setEnabled(true);
                btnActualizarCamarote.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Registro No encontrado");
                cmbEstado.setEnabled(false);
                spCapacidad.setEnabled(false);
                txtIDCamarote.setText(null);
                btnActualizarCamarote.setEnabled(false);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarCamarote();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed

    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarCamaroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCamaroteActionPerformed
        try {

            ps = dbConexion().prepareStatement("UPDATE camarotes SET capacidadMaxima=?, estadoCamarote=?  WHERE codigoCamarote = ?");
            ps.setString(1, String.valueOf(spCapacidad.getValue()));
            ps.setString(2, String.valueOf(cmbEstado.getSelectedItem()));
            ps.setString(3, txtIDCamarote.getText());

            int llenado = ps.executeUpdate();

            if (llenado > 0) {
                  Icon icono = new ImageIcon(getClass().getResource("/Resources/Check.png"));
                  JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> Actualizado Correctamente</b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
                cargarDatos();
                limpiarCambio();
            } else {
                Icon icono = new ImageIcon(getClass().getResource("/Resources/Advertencia.png"));
                JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> Insertar código del Camarote</b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
 
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar los datos" + ex);
        }
    }//GEN-LAST:event_btnActualizarCamaroteActionPerformed

    private void btnRegreesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegreesarActionPerformed
       dispose();
    }//GEN-LAST:event_btnRegreesarActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        int llenar = this.tablaDatos.getSelectedRow();

        this.txtIDCamarote.setText(String.valueOf(tablaDatos.getValueAt(llenar, 0)));
        limpiar();
        buscarCamarote();

    }//GEN-LAST:event_tablaDatosMouseClicked

    private void cmbCodigoBuqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoBuqueActionPerformed

        try {
            limpiarCambio();
            if (cmbCodigoBuque.getSelectedIndex() != 0) {

                cargarDatos();
                ps = dbConexion().prepareStatement("SELECT nombreBuque FROM buques WHERE codigoBuque = '" + this.cmbCodigoBuque.getSelectedItem() + "'");
                ResultSet result = ps.executeQuery();
                result.next();

                this.txtNombreBuque.setText(result.getString("nombreBuque"));
                txtIDCamarote.setEnabled(true);

            } else {
                model.setRowCount(0);
                btnActualizarCamarote.setEnabled(false);
                txtNombreBuque.setText(null);
                txtIDCamarote.setEnabled(false);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_cmbCodigoBuqueActionPerformed

    private void txtIDCamaroteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDCamaroteKeyTyped

    }//GEN-LAST:event_txtIDCamaroteKeyTyped

    private void txtIDCamaroteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDCamaroteKeyPressed

    }//GEN-LAST:event_txtIDCamaroteKeyPressed

    private void txtIDCamaroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDCamaroteActionPerformed

    }//GEN-LAST:event_txtIDCamaroteActionPerformed

    private void txtIDCamaroteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDCamaroteKeyReleased
        if (txtIDCamarote.getText() != "") {

            if (validar.isEntero(txtIDCamarote.getText())) {
                txtIDCamarote.setForeground(Color.black);
                btnActualizarCamarote.setEnabled(true);

            } else {
                txtIDCamarote.setText("");

                btnActualizarCamarote.setEnabled(false);
            }

        } else {
            txtIDCamarote.setForeground(Color.black);
            btnActualizarCamarote.setEnabled(false);
        }


    }//GEN-LAST:event_txtIDCamaroteKeyReleased

    private void cmbCodigoBuqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCodigoBuqueMouseClicked

    }//GEN-LAST:event_cmbCodigoBuqueMouseClicked

    private void cargarDatos() {
        model = (DefaultTableModel) tablaDatos.getModel();
        model.setRowCount(0);

        try {
            ps = dbConexion().prepareStatement("SELECT codigoCamarote, nivel, tipoCamarote, capacidadMaxima, precioCamarote, estadoCamarote FROM camarotes WHERE codigoBuque = '" + this.cmbCodigoBuque.getSelectedItem() + "'");
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
            java.util.logging.Logger.getLogger(frmCRUDActualizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCRUDActualizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCRUDActualizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCRUDActualizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCRUDActualizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCamarote;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegreesar;
    private javax.swing.JComboBox<String> cmbCodigoBuque;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuque;
    private javax.swing.JLabel lblCRUD;
    private javax.swing.JLabel lblCapacidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNombreBuque;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel panActualizar;
    private javax.swing.JSpinner spCapacidad;
    private javax.swing.JSpinner spNiveel;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtIDCamarote;
    private javax.swing.JTextField txtNombreBuque;
    private javax.swing.JTextField txtPrecioCamarote;
    private javax.swing.JTextField txtTipoCamarote;
    // End of variables declaration//GEN-END:variables
}
