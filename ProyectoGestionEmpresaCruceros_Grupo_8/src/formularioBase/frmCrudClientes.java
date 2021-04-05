package formularioBase;

import Clases.Cliente.ClsClientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Clases.ClsValidaciones;
import Clases.Personas.ClsPersona;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import java.awt.Color;
import java.awt.Font;

import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edmej
 */
public class frmCrudClientes extends javax.swing.JFrame {



    public frmCrudClientes() {
        initComponents();
        btnMenuPrincipal.setOpaque(false);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.setBorderPainted(false);
    }

    ClsValidaciones validar = new ClsValidaciones();
    ClsClientes cliente = new ClsClientes();
    ClsPersona persona = new ClsPersona();
    dbConnection dbConn =  new dbConnection();
    Connection cn = dbConn.dbConexion();
    PreparedStatement ps = null;
    ResultSet rs;
    
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    DefaultTableModel temp;
    
    Icon icon = new ImageIcon(getClass().getResource("/Resources/Error.png"));
    Icon icono = new ImageIcon(getClass().getResource("/Resources/Advertencia.png"));
    Icon Icono = new ImageIcon(getClass().getResource("/Resources/Check.png"));
     
    String fecha = "";
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombresCliente = new javax.swing.JTextField();
        txtApellidosCliente = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreoCliente = new javax.swing.JTextField();
        cmbEstadoCliente = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdentidadCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        btnEliminarCliente = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        btnListo = new javax.swing.JButton();
        lbActualizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 45 Book", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Clientes");

        jLabel2.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres del Cliente:");

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos del Cliente:");

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono:");

        jLabel5.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo Electrónico:");

        jLabel6.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado:");

        txtNombresCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtNombresCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtNombresCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtApellidosCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidosCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtApellidosCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefono.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));

        txtCorreoCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtCorreoCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtCorreoCliente.setForeground(new java.awt.Color(0, 0, 0));

        cmbEstadoCliente.setBackground(new java.awt.Color(204, 204, 204));
        cmbEstadoCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        cmbEstadoCliente.setForeground(new java.awt.Color(0, 0, 0));
        cmbEstadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " <Seleccione>", "Activo", "Inactivo" }));
        cmbEstadoCliente.setToolTipText("");

        btnAgregar.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregar.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 22)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 204, 51));
        btnModificar.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 22)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección:");

        txtDireccionCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccionCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Identidad Cliente:");

        txtIdentidadCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtIdentidadCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtIdentidadCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtIdentidadCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTClientes.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identidad", "Nombres", "Apellidos", "Teléfono", "Correo", "Fecha Nacimiento", "Dirección", "Estado"
            }
        ));
        jTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTClientes);

        btnEliminarCliente.setBackground(new java.awt.Color(255, 204, 51));
        btnEliminarCliente.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 22)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarCliente.setLabel("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 22)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnMenuPrincipal.setBackground(new java.awt.Color(0, 79, 129));
        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenuPrincipal.setBorderPainted(false);
        btnMenuPrincipal.setPreferredSize(new java.awt.Dimension(80, 76));
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha de Nacimiento:");

        txtFechaNacimiento.setEditable(false);
        txtFechaNacimiento.setBackground(new java.awt.Color(204, 204, 204));
        txtFechaNacimiento.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtFechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));

        jdcFecha.setBackground(new java.awt.Color(204, 204, 204));
        jdcFecha.setForeground(new java.awt.Color(0, 0, 0));
        jdcFecha.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N

        btnListo.setBackground(new java.awt.Color(255, 204, 51));
        btnListo.setFont(new java.awt.Font("Doppio One", 0, 14)); // NOI18N
        btnListo.setForeground(new java.awt.Color(0, 0, 0));
        btnListo.setLabel("Listo");
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });

        lbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/refresh_30px.png"))); // NOI18N
        lbActualizar.setIconTextGap(2);
        lbActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(67, 67, 67)
                                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnListo)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(155, 155, 155)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)))
                        .addGap(1090, 1090, 1090))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdentidadCliente)
                                .addComponent(txtNombresCliente)
                                .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbActualizar))
                        .addContainerGap(58, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(757, 757, 757))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(lbActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtIdentidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnListo)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(cmbEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
          int telefono = Integer.parseInt(txtTelefono.getText());
          
        if(!txtIdentidadCliente.getText().isBlank() || !txtNombresCliente.getText().isBlank() || !txtApellidosCliente.getText().isBlank() || !txtTelefono.getText().isBlank() || !txtCorreoCliente.getText().isBlank() || !txtFechaNacimiento.getText().isBlank() || !txtDireccionCliente.getText().isBlank() || cmbEstadoCliente.getSelectedItem() != "<Seleccione>")
        {
            
            if(validar.isEntero(txtIdentidadCliente.getText()) && txtIdentidadCliente.getText().length() == 13)
            {
                if(validar.isLetras(txtNombresCliente.getText()) || validar.isLetras(txtApellidosCliente.getText()) || validar.isLetras(txtDireccionCliente.getText()))
                {
                    if(validar.isEntero(txtTelefono.getText()) && txtTelefono.getText().length() == 8)
                    {
                        if(validar.isemail(txtCorreoCliente.getText()))
                        {  
                           String fecha2 =  txtFechaNacimiento.getText().toString();
                           if(fecha.equals(fecha2))
                           {
                               
                                persona.setIdentidad(txtIdentidadCliente.getText());
                                persona.setNombres(txtNombresCliente.getText());
                                persona.setApellidos(txtApellidosCliente.getText());
                                persona.setTelefono(txtTelefono.getText());
                                persona.setCorreoElectronico(txtCorreoCliente.getText());
                                cliente.setFechaNacimiento(txtFechaNacimiento.getText());
                                cliente.setDireccionCliente(txtDireccionCliente.getText());
                                persona.setEstado(cmbEstadoCliente.getSelectedItem().toString());

                                try{

                                    if(cliente.AgregarPersona())
                                    {
                                        JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> CLIENTE REGISTRADO CORRECTAMENTE</b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);
                                        jdcFecha.setCalendar(null);
                                        fecha = "";
                                    }
                                    else 
                                    {
                                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL INTENTAR INGRESAR EL CLIENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
                                        jdcFecha.setCalendar(null);
                                        fecha = "";
                                    }

                                }
                                catch(Exception ex)
                                {
                                    JOptionPane.showMessageDialog(null, ex);
                                }
                               
                           }
                           else{
                               
                               JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE UNA FECHA VALIDA </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

                           }
                           
                      
                        }
                        else{
                            
                             JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE UN CORREO VALIDO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

                        }

                    }   
                    else {
                        
                         JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE UN TELEFONO VALIDO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

                    }
  
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> REVISE NOMBRES Y APELLIDOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> EL NUMERO DE IDENTIDAD NO TIENE UN FORMATO VALIDO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

            }
            
        }
        else
        {
             JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> DEBE INGRESAR TODOS LOS DATOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        

        int telefono = Integer.parseInt(txtTelefono.getText());
        
        if(!txtIdentidadCliente.getText().isBlank() || !txtNombresCliente.getText().isBlank() || !txtApellidosCliente.getText().isBlank() || !txtTelefono.getText().isBlank() || !txtCorreoCliente.getText().isBlank() || !txtFechaNacimiento.getText().isBlank() || !txtDireccionCliente.getText().isBlank() || cmbEstadoCliente.getSelectedItem() != "<Seleccione>")
        {
            
            if(validar.isEntero(txtIdentidadCliente.getText()) && txtIdentidadCliente.getText().length() == 13)
            {
                if(validar.isLetras(txtNombresCliente.getText()) || validar.isLetras(txtApellidosCliente.getText()) || validar.isLetras(txtDireccionCliente.getText()))
                {
                    if(validar.isEntero(txtTelefono.getText()) && txtTelefono.getText().length() == 8)
                    {
                        if(validar.isemail(txtCorreoCliente.getText()))
                        {
                            String fecha2 =  txtFechaNacimiento.getText().toString();
                           if(fecha.equals(fecha2))
                           {
                               
                                persona.setIdentidad(txtIdentidadCliente.getText());
                                persona.setNombres(txtNombresCliente.getText());
                                persona.setApellidos(txtApellidosCliente.getText());
                                persona.setTelefono(txtTelefono.getText());
                                persona.setCorreoElectronico(txtCorreoCliente.getText());
                                cliente.setFechaNacimiento(fecha2);
                                cliente.setDireccionCliente(txtDireccionCliente.getText());
                                persona.setEstado(cmbEstadoCliente.getSelectedItem().toString());

                                try{

                                    if(cliente.ActualizarPersona())
                                    {
                                        JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> CLIENTE ACTUALIZADO CORRECTAMENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);
                                        LimpiarTabla();
                                        LlenarTabla();
                                        jdcFecha.setCalendar(null);
                                        fecha = "";
                                        
                                    }
                                    else 
                                    {
                                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL INTENTAR MODIFICAR UN CLIENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
                                        jdcFecha.setCalendar(null);
                                        fecha = "";
                                    }

                                }
                                catch(Exception ex)
                                {
                                    JOptionPane.showMessageDialog(null, ex);
                                }
                               
                           }
                           else{
                               
                               JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE UNA FECHA VALIDA </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

                           }
                           
                      
                        }
                        else{
                            
                             JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE UN CORREO VALIDO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

                        }

                    }   
                    else {
                        
                         JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE UN TELEFONO VALIDO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

                    }
  
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> REVISE NOMBRES Y APELLIDOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> EL NUMERO DE IDENTIDAD NO TIENE UN FORMATO VALIDO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

            }
            
        }
        else
        {
             JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> DEBE INGRESAR TODOS LOS DATOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    public void LimpiarTabla()
    {  
        try
        {
            temp = (DefaultTableModel) jTClientes.getModel();
            temp.setRowCount(0);
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }
    }
    
    public void LlenarTabla()
    {
        try{
            
            ps = dbConnection.dbConexion().prepareStatement("SELECT * FROM [dbo].[clientes]");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();
            
            ArrayList<Object[]> data = new ArrayList<>();
            
            while (rs.next()) {
                Object[] rows = new Object[rsm.getColumnCount()];
                for (int i = 0; i < rows.length; i++)
                {
                    rows[i] = rs.getObject(i + 1);
                }
                data.add(rows);
            }
            
            dtm = (DefaultTableModel) this.jTClientes.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }  
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, icon); 
        }
        
    }
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       jTClientes.getTableHeader().setReorderingAllowed(false); 
       jTClientes.getTableHeader().setForeground(Color.BLACK);
       jTClientes.getTableHeader().setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
       LlenarTabla();
       //txtFechaNacimiento.setVisible(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        
        
        int result = JOptionPane.showConfirmDialog(null,"<html><b style=\"color:black; font-size:13px;\">Está seguro de volver al Menú Principal?</b></html>" , "Salir del Módulo",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, icono);
        if(result == JOptionPane.YES_NO_OPTION)
        {
            this.dispose();
            

            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
        
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        
            txtFechaNacimiento.setText(null);
        
            String dia = Integer.toString(jdcFecha.getCalendar().get(Calendar.DAY_OF_MONTH));
            String mes = Integer.toString(jdcFecha.getCalendar().get(Calendar.MONTH) + 1);
            String anio = Integer.toString(jdcFecha.getCalendar().get(Calendar.YEAR));

            fecha = fecha.concat(anio);
            fecha = fecha.concat("-");
            fecha = fecha.concat(mes);
            fecha = fecha.concat("-");
            fecha = fecha.concat(dia);
            
            txtFechaNacimiento.setText(fecha);
               
    }//GEN-LAST:event_btnListoActionPerformed

    private void jTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClientesMouseClicked
        
        int select = jTClientes.rowAtPoint(evt.getPoint());
        txtIdentidadCliente.setText(String.valueOf(jTClientes.getValueAt(select, 0)));
        txtNombresCliente.setText(String.valueOf(jTClientes.getValueAt(select, 1)));
        txtApellidosCliente.setText(String.valueOf(jTClientes.getValueAt(select, 2)));
        txtTelefono.setText(String.valueOf(jTClientes.getValueAt(select, 3)));
        txtCorreoCliente.setText(String.valueOf(jTClientes.getValueAt(select, 4)));
        txtFechaNacimiento.setText(String.valueOf(jTClientes.getValueAt(select, 5)));
        txtDireccionCliente.setText(String.valueOf(jTClientes.getValueAt(select, 6)));
        
    }//GEN-LAST:event_jTClientesMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtIdentidadCliente.setText(null);
        txtNombresCliente.setText(null);
        txtApellidosCliente.setText(null);
        txtTelefono.setText(null);
        txtCorreoCliente.setText(null);
        txtFechaNacimiento.setText(null);
        txtDireccionCliente.setText(null);
        jdcFecha.setCalendar(null);
        fecha = "";
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void lbActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbActualizarMouseClicked
        
        LimpiarTabla();
        LlenarTabla();
        
    }//GEN-LAST:event_lbActualizarMouseClicked

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        
        if(!txtIdentidadCliente.getText().isBlank())
        {
            if(validar.isEntero(txtIdentidadCliente.getText()) && txtIdentidadCliente.getText().length() == 13)
            {
                try{
                     persona.setIdentidad(txtIdentidadCliente.getText());
                     
                     if(cliente.EliminarPersona())
                     {
                         JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> ELIMINADO CORRECTAMENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);
                         LimpiarTabla();
                         LlenarTabla();
                         txtIdentidadCliente.setText(null);
                     }
                     else 
                     {
                         JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL INTENTAR ELIMINAR EL CLIENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
                     }
                     
                }
                catch(Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex);
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> EL NUMERO DE IDENTIDAD NO TIENE UN FORMATO VALIDO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> INGRESE UN NUMERO DE IDENTIDAD </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
        }
        
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    
    
    

    
    
    
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
            java.util.logging.Logger.getLogger(frmCrudClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrudClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrudClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrudClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrudClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnListo;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbEstadoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClientes;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel lbActualizar;
    private javax.swing.JTextField txtApellidosCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtIdentidadCliente;
    private javax.swing.JTextField txtNombresCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
