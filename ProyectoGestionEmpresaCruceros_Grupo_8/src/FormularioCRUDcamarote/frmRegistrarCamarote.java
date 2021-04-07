package FormularioCRUDcamarote;

import Clases.CRUDcamarote.clsCamarote;
import Clases.clsMessage;
import Clases.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static Clases.dbConnection.dbConexion;
import java.net.URL;

import java.sql.SQLException;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.JSpinner;


public class frmRegistrarCamarote extends javax.swing.JFrame {

    clsCamarote camarote = new clsCamarote();
    dbConnection conexion = new dbConnection();
    PreparedStatement ps;
    ResultSet result = null;
    clsMessage message = new clsMessage();
    
    private int retornarCodigoCamarote;

    public frmRegistrarCamarote() {
        initComponents();

        camarote.extraer_codigoBuque(cmbCodigoBuque);
    }

    private void limpiarCampos() {
        cmbCodigoBuque.setSelectedIndex(0);
        txtNombreBuque.setText(null);
        txtCodigoCamarote.setText(null);
        cmbNivel.setSelectedIndex(0);
        cmbTipoCamarote.setSelectedIndex(0);
        cmbPrecio.setSelectedIndex(0);
        spCapacidadPersonas.setValue(1);
        cmbEstadoCamarote.setSelectedIndex(0);
        btnAgregar.setEnabled(false);
    }
     
    private void bloquear(){
        btnAgregar.setEnabled(false);
        cmbTipoCamarote.setEnabled(false);
        cmbPrecio.setEnabled(false);
        cmbNivel.setEnabled(false);
        spCapacidadPersonas.setEnabled(false);
        cmbEstadoCamarote.setEnabled(false);
    }
    
