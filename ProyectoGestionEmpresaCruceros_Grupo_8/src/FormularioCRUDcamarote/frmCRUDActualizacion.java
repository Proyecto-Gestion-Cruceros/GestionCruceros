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
import java.awt.Font;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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
    
    Icon icono = new ImageIcon(getClass().getResource("/Resources/Advertencia.png"));
    Icon icon = new ImageIcon(getClass().getResource("/Resources/Error.png"));
    Icon Icono = new ImageIcon(getClass().getResource("/Resources/Check.png"));

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

        lblPrecio.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio");

        txtPrecioCamarote.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtPrecioCamarote.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioCamaroteKeyReleased(evt);
            }
        });

        btnActualizarCamarote.setBackground(new java.awt.Color(255, 204, 51));
        btnActualizarCamarote.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnActualizarCamarote.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarCamarote.setText("ACTUALIZAR");
        btnActualizarCamarote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCamaroteActionPerformed(evt);
            }
        });

        lblNivel.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblNivel.setForeground(new java.awt.Color(255, 255, 255));
        lblNivel.setText("Nivel");

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

        lblCodigo.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código de Camarote");

        lblCRUD.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        lblCRUD.setForeground(new java.awt.Color(255, 204, 51));
        lblCRUD.setText("ACTUALIZACION DE CAMAROTES");

        lblNombreBuque.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblNombreBuque.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreBuque.setText("Nombre de Buque");

        lblTipo.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 255));
        lblTipo.setText("Tipo de Camarote");

        spNiveel.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        spNiveel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));
        spNiveel.setEnabled(false);
        spNiveel.setVerifyInputWhenFocusTarget(false);

        lblCapacidad.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblCapacidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCapacidad.setText("Capacidad Máxima de Personas");

        lblBuque.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblBuque.setForeground(new java.awt.Color(255, 255, 255));
        lblBuque.setText("Código de Buque");

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblEstado.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado ");

        cmbEstado.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desocupado", "Ocupado" }));
        cmbEstado.setToolTipText("");
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });

        spCapacidad.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        spCapacidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 6, 1));
        spCapacidad.setVerifyInputWhenFocusTarget(false);

        tablaDatos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        tablaDatos.setForeground(new java.awt.Color(0, 0, 0));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Camarote", "Nivel", "Tipo de Camarote", "Capacidad Máxima de Personas", "Precio", "Estado"
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

        btnBuscar.setBackground(new java.awt.Color(255, 204, 51));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lupa (2).png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtTipoCamarote.setEditable(false);
        txtTipoCamarote.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        txtNombreBuque.setEditable(false);
        txtNombreBuque.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        btnRegreesar.setBackground(new java.awt.Color(255, 204, 51));
        btnRegreesar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnRegreesar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegreesar.setText("REGRESAR");
        btnRegreesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegreesarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panActualizarLayout = new javax.swing.GroupLayout(panActualizar);
        panActualizar.setLayout(panActualizarLayout);
        panActualizarLayout.setHorizontalGroup(
            panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panActualizarLayout.createSequentialGroup()
                .addGap(598, 598, 598)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269)
                .addComponent(btnActualizarCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panActualizarLayout.createSequentialGroup()
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegreesar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panActualizarLayout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panActualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panActualizarLayout.createSequentialGroup()
                        .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panActualizarLayout.createSequentialGroup()
                                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCapacidad)
                                    .addComponent(lblBuque)
                                    .addComponent(lblNombreBuque)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblNivel)
                                    .addComponent(lblTipo)
                                    .addComponent(lblPrecio))
                                .addGap(26, 26, 26))
                            .addGroup(panActualizarLayout.createSequentialGroup()
                                .addComponent(lblEstado)
                                .addGap(254, 254, 254)))
                        .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panActualizarLayout.createSequentialGroup()
                                .addComponent(txtIDCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbCodigoBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spNiveel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTipoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(637, 637, 637))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panActualizarLayout.createSequentialGroup()
                        .addComponent(lblCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(583, 583, 583))))
        );
        panActualizarLayout.setVerticalGroup(
            panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panActualizarLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblCRUD, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuque)
                    .addComponent(cmbCodigoBuque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panActualizarLayout.createSequentialGroup()
                        .addComponent(lblNombreBuque)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panActualizarLayout.createSequentialGroup()
                        .addComponent(txtNombreBuque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCodigo)
                        .addComponent(txtIDCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(26, 26, 26)
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spNiveel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNivel))
                .addGap(33, 33, 33)
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipo))
                .addGap(30, 30, 30)
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio))
                .addGap(31, 31, 31)
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCapacidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spCapacidad))
                .addGap(36, 36, 36)
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnRegreesar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tablaDatos.getTableHeader().setReorderingAllowed(false);
        tablaDatos.getTableHeader().setForeground(Color.BLACK);
        tablaDatos.getTableHeader().setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        
        cmbEstado.setEnabled(false);
        spCapacidad.setEnabled(false);
        txtPrecioCamarote.setEnabled(false);
        btnActualizarCamarote.setEnabled(false);
        ((JSpinner.DefaultEditor) spCapacidad.getEditor()).getTextField().setEditable(false);
        txtIDCamarote.setEnabled(false);
        btnBuscar.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void limpiarCampos() {
        txtNombreBuque.setText(null);
        txtIDCamarote.setText(null);
        txtPrecioCamarote.setEnabled(false);
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
        txtPrecioCamarote.setEnabled(false);
        cmbEstado.setSelectedIndex(0);
    }

    private void limpiarCambio() {
        txtIDCamarote.setText(null);
        spNiveel.setValue(1);
        txtTipoCamarote.setText(null);
        spCapacidad.setValue(1);
        txtPrecioCamarote.setText(null);
        cmbEstado.setSelectedIndex(0);
        cmbEstado.setEnabled(false);
        spCapacidad.setEnabled(false);
        btnBuscar.setEnabled(false);
        txtPrecioCamarote.setEnabled(false);
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
                txtPrecioCamarote.setEnabled(true);
                cargarDatosSeleccionados(Integer.parseInt(txtIDCamarote.getText()));
                
            } else {
                JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> REGISTRO DE CAMAROTE NO ENCONTRADO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
                cmbEstado.setEnabled(false);
                spCapacidad.setEnabled(false);
                txtIDCamarote.setText(null);
                btnActualizarCamarote.setEnabled(false);
                txtPrecioCamarote.setEnabled(false);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Buscar " + ex, "",JOptionPane.INFORMATION_MESSAGE, icon);
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
            ps = dbConexion().prepareStatement("UPDATE camarotes SET capacidadMaxima=?, estadoCamarote=?, precioCamarote = ?  WHERE codigoCamarote = ?");
            ps.setString(1, String.valueOf(spCapacidad.getValue()));
            ps.setString(2, String.valueOf(cmbEstado.getSelectedItem()));
            ps.setString(3, txtPrecioCamarote.getText());
            ps.setString(4, txtIDCamarote.getText());

            int llenado = ps.executeUpdate();

            if (llenado > 0) { 
                JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> CAMAROTE ACTUALIZADO CORRECTAMENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);
                cargarDatos();
                limpiarCambio();
            } else {     
                JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> INSERTAR CODIGO DEL CAMAROTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar los datos " + ex, "",JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_btnActualizarCamaroteActionPerformed

    private void btnRegreesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegreesarActionPerformed
       dispose();
    }//GEN-LAST:event_btnRegreesarActionPerformed

    private void tablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaDatosMouseClicked
        int llenar = this.tablaDatos.getSelectedRow();
        this.txtIDCamarote.setText(String.valueOf(tablaDatos.getValueAt(llenar, 0)));
        limpiar();
        btnBuscar.setEnabled(true);
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
                txtPrecioCamarote.setEnabled(false);
                btnBuscar.setEnabled(false);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, icon); 
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
                btnBuscar.setEnabled(true);

                txtPrecioCamarote.setEnabled(true);
                cmbEstado.setEnabled(true);
                spCapacidad.setEnabled(true);
                txtTipoCamarote.setEnabled(true);

            } else {
                txtIDCamarote.setText("");
                btnBuscar.setEnabled(false);
                btnActualizarCamarote.setEnabled(false);
                
                txtPrecioCamarote.setEnabled(false);
                cmbEstado.setEnabled(false);
                spCapacidad.setEnabled(false);
                txtTipoCamarote.setEnabled(false);
                
                
                spNiveel.setValue(1);
                spCapacidad.setValue(1);
                txtTipoCamarote.setText(null);
                txtPrecioCamarote.setText(null);
                cmbEstado.setSelectedIndex(0);
                
                cargarDatos();
            
            }

        } else {
            txtIDCamarote.setForeground(Color.black);
            btnActualizarCamarote.setEnabled(false);
            btnBuscar.setEnabled(false);
            
            txtPrecioCamarote.setEnabled(false);
            cmbEstado.setEnabled(false);
            spCapacidad.setEnabled(false);
            txtTipoCamarote.setEnabled(false);

            spNiveel.setValue(1);
            spCapacidad.setValue(1);
            txtTipoCamarote.setText(null);
            txtPrecioCamarote.setText(null);
            cmbEstado.setSelectedIndex(0);
            
            cargarDatos();
        }
    }//GEN-LAST:event_txtIDCamaroteKeyReleased

    private void cmbCodigoBuqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCodigoBuqueMouseClicked

    }//GEN-LAST:event_cmbCodigoBuqueMouseClicked

    private void txtPrecioCamaroteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioCamaroteKeyReleased
         if (txtPrecioCamarote.getText() != "") {

            if (validar.isDecimal(txtPrecioCamarote.getText())) {
                txtPrecioCamarote.setForeground(Color.black);
                btnActualizarCamarote.setEnabled(true);
 
            } else {
                txtPrecioCamarote.setForeground(Color.red);
                btnActualizarCamarote.setEnabled(false);
            }

        } else {
            txtPrecioCamarote.setForeground(Color.black);
            btnActualizarCamarote.setEnabled(false);
        }
    }//GEN-LAST:event_txtPrecioCamaroteKeyReleased

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
            JOptionPane.showMessageDialog(null, "Error al cargar los datos en la tabla " + ex, "",JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }
    
     private void cargarDatosSeleccionados(int codigoCamarote) {
        model = (DefaultTableModel) tablaDatos.getModel();
        model.setRowCount(0);

        try {
            ps = dbConexion().prepareStatement("SELECT codigoCamarote, nivel, tipoCamarote, capacidadMaxima, precioCamarote, estadoCamarote FROM camarotes WHERE codigoBuque = '" + this.cmbCodigoBuque.getSelectedItem() + "' AND codigoCamarote = " + codigoCamarote);
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
            JOptionPane.showMessageDialog(null, "Error al cargar los datos en la tabla " + ex, "",JOptionPane.INFORMATION_MESSAGE, icon);
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
