package formularioBase;

import Clases.Cliente.ClsClientes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Clases.ClsValidaciones;
import Clases.Personas.ClsPersona;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Font;

import java.sql.ResultSetMetaData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
        initDateEditor();
    }

    ClsValidaciones validar = new ClsValidaciones();
    ClsClientes cliente = new ClsClientes();
    ClsPersona persona = new ClsPersona();
    dbConnection dbConn =  new dbConnection();
    Connection cn = dbConn.dbConexion();
    PreparedStatement ps = null;
    ResultSet rs;
    JTextFieldDateEditor dtEditor;
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
        jdcFecha = new com.toedter.calendar.JDateChooser();
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

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Clientes");

        jLabel2.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres del Cliente");

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos del Cliente");

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo Electrónico");

        jLabel6.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado");

        txtNombresCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtNombresCliente.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtNombresCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtApellidosCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidosCliente.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtApellidosCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));

        txtCorreoCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreoCliente.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtCorreoCliente.setForeground(new java.awt.Color(0, 0, 0));

        cmbEstadoCliente.setBackground(new java.awt.Color(255, 255, 255));
        cmbEstadoCliente.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbEstadoCliente.setForeground(new java.awt.Color(0, 0, 0));
        cmbEstadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " <Seleccione>", "Activo", "Inactivo" }));
        cmbEstadoCliente.setToolTipText("");

        btnAgregar.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 22)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 204, 51));
        btnModificar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 22)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("Actualizar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección");

        txtDireccionCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccionCliente.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Identidad Cliente");

        txtIdentidadCliente.setBackground(new java.awt.Color(255, 255, 255));
        txtIdentidadCliente.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtIdentidadCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtIdentidadCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTClientes.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identidad", "Nombres", "Apellidos", "Teléfono", "Correo", "Fecha Nacimiento", "Dirección", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTClientes);

        btnEliminarCliente.setBackground(new java.awt.Color(255, 204, 51));
        btnEliminarCliente.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 22)); // NOI18N
        btnEliminarCliente.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarCliente.setLabel("Eliminar");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 22)); // NOI18N
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
        jLabel9.setText("Fecha de Nacimiento");

        jdcFecha.setBackground(new java.awt.Color(255, 255, 255));
        jdcFecha.setForeground(new java.awt.Color(0, 0, 0));
        jdcFecha.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1328, 1328, 1328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtIdentidadCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(28, 28, 28))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29))
                                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, 0)
                                        .addComponent(lbActualizar)
                                        .addGap(1226, 1226, 1226))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)))))
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(351, 351, 351))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(837, 837, 837))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbActualizar)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(453, 453, 453)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(129, 129, 129)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cmbEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtIdentidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(258, 258, 258)))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
          
        if(!txtIdentidadCliente.getText().isBlank() && !txtNombresCliente.getText().isBlank() && !txtApellidosCliente.getText().isBlank() && !txtTelefono.getText().isBlank() 
                && !txtCorreoCliente.getText().isBlank() && jdcFecha.getDate() != null && !txtDireccionCliente.getText().isBlank() && cmbEstadoCliente.getSelectedItem() != "<Seleccione>")
        {  
            if(validar.isEntero(txtIdentidadCliente.getText()) && txtIdentidadCliente.getText().length() == 13)
            {
                if(validar.isLetras(txtNombresCliente.getText()) || validar.isLetras(txtApellidosCliente.getText()) || validar.isLetras(txtDireccionCliente.getText()))
                {
                    if(validar.isEntero(txtTelefono.getText()) && txtTelefono.getText().length() == 8)
                    {
                        if(validar.isemail(txtCorreoCliente.getText()))
                        {
                            
                            Calendar c = new GregorianCalendar();
                            String diaA = Integer.toString(c.get(Calendar.DAY_OF_MONTH));
                            String mesA = Integer.toString(c.get(Calendar.MONTH));
                            String anioA = Integer.toString(c.get(Calendar.YEAR));
                            String fechaMinima = (anioA + "-" + mesA + "-" + diaA);
                            
                            String FechaNacimiento;
                            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
                            
                            int año = jdcFecha.getCalendar().get(Calendar.YEAR);
                            int mes = jdcFecha.getCalendar().get(Calendar.MONTH);
                            int dia = jdcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
                            
                            FechaNacimiento = (año + "-" + mes + "-" + dia);
                               
                            
                            if(validarFecha(FechaNacimiento, fechaMinima))
                            {
                                if(cmbEstadoCliente.getSelectedIndex() == 0)
                                {
                                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE UN ESTADO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
                                }
                                else 
                                {
                                    persona.setIdentidad(txtIdentidadCliente.getText());
                                    persona.setNombres(txtNombresCliente.getText());
                                    persona.setApellidos(txtApellidosCliente.getText());
                                    persona.setTelefono(txtTelefono.getText());
                                    persona.setCorreoElectronico(txtCorreoCliente.getText());
                                    cliente.setFechaNacimiento(FechaNacimiento);
                                    cliente.setDireccionCliente(txtDireccionCliente.getText());
                                    persona.setEstado(cmbEstadoCliente.getSelectedItem().toString());

                                    try{

                                        if(cliente.AgregarPersona())
                                        {
                                            JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> CLIENTE AGREGADO CORRECTAMENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);
                                            Limpiar();
                                            LimpiarTabla();
                                            LlenarTabla();

                                        }
                                        else 
                                        {
                                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL INTENTAR AGREGAR EL CLIENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
                                            fecha = "";
                                        }

                                    }
                                    catch(Exception ex)
                                    {
                                        JOptionPane.showMessageDialog(null, ex);
                                    }
                                }
                            }
                            else
                            {
                                
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
           
        if(!txtIdentidadCliente.getText().isBlank() || !txtNombresCliente.getText().isBlank() || !txtApellidosCliente.getText().isBlank() || !txtTelefono.getText().isBlank() 
                || !txtCorreoCliente.getText().isBlank() || jdcFecha.getDate() != null || !txtDireccionCliente.getText().isBlank() || cmbEstadoCliente.getSelectedItem() != "<Seleccione>")
        {
            
            if(validar.isEntero(txtIdentidadCliente.getText()) && txtIdentidadCliente.getText().length() == 13)
            {
                if(validar.isLetras(txtNombresCliente.getText()) || validar.isLetras(txtApellidosCliente.getText()) || validar.isLetras(txtDireccionCliente.getText()))
                {
                    if(validar.isEntero(txtTelefono.getText()) && txtTelefono.getText().length() == 8)
                    {
                        if(validar.isemail(txtCorreoCliente.getText()))
                        {
                            
                            String FechaNacimiento;
                            SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
                            
                            int año = jdcFecha.getCalendar().get(Calendar.YEAR);
                            int mes = jdcFecha.getCalendar().get(Calendar.MONTH);
                            int dia = jdcFecha.getCalendar().get(Calendar.DAY_OF_MONTH);
                            
                            FechaNacimiento = (año + "-" + mes + "-" + dia);
                               
                                if(cmbEstadoCliente.getSelectedIndex() == 0)
                                {
                                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE UN ESTADO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
                                }
                                else 
                                {
                                    persona.setIdentidad(txtIdentidadCliente.getText());
                                    persona.setNombres(txtNombresCliente.getText());
                                    persona.setApellidos(txtApellidosCliente.getText());
                                    persona.setTelefono(txtTelefono.getText());
                                    persona.setCorreoElectronico(txtCorreoCliente.getText());
                                    cliente.setFechaNacimiento(FechaNacimiento);
                                    cliente.setDireccionCliente(txtDireccionCliente.getText());
                                    persona.setEstado(cmbEstadoCliente.getSelectedItem().toString());

                                    try{

                                        if(cliente.ActualizarPersona())
                                        {
                                            JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> CLIENTE ACTUALIZADO CORRECTAMENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);
                                            LimpiarTabla();
                                            LlenarTabla();

                                        }
                                        else 
                                        {
                                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL INTENTAR ACTUALIZAR CLIENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
                                            fecha = "";
                                        }

                                    }
                                    catch(Exception ex)
                                    {
                                        JOptionPane.showMessageDialog(null, ex);
                                    }
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
    
    
    public void llenarFecha()
    {
        
        int fila = jTClientes.getSelectedRow();
        String fecha1 = jTClientes.getValueAt(fila, 5).toString();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        Date fecha2 = null;
        
        try{
            
            fecha2 = formato.parse(fecha1);
            jdcFecha.setDate(fecha2);
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error al cargar Fecha" + ex, "", JOptionPane.INFORMATION_MESSAGE, icon);           
        }
        
    }
    
    private void initDateEditor()
    {
        dtEditor = (JTextFieldDateEditor)jdcFecha.getDateEditor();
        dtEditor.setEditable(false);
        dtEditor.setBackground(Color.white);

    }
    
    public boolean validarFecha(String FechaNacimiento, String fechaMinima)
    {
        
        try{
            
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha1 = formato.parse(FechaNacimiento);
            Date fecha2 = formato.parse(fechaMinima);  
            
            if(fecha1.before(fecha2))
            {
                return true;
            }
            else 
            {
                    return false;
            }
            
        }
        catch(Exception ex)
        {
            return false;
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

    private void jTClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClientesMouseClicked
        
        int select = jTClientes.rowAtPoint(evt.getPoint());
        txtIdentidadCliente.setText(String.valueOf(jTClientes.getValueAt(select, 0)));
        txtNombresCliente.setText(String.valueOf(jTClientes.getValueAt(select, 1)));
        txtApellidosCliente.setText(String.valueOf(jTClientes.getValueAt(select, 2)));
        txtTelefono.setText(String.valueOf(jTClientes.getValueAt(select, 3)));
        txtCorreoCliente.setText(String.valueOf(jTClientes.getValueAt(select, 4)));
        llenarFecha();
        txtDireccionCliente.setText(String.valueOf(jTClientes.getValueAt(select, 6)));
        
        jdcFecha.setEnabled(false);
        
    }//GEN-LAST:event_jTClientesMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        Limpiar();
        jdcFecha.setEnabled(true);
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void Limpiar()
    {
        txtIdentidadCliente.setText(null);
        txtNombresCliente.setText(null);
        txtApellidosCliente.setText(null);
        txtTelefono.setText(null);
        txtCorreoCliente.setText(null);
        txtDireccionCliente.setText(null);
        jdcFecha.setCalendar(null);
        //jdcFecha.setEnabled(true);
        cmbEstadoCliente.setSelectedIndex(0);
        fecha = "";
    }
    
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
                           
                        int result = JOptionPane.showConfirmDialog(null, "<html><b style=\"color:black; font-size:13px;\">¿Está Seguro de Eliminar el Cliente?</b></html>","",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, icono);
                        if (result == JOptionPane.YES_OPTION) 
			{
							
                            JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> ELIMINADO CORRECTAMENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);
                            LimpiarTabla();
                            LlenarTabla();
							
                        }
                         
                     }
                     else 
                     {
                             JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL INTENTAR ELIMINAR EL CLIENTE</b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
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
    private javax.swing.JTextField txtIdentidadCliente;
    private javax.swing.JTextField txtNombresCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
