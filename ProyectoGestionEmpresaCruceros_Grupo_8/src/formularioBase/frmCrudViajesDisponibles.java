package formularioBase;

import Clases.BuquesyViajesDisponibles.ClsViajesDisponibles;
import Clases.ClsFuncionesDB;
import Clases.ClsValidaciones;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCrudViajesDisponibles extends javax.swing.JFrame {

    public frmCrudViajesDisponibles() {
        initComponents();
        initDateEditor();
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
        jdcFechaRegreso = new com.toedter.calendar.JDateChooser();
        jdcFechaSalida = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(1635, 1035));

        jLabel7.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de salida");

        jLabel8.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha de regreso");

        jLabel9.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Destino de visita");

        cmbDestinos.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbDestinos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDestinosItemStateChanged(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Buque");

        jLabel12.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Puerto de salida");

        cmbPuertoSalida.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbPuertoSalida.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPuertoSalidaItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Avenir LT Std 45 Book", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("VIAJES DISPONIBLES");

        cmbBuques.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbBuques.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBuquesItemStateChanged(evt);
            }
        });

        jtViajesDisp.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jtViajesDisp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Viaje", "Buque", "Puerto de salida", "Destino", "Fecha de salida", "Fecha de regreso", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        jLabel13.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Id Viaje");

        txtIdViaje.setEditable(false);
        txtIdViaje.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });

        txtSalida.setEditable(false);
        txtSalida.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        txtDestino.setEditable(false);
        txtDestino.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        txtBuque.setEditable(false);
        txtBuque.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jdcFechaRegreso.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jdcFechaSalida.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
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
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(79, 79, 79))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmbDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jdcFechaRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(151, 151, 151)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 946, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(599, 599, 599)
                .addComponent(btnMenu)
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMenu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jdcFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jdcFechaRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
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

    JTextFieldDateEditor dtEditorSa;
    JTextFieldDateEditor dtEditorRe;
    
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    
    ClsValidaciones Validar = new ClsValidaciones();
    ClsViajesDisponibles Viaje = new ClsViajesDisponibles();
    
    Icon icon = new ImageIcon(getClass().getResource("/Resources/Error.png"));
    Icon icono = new ImageIcon(getClass().getResource("/Resources/Advertencia.png"));
    Icon Icono = new ImageIcon(getClass().getResource("/Resources/Check.png"));
    
    private void limpiar() {
        txtIdViaje.setText(null);
        cmbBuques.setSelectedIndex(-1);
        cmbPuertoSalida.setSelectedIndex(-1);
        cmbDestinos.setSelectedIndex(-1);
        jdcFechaSalida.setCalendar(null);
        jdcFechaRegreso.setCalendar(null);
        CodigoNuevoViaje();
    }
    
    private void initDateEditor(){
        dtEditorSa = (JTextFieldDateEditor)jdcFechaSalida.getDateEditor();
        
        dtEditorSa.setEditable(false);
        dtEditorSa.setBackground(Color.white);
        
        dtEditorRe = (JTextFieldDateEditor)jdcFechaRegreso.getDateEditor();
        
        dtEditorRe.setEditable(false);
        dtEditorRe.setBackground(Color.white);
        
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtViajesDisp.getTableHeader().setReorderingAllowed(false);
        jtViajesDisp.getTableHeader().setForeground(Color.BLACK);
        jtViajesDisp.getTableHeader().setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        Viaje.llenarJCombobox(cmbBuques, "SELECT [codigoBuque] FROM [dbo].[buques] WHERE [estado] = 'Activo' OR [estado] = 'Ocupado' ORDER BY [nombreBuque] ASC", "codigoBuque");
        Viaje.llenarJCombobox(cmbPuertoSalida, "SELECT [codigoPuerto] FROM [dbo].[puertosSalida] WHERE [estado] = 'Activo' ORDER BY [nombrePuerto] ASC", "codigoPuerto");
        Viaje.llenarJCombobox(cmbDestinos, "SELECT [codigoDestino] FROM [dbo].[destinosTuristicos] WHERE [estado] = 'Activo' ORDER BY [nombreDestino] ASC", "codigoDestino");
        Viaje.llenarJTable(jtViajesDisp, "SELECT vd.idViaje, b.nombreBuque, ps.nombrePuerto, dt.nombreDestino, vd.fechaSalida, vd.fechaRegreso, vd.estado FROM dbo.buques b INNER JOIN dbo.viajesDisponibles vd ON b.codigoBuque = vd.codigoBuque INNER JOIN dbo.destinosTuristicos dt ON vd.codigoDestino = dt.codigoDestino INNER JOIN dbo.puertosSalida ps ON vd.codigoPuertoSalida = ps.codigoPuerto");
        CodigoNuevoViaje();

    }//GEN-LAST:event_formWindowOpened

    private boolean validarFechas(String fechaPartida, String fechaRegreso, String fechaActual) {

        try {
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaDate1 = formateador.parse(fechaPartida);
            Date fechaDate2 = formateador.parse(fechaRegreso);
            Date fechaDate3 = formateador.parse(fechaActual);

            if ((fechaDate3.before(fechaDate1)) && (fechaDate3.before(fechaDate2))) {
                if (fechaDate1.before(fechaDate2)) {
                    return true;
                } else {
                    return false;
                }
            }
            return false;
        } catch (Exception ex) {
            return false;
        }

    }

    private boolean validarDisponibilidadBuque(String fechaRegreso, String fechaPartidaN, String fechaRegresoN) {

        try {
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd");

            Date fechaDateRe = formateador.parse(fechaRegreso);
            Date fechaDatePaN = formateador.parse(fechaPartidaN);
            Date fechaDateReN = formateador.parse(fechaRegresoN);

            if ((fechaDateRe.before(fechaDatePaN)) && (fechaDateRe.before(fechaDateReN))) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {
            return false;
        }
    }


    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed

        if ((cmbBuques.getSelectedIndex() != -1) && (cmbPuertoSalida.getSelectedIndex() != -1) && (cmbDestinos.getSelectedIndex() != -1) && (jdcFechaSalida.getDate() != null) && (jdcFechaRegreso.getDate() != null)) {

            int codBuque, codPuertoSalida, codDestino;
            String fechaPartidaN, fechaRegresoN, fechaRegreso;

            int anioPartida = jdcFechaSalida.getCalendar().get(Calendar.YEAR);
            int mesPartida = jdcFechaSalida.getCalendar().get(Calendar.MARCH);
            int diaPartida = jdcFechaSalida.getCalendar().get(Calendar.DAY_OF_MONTH);

            fechaPartidaN = (anioPartida + "-" + mesPartida + "-" + diaPartida);

            int anioRegreso = jdcFechaRegreso.getCalendar().get(Calendar.YEAR);
            int mesRegreso = jdcFechaRegreso.getCalendar().get(Calendar.MARCH);
            int diaRegreso = jdcFechaRegreso.getCalendar().get(Calendar.DAY_OF_MONTH);

            fechaRegresoN = (anioRegreso + "-" + mesRegreso + "-" + diaRegreso);

            Calendar c = new GregorianCalendar();
            String dia = Integer.toString(c.get(Calendar.DATE));
            String mes = Integer.toString(c.get(Calendar.MONTH));
            String anio = Integer.toString(c.get(Calendar.YEAR));
            String fechaActual = (anio + "-" + mes + "-" + dia);

            codBuque = Integer.parseInt(cmbBuques.getSelectedItem().toString());
            codPuertoSalida = Integer.parseInt(cmbPuertoSalida.getSelectedItem().toString());
            codDestino = Integer.parseInt(cmbDestinos.getSelectedItem().toString());

            Viaje.setBuque(codBuque);
            if (Viaje.obtenerFechaRegresoBuque() != null) {

                fechaRegreso = Viaje.obtenerFechaRegresoBuque();

                if (validarFechas(fechaPartidaN, fechaRegresoN, fechaActual)) {

                    if (validarDisponibilidadBuque(fechaRegreso, fechaPartidaN, fechaRegresoN)) {
                        if (VerificarViaje()) {
                            if (Viaje.verificarEstadoInac()) {

                                Viaje.setCodBuque(codBuque);
                                Viaje.setCodPuertoSalida(codPuertoSalida);
                                Viaje.setCodDestino(codDestino);

                                Viaje.setFechaPartida(fechaPartidaN);

                                Viaje.setFechaRegreso(fechaRegresoN);

                                Viaje.setEstado("Activo");

                                Viaje.setIdBuque(codBuque);
                                Viaje.setEstadoBuque("Ocupado");
                                Viaje.actulizarEstadoBuque();

                                if (Viaje.RegistrarViajeDisponible()) {
                                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> VIAJE REGISTRADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);
                                    limpiar();
                                    Viaje.llenarJTable(jtViajesDisp, "SELECT vd.idViaje, b.nombreBuque, ps.nombrePuerto, dt.nombreDestino, vd.fechaSalida, vd.fechaRegreso, vd.estado FROM dbo.buques b INNER JOIN dbo.viajesDisponibles vd ON b.codigoBuque = vd.codigoBuque INNER JOIN dbo.destinosTuristicos dt ON vd.codigoDestino = dt.codigoDestino INNER JOIN dbo.puertosSalida ps ON vd.codigoPuertoSalida = ps.codigoPuerto");

                                } else {
                                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR DE PROCEDIMIENTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> EL VIAJE YA EXISTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                            }
                        } else {

                            Viaje.setCodBuque(codBuque);
                            Viaje.setCodPuertoSalida(codPuertoSalida);
                            Viaje.setCodDestino(codDestino);

                            Viaje.setFechaPartida(fechaPartidaN);

                            Viaje.setFechaRegreso(fechaRegresoN);

                            Viaje.setEstado("Activo");

                            Viaje.setIdBuque(codBuque);
                            Viaje.setEstadoBuque("Ocupado");
                            Viaje.actulizarEstadoBuque();

                            if (Viaje.RegistrarViajeDisponible()) {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> VIAJE REGISTRADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);
                                limpiar();
                                Viaje.llenarJTable(jtViajesDisp, "SELECT vd.idViaje, b.nombreBuque, ps.nombrePuerto, dt.nombreDestino, vd.fechaSalida, vd.fechaRegreso, vd.estado FROM dbo.buques b INNER JOIN dbo.viajesDisponibles vd ON b.codigoBuque = vd.codigoBuque INNER JOIN dbo.destinosTuristicos dt ON vd.codigoDestino = dt.codigoDestino INNER JOIN dbo.puertosSalida ps ON vd.codigoPuertoSalida = ps.codigoPuerto");

                            } else {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR DE PROCEDIMIENTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);

                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> EL BUQUE ESTA OCUPADO EN ESA FECHA </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                        jdcFechaSalida.setCalendar(null);
                        jdcFechaRegreso.setCalendar(null);
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE LAS FECHAS CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                    jdcFechaSalida.setCalendar(null);
                    jdcFechaRegreso.setCalendar(null);
                }

            } else {
                if (validarFechas(fechaPartidaN, fechaRegresoN, fechaActual)) {
                    if (VerificarViaje()) {
                        if (Viaje.verificarEstadoInac()) {

                            Viaje.setCodBuque(codBuque);
                            Viaje.setCodPuertoSalida(codPuertoSalida);
                            Viaje.setCodDestino(codDestino);

                            Viaje.setFechaPartida(fechaPartidaN);

                            Viaje.setFechaRegreso(fechaRegresoN);

                            Viaje.setEstado("Activo");

                            Viaje.setIdBuque(codBuque);
                            Viaje.setEstadoBuque("Ocupado");
                            Viaje.actulizarEstadoBuque();

                            if (Viaje.RegistrarViajeDisponible()) {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> VIAJE REGISTRADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);
                                limpiar();
                                Viaje.llenarJTable(jtViajesDisp, "SELECT vd.idViaje, b.nombreBuque, ps.nombrePuerto, dt.nombreDestino, vd.fechaSalida, vd.fechaRegreso, vd.estado FROM dbo.buques b INNER JOIN dbo.viajesDisponibles vd ON b.codigoBuque = vd.codigoBuque INNER JOIN dbo.destinosTuristicos dt ON vd.codigoDestino = dt.codigoDestino INNER JOIN dbo.puertosSalida ps ON vd.codigoPuertoSalida = ps.codigoPuerto");


                            } else {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR DE PROCEDIMIENTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> EL VIAJE YA EXISTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                        }
                    } else {

                        Viaje.setCodBuque(codBuque);
                        Viaje.setCodPuertoSalida(codPuertoSalida);
                        Viaje.setCodDestino(codDestino);

                        Viaje.setFechaPartida(fechaPartidaN);

                        Viaje.setFechaRegreso(fechaRegresoN);

                        Viaje.setEstado("Activo");

                        Viaje.setIdBuque(codBuque);
                        Viaje.setEstadoBuque("Ocupado");
                        Viaje.actulizarEstadoBuque();

                        if (Viaje.RegistrarViajeDisponible()) {
                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> VIAJE REGISTRADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);
                            limpiar();
                            Viaje.llenarJTable(jtViajesDisp, "SELECT vd.idViaje, b.nombreBuque, ps.nombrePuerto, dt.nombreDestino, vd.fechaSalida, vd.fechaRegreso, vd.estado FROM dbo.buques b INNER JOIN dbo.viajesDisponibles vd ON b.codigoBuque = vd.codigoBuque INNER JOIN dbo.destinosTuristicos dt ON vd.codigoDestino = dt.codigoDestino INNER JOIN dbo.puertosSalida ps ON vd.codigoPuertoSalida = ps.codigoPuerto");


                        } else {
                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR DE PROCEDIMIENTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);

                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE LAS FECHAS CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                    jdcFechaSalida.setCalendar(null);
                    jdcFechaRegreso.setCalendar(null);
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> INGRESE LOS DATOS SOLICITADOS </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icono);

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
            JOptionPane.showMessageDialog(null, " Error al verificar buque " + ex, "", JOptionPane.INFORMATION_MESSAGE, icon);
            return false;
        }
    }
    
        private boolean VerificarBuque() {
        int resultado = 0;
        int codBuque;
        codBuque = Integer.parseInt(cmbBuques.getSelectedItem().toString());
        try {
            ps = dbConnection.dbConexion().prepareStatement("SELECT [estado] FROM [dbo].[buques] WHERE [idViaje] = ?");
            ps.setInt(1, codBuque);

            rs = ps.executeQuery();

            if (rs.next()) {

                Viaje.setEstadoBuque(rs.getString("estado").trim());
                return true;

            } else {
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al verificar buque " + ex, "", JOptionPane.INFORMATION_MESSAGE, icon);
            return false;
        }
    }

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed

        
        if ((cmbBuques.getSelectedIndex() != -1) && (cmbPuertoSalida.getSelectedIndex() != -1) && (cmbDestinos.getSelectedIndex() != -1) && (jdcFechaSalida.getDate() != null) && (jdcFechaRegreso.getDate() != null)) {

            try {
                String obtenerUltimoCodigo;
                int UltimoCodigo;
                ps = dbConnection.dbConexion().prepareStatement("SELECT TOP 1 [idViaje] FROM [dbo].[viajesDisponibles] order by [idViaje] desc");
                rs = ps.executeQuery();

                if (rs.next()) {
                    obtenerUltimoCodigo = rs.getString("idViaje").trim();
                    UltimoCodigo = Integer.parseInt(obtenerUltimoCodigo) + 1;

                    if ((UltimoCodigo != Integer.parseInt(txtIdViaje.getText()))) {

                        VerificarViaje();
                        if (Viaje.verificarEstadoAct()) {

                            int idViaje, codBuque, codPuertoSalida, codDestino;
                            String fechaPartidaN, fechaRegresoN, fechaRegreso;

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

                            fechaPartidaN = (anioPartida + "-" + mesPartida + "-" + diaPartida);

                            Viaje.setFechaPartida(fechaPartidaN);

                            int anioRegreso = jdcFechaRegreso.getCalendar().get(Calendar.YEAR);
                            int mesRegreso = jdcFechaRegreso.getCalendar().get(Calendar.MARCH);
                            int diaRegreso = jdcFechaRegreso.getCalendar().get(Calendar.DAY_OF_MONTH);

                            fechaRegresoN = (anioRegreso + "-" + mesRegreso + "-" + diaRegreso);

                            Calendar c = new GregorianCalendar();
                            String dia = Integer.toString(c.get(Calendar.DATE));
                            String mes = Integer.toString(c.get(Calendar.MONTH));
                            String anio = Integer.toString(c.get(Calendar.YEAR));
                            String fechaActual = (anio + "-" + mes + "-" + dia);
                            
                            Viaje.setFechaRegreso(fechaRegresoN);

                            if (validarFechas(fechaPartidaN, fechaRegresoN, fechaActual)) {

                                fechaRegreso = Viaje.obtenerFechaRegresoBuque();
                                if (validarDisponibilidadBuque(fechaRegreso, fechaPartidaN, fechaRegresoN)) {

                                    if (Viaje.ActualizarViajeDisponible()) {
                                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> VIAJE ACTUALIZADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);
                                        limpiar();
                                        Viaje.llenarJTable(jtViajesDisp, "SELECT vd.idViaje, b.nombreBuque, ps.nombrePuerto, dt.nombreDestino, vd.fechaSalida, vd.fechaRegreso, vd.estado FROM dbo.buques b INNER JOIN dbo.viajesDisponibles vd ON b.codigoBuque = vd.codigoBuque INNER JOIN dbo.destinosTuristicos dt ON vd.codigoDestino = dt.codigoDestino INNER JOIN dbo.puertosSalida ps ON vd.codigoPuertoSalida = ps.codigoPuerto");

                                    } else {
                                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR DE PROCEDIMIENTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> EL BUQUE ESTA OCUPADO EN ESA FECHA </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                                    jdcFechaSalida.setCalendar(null);
                                    jdcFechaRegreso.setCalendar(null);
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE LAS FECHAS CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                                jdcFechaSalida.setCalendar(null);
                                jdcFechaRegreso.setCalendar(null);
                            }

                        } else {
                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> NO SE PUEDE ACTUALIZAR UN VIAJE CANCELADO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> SELECCIONE UN VIAJE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);

                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE, icon);
            }

        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> INGRESE LOS DATOS SOLICITADOS </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icono);
        }
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
   if (!txtIdViaje.getText().isBlank()) {

            try {
                String obtenerUltimoCodigo;
                int UltimoCodigo, codBuque;
                ps = dbConnection.dbConexion().prepareStatement("SELECT TOP 1 [idViaje] FROM [dbo].[viajesDisponibles] order by [idViaje] desc");
                rs = ps.executeQuery();

                if (rs.next()) {
                    obtenerUltimoCodigo = rs.getString("idViaje").trim();
                    UltimoCodigo = Integer.parseInt(obtenerUltimoCodigo) + 1;

                    if ((UltimoCodigo != Integer.parseInt(txtIdViaje.getText()))) {

                        VerificarViaje();
                        if (Viaje.verificarEstadoAct()) {
                            Viaje.setEstado("Inactivo");
                            Viaje.setIdViaje(Integer.parseInt(txtIdViaje.getText()));
                            codBuque = Integer.parseInt(cmbBuques.getSelectedItem().toString());
                            
                            Viaje.setIdBuque(codBuque);
                            Viaje.setEstadoBuque("Activo");
                            Viaje.actulizarEstadoBuque();
                            
                            if (Viaje.EliminarViaje()) {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> VIAJE ELIMINADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, Icono);
                                limpiar();
                                Viaje.llenarJTable(jtViajesDisp, "SELECT vd.idViaje, b.nombreBuque, ps.nombrePuerto, dt.nombreDestino, vd.fechaSalida, vd.fechaRegreso, vd.estado FROM dbo.buques b INNER JOIN dbo.viajesDisponibles vd ON b.codigoBuque = vd.codigoBuque INNER JOIN dbo.destinosTuristicos dt ON vd.codigoDestino = dt.codigoDestino INNER JOIN dbo.puertosSalida ps ON vd.codigoPuertoSalida = ps.codigoPuerto");


                            } else {
                                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR DE PROCEDIMIENTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> EL VIAJE YA SE ENCUENTRA ELIMINADO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);

                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> SELECCIONE UN VIAJE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icon);

                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> SELECCIONE UN VIAJE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, icono);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        int result = JOptionPane.showConfirmDialog(null, "<html><b style=\"color:black; font-size:13px;\">Está seguro de volver al Menú Principal?</b></html>", "Salir del Módulo",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, icono);

        if (result == JOptionPane.YES_NO_OPTION) {
            this.dispose();

            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuMouseClicked

    public void CodigoNuevoViaje() {
        try {
            String obtenerUltimoCodigo;
            int UltimoCodigo;
            ps = dbConnection.dbConexion().prepareStatement("SELECT TOP 1 [idViaje] FROM [dbo].[viajesDisponibles] order by [idViaje] desc");
            rs = ps.executeQuery();

            if (rs.next()) {
                obtenerUltimoCodigo = rs.getString("idViaje").trim();
                UltimoCodigo = Integer.parseInt(obtenerUltimoCodigo) + 1;
                txtIdViaje.setText("" + UltimoCodigo);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE, icon);
        }

    }
    
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
        String JcmbBuque = cmbBuques.getEditor().getItem().toString();
        txtIdViaje.setText(String.valueOf(jtViajesDisp.getValueAt(seleccionar, 0)));

        buque = jtViajesDisp.getValueAt(seleccionar, 1).toString();
        salida = jtViajesDisp.getValueAt(seleccionar, 2).toString();
        destino = jtViajesDisp.getValueAt(seleccionar, 3).toString();
        
        Viaje.setNombreBuque(buque);
        for(int i = 0; i < cmbBuques.getItemCount(); i++)
        {
            if(Integer.parseInt(cmbBuques.getItemAt(i)) == Viaje.obtenerIdBuque())
            {
                cmbBuques.setSelectedIndex(i);
            }
        }

        Viaje.setNombreSalida(salida);
        for(int i = 0; i < cmbPuertoSalida.getItemCount(); i++)
        {
            if(Integer.parseInt(cmbPuertoSalida.getItemAt(i)) == Viaje.obtenerIdSalida())
            {
                cmbPuertoSalida.setSelectedIndex(i);
            }
        }
        
        Viaje.setNombreDestino(destino);
        for(int i = 0; i < cmbDestinos.getItemCount(); i++)
        {
            if(Integer.parseInt(cmbDestinos.getItemAt(i)) == Viaje.obtenerIdDestino())
            {
                cmbDestinos.setSelectedIndex(i);
            }
        }
        
        llenarFechaSal();
        llenarFechaRe();

    }//GEN-LAST:event_jtViajesDispMouseClicked

    
    private void llenarFechaSal() {
        int fila = jtViajesDisp.getSelectedRow();
        String fechaSalida = jtViajesDisp.getValueAt(fila, 4).toString();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaNSal = null;
        try {
            fechaNSal = formatoDelTexto.parse(fechaSalida);
            jdcFechaSalida.setDate(fechaNSal);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar fecha salida " + ex, "", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }

    private void llenarFechaRe() {
        int fila = jtViajesDisp.getSelectedRow();
        String fechaRegreso = jtViajesDisp.getValueAt(fila, 5).toString();
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");

        Date fechaNRe = null;
        try {
            fechaNRe = formatoDelTexto.parse(fechaRegreso);
            jdcFechaRegreso.setDate(fechaNRe);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar fecha regreso" + ex, "", JOptionPane.INFORMATION_MESSAGE, icon);
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
    private com.toedter.calendar.JDateChooser jdcFechaRegreso;
    private com.toedter.calendar.JDateChooser jdcFechaSalida;
    private javax.swing.JTable jtViajesDisp;
    private javax.swing.JTextField txtBuque;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtIdViaje;
    private javax.swing.JTextField txtSalida;
    // End of variables declaration//GEN-END:variables
}
