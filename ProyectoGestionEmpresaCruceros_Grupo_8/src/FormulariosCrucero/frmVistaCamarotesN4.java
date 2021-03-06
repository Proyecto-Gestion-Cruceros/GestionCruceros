package FormulariosCrucero;

import Clases.clsMessage;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import Formularios.Pagos.frmPagos;
import static FormulariosCrucero.frmVistaCamarotesN2.conn;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.swing.AbstractButton;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmVistaCamarotesN4 extends javax.swing.JFrame {

    public frmVistaCamarotesN4() {
        initComponents();
    }

    dbConnection conexion = new dbConnection();
    clsVariablesViaje variables = new clsVariablesViaje();
    int cantidadOcupantes = variables.getNumeroPersonas();
    clsMessage message = new clsMessage();
    int numeroCamaroteSeleccionado = 0;
    PreparedStatement ps;
    ResultSet result = null;
    


    public static Connection dbConexion() {
        String url = "jdbc:sqlserver://DESKTOP-P4A3L4O:1433;databaseName=agenciaCruceros";

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        } catch (Exception ex) {
            System.out.println("ERROR DE CONEXIÓN");
        }

        try {
            conn = DriverManager.getConnection(url, "sa", "1234");
        } catch (Exception ex) {
            System.out.println("ERROR DE CONEXIÓN");
        }

        return conn;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        indicador150 = new javax.swing.JButton();
        indicador141 = new javax.swing.JButton();
        indicador151 = new javax.swing.JButton();
        indicador152 = new javax.swing.JButton();
        indicador153 = new javax.swing.JButton();
        indicador154 = new javax.swing.JButton();
        indicador149 = new javax.swing.JButton();
        indicador140 = new javax.swing.JButton();
        indicador139 = new javax.swing.JButton();
        indicador138 = new javax.swing.JButton();
        indicador143 = new javax.swing.JButton();
        indicador142 = new javax.swing.JButton();
        indicador144 = new javax.swing.JButton();
        indicador145 = new javax.swing.JButton();
        indicador146 = new javax.swing.JButton();
        indicador147 = new javax.swing.JButton();
        indicador148 = new javax.swing.JButton();
        indicador137 = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatosCamarote = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1920, 1080));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(1635, 1035));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("CAMAROTES - NIVEL 1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(770, 80, 460, 49);

        btnAtras.setBackground(new java.awt.Color(255, 204, 51));
        btnAtras.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("REGRESAR");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(0, 1020, 210, 60);

        btnSiguiente.setBackground(new java.awt.Color(255, 204, 51));
        btnSiguiente.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(1710, 1020, 210, 60);

        indicador150.setBackground(new java.awt.Color(102, 255, 0));
        indicador150.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador150);
        indicador150.setHideActionText(true);
        indicador150.setName("indicador150"); // NOI18N
        indicador150.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador150ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador150);
        indicador150.setBounds(1251, 385, 47, 30);

        indicador141.setBackground(new java.awt.Color(102, 255, 0));
        indicador141.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador141.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador141);
        indicador141.setName("indicador141"); // NOI18N
        indicador141.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador141ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador141);
        indicador141.setBounds(1360, 320, 45, 30);

        indicador151.setBackground(new java.awt.Color(102, 255, 0));
        indicador151.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador151);
        indicador151.setHideActionText(true);
        indicador151.setName("indicador151"); // NOI18N
        indicador151.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador151ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador151);
        indicador151.setBounds(1327, 385, 40, 30);

        indicador152.setBackground(new java.awt.Color(102, 255, 0));
        indicador152.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador152);
        indicador152.setHideActionText(true);
        indicador152.setName("indicador152"); // NOI18N
        indicador152.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador152ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador152);
        indicador152.setBounds(1192, 435, 47, 30);

        indicador153.setBackground(new java.awt.Color(102, 255, 0));
        indicador153.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador153);
        indicador153.setHideActionText(true);
        indicador153.setName("indicador153"); // NOI18N
        indicador153.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador153ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador153);
        indicador153.setBounds(1251, 435, 47, 30);

        indicador154.setBackground(new java.awt.Color(102, 255, 0));
        indicador154.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador154);
        indicador154.setHideActionText(true);
        indicador154.setName("indicador154"); // NOI18N
        indicador154.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador154ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador154);
        indicador154.setBounds(1327, 435, 40, 30);

        indicador149.setBackground(new java.awt.Color(102, 255, 0));
        indicador149.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador149);
        indicador149.setHideActionText(true);
        indicador149.setName("indicador149"); // NOI18N
        indicador149.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador149ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador149);
        indicador149.setBounds(1192, 385, 47, 30);

        indicador140.setBackground(new java.awt.Color(102, 255, 0));
        indicador140.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador140.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador140);
        indicador140.setName("indicador140"); // NOI18N
        indicador140.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador140ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador140);
        indicador140.setBounds(1302, 320, 45, 30);

        indicador139.setBackground(new java.awt.Color(102, 255, 0));
        indicador139.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador139.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador139);
        indicador139.setName("indicador139"); // NOI18N
        indicador139.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador139ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador139);
        indicador139.setBounds(1244, 320, 45, 30);

        indicador138.setBackground(new java.awt.Color(102, 255, 0));
        indicador138.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador138.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador138);
        indicador138.setName("indicador138"); // NOI18N
        indicador138.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador138ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador138);
        indicador138.setBounds(1185, 320, 45, 30);

        indicador143.setBackground(new java.awt.Color(102, 255, 0));
        indicador143.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador143.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador143);
        indicador143.setName("indicador143"); // NOI18N
        indicador143.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador143ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador143);
        indicador143.setBounds(1125, 497, 45, 30);

        indicador142.setBackground(new java.awt.Color(102, 255, 0));
        indicador142.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador142.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador142);
        indicador142.setName("indicador142"); // NOI18N
        indicador142.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador142ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador142);
        indicador142.setBounds(1418, 320, 45, 30);

        indicador144.setBackground(new java.awt.Color(102, 255, 0));
        indicador144.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador144.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador144);
        indicador144.setName("indicador144"); // NOI18N
        indicador144.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador144ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador144);
        indicador144.setBounds(1185, 497, 45, 30);

        indicador145.setBackground(new java.awt.Color(102, 255, 0));
        indicador145.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador145.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador145);
        indicador145.setName("indicador145"); // NOI18N
        indicador145.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador145ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador145);
        indicador145.setBounds(1244, 497, 45, 30);

        indicador146.setBackground(new java.awt.Color(102, 255, 0));
        indicador146.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador146.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador146);
        indicador146.setName("indicador146"); // NOI18N
        indicador146.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador146ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador146);
        indicador146.setBounds(1302, 497, 45, 30);

        indicador147.setBackground(new java.awt.Color(102, 255, 0));
        indicador147.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador147.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador147);
        indicador147.setName("indicador147"); // NOI18N
        indicador147.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador147ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador147);
        indicador147.setBounds(1360, 497, 45, 30);

        indicador148.setBackground(new java.awt.Color(102, 255, 0));
        indicador148.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador148.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador148);
        indicador148.setName("indicador148"); // NOI18N
        indicador148.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador148ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador148);
        indicador148.setBounds(1418, 497, 45, 30);

        indicador137.setBackground(new java.awt.Color(102, 255, 0));
        indicador137.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador137.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador137);
        indicador137.setName("indicador137"); // NOI18N
        indicador137.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador137ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador137);
        indicador137.setBounds(1125, 320, 45, 30);

        lblBackground.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/nivelUltimoDef.png"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(170, 220, 1630, 410);

        txtDatosCamarote.setEditable(false);
        txtDatosCamarote.setBackground(new java.awt.Color(0, 79, 129));
        txtDatosCamarote.setColumns(20);
        txtDatosCamarote.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        txtDatosCamarote.setForeground(new java.awt.Color(255, 204, 51));
        txtDatosCamarote.setRows(5);
        txtDatosCamarote.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204)));
        txtDatosCamarote.setFocusable(false);
        jScrollPane1.setViewportView(txtDatosCamarote);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(770, 770, 450, 220);

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Detalles del Camarote");
        jLabel2.setFocusTraversalPolicyProvider(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(840, 710, 330, 49);

        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenuPrincipal.setBorderPainted(false);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenuPrincipal);
        btnMenuPrincipal.setBounds(1843, 2, 75, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indicador152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador152ActionPerformed
        bloquearBotones(indicador152);

        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 152;
            llenarDatosCamarote(152);
        }
    }//GEN-LAST:event_indicador152ActionPerformed

    private void indicador153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador153ActionPerformed
        bloquearBotones(indicador153);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 153;
            llenarDatosCamarote(153);
        }
    }//GEN-LAST:event_indicador153ActionPerformed

    private void indicador137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador137ActionPerformed
        bloquearBotones(indicador137);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 137;
            llenarDatosCamarote(137);
        }
    }//GEN-LAST:event_indicador137ActionPerformed

    private void indicador138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador138ActionPerformed
        bloquearBotones(indicador138);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 138;
            llenarDatosCamarote(138);
        }
    }//GEN-LAST:event_indicador138ActionPerformed

    private void indicador139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador139ActionPerformed
        bloquearBotones(indicador139);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 139;
            llenarDatosCamarote(139);
        }
    }//GEN-LAST:event_indicador139ActionPerformed

    private void indicador140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador140ActionPerformed
        bloquearBotones(indicador140);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 140;
            llenarDatosCamarote(140);
        }
    }//GEN-LAST:event_indicador140ActionPerformed

    private void indicador141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador141ActionPerformed
        bloquearBotones(indicador141);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 141;
            llenarDatosCamarote(141);
        }
    }//GEN-LAST:event_indicador141ActionPerformed

    private void indicador142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador142ActionPerformed
        bloquearBotones(indicador142);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 142;
            llenarDatosCamarote(142);
        }
    }//GEN-LAST:event_indicador142ActionPerformed

    private void indicador143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador143ActionPerformed
        bloquearBotones(indicador143);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 143;
            llenarDatosCamarote(143);
        }
    }//GEN-LAST:event_indicador143ActionPerformed

    private void indicador144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador144ActionPerformed
        bloquearBotones(indicador144);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 144;
            llenarDatosCamarote(144);
        }
    }//GEN-LAST:event_indicador144ActionPerformed

    private void indicador145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador145ActionPerformed
        bloquearBotones(indicador145);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 145;
            llenarDatosCamarote(145);
        }
    }//GEN-LAST:event_indicador145ActionPerformed

    private void indicador146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador146ActionPerformed
        bloquearBotones(indicador146);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 146;
            llenarDatosCamarote(146);
        }
    }//GEN-LAST:event_indicador146ActionPerformed

    private void indicador147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador147ActionPerformed
        bloquearBotones(indicador147);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 147;
            llenarDatosCamarote(147);
        }
    }//GEN-LAST:event_indicador147ActionPerformed

    private void indicador148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador148ActionPerformed
        bloquearBotones(indicador148);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 148;
            llenarDatosCamarote(148);
        }
    }//GEN-LAST:event_indicador148ActionPerformed

    private void indicador149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador149ActionPerformed
        bloquearBotones(indicador149);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 149;
            llenarDatosCamarote(149);
        }
    }//GEN-LAST:event_indicador149ActionPerformed

    private void indicador150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador150ActionPerformed
        bloquearBotones(indicador150);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 150;
            llenarDatosCamarote(150);
        }
    }//GEN-LAST:event_indicador150ActionPerformed

    private void indicador151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador151ActionPerformed
        bloquearBotones(indicador151);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 151;
            llenarDatosCamarote(151);
        }
    }//GEN-LAST:event_indicador151ActionPerformed

    private void indicador154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador154ActionPerformed
        bloquearBotones(indicador154);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 154;
            llenarDatosCamarote(154);
        }
    }//GEN-LAST:event_indicador154ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        verificarBotones();
        retornarEstadoCamarote();
    }//GEN-LAST:event_formWindowOpened

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (numeroCamaroteSeleccionado != 0) {
            variables.setNumeroCamarote(numeroCamaroteSeleccionado);
            this.dispose();
            new frmPagos().setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> DEBE SELECCIONAR UN CAMAROTE</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icono);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        numeroCamaroteSeleccionado = 0;
        variables.setNumeroCamarote(0);
        this.dispose();
        frmSeleccionNivel seleccionador = new frmSeleccionNivel();
        seleccionador.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"<html><b style=\"color:black; font-size:13px;\">Está seguro de volver al Menú Principal?</b></html>" , "Salir del Módulo",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, message.icono);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            variables.resetVariables();
            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed


    public void bloquearBotones(JButton boton) {

        Enumeration elements = group.getElements();

        if (boton.isContentAreaFilled() == true) {

            while (elements.hasMoreElements()) {

                AbstractButton button = (AbstractButton) elements.nextElement();
                button.setEnabled(true);

            }
            boton.setEnabled(true);
            boton.setContentAreaFilled(false);

        } else {
            while (elements.hasMoreElements()) {

                AbstractButton button = (AbstractButton) elements.nextElement();
                button.setEnabled(false);

            }
            boton.setEnabled(true);
            boton.setContentAreaFilled(true);
        }

    }

    public void verificarBotones() {
        Enumeration elements = group.getElements();

        while (elements.hasMoreElements()) {

            AbstractButton button = (AbstractButton) elements.nextElement();
            button.setEnabled(true);
            button.setContentAreaFilled(false);
        }

    }

    public void retornarEstadoCamarote() {
        try {
            for (int i = 137; i <= 154; i++) {
                String estadoCamarote;
                String nombreBoton;
                int capacidadMax;

                ps = conexion.dbConexion().prepareStatement("SELECT estadoCamarote, capacidadMaxima FROM camarotes WHERE codigoCamarote = " + i + " AND codigoBuque = " + variables.getCodigoBuque() + " AND nivel = " + variables.getNivelBarco());
                ResultSet result = ps.executeQuery();
                if (result.next()) {
                    estadoCamarote = result.getString("estadoCamarote");
                    capacidadMax = Integer.parseInt(result.getString("capacidadMaxima"));

                    if (estadoCamarote.equals("Ocupado") || (cantidadOcupantes > capacidadMax)) {

                        Enumeration elements = group.getElements();
                        while (elements.hasMoreElements()) {
                            AbstractButton button = (AbstractButton) elements.nextElement();
                            nombreBoton = "indicador" + i;

                            if (nombreBoton.equals(button.getName())) {
                                button.setEnabled(false);
                                button.setBackground(Color.gray);
                                button.setBorderPainted(false);
                                button.setContentAreaFilled(true);
                                group.remove(button);
                            }
                        }
                    }
                } else {
                    Enumeration elements = group.getElements();
                    while (elements.hasMoreElements()) {
                        AbstractButton button = (AbstractButton) elements.nextElement();
                        nombreBoton = "indicador" + i;

                        if (nombreBoton.equals(button.getName())) {
                            button.setEnabled(false);
                            button.setBackground(Color.red);
                            button.setBorderPainted(false);
                            button.setContentAreaFilled(true);
                            group.remove(button);
                        }
                    }
                }
            }

        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, message.icon); 
        }
    }

    public void llenarDatosCamarote(int numeroCamarote) {

        try {

            int codigoBuque;
            int nivel;
            String tipoCamarote;
            int capacidadMaxima;
            float precioCamarote;
            
            if (numeroCamarote != 0) {
                ps = conexion.dbConexion().prepareStatement("SELECT codigoBuque, nivel, tipoCamarote, capacidadMaxima, precioCamarote FROM camarotes WHERE codigoCamarote = " + numeroCamarote + " AND codigoBuque = " + variables.getCodigoBuque() + " AND nivel = " + variables.getNivelBarco());
                ResultSet result = ps.executeQuery();
                if (result.next()) {
                    codigoBuque = Integer.parseInt(result.getString("codigoBuque"));
                    nivel = Integer.parseInt(result.getString("nivel"));
                    tipoCamarote = result.getString("tipoCamarote");
                    capacidadMaxima = Integer.parseInt(result.getString("capacidadMaxima"));
                    precioCamarote = Float.parseFloat(result.getString("precioCamarote"));
                      
                    txtDatosCamarote.append(" Numero de Camarote: " + numeroCamarote);
                    txtDatosCamarote.append("\n Codigo del Buque: " + codigoBuque);
                    txtDatosCamarote.append("\n Nivel: " + nivel);
                    txtDatosCamarote.append("\n Tipo: " + tipoCamarote);
                    txtDatosCamarote.append("\n Capacidad Maxima: " + capacidadMaxima + " Personas");
                    txtDatosCamarote.append("\n Precio: $ " + precioCamarote);      
                }

            } else {
                txtDatosCamarote.setText(null);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, message.icon); 
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup group;
    private javax.swing.JButton indicador137;
    private javax.swing.JButton indicador138;
    private javax.swing.JButton indicador139;
    private javax.swing.JButton indicador140;
    private javax.swing.JButton indicador141;
    private javax.swing.JButton indicador142;
    private javax.swing.JButton indicador143;
    private javax.swing.JButton indicador144;
    private javax.swing.JButton indicador145;
    private javax.swing.JButton indicador146;
    private javax.swing.JButton indicador147;
    private javax.swing.JButton indicador148;
    private javax.swing.JButton indicador149;
    private javax.swing.JButton indicador150;
    private javax.swing.JButton indicador151;
    private javax.swing.JButton indicador152;
    private javax.swing.JButton indicador153;
    private javax.swing.JButton indicador154;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextArea txtDatosCamarote;
    // End of variables declaration//GEN-END:variables
}
