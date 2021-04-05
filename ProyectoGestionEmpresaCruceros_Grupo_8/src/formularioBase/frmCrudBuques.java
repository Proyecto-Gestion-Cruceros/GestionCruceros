package formularioBase;

import Clases.BuquesyViajesDisponibles.ClsBuques;
import Clases.ClsValidaciones;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCrudBuques extends javax.swing.JFrame {

    public frmCrudBuques() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNumCamarotes = new javax.swing.JTextField();
        txtNumNIveles = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreBuque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBuques = new javax.swing.JTable();
        txtCodBuque = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnMenu = new javax.swing.JLabel();

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Balsamiq Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Viajes disponibles");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        txtNumCamarotes.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        txtNumNIveles.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Avenir LT Std 45 Book", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("BUQUES");

        jLabel7.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Número de niveles");

        jLabel8.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Número de camarotes");

        btnActualizar.setBackground(new java.awt.Color(255, 204, 51));
        btnActualizar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de buque");

        txtNombreBuque.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtNombreBuque.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtNombreBuquePropertyChange(evt);
            }
        });
        txtNombreBuque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreBuqueKeyPressed(evt);
            }
        });

        jtBuques.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jtBuques.setForeground(new java.awt.Color(0, 0, 0));
        jtBuques.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo buque", "Nombre buque", "N. Camarotes", "N. De Niveles", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtBuques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBuquesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtBuques);

        txtCodBuque.setEditable(false);
        txtCodBuque.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Código buque");

        btnEliminar.setBackground(new java.awt.Color(255, 204, 51));
        btnEliminar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCodBuque, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNumNIveles, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNumCamarotes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(211, 211, 211)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(907, 907, 907)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMenu)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMenu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodBuque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreBuque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8))
                            .addComponent(txtNumCamarotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txtNumNIveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(69, 69, 69))
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

    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    
    ClsValidaciones Validar = new ClsValidaciones();
    ClsBuques buques = new ClsBuques();
    
    Icon icon = new ImageIcon(getClass().getResource("/Resources/Error.png"));
    Icon icono = new ImageIcon(getClass().getResource("/Resources/Advertencia.png"));
    Icon Icono = new ImageIcon(getClass().getResource("/Resources/Check.png"));
    
    private void limpiar() {
        txtCodBuque.setText(null);
        txtNombreBuque.setText(null);
        txtNumCamarotes.setText(null);
        txtNumNIveles.setText(null);
        CodigoNuevoBuque();
    }
    
    private void LlenarJtable(){
        dtm = (DefaultTableModel) jtBuques.getModel();
        dtm.setRowCount(0);
        try {
            ps = dbConnection.dbConexion().prepareStatement("SELECT [codigoBuque], [nombreBuque], [numeroCamarotes], [numeroNiveles], [estado] FROM [dbo].[buques]");
            rs = ps.executeQuery();
            rsm = rs.getMetaData();

            int columna = rsm.getColumnCount();

            while (rs.next()) {
                Object fil[] = new Object[columna];
                for (int i = 0; i < columna; i++) {
                    fil[i] = rs.getObject(i + 1);
                }
                dtm.addRow(fil);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos en la tabla " + ex, "", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }

    public void CodigoNuevoBuque() {
        try {
            String obtenerUltimoCodigo;
            int UltimoCodigo;
            ps = dbConnection.dbConexion().prepareStatement("SELECT TOP 1 [codigoBuque] FROM [dbo].[buques] order by codigoBuque desc");
            rs = ps.executeQuery();

            if (rs.next()) {
                obtenerUltimoCodigo = rs.getString("codigoBuque").trim();
                UltimoCodigo = Integer.parseInt(obtenerUltimoCodigo) + 1;
                txtCodBuque.setText("" + UltimoCodigo);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE, icon);
        }

    }

    private boolean VerificarBuque() {
        int resultado = 0;

        try {
            ps = dbConnection.dbConexion().prepareStatement("SELECT [estado] FROM [dbo].[buques] WHERE [codigoBuque] = ?");
            ps.setString(1, txtCodBuque.getText());

            rs = ps.executeQuery();

            if (rs.next()) {

                buques.setEstadoIn(rs.getString("estado").trim());
                return true;

            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar buque " + ex, "", JOptionPane.INFORMATION_MESSAGE, icon);
            return false;
        }
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        if (!txtCodBuque.getText().isBlank() && !txtNombreBuque.getText().isBlank() && !txtNumCamarotes.getText().isBlank() && !txtNumNIveles.getText().isBlank()) {

            if (Validar.isLetras(txtNombreBuque.getText()) && Validar.isEntero(txtNumCamarotes.getText()) && Validar.isEntero(txtNumNIveles.getText())) {

                try {
                    String obtenerUltimoCodigo;
                    int UltimoCodigo;
                    ps = dbConnection.dbConexion().prepareStatement("SELECT TOP 1 [codigoBuque] FROM [dbo].[buques] order by codigoBuque desc");
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        obtenerUltimoCodigo = rs.getString("codigoBuque").trim();
                        UltimoCodigo = Integer.parseInt(obtenerUltimoCodigo) + 1;

                        if ((UltimoCodigo != Integer.parseInt(txtCodBuque.getText()))) {

                            VerificarBuque();
                            if (buques.verificarEstadoAc()) {

                                buques.setCodigoBuque(Integer.parseInt(txtCodBuque.getText()));
                                buques.setNombreBuque(txtNombreBuque.getText());
                                buques.setNumCamarotes(Integer.parseInt(txtNumCamarotes.getText()));
                                buques.setNumNivel(Integer.parseInt(txtNumNIveles.getText()));

                                if (buques.ActualizarBuque()) {

                                    JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> BUQUE ACTUALIZADO CORRECTAMENTE</b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);

                                    LlenarJtable();
                                    limpiar();
                                } else {
                                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR DE PROCEDIMIENTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> NO SE PUEDE ACTUALIZAR UN BUQUE ELIMINADO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                                limpiar();
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> SELECCIONE UN BUQUE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);

                        }

                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE, icon);
                }

            } else {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE LOS DATOS SOLICITADOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
            }
        }else{
            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE LOS DATOS SOLICITADOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
            
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    
        if (!txtNombreBuque.getText().isBlank() && !txtNumCamarotes.getText().isBlank() && !txtNumNIveles.getText().isBlank()) {

            if (Validar.isLetras(txtNombreBuque.getText()) && Validar.isEntero(txtNumCamarotes.getText()) && Validar.isEntero(txtNumNIveles.getText())) {

                if (VerificarBuque()){
                    if (buques.verificarEstadoInac()) {

                    buques.setNombreBuque(txtNombreBuque.getText());
                    buques.setNumCamarotes(Integer.parseInt(txtNumCamarotes.getText()));
                    buques.setNumNivel(Integer.parseInt(txtNumNIveles.getText()));
                    buques.setEstado("Activo");
                    
                    if (buques.RegistrarBuque()) {
                        JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> BUQUE REGISTRADO CORRECTAMENTE</b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);

                        LlenarJtable();
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR DE PROCEDIMIENTO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                } else {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> EL BUQUE YA EXISTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
                        limpiar();
                    }
                } else {
                    buques.setNombreBuque(txtNombreBuque.getText());
                    buques.setNumCamarotes(Integer.parseInt(txtNumCamarotes.getText()));
                    buques.setNumNivel(Integer.parseInt(txtNumNIveles.getText()));
                    buques.setEstado("Activo");
                    
                    if (buques.RegistrarBuque()) {
                        
                        JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> BUQUE REGISTRADO CORRECTAMENTE</b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);

                        LlenarJtable();
                        limpiar();
                    } else {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR DE PROCEDIMIENTO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE LOS DATOS SOLICITADOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE LOS DATOS SOLICITADOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
            
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtBuques.getTableHeader().setReorderingAllowed(false);
        jtBuques.getTableHeader().setForeground(Color.BLACK);
        jtBuques.getTableHeader().setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        LlenarJtable();
        CodigoNuevoBuque();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (!txtNombreBuque.getText().isBlank() && !txtNumCamarotes.getText().isBlank() && !txtNumNIveles.getText().isBlank()) {
            if (Validar.isLetras(txtNombreBuque.getText()) && Validar.isEntero(txtNumCamarotes.getText()) && Validar.isEntero(txtNumNIveles.getText())) {
                
                try {
                    String obtenerUltimoCodigo;
                    int UltimoCodigo;
                    ps = dbConnection.dbConexion().prepareStatement("SELECT TOP 1 [codigoBuque] FROM [dbo].[buques] order by codigoBuque desc");
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        obtenerUltimoCodigo = rs.getString("codigoBuque").trim();
                        UltimoCodigo = Integer.parseInt(obtenerUltimoCodigo) + 1;

                        if ((UltimoCodigo != Integer.parseInt(txtCodBuque.getText()))) {
                            VerificarBuque();

                            if (buques.verificarEstadoAc()) {

                                buques.setEstado("Inactivo");
                                buques.setNombreBuque(txtNombreBuque.getText());

                                if (buques.EliminarBuque()) {
                                    JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> BUQUE ELIMINADO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);
                                    LlenarJtable();
                                    limpiar();

                                } else {
                                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR DE PROCEDIMIENTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> YA SE ENCUENTRA ELIMINADO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                                limpiar();

                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> SELECCIONE UN BUQUE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);

                        }

                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE, icon);
                }
            } else {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE LOS DATOS SOLICITADOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
            }
        } else {
            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE LOS DATOS SOLICITADOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
        } 
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        int result = JOptionPane.showConfirmDialog(null,"<html><b style=\"color:black; font-size:13px;\">Está seguro de volver al Menú Principal?</b></html>" , "Salir del Módulo",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, icono);

        if(result == JOptionPane.YES_NO_OPTION)
        {
            this.dispose();

            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuMouseClicked

    private void jtBuquesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBuquesMouseClicked
   
        int seleccionar = jtBuques.rowAtPoint(evt.getPoint());
        txtCodBuque.setText(String.valueOf(jtBuques.getValueAt(seleccionar, 0)));
        txtNombreBuque.setText(String.valueOf(jtBuques.getValueAt(seleccionar, 1)));
        txtNumCamarotes.setText(String.valueOf(jtBuques.getValueAt(seleccionar, 2)));
        txtNumNIveles.setText(String.valueOf(jtBuques.getValueAt(seleccionar, 3)));
    }//GEN-LAST:event_jtBuquesMouseClicked

    private void txtNombreBuquePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtNombreBuquePropertyChange
    
    }//GEN-LAST:event_txtNombreBuquePropertyChange

    private void txtNombreBuqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreBuqueKeyPressed

    }//GEN-LAST:event_txtNombreBuqueKeyPressed

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
            java.util.logging.Logger.getLogger(frmCrudBuques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrudBuques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrudBuques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrudBuques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrudBuques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtBuques;
    private javax.swing.JTextField txtCodBuque;
    private javax.swing.JTextField txtNombreBuque;
    private javax.swing.JTextField txtNumCamarotes;
    private javax.swing.JTextField txtNumNIveles;
    // End of variables declaration//GEN-END:variables
}
