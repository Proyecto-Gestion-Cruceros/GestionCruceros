/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioBase;

import Clases.Personas.clsUsuarios;
import Clases.Personas.ClsPersona;
import javax.swing.JOptionPane;
import Clases.ClsValidaciones;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class frmCrudUsuariosAVAD extends javax.swing.JFrame {

    public frmCrudUsuariosAVAD() {
        initComponents();
    }

    dbConnection conexion = new dbConnection();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    DefaultTableModel temp;

    clsUsuarios Usuario = new clsUsuarios();
    ClsPersona Persona = new ClsPersona();
    ClsValidaciones validar = new ClsValidaciones();

    Icon icon = new ImageIcon(getClass().getResource("/Resources/Error.png"));
    Icon icono = new ImageIcon(getClass().getResource("/Resources/Advertencia.png"));
    Icon Icono = new ImageIcon(getClass().getResource("/Resources/Check.png"));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCargo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdentidadUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombresUsuarios = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelefonoUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCorreoElectronicoUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCargoUsuario = new javax.swing.JTextField();
        btnActualizarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtApellidosUsuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAgregarUsuario1 = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JUsuarios = new javax.swing.JTable();
        btnMenuPrincipal = new javax.swing.JButton();
        txtContraseñaUsuario = new javax.swing.JPasswordField();
        txtConfirmarContraseñaUsuario = new javax.swing.JPasswordField();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));

        lblCargo.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 204, 51));
        lblCargo.setText("----------------- ");

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Identidad");

        txtIdentidadUsuario.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombres");

        txtNombresUsuarios.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefono");

        txtTelefonoUsuario.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo electronico");

        txtCorreoElectronicoUsuario.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 51));
        jLabel8.setText("CRUD ");

        jLabel9.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cargo");

        txtCargoUsuario.setEditable(false);
        txtCargoUsuario.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtCargoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoUsuarioActionPerformed(evt);
            }
        });

        btnActualizarUsuario.setBackground(new java.awt.Color(255, 204, 51));
        btnActualizarUsuario.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnActualizarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarUsuario.setText("ACTUALIZAR");
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setBackground(new java.awt.Color(255, 204, 51));
        btnEliminarUsuario.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarUsuario.setText("ELIMINAR");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apellidos");

        txtApellidosUsuario.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Contraseña");

        jLabel12.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Confirmar contraseña");

        btnAgregarUsuario1.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregarUsuario1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAgregarUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarUsuario1.setText("AGREGAR");
        btnAgregarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarUsuario1ActionPerformed(evt);
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

        JUsuarios.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        JUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "identidad Usuario", "Nombres", "Apellidos", "Telefono", "Correo Electronico", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JUsuarios);

        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenuPrincipal.setBorderPainted(false);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregarUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(278, 278, 278)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(116, 116, 116)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtApellidosUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorreoElectronicoUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefonoUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdentidadUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombresUsuarios, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCargoUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtContraseñaUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(txtConfirmarContraseñaUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(121, 121, 121))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(622, 622, 622)
                                .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(466, 466, 466)))
                        .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblCargo))
                        .addGap(44, 44, 44)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(365, 365, 365)
                                        .addComponent(txtCargoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtIdentidadUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(txtNombresUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(txtApellidosUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(txtTelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtCorreoElectronicoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel4)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel10)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel5)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel11)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtConfirmarContraseñaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCargoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoUsuarioActionPerformed

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        if (!txtIdentidadUsuario.getText().isBlank() || !txtNombresUsuarios.getText().isBlank() || !txtApellidosUsuario.getText().isBlank() || !txtTelefonoUsuario.getText().isBlank()
                || !txtCorreoElectronicoUsuario.getText().isBlank() || !String.valueOf(txtContraseñaUsuario.getPassword()).isBlank() || !String.valueOf(txtConfirmarContraseñaUsuario.getPassword()).isBlank()) {
            if (validar.isEntero(txtIdentidadUsuario.getText()) && txtIdentidadUsuario.getText().length() == 13) {
                if (validar.isLetras(txtNombresUsuarios.getText()) || validar.isLetras(txtApellidosUsuario.getText())) {
                    if (validar.isEntero(txtTelefonoUsuario.getText()) && txtTelefonoUsuario.getText().length() == 8) {
                        //VALIDACIONES PARA CORREO Y CONTRASEÑO LUEGO PROCEDIMIENTO

                        if (String.valueOf(txtContraseñaUsuario.getPassword()).equals(String.valueOf(txtConfirmarContraseñaUsuario.getPassword()))) {

                            Persona.setIdentidad(txtIdentidadUsuario.getText());
                            Persona.setNombres(txtNombresUsuarios.getText());
                            Persona.setApellidos(txtApellidosUsuario.getText());
                            Persona.setTelefono(txtTelefonoUsuario.getText());
                            Persona.setCorreoElectronico(txtCorreoElectronicoUsuario.getText());

                            if (txtCargoUsuario.getText().equals("Administrador")) {
                                Usuario.setCargo(1);
                            } else {
                                Usuario.setCargo(2);
                            }
                            Usuario.setContrasenia(txtContraseñaUsuario.getText());

                            try {
                                if (Usuario.ActualizarPersona()) {

                                    JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> USUARIO ACTUALIZADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);
                                    MostrarUsuarios();

                                } else {
                                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL ACTUALIZAR </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                                }
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE LA CONTRASEÑA </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMNETE EL NUMERO DE TELEFONICO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE EL NOMBRE O APELLIDO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                }
            } else {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE EL NUMERO DE IDENTIDAD </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
            }

        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> INGRESE TODOS LOS DATOS NECESARIOS </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icono);

        }
    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        JUsuarios.getTableHeader().setReorderingAllowed(false);
        JUsuarios.getTableHeader().setForeground(Color.BLACK);
        JUsuarios.getTableHeader().setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        lblCargo.setText(Usuario.getUsuario().toUpperCase());
        txtCargoUsuario.setText(Usuario.getUsuario());
        MostrarUsuarios();
    }//GEN-LAST:event_formWindowOpened

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        frmCrudUsuarios CrudUsuario = new frmCrudUsuarios();

        CrudUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarUsuario1ActionPerformed
        if (!txtIdentidadUsuario.getText().isBlank() || !txtNombresUsuarios.getText().isBlank() || !txtApellidosUsuario.getText().isBlank() || !txtTelefonoUsuario.getText().isBlank()
                || !txtCorreoElectronicoUsuario.getText().isBlank() || !String.valueOf(txtContraseñaUsuario.getPassword()).isBlank() || !String.valueOf(txtConfirmarContraseñaUsuario.getPassword()).isBlank()) {
            if (validar.isEntero(txtIdentidadUsuario.getText()) && txtIdentidadUsuario.getText().length() == 13) {
                if (validar.isLetras(txtNombresUsuarios.getText()) || validar.isLetras(txtApellidosUsuario.getText())) {
                    if (validar.isEntero(txtTelefonoUsuario.getText()) && txtTelefonoUsuario.getText().length() == 8) {
                        //VALIDACIONES PARA CORREO Y CONTRASEÑO LUEGO PROCEDIMIENTO
                        if (validar.isemail(txtCorreoElectronicoUsuario.getText())) {
                            if (String.valueOf(txtContraseñaUsuario.getPassword()).equals(String.valueOf(txtConfirmarContraseñaUsuario.getPassword()))) {

                                Persona.setIdentidad(txtIdentidadUsuario.getText());
                                Persona.setNombres(txtNombresUsuarios.getText());
                                Persona.setApellidos(txtApellidosUsuario.getText());
                                Persona.setTelefono(txtTelefonoUsuario.getText());
                                Persona.setCorreoElectronico(txtCorreoElectronicoUsuario.getText());

                                if (txtCargoUsuario.getText().equals("Administrador")) {
                                    Usuario.setCargo(1);
                                } else {
                                    Usuario.setCargo(2);
                                }
                                Usuario.setContrasenia(txtContraseñaUsuario.getText());

                                try {
                                    if (Usuario.AgregarPersona()) {
                                        JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> USUARIO REGISTRADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);
                                        MostrarUsuarios();
                                    } else {
                                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL REGISTRAR </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                                    }
                                } catch (Exception ex) {
                                    JOptionPane.showMessageDialog(null, ex);
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE LA CONTRASEÑA </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE EL CORREO ELECTRONICO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMNETE EL NUMERO DE TELEFONICO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE EL NOMBRE O APELLIDO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                }
            } else {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE EL NUMERO DE IDENTIDAD </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
            }

        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> INGRESE TODOS LOS DATOS NECESARIOS </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icono);
        }
    }//GEN-LAST:event_btnAgregarUsuario1ActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        if (!txtIdentidadUsuario.getText().isBlank()) {
            if (validar.isEntero(txtIdentidadUsuario.getText()) && txtIdentidadUsuario.getText().length() == 13) {
                try {
                    Persona.setIdentidad(txtIdentidadUsuario.getText());
                    if (Usuario.EliminarPersona()) {

                        int result = JOptionPane.showConfirmDialog(null, "<html><b style=\"color:black; font-size:13px;\">Está Seguro de Eliminar El Usuario?</b></html>", "Salir del Módulo",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE, icono);
                        if (result == JOptionPane.YES_OPTION) {
                            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> USUARIO ELIMINADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);
                            MostrarUsuarios();
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL ELIMINAR </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE EL NUMERO DE IDENTIDAD </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> INGRESE EL NUMERO DE IDENTIDAD PARA PODER ELIMINAR </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icono);
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void JUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JUsuariosMouseClicked
        int seleccionar = JUsuarios.rowAtPoint(evt.getPoint());
        txtIdentidadUsuario.setText(String.valueOf(JUsuarios.getValueAt(seleccionar, 0)));
        txtNombresUsuarios.setText(String.valueOf(JUsuarios.getValueAt(seleccionar, 1)));
        txtApellidosUsuario.setText(String.valueOf(JUsuarios.getValueAt(seleccionar, 2)));
        txtTelefonoUsuario.setText(String.valueOf(JUsuarios.getValueAt(seleccionar, 3)));
        txtCorreoElectronicoUsuario.setText(String.valueOf(JUsuarios.getValueAt(seleccionar, 4)));
        txtContraseñaUsuario.setText(null);
        txtConfirmarContraseñaUsuario.setText(null);

    }//GEN-LAST:event_JUsuariosMouseClicked

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "<html><b style=\"color:black; font-size:13px;\">Está seguro de volver al Menú Principal?</b></html>", "Salir del Módulo",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, icono);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIdentidadUsuario.setText(null);
        txtNombresUsuarios.setText(null);
        txtApellidosUsuario.setText(null);
        txtTelefonoUsuario.setText(null);
        txtCorreoElectronicoUsuario.setText(null);
        txtContraseñaUsuario.setText(null);
        txtConfirmarContraseñaUsuario.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    void limpiaTabla() {
        try {
            temp = (DefaultTableModel) JUsuarios.getModel();
            temp.setRowCount(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }

    public void MostrarUsuarios() {
        try {
            limpiaTabla();
            int Cargo;
            if (txtCargoUsuario.getText().equals("Administrador")) {
                Cargo = 1;
            } else {
                Cargo = 2;
            }

            ps = dbConnection.dbConexion().prepareStatement("SELECT [identidadUsuario], [nombres] ,[apellidos],[telefono] ,[correoElectronico] ,[estado] FROM [agenciaCruceros].[dbo].[usuarios] WHERE [cargo] = ?");
            ps.setInt(1, Cargo);
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

            dtm = (DefaultTableModel) this.JUsuarios.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "", JOptionPane.INFORMATION_MESSAGE, icon);
        }

    }

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
            java.util.logging.Logger.getLogger(frmCrudUsuariosAVAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrudUsuariosAVAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrudUsuariosAVAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrudUsuariosAVAD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrudUsuariosAVAD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JUsuarios;
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JButton btnAgregarUsuario1;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JTextField txtApellidosUsuario;
    private javax.swing.JTextField txtCargoUsuario;
    private javax.swing.JPasswordField txtConfirmarContraseñaUsuario;
    private javax.swing.JPasswordField txtContraseñaUsuario;
    private javax.swing.JTextField txtCorreoElectronicoUsuario;
    private javax.swing.JTextField txtIdentidadUsuario;
    private javax.swing.JTextField txtNombresUsuarios;
    private javax.swing.JTextField txtTelefonoUsuario;
    // End of variables declaration//GEN-END:variables
}
