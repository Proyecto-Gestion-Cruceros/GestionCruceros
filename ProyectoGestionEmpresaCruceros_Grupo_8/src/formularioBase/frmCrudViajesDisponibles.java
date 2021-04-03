package formularioBase;

import Clases.BuquesyViajesDisponibles.ClsViajesDisponibles;
import Clases.ClsValidaciones;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCrudViajesDisponibles extends javax.swing.JFrame {

    public frmCrudViajesDisponibles() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbDestinos = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmbPuertoSalida = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbBuques = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtViajesDisp = new javax.swing.JTable();
        btnAgregar1 = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtIdViaje = new javax.swing.JTextField();
        btnMenu = new javax.swing.JLabel();
        txtSalida = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtBuque = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(1635, 1035));

        jLabel7.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de salida:");

        jLabel8.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha de regreso:");

        jLabel9.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Destino de visita:");

        cmbDestinos.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        cmbDestinos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDestinosItemStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buque:");

        jLabel12.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Puerto de salida:");

        cmbPuertoSalida.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        cmbPuertoSalida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPuertoSalidaItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Avenir LT Std 45 Book", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("VIAJES DISPONIBLES");

        cmbBuques.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        cmbBuques.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBuquesItemStateChanged(evt);
            }
        });

        jtViajesDisp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Viaje", "Buque", "Puerto de salida", "Destino", "Fecha de salida", "Fecha de regreso", "Estado"
            }
        ));
        jtViajesDisp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtViajesDispMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtViajesDisp);

        btnAgregar1.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregar1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAgregar1.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar1.setText("AGREGAR");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        btnActualizar1.setBackground(new java.awt.Color(255, 204, 51));
        btnActualizar1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnActualizar1.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar1.setText("ACTUALIZAR");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
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

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Id Viaje:");

        txtIdViaje.setEditable(false);
        txtIdViaje.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        txtSalida.setEditable(false);
        txtSalida.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N

        txtDestino.setEditable(false);
        txtDestino.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N

        txtBuque.setEditable(false);
        txtBuque.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbBuques, javax.swing.GroupLayout.Alignment.LEADING, 0, 118, Short.MAX_VALUE)
                                    .addComponent(txtIdViaje, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPuertoSalida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel7))
                                        .addGap(79, 79, 79))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(cmbDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(151, 151, 151)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnMenu)
                .addGap(613, 613, 613)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(btnMenu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdViaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbBuques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtBuque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(76, 76, 76)
                        .addComponent(jLabel7)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel8)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)))
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61))
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

    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    
    ClsValidaciones Validar = new ClsValidaciones();
    ClsViajesDisponibles Viaje = new ClsViajesDisponibles();
    
    private void limpiar() {
        txtIdViaje.setText(null);
        cmbBuques.setSelectedIndex(-1);
        cmbPuertoSalida.setSelectedIndex(-1);
        cmbDestinos.setSelectedIndex(-1);
        jdcFechaSalida.setCalendar(null);
        jdcFechaRegreso.setCalendar(null);
        
    }
    
    private void LlenarJtable(){
        dtm = (DefaultTableModel) jtViajesDisp.getModel();
        dtm.setRowCount(0);
        try {
            ps = dbConnection.dbConexion().prepareStatement("SELECT vd.idViaje, b.nombreBuque, ps.nombrePuerto, dt.nombreDestino, vd.fechaSalida, vd.fechaRegreso, vd.estado FROM dbo.buques b INNER JOIN dbo.viajesDisponibles vd ON b.codigoBuque = vd.codigoBuque INNER JOIN dbo.destinosTuristicos dt ON vd.codigoDestino = dt.codigoDestino INNER JOIN dbo.puertosSalida ps ON vd.codigoPuertoSalida = ps.codigoPuerto");
            
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
            JOptionPane.showMessageDialog(null, "Error al cargar los datos en la tabla" + ex);
        }

    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
   
        Viaje.llenarJCombobox(cmbBuques, "SELECT [codigoBuque] FROM [dbo].[buques] WHERE [estado] = 'Activo' ORDER BY [nombreBuque] ASC", "codigoBuque");
        Viaje.llenarJCombobox(cmbPuertoSalida, "SELECT [codigoPuerto] FROM [dbo].[puertosSalida] WHERE [estado] = 'Activo' ORDER BY [nombrePuerto] ASC", "codigoPuerto");
        Viaje.llenarJCombobox(cmbDestinos, "SELECT [codigoDestino] FROM [dbo].[destinosTuristicos] WHERE [estado] = 'Activo' ORDER BY [nombreDestino] ASC", "codigoDestino");
        LlenarJtable();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed

        if (cmbBuques.getSelectedIndex() != -1 && cmbPuertoSalida.getSelectedIndex() != -1 && cmbDestinos.getSelectedIndex() != -1 && jdcFechaSalida.getDate() != null && jdcFechaRegreso.getDate() != null) {
            
            VerificarViaje();
            
            if (Viaje.verificarEstadoCanc()) {

                int codBuque, codPuertoSalida, codDestino;
                String fechaPartida, fechaRegreso;

                codBuque = Integer.parseInt(cmbBuques.getSelectedItem().toString());
                codPuertoSalida = Integer.parseInt(cmbPuertoSalida.getSelectedItem().toString());
                codDestino = Integer.parseInt(cmbDestinos.getSelectedItem().toString());

                Viaje.setCodBuque(codBuque);
                Viaje.setCodPuertoSalida(codPuertoSalida);
                Viaje.setCodDestino(codDestino);

                int anioPartida = jdcFechaSalida.getCalendar().get(Calendar.YEAR);
                int mesPartida = jdcFechaSalida.getCalendar().get(Calendar.MARCH);
                int diaPartida = jdcFechaSalida.getCalendar().get(Calendar.DAY_OF_MONTH);

                fechaPartida = (anioPartida + "-" + mesPartida + "-" + diaPartida);

                Viaje.setFechaPartida(fechaPartida);

                int anioRegreso = jdcFechaRegreso.getCalendar().get(Calendar.YEAR);
                int mesRegreso = jdcFechaRegreso.getCalendar().get(Calendar.MARCH);
                int diaRegreso = jdcFechaRegreso.getCalendar().get(Calendar.DAY_OF_MONTH);

                fechaRegreso = (anioRegreso + "-" + mesRegreso + "-" + diaRegreso);

                Viaje.setFechaRegreso(fechaRegreso);

                Viaje.setEstado("Disponible");

                if (Viaje.RegistrarViajeDisponible()) {
                    JOptionPane.showMessageDialog(this, "Viaje registrado correctamente");
                    limpiar();
                    LlenarJtable();

                } else {
                    JOptionPane.showMessageDialog(this, "Error de procedimiento");
                }

            } else {
                JOptionPane.showMessageDialog(this, "El viaje ya existe");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese los datos solicitados");
        }

    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private boolean VerificarViaje() {
        int resultado = 0;

        try {
            ps = dbConnection.dbConexion().prepareStatement("SELECT [estado] FROM [dbo].[viajesDisponibles] WHERE [idViaje] = ?");
            ps.setString(1, txtIdViaje.getText());

            rs = ps.executeQuery();

            if (rs.next()) {

                Viaje.setEstadoIn(rs.getString("estado").trim());
                return true;

            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar buque" + ex);
            return false;
        }
    }
    
    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed

        if (cmbBuques.getSelectedIndex() != -1 && cmbPuertoSalida.getSelectedIndex() != -1 && cmbDestinos.getSelectedIndex() != -1 && jdcFechaSalida.getDate() != null && jdcFechaRegreso.getDate() != null) {

            VerificarViaje();
            if (Viaje.verificarEstadoDisp()) {

                int idViaje, codBuque, codPuertoSalida, codDestino;
                String fechaPartida, fechaRegreso;

                idViaje = Integer.parseInt(txtIdViaje.getText());
                codBuque = Integer.parseInt(cmbBuques.getSelectedItem().toString());
                codPuertoSalida = Integer.parseInt(cmbPuertoSalida.getSelectedItem().toString());
                codDestino = Integer.parseInt(cmbDestinos.getSelectedItem().toString());

                Viaje.setIdViaje(idViaje);
                Viaje.setCodBuque(codBuque);
                Viaje.setCodPuertoSalida(codPuertoSalida);
                Viaje.setCodDestino(codDestino);

                int anioPartida = jdcFechaSalida.getCalendar().get(Calendar.YEAR);
                int mesPartida = jdcFechaSalida.getCalendar().get(Calendar.MARCH);
                int diaPartida = jdcFechaSalida.getCalendar().get(Calendar.DAY_OF_MONTH);

                fechaPartida = (anioPartida + "-" + mesPartida + "-" + diaPartida);

                Viaje.setFechaPartida(fechaPartida);

                int anioRegreso = jdcFechaRegreso.getCalendar().get(Calendar.YEAR);
                int mesRegreso = jdcFechaRegreso.getCalendar().get(Calendar.MARCH);
                int diaRegreso = jdcFechaRegreso.getCalendar().get(Calendar.DAY_OF_MONTH);

                fechaRegreso = (anioRegreso + "-" + mesRegreso + "-" + diaRegreso);

                Viaje.setFechaRegreso(fechaRegreso);

                if (Viaje.ActualizarViajeDisponible()) {
                    JOptionPane.showMessageDialog(this, "Viaje Actualizado correctamente");
                    limpiar();
                    LlenarJtable();

                } else {
                    JOptionPane.showMessageDialog(this, "Error de procedimiento");
                }

            } else {
                JOptionPane.showMessageDialog(this, "No se puede actualizar un viaje cancelado");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese los datos solicitados");
        }
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        if(!txtIdViaje.getText().isBlank()){
        
            VerificarViaje();
            
            if (Viaje.verificarEstadoDisp()) {
                Viaje.setEstado("Cancelado");
                Viaje.setIdViaje(Integer.parseInt(txtIdViaje.getText()));
                if(Viaje.EliminarViaje()){
                    JOptionPane.showMessageDialog(this, "Viaje cancelado correctamente");
                    limpiar();
                    LlenarJtable();
                }else{
                    JOptionPane.showMessageDialog(this, "Error de procedimiento");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Ya se encuentra cancelado");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Seleccione un viaje");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    
        limpiar();
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        int result = JOptionPane.showConfirmDialog(null, "Regresar al Menú Principal?", "Regresar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(result == JOptionPane.YES_NO_OPTION)
        {
            this.dispose();
            
            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuMouseClicked

    private void cmbBuquesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBuquesItemStateChanged
        
        if (cmbBuques.getSelectedIndex() != -1) {
            
            int idBuque = Integer.parseInt(cmbBuques.getSelectedItem().toString());
            Viaje.setCodigoBuque(idBuque);
            txtBuque.setText(Viaje.obtenerNombreBuque());
            
        } else {
            txtBuque.setText(null);
        }
        
        
    }//GEN-LAST:event_cmbBuquesItemStateChanged

    private void cmbPuertoSalidaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPuertoSalidaItemStateChanged
    
        if (cmbPuertoSalida.getSelectedIndex() != -1) {
            
            int idSalida = Integer.parseInt(cmbPuertoSalida.getSelectedItem().toString());
            Viaje.setCodigoSalida(idSalida);
            txtSalida.setText(Viaje.obtenerNombreSalida());
            
        } else {
            txtSalida.setText(null);
        }
    }//GEN-LAST:event_cmbPuertoSalidaItemStateChanged

    private void cmbDestinosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDestinosItemStateChanged
    
        if (cmbDestinos.getSelectedIndex() != -1) {
            
            int idDestino = Integer.parseInt(cmbDestinos.getSelectedItem().toString());
            Viaje.setCodigoDestino(idDestino);
            txtDestino.setText(Viaje.obtenerNombreDestino());
            
        } else {
            txtDestino.setText(null);
        }
    }//GEN-LAST:event_cmbDestinosItemStateChanged

    private void jtViajesDispMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtViajesDispMouseClicked
        int seleccionar = jtViajesDisp.rowAtPoint(evt.getPoint());
        String buque, salida, destino;
        
        txtIdViaje.setText(String.valueOf(jtViajesDisp.getValueAt(seleccionar, 0)));
        
        buque = jtViajesDisp.getValueAt(seleccionar, 1).toString();
        salida = jtViajesDisp.getValueAt(seleccionar, 2).toString();
        destino = jtViajesDisp.getValueAt(seleccionar, 3).toString();
 
        Viaje.setNombreBuque(buque);
        cmbBuques.setSelectedItem(Viaje.obtenerIdBuque());
        
        Viaje.setNombreSalida(salida);
        cmbPuertoSalida.setSelectedItem(Viaje.obtenerIdSalida());
        
        Viaje.setNombreDestino(destino);
        cmbDestinos.setSelectedItem(Viaje.obtenerIdDestino());
        
        llenarFechaSal();
        llenarFechaRe();
        
    }//GEN-LAST:event_jtViajesDispMouseClicked
    
    private void llenarFechaSal(){
        int fila = jtViajesDisp.getSelectedRow();
        String fechaSalida = jtViajesDisp.getValueAt(fila, 4).toString();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaNSal = null;
        try {
            fechaNSal = formatoDelTexto.parse(fechaSalida);
            jdcFechaSalida.setDate(fechaNSal);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar fecha salida " + ex);
        }
    }
    
    private void llenarFechaRe(){
        int fila = jtViajesDisp.getSelectedRow();
        String fechaRegreso = jtViajesDisp.getValueAt(fila, 5).toString();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");       
        
        Date fechaNRe = null;
        try {
            fechaNRe = formatoDelTexto.parse(fechaRegreso);
            jdcFechaRegreso.setDate(fechaNRe);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar fecha regreso " + ex);
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
            java.util.logging.Logger.getLogger(frmCrudViajesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrudViajesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrudViajesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrudViajesDisponibles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrudViajesDisponibles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel btnMenu;
    private javax.swing.JComboBox<String> cmbBuques;
    private javax.swing.JComboBox<String> cmbDestinos;
    private javax.swing.JComboBox<String> cmbPuertoSalida;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtViajesDisp;
    private javax.swing.JTextField txtBuque;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtIdViaje;
    private javax.swing.JTextField txtSalida;
    // End of variables declaration//GEN-END:variables
}