       private void desbloquear(){
        btnAgregar.setEnabled(true);
        cmbTipoCamarote.setEnabled(true);
        cmbPrecio.setEnabled(false);
        cmbNivel.setEnabled(false);
        spCapacidadPersonas.setEnabled(true);
        cmbEstadoCamarote.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Camarote = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoCamarote = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreBuque = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbTipoCamarote = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbCodigoBuque = new javax.swing.JComboBox<>();
        btnLimpiaar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cmbEstadoCamarote = new javax.swing.JComboBox<>();
        spCapacidadPersonas = new javax.swing.JSpinner();
        cmbPrecio = new javax.swing.JComboBox<>();
        btnRegresar = new javax.swing.JButton();
        cmbNivel = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Camarote.setBackground(new java.awt.Color(0, 79, 129));

        lblImagen.setBackground(new java.awt.Color(255, 255, 255));
        lblImagen.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        lblImagen.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio");

        btnAgregar.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("REGISTRAR");
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
        txtCodigoCamarote.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoCamarote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoCamaroteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código de Camarote");

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("REGISTRO DE CAMAROTES");

        jLabel6.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre del Buque");

        txtNombreBuque.setEditable(false);
        txtNombreBuque.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtNombreBuque.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipo de Camarote");

        jLabel8.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Capacidad Máxima de Personas");

        cmbTipoCamarote.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbTipoCamarote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Opción", "Interior", "Vista al Océano ", "Balcón", "Suite " }));
        cmbTipoCamarote.setInheritsPopupMenu(true);
        cmbTipoCamarote.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTipoCamaroteItemStateChanged(evt);
            }
        });
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

        btnLimpiaar.setBackground(new java.awt.Color(255, 204, 51));
        btnLimpiaar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnLimpiaar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiaar.setText("LIMPIAR");
        btnLimpiaar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaarActionPerformed(evt);
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
        spCapacidadPersonas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spCapacidadPersonasKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spCapacidadPersonasKeyTyped(evt);
            }
        });

        cmbPrecio.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----" }));
        cmbPrecio.setEnabled(false);
        cmbPrecio.setFocusable(false);
        cmbPrecio.setInheritsPopupMenu(true);
        cmbPrecio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPrecioItemStateChanged(evt);
            }
        });
        cmbPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPrecioActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(255, 204, 51));
        btnRegresar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        cmbNivel.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----" }));
        cmbNivel.setEnabled(false);
        cmbNivel.setFocusable(false);
        cmbNivel.setInheritsPopupMenu(true);
        cmbNivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbNivelItemStateChanged(evt);
            }
        });
        cmbNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CamaroteLayout = new javax.swing.GroupLayout(Camarote);
        Camarote.setLayout(CamaroteLayout);
        CamaroteLayout.setHorizontalGroup(
            CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CamaroteLayout.createSequentialGroup()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CamaroteLayout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CamaroteLayout.createSequentialGroup()
                                .addGap(314, 314, 314)
                                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CamaroteLayout.createSequentialGroup()
                                        .addComponent(txtCodigoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 922, Short.MAX_VALUE))
                                    .addGroup(CamaroteLayout.createSequentialGroup()
                                        .addComponent(cmbCodigoBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 774, Short.MAX_VALUE))))
                            .addGroup(CamaroteLayout.createSequentialGroup()
                                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(CamaroteLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbEstadoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spCapacidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addGroup(CamaroteLayout.createSequentialGroup()
                                        .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3))
                                        .addGap(150, 150, 150)
                                        .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbTipoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(CamaroteLayout.createSequentialGroup()
                                                .addComponent(cmbPrecio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(149, 149, 149))
                                            .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(743, Short.MAX_VALUE))))
                    .addGroup(CamaroteLayout.createSequentialGroup()
                        .addGap(827, 827, 827)
                        .addComponent(txtNombreBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(CamaroteLayout.createSequentialGroup()
                .addGap(622, 622, 622)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CamaroteLayout.createSequentialGroup()
                        .addComponent(btnLimpiaar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CamaroteLayout.setVerticalGroup(
            CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CamaroteLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbCodigoBuque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombreBuque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spCapacidadPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cmbEstadoCamarote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(CamaroteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiaar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Camarote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Camarote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (cmbCodigoBuque.getSelectedIndex() != 0 && cmbTipoCamarote.getSelectedIndex() != 0) {
                ps = dbConexion().prepareStatement("INSERT INTO camarotes VALUES (?, ?, ?, ?, ?, ?, ?)");
                ps.setString(1, String.valueOf(txtCodigoCamarote.getText()));
                ps.setString(2, String.valueOf(cmbCodigoBuque.getSelectedItem()));
                ps.setString(3, String.valueOf(cmbNivel.getSelectedItem()));   
                ps.setString(4, String.valueOf(cmbTipoCamarote.getSelectedItem()));
                ps.setString(5, String.valueOf(spCapacidadPersonas.getValue()));
                ps.setString(6, String.valueOf(cmbPrecio.getSelectedItem()));
                ps.setString(7, String.valueOf(cmbEstadoCamarote.getSelectedItem()));
                ps.executeUpdate();
                 JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> CAMAROTE REGISTRADO CORRECTAMENTE</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.Icono);
                 limpiarCampos();
            } else {
                
                JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> VERIFIQUE QUE TODOS LOS CAMPOS ESTEN LLENOS</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icono);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Registrar los datos " + ex, "",JOptionPane.INFORMATION_MESSAGE, message.icon);
        } finally {
            retornarCodigoCamarote = retornarUltimoIdCamarote() + 1;
    
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbTipoCamaroteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTipoCamaroteItemStateChanged
        int selectedIndex = cmbTipoCamarote.getSelectedIndex();
        String ubicacion;
        URL url = null;
        cargarPrecios();
        cargarNivel();

        switch (selectedIndex) {

            case 0:
                ubicacion = "/Resources/fondo.PNG";
                url = this.getClass().getResource(ubicacion);
                ImageIcon Imagen = new ImageIcon(url);
                lblImagen.setIcon(Imagen);
                cmbPrecio.setSelectedItem("----");
                cmbNivel.setSelectedItem("----");
                break;

            case 1:
                ubicacion = "/Resources/Interor.png";
                url = this.getClass().getResource(ubicacion);
                ImageIcon imagen = new ImageIcon(url);
                lblImagen.setIcon(imagen);
                cmbPrecio.setSelectedItem("50");
                cmbNivel.setSelectedItem("4");
                break;

            case 2:
                ubicacion = "/Resources/VO.png";
                url = this.getClass().getResource(ubicacion);
                ImageIcon imagenes = new ImageIcon(url);
                lblImagen.setIcon(imagenes);
                cmbPrecio.setSelectedItem("75");
                cmbNivel.setSelectedItem("3");
                break;

            case 3:
                ubicacion = "/Resources/Balcoon.png";
                url = this.getClass().getResource(ubicacion);
                ImageIcon image = new ImageIcon(url);
                lblImagen.setIcon(image);
                cmbPrecio.setSelectedItem("100");
                cmbNivel.setSelectedItem("2");
                break;

            case 4:
                ubicacion = "/Resources/Suite.png";
                url = this.getClass().getResource(ubicacion);
                ImageIcon Image = new ImageIcon(url);
                lblImagen.setIcon(Image);
                cmbPrecio.setSelectedItem("150");
                cmbNivel.setSelectedItem("1");
                break;

        }
    }//GEN-LAST:event_cmbTipoCamaroteItemStateChanged

    private void cargarPrecios() {
        cmbPrecio.removeAllItems();
        cmbPrecio.addItem("----");
        cmbPrecio.addItem("50");
        cmbPrecio.addItem("75");
        cmbPrecio.addItem("100");
        cmbPrecio.addItem("150");
    }
    
    private void cargarNivel() {
        cmbNivel.removeAllItems();
        cmbNivel.addItem("----");
        cmbNivel.addItem("1");
        cmbNivel.addItem("2");
        cmbNivel.addItem("3");
        cmbNivel.addItem("4");
    }

    private void cmbTipoCamaroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoCamaroteActionPerformed
        try {

            int selectedIndex = cmbPrecio.getSelectedIndex();

            if (cmbTipoCamarote.getSelectedIndex() == 1) {
                ps = dbConexion().prepareStatement("SELECT precioCamarote FROM camarotes WHERE tipoCamarote = '" + this.cmbTipoCamarote.getSelectedItem() + "'");
                ResultSet result = ps.executeQuery();
                result.next();

                selectedIndex = 1;
                cmbPrecio.setSelectedItem(result.getString("precioCamarote").trim());

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, message.icon); 
            
        }
    }//GEN-LAST:event_cmbTipoCamaroteActionPerformed

    private void cmbCodigoBuqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodigoBuqueActionPerformed
        try {     
            if (cmbCodigoBuque.getSelectedIndex() != 0) {
                btnAgregar.setEnabled(true);
                ps = dbConexion().prepareStatement("SELECT nombreBuque FROM buques WHERE codigoBuque = '" + this.cmbCodigoBuque.getSelectedItem() + "'");
                ResultSet result = ps.executeQuery();
                result.next();
                this.txtNombreBuque.setText(result.getString("nombreBuque"));

                if (retornarUltimoIdCamarote() > 0 && retornarUltimoIdCamarote() <= 153) {
                    retornarCodigoCamarote = retornarUltimoIdCamarote() + 1;
                    txtCodigoCamarote.setText(String.valueOf(retornarCodigoCamarote));
                    desbloquear();

                } else if (retornarUltimoIdCamarote() >= 154) {
                    retornarCodigoCamarote = retornarUltimoIdCamarote();
                    txtCodigoCamarote.setText(String.valueOf(retornarCodigoCamarote));
                    bloquear();      
                    JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> LA CAPACIDAD MAXIMA DE CAMAROTES EN EL BUQUE HA SIDO ALCANZADA </b></html>" , "",JOptionPane.INFORMATION_MESSAGE, message.icono);
                }else {
                    retornarCodigoCamarote = 1;
                    txtCodigoCamarote.setText(Integer.toString(retornarCodigoCamarote));
                    desbloquear();
        
                }

            } else {
                limpiarCampos();
                btnAgregar.setEnabled(false);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, message.icon);   
        }
    }//GEN-LAST:event_cmbCodigoBuqueActionPerformed

    private int retornarUltimoIdCamarote() {
        try {

            int ultimoCamarote = 0;
            if (cmbCodigoBuque.getSelectedIndex() != 0) {

                ps = dbConexion().prepareStatement("SELECT MAX(codigoCamarote) as ultimoCamarote FROM camarotes WHERE codigoBuque = '" + this.cmbCodigoBuque.getSelectedItem() + "'");
                ResultSet result = ps.executeQuery();

                if (result.next()) {

                    if (result.getString("ultimoCamarote") != null) {
                        ultimoCamarote = Integer.parseInt(result.getString("ultimoCamarote"));
                    }
                }
            }
            return ultimoCamarote;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, message.icon); 

        }
        return 0;
    }


    private void btnLimpiaarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaarActionPerformed
        limpiarCampos();

    }//GEN-LAST:event_btnLimpiaarActionPerformed

    private void cmbEstadoCamaroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoCamaroteActionPerformed

    }//GEN-LAST:event_cmbEstadoCamaroteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    ((JSpinner.DefaultEditor) spCapacidadPersonas.getEditor()).getTextField().setEditable(false);
    btnAgregar.setEnabled(false);
    
    }//GEN-LAST:event_formWindowOpened


    private void cmbPrecioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPrecioItemStateChanged
    
    }//GEN-LAST:event_cmbPrecioItemStateChanged

    private void cmbPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPrecioActionPerformed
      
    }//GEN-LAST:event_cmbPrecioActionPerformed

    private void txtCodigoCamaroteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoCamaroteActionPerformed

    }//GEN-LAST:event_txtCodigoCamaroteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
          dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void spCapacidadPersonasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spCapacidadPersonasKeyTyped

       
    }//GEN-LAST:event_spCapacidadPersonasKeyTyped

    private void spCapacidadPersonasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spCapacidadPersonasKeyPressed

    }//GEN-LAST:event_spCapacidadPersonasKeyPressed

    private void cmbNivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbNivelItemStateChanged
      
    }//GEN-LAST:event_cmbNivelItemStateChanged

    private void cmbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelActionPerformed
 
    }//GEN-LAST:event_cmbNivelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Camarote;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiaar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbCodigoBuque;
    private javax.swing.JComboBox<String> cmbEstadoCamarote;
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JComboBox<String> cmbPrecio;
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
    private javax.swing.JSpinner spCapacidadPersonas;
    private javax.swing.JTextField txtCodigoCamarote;
    private javax.swing.JTextField txtNombreBuque;
    // End of variables declaration//GEN-END:variables
}
