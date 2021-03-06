package FormulariosCrucero;

import Clases.clsMessage;
import Clases.dbConnection;
import FormularioIGP.frmIGP;

import Formularios.Pagos.frmPagos;
import java.awt.Color;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmVistaCamarotesN2 extends javax.swing.JFrame {

    public frmVistaCamarotesN2() {
        initComponents();
    }

    dbConnection conexion = new dbConnection();
    clsVariablesViaje variables = new clsVariablesViaje();

    int cantidadOcupantes = variables.getNumeroPersonas();
    public static Connection conn = null;
    int numeroCamaroteSeleccionado = 0;
    PreparedStatement ps;
    ResultSet result = null;
    clsMessage message = new clsMessage();

    Icon icon = new ImageIcon(getClass().getResource("/Resources/Error.png"));
    Icon icono = new ImageIcon(getClass().getResource("/Resources/Advertencia.png"));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        indicador11 = new javax.swing.JButton();
        indicador37 = new javax.swing.JButton();
        indicador31 = new javax.swing.JButton();
        indicador8 = new javax.swing.JButton();
        indicador12 = new javax.swing.JButton();
        indicador10 = new javax.swing.JButton();
        indicador7 = new javax.swing.JButton();
        indicador6 = new javax.swing.JButton();
        indicador9 = new javax.swing.JButton();
        indicador3 = new javax.swing.JButton();
        indicador2 = new javax.swing.JButton();
        indicador19 = new javax.swing.JButton();
        indicador5 = new javax.swing.JButton();
        indicador4 = new javax.swing.JButton();
        indicador20 = new javax.swing.JButton();
        indicador21 = new javax.swing.JButton();
        indicador22 = new javax.swing.JButton();
        indicador23 = new javax.swing.JButton();
        indicador24 = new javax.swing.JButton();
        indicador25 = new javax.swing.JButton();
        indicador26 = new javax.swing.JButton();
        indicador27 = new javax.swing.JButton();
        indicador28 = new javax.swing.JButton();
        indicador1 = new javax.swing.JButton();
        indicador29 = new javax.swing.JButton();
        indicador38 = new javax.swing.JButton();
        indicador40 = new javax.swing.JButton();
        indicador50 = new javax.swing.JButton();
        indicador42 = new javax.swing.JButton();
        indicador39 = new javax.swing.JButton();
        indicador49 = new javax.swing.JButton();
        indicador36 = new javax.swing.JButton();
        indicador33 = new javax.swing.JButton();
        indicador13 = new javax.swing.JButton();
        indicador14 = new javax.swing.JButton();
        indicador15 = new javax.swing.JButton();
        indicador16 = new javax.swing.JButton();
        indicador17 = new javax.swing.JButton();
        indicador18 = new javax.swing.JButton();
        indicador30 = new javax.swing.JButton();
        indicador34 = new javax.swing.JButton();
        indicador32 = new javax.swing.JButton();
        indicador45 = new javax.swing.JButton();
        indicador51 = new javax.swing.JButton();
        indicador47 = new javax.swing.JButton();
        indicador41 = new javax.swing.JButton();
        indicador52 = new javax.swing.JButton();
        indicador46 = new javax.swing.JButton();
        indicador35 = new javax.swing.JButton();
        indicador43 = new javax.swing.JButton();
        indicador48 = new javax.swing.JButton();
        indicador44 = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatosCamarote = new javax.swing.JTextArea();

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

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Detalles del Camarote");
        jLabel1.setFocusTraversalPolicyProvider(true);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(810, 730, 330, 49);

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

        indicador11.setBackground(new java.awt.Color(51, 255, 0));
        indicador11.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador11);
        indicador11.setHideActionText(true);
        indicador11.setName("indicador11"); // NOI18N
        indicador11.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador11ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador11);
        indicador11.setBounds(954, 360, 40, 40);

        indicador37.setBackground(new java.awt.Color(102, 255, 0));
        indicador37.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador37);
        indicador37.setHideActionText(true);
        indicador37.setName("indicador37"); // NOI18N
        indicador37.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador37ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador37);
        indicador37.setBounds(869, 438, 40, 30);

        indicador31.setBackground(new java.awt.Color(102, 255, 0));
        indicador31.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador31.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador31);
        indicador31.setHideActionText(true);
        indicador31.setName("indicador31"); // NOI18N
        indicador31.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador31ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador31);
        indicador31.setBounds(1078, 552, 40, 40);

        indicador8.setBackground(new java.awt.Color(102, 255, 0));
        indicador8.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador8);
        indicador8.setHideActionText(true);
        indicador8.setName("indicador8"); // NOI18N
        indicador8.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador8ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador8);
        indicador8.setBounds(770, 360, 40, 40);

        indicador12.setBackground(new java.awt.Color(102, 255, 0));
        indicador12.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador12);
        indicador12.setHideActionText(true);
        indicador12.setName("indicador12"); // NOI18N
        indicador12.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador12ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador12);
        indicador12.setBounds(1016, 360, 40, 40);

        indicador10.setBackground(new java.awt.Color(102, 255, 0));
        indicador10.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador10);
        indicador10.setHideActionText(true);
        indicador10.setName("indicador10"); // NOI18N
        indicador10.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador10ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador10);
        indicador10.setBounds(894, 360, 40, 40);

        indicador7.setBackground(new java.awt.Color(102, 255, 0));
        indicador7.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador7.setText("   ");
        indicador7.setToolTipText("");
        indicador7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador7);
        indicador7.setHideActionText(true);
        indicador7.setName("indicador7"); // NOI18N
        indicador7.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador7ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador7);
        indicador7.setBounds(710, 360, 40, 40);

        indicador6.setBackground(new java.awt.Color(102, 255, 0));
        indicador6.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador6.setText("   ");
        indicador6.setToolTipText("");
        indicador6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador6);
        indicador6.setHideActionText(true);
        indicador6.setName("indicador6"); // NOI18N
        indicador6.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador6ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador6);
        indicador6.setBounds(649, 360, 40, 40);

        indicador9.setBackground(new java.awt.Color(102, 255, 0));
        indicador9.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador9);
        indicador9.setHideActionText(true);
        indicador9.setName("indicador9"); // NOI18N
        indicador9.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador9ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador9);
        indicador9.setBounds(830, 360, 40, 40);

        indicador3.setBackground(new java.awt.Color(102, 255, 0));
        indicador3.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador3.setText("  ");
        indicador3.setActionCommand("indicador3");
        indicador3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador3);
        indicador3.setHideActionText(true);
        indicador3.setName("indicador3"); // NOI18N
        indicador3.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador3ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador3);
        indicador3.setBounds(412, 360, 40, 40);

        indicador2.setBackground(new java.awt.Color(102, 255, 0));
        indicador2.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador2.setText("  ");
        indicador2.setActionCommand("");
        indicador2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador2);
        indicador2.setHideActionText(true);
        indicador2.setName("indicador2"); // NOI18N
        indicador2.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador2ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador2);
        indicador2.setBounds(350, 360, 40, 40);

        indicador19.setBackground(new java.awt.Color(102, 255, 0));
        indicador19.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador19.setText("  ");
        indicador19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador19);
        indicador19.setHideActionText(true);
        indicador19.setName("indicador19"); // NOI18N
        indicador19.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador19ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador19);
        indicador19.setBounds(290, 552, 40, 40);

        indicador5.setBackground(new java.awt.Color(102, 255, 0));
        indicador5.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador5.setText("   ");
        indicador5.setToolTipText("");
        indicador5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador5);
        indicador5.setHideActionText(true);
        indicador5.setName("indicador5"); // NOI18N
        indicador5.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador5ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador5);
        indicador5.setBounds(550, 360, 40, 40);

        indicador4.setBackground(new java.awt.Color(102, 255, 0));
        indicador4.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador4.setText("  ");
        indicador4.setActionCommand("indicado4");
        indicador4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador4);
        indicador4.setHideActionText(true);
        indicador4.setName("indicador4"); // NOI18N
        indicador4.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador4ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador4);
        indicador4.setBounds(472, 360, 40, 40);

        indicador20.setBackground(new java.awt.Color(102, 255, 0));
        indicador20.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador20.setText("  ");
        indicador20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador20);
        indicador20.setHideActionText(true);
        indicador20.setName("indicador20"); // NOI18N
        indicador20.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador20ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador20);
        indicador20.setBounds(350, 552, 40, 40);

        indicador21.setBackground(new java.awt.Color(102, 255, 0));
        indicador21.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador21.setText("   ");
        indicador21.setToolTipText("");
        indicador21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador21);
        indicador21.setHideActionText(true);
        indicador21.setName("indicador21"); // NOI18N
        indicador21.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador21ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador21);
        indicador21.setBounds(412, 552, 40, 40);

        indicador22.setBackground(new java.awt.Color(102, 255, 0));
        indicador22.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador22.setText("   ");
        indicador22.setToolTipText("");
        indicador22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador22);
        indicador22.setHideActionText(true);
        indicador22.setName("indicador22"); // NOI18N
        indicador22.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador22ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador22);
        indicador22.setBounds(472, 552, 40, 40);

        indicador23.setBackground(new java.awt.Color(102, 255, 0));
        indicador23.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador23.setText("   ");
        indicador23.setToolTipText("");
        indicador23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador23);
        indicador23.setHideActionText(true);
        indicador23.setName("indicador23"); // NOI18N
        indicador23.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador23ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador23);
        indicador23.setBounds(550, 552, 40, 40);

        indicador24.setBackground(new java.awt.Color(102, 255, 0));
        indicador24.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador24.setText("   ");
        indicador24.setToolTipText("");
        indicador24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador24);
        indicador24.setHideActionText(true);
        indicador24.setName("indicador24"); // NOI18N
        indicador24.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador24ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador24);
        indicador24.setBounds(649, 552, 40, 40);

        indicador25.setBackground(new java.awt.Color(102, 255, 0));
        indicador25.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador25.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador25);
        indicador25.setHideActionText(true);
        indicador25.setName("indicador25"); // NOI18N
        indicador25.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador25ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador25);
        indicador25.setBounds(710, 552, 40, 40);

        indicador26.setBackground(new java.awt.Color(102, 255, 0));
        indicador26.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador26.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador26);
        indicador26.setHideActionText(true);
        indicador26.setName("indicador26"); // NOI18N
        indicador26.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador26ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador26);
        indicador26.setBounds(770, 552, 40, 40);

        indicador27.setBackground(new java.awt.Color(102, 255, 0));
        indicador27.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador27.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador27);
        indicador27.setHideActionText(true);
        indicador27.setName("indicador27"); // NOI18N
        indicador27.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador27ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador27);
        indicador27.setBounds(830, 552, 40, 40);

        indicador28.setBackground(new java.awt.Color(102, 255, 0));
        indicador28.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador28.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador28);
        indicador28.setHideActionText(true);
        indicador28.setName("indicador28"); // NOI18N
        indicador28.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador28ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador28);
        indicador28.setBounds(894, 552, 40, 40);

        indicador1.setBackground(new java.awt.Color(102, 255, 0));
        indicador1.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador1.setToolTipText("");
        indicador1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador1);
        indicador1.setHideActionText(true);
        indicador1.setName("indicador1"); // NOI18N
        indicador1.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador1ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador1);
        indicador1.setBounds(290, 360, 40, 40);

        indicador29.setBackground(new java.awt.Color(102, 255, 0));
        indicador29.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador29.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador29);
        indicador29.setHideActionText(true);
        indicador29.setName("indicador29"); // NOI18N
        indicador29.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador29ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador29);
        indicador29.setBounds(954, 552, 40, 40);

        indicador38.setBackground(new java.awt.Color(102, 255, 0));
        indicador38.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador38);
        indicador38.setHideActionText(true);
        indicador38.setName("indicador38"); // NOI18N
        indicador38.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador38ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador38);
        indicador38.setBounds(928, 438, 40, 30);

        indicador40.setBackground(new java.awt.Color(102, 255, 0));
        indicador40.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador40);
        indicador40.setHideActionText(true);
        indicador40.setName("indicador40"); // NOI18N
        indicador40.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador40ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador40);
        indicador40.setBounds(808, 487, 40, 30);

        indicador50.setBackground(new java.awt.Color(102, 255, 0));
        indicador50.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador50);
        indicador50.setHideActionText(true);
        indicador50.setName("indicador50"); // NOI18N
        indicador50.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador50ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador50);
        indicador50.setBounds(1212, 487, 40, 30);

        indicador42.setBackground(new java.awt.Color(102, 255, 0));
        indicador42.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador42);
        indicador42.setHideActionText(true);
        indicador42.setName("indicador42"); // NOI18N
        indicador42.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador42ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador42);
        indicador42.setBounds(928, 487, 40, 30);

        indicador39.setBackground(new java.awt.Color(102, 255, 0));
        indicador39.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador39);
        indicador39.setHideActionText(true);
        indicador39.setName("indicador39"); // NOI18N
        indicador39.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador39ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador39);
        indicador39.setBounds(988, 438, 40, 30);

        indicador49.setBackground(new java.awt.Color(102, 255, 0));
        indicador49.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador49);
        indicador49.setHideActionText(true);
        indicador49.setName("indicador49"); // NOI18N
        indicador49.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador49ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador49);
        indicador49.setBounds(1156, 503, 40, 20);

        indicador36.setBackground(new java.awt.Color(102, 255, 0));
        indicador36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador36);
        indicador36.setHideActionText(true);
        indicador36.setName("indicador36"); // NOI18N
        indicador36.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador36ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador36);
        indicador36.setBounds(808, 438, 40, 30);

        indicador33.setBackground(new java.awt.Color(102, 255, 0));
        indicador33.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador33);
        indicador33.setHideActionText(true);
        indicador33.setName("indicador33"); // NOI18N
        indicador33.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador33ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador33);
        indicador33.setBounds(1204, 552, 40, 40);

        indicador13.setBackground(new java.awt.Color(102, 255, 0));
        indicador13.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador13);
        indicador13.setHideActionText(true);
        indicador13.setName("indicador13"); // NOI18N
        indicador13.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador13ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador13);
        indicador13.setBounds(1078, 360, 40, 40);

        indicador14.setBackground(new java.awt.Color(102, 255, 0));
        indicador14.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador14);
        indicador14.setHideActionText(true);
        indicador14.setName("indicador14"); // NOI18N
        indicador14.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador14ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador14);
        indicador14.setBounds(1146, 360, 40, 40);

        indicador15.setBackground(new java.awt.Color(102, 255, 0));
        indicador15.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador15);
        indicador15.setHideActionText(true);
        indicador15.setName("indicador15"); // NOI18N
        indicador15.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador15ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador15);
        indicador15.setBounds(1204, 360, 40, 40);

        indicador16.setBackground(new java.awt.Color(102, 255, 0));
        indicador16.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador16);
        indicador16.setHideActionText(true);
        indicador16.setName("indicador16"); // NOI18N
        indicador16.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador16ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador16);
        indicador16.setBounds(1264, 360, 40, 40);

        indicador17.setBackground(new java.awt.Color(102, 255, 0));
        indicador17.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador17);
        indicador17.setHideActionText(true);
        indicador17.setName("indicador17"); // NOI18N
        indicador17.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador17ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador17);
        indicador17.setBounds(1320, 360, 40, 40);

        indicador18.setBackground(new java.awt.Color(102, 255, 0));
        indicador18.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador18);
        indicador18.setHideActionText(true);
        indicador18.setName("indicador18"); // NOI18N
        indicador18.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador18ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador18);
        indicador18.setBounds(1380, 360, 40, 40);

        indicador30.setBackground(new java.awt.Color(102, 255, 0));
        indicador30.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador30.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador30);
        indicador30.setHideActionText(true);
        indicador30.setName("indicador30"); // NOI18N
        indicador30.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador30ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador30);
        indicador30.setBounds(1016, 552, 40, 40);

        indicador34.setBackground(new java.awt.Color(102, 255, 0));
        indicador34.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador34);
        indicador34.setHideActionText(true);
        indicador34.setName("indicador34"); // NOI18N
        indicador34.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador34ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador34);
        indicador34.setBounds(1264, 552, 40, 40);

        indicador32.setBackground(new java.awt.Color(102, 255, 0));
        indicador32.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador32.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador32);
        indicador32.setHideActionText(true);
        indicador32.setName("indicador32"); // NOI18N
        indicador32.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador32ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador32);
        indicador32.setBounds(1146, 552, 40, 40);

        indicador45.setBackground(new java.awt.Color(102, 255, 0));
        indicador45.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador45);
        indicador45.setHideActionText(true);
        indicador45.setName("indicador45"); // NOI18N
        indicador45.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador45ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador45);
        indicador45.setBounds(1212, 438, 40, 30);

        indicador51.setBackground(new java.awt.Color(102, 255, 0));
        indicador51.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador51);
        indicador51.setHideActionText(true);
        indicador51.setName("indicador51"); // NOI18N
        indicador51.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador51ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador51);
        indicador51.setBounds(1270, 487, 40, 30);

        indicador47.setBackground(new java.awt.Color(102, 255, 0));
        indicador47.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador47);
        indicador47.setHideActionText(true);
        indicador47.setName("indicador47"); // NOI18N
        indicador47.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador47ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador47);
        indicador47.setBounds(1345, 438, 40, 30);

        indicador41.setBackground(new java.awt.Color(102, 255, 0));
        indicador41.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador41);
        indicador41.setHideActionText(true);
        indicador41.setName("indicador41"); // NOI18N
        indicador41.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador41ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador41);
        indicador41.setBounds(869, 487, 40, 30);

        indicador52.setBackground(new java.awt.Color(102, 255, 0));
        indicador52.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador52);
        indicador52.setHideActionText(true);
        indicador52.setName("indicador52"); // NOI18N
        indicador52.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador52ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador52);
        indicador52.setBounds(1345, 487, 40, 30);

        indicador46.setBackground(new java.awt.Color(102, 255, 0));
        indicador46.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador46);
        indicador46.setHideActionText(true);
        indicador46.setName("indicador46"); // NOI18N
        indicador46.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador46ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador46);
        indicador46.setBounds(1270, 438, 40, 30);

        indicador35.setBackground(new java.awt.Color(102, 255, 0));
        indicador35.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador35);
        indicador35.setHideActionText(true);
        indicador35.setName("indicador35"); // NOI18N
        indicador35.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador35ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador35);
        indicador35.setBounds(1349, 552, 40, 40);

        indicador43.setBackground(new java.awt.Color(102, 255, 0));
        indicador43.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador43);
        indicador43.setHideActionText(true);
        indicador43.setName("indicador43"); // NOI18N
        indicador43.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador43ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador43);
        indicador43.setBounds(988, 487, 40, 30);

        indicador48.setBackground(new java.awt.Color(102, 255, 0));
        indicador48.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador48);
        indicador48.setHideActionText(true);
        indicador48.setName("indicador48"); // NOI18N
        indicador48.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador48ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador48);
        indicador48.setBounds(1412, 433, 40, 20);

        indicador44.setBackground(new java.awt.Color(102, 255, 0));
        indicador44.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador44);
        indicador44.setHideActionText(true);
        indicador44.setName("indicador44"); // NOI18N
        indicador44.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador44ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador44);
        indicador44.setBounds(1156, 430, 40, 20);

        lblBackground.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/mapaPrimerNivelCompleto (1).png"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(170, 270, 1700, 410);

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("CAMAROTES - NIVEL 4");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(730, 110, 510, 49);

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
        jScrollPane1.setBounds(740, 780, 450, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indicador48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador48ActionPerformed
        bloquearBotones(indicador48);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 48;
            llenarDatosCamarote(48);
        }
    }//GEN-LAST:event_indicador48ActionPerformed

    private void indicador43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador43ActionPerformed
        bloquearBotones(indicador43);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 43;
            llenarDatosCamarote(43);
        }
    }//GEN-LAST:event_indicador43ActionPerformed

    private void indicador52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador52ActionPerformed
        bloquearBotones(indicador52);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 52;
            llenarDatosCamarote(52);
        }
    }//GEN-LAST:event_indicador52ActionPerformed

    private void indicador49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador49ActionPerformed
        bloquearBotones(indicador49);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 49;
            llenarDatosCamarote(49);
        }
    }//GEN-LAST:event_indicador49ActionPerformed

    private void indicador46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador46ActionPerformed
        bloquearBotones(indicador46);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 46;
            llenarDatosCamarote(46);
        }
    }//GEN-LAST:event_indicador46ActionPerformed

    private void indicador47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador47ActionPerformed
        bloquearBotones(indicador47);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 47;
            llenarDatosCamarote(47);
        }
    }//GEN-LAST:event_indicador47ActionPerformed

    private void indicador51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador51ActionPerformed
        bloquearBotones(indicador51);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 51;
            llenarDatosCamarote(51);
        }
    }//GEN-LAST:event_indicador51ActionPerformed

    private void indicador40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador40ActionPerformed
        bloquearBotones(indicador40);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 40;
            llenarDatosCamarote(40);
        }
    }//GEN-LAST:event_indicador40ActionPerformed

    private void indicador44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador44ActionPerformed
        bloquearBotones(indicador44);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 44;
            llenarDatosCamarote(44);
        }
    }//GEN-LAST:event_indicador44ActionPerformed

    private void indicador41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador41ActionPerformed
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 41;
            llenarDatosCamarote(41);
        }
    }//GEN-LAST:event_indicador41ActionPerformed

    private void indicador42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador42ActionPerformed
        bloquearBotones(indicador42);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 42;
            llenarDatosCamarote(42);
        }
    }//GEN-LAST:event_indicador42ActionPerformed

    private void indicador45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador45ActionPerformed
        bloquearBotones(indicador45);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 45;
            llenarDatosCamarote(45);
        }
    }//GEN-LAST:event_indicador45ActionPerformed

    private void indicador50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador50ActionPerformed
        bloquearBotones(indicador50);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 50;
            llenarDatosCamarote(50);
        }
    }//GEN-LAST:event_indicador50ActionPerformed

    private void indicador29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador29ActionPerformed
        bloquearBotones(indicador29);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 29;
            llenarDatosCamarote(29);
        }
    }//GEN-LAST:event_indicador29ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        verificarBotones();

        retornarEstadoCamarote();
    }//GEN-LAST:event_formWindowOpened

    private void indicador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador1ActionPerformed

        bloquearBotones(indicador1);

        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 1;
            llenarDatosCamarote(1);
        }

    }//GEN-LAST:event_indicador1ActionPerformed

    private void indicador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador2ActionPerformed
        bloquearBotones(indicador2);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 2;
            llenarDatosCamarote(2);
        }
    }//GEN-LAST:event_indicador2ActionPerformed

    private void indicador3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador3ActionPerformed
        bloquearBotones(indicador3);

        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 3;
            llenarDatosCamarote(3);
        }
    }//GEN-LAST:event_indicador3ActionPerformed

    private void indicador5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador5ActionPerformed
        bloquearBotones(indicador5);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 5;
            llenarDatosCamarote(5);
        }
    }//GEN-LAST:event_indicador5ActionPerformed

    private void indicador6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador6ActionPerformed
        bloquearBotones(indicador6);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 6;
            llenarDatosCamarote(6);
        }      
    }//GEN-LAST:event_indicador6ActionPerformed

    private void indicador7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador7ActionPerformed
        bloquearBotones(indicador7);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 7;
            llenarDatosCamarote(7);
        }      
    }//GEN-LAST:event_indicador7ActionPerformed

    private void indicador8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador8ActionPerformed
        bloquearBotones(indicador8);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 8;
            llenarDatosCamarote(8);
        }
    }//GEN-LAST:event_indicador8ActionPerformed

    private void indicador9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador9ActionPerformed
        bloquearBotones(indicador9);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 9;
            llenarDatosCamarote(9);
        }
    }//GEN-LAST:event_indicador9ActionPerformed

    private void indicador10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador10ActionPerformed
        bloquearBotones(indicador10);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 10;
            llenarDatosCamarote(10);
        }
    }//GEN-LAST:event_indicador10ActionPerformed

    private void indicador11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador11ActionPerformed
        bloquearBotones(indicador11);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 11;
            llenarDatosCamarote(11);
        }
    }//GEN-LAST:event_indicador11ActionPerformed

    private void indicador12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador12ActionPerformed
        bloquearBotones(indicador12);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 12;
            llenarDatosCamarote(12);
        }      
    }//GEN-LAST:event_indicador12ActionPerformed

    private void indicador13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador13ActionPerformed
        bloquearBotones(indicador13);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 13;
            llenarDatosCamarote(13);
        }
    }//GEN-LAST:event_indicador13ActionPerformed

    private void indicador14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador14ActionPerformed
        bloquearBotones(indicador14);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 14;
            llenarDatosCamarote(14);
        }
    }//GEN-LAST:event_indicador14ActionPerformed

    private void indicador15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador15ActionPerformed
        bloquearBotones(indicador15);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 15;
            llenarDatosCamarote(15);
        }
    }//GEN-LAST:event_indicador15ActionPerformed

    private void indicador16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador16ActionPerformed
        bloquearBotones(indicador16);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 16;
            llenarDatosCamarote(16);
        }
    }//GEN-LAST:event_indicador16ActionPerformed

    private void indicador17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador17ActionPerformed
        bloquearBotones(indicador17);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 17;
            llenarDatosCamarote(17);
        }
    }//GEN-LAST:event_indicador17ActionPerformed

    private void indicador18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador18ActionPerformed
        bloquearBotones(indicador18);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 18;
            llenarDatosCamarote(18);
        }
    }//GEN-LAST:event_indicador18ActionPerformed

    private void indicador19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador19ActionPerformed
        bloquearBotones(indicador19);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 19;
            llenarDatosCamarote(19);
        }
    }//GEN-LAST:event_indicador19ActionPerformed

    private void indicador20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador20ActionPerformed
        bloquearBotones(indicador20);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 20;
            llenarDatosCamarote(20);
        }
    }//GEN-LAST:event_indicador20ActionPerformed

    private void indicador21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador21ActionPerformed
        bloquearBotones(indicador21);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 21;
            llenarDatosCamarote(21);
        }
    }//GEN-LAST:event_indicador21ActionPerformed

    private void indicador22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador22ActionPerformed
        bloquearBotones(indicador22);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 22;
            llenarDatosCamarote(22);
        }
    }//GEN-LAST:event_indicador22ActionPerformed

    private void indicador24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador24ActionPerformed
        bloquearBotones(indicador24);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 24;
            llenarDatosCamarote(24);
        }
    }//GEN-LAST:event_indicador24ActionPerformed

    private void indicador25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador25ActionPerformed
        bloquearBotones(indicador25);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 25;
            llenarDatosCamarote(25);
        }
    }//GEN-LAST:event_indicador25ActionPerformed

    private void indicador26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador26ActionPerformed
        bloquearBotones(indicador26);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 26;
            llenarDatosCamarote(26);
        }
    }//GEN-LAST:event_indicador26ActionPerformed

    private void indicador27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador27ActionPerformed
        bloquearBotones(indicador27);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 27;
            llenarDatosCamarote(27);
        }
    }//GEN-LAST:event_indicador27ActionPerformed

    private void indicador28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador28ActionPerformed
        bloquearBotones(indicador28);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 28;
            llenarDatosCamarote(28);
        }
    }//GEN-LAST:event_indicador28ActionPerformed

    private void indicador30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador30ActionPerformed
        bloquearBotones(indicador30);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 30;
            llenarDatosCamarote(30);
        }
    }//GEN-LAST:event_indicador30ActionPerformed

    private void indicador31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador31ActionPerformed
        bloquearBotones(indicador31);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 31;
            llenarDatosCamarote(31);
        }
    }//GEN-LAST:event_indicador31ActionPerformed

    private void indicador32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador32ActionPerformed
        bloquearBotones(indicador32);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 32;
            llenarDatosCamarote(32);
        }
    }//GEN-LAST:event_indicador32ActionPerformed

    private void indicador33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador33ActionPerformed
        bloquearBotones(indicador33);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 33;
            llenarDatosCamarote(33);
        }
    }//GEN-LAST:event_indicador33ActionPerformed

    private void indicador34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador34ActionPerformed
        bloquearBotones(indicador34);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 34;
            llenarDatosCamarote(34);
        }
    }//GEN-LAST:event_indicador34ActionPerformed

    private void indicador35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador35ActionPerformed
        bloquearBotones(indicador35);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 35;
            llenarDatosCamarote(35);
        }
    }//GEN-LAST:event_indicador35ActionPerformed

    private void indicador36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador36ActionPerformed
        bloquearBotones(indicador36);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 36;
            llenarDatosCamarote(36);
        }
    }//GEN-LAST:event_indicador36ActionPerformed

    private void indicador37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador37ActionPerformed
        bloquearBotones(indicador37);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 37;
            llenarDatosCamarote(37);
        }
    }//GEN-LAST:event_indicador37ActionPerformed

    private void indicador38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador38ActionPerformed
        bloquearBotones(indicador38);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 38;
            llenarDatosCamarote(38);
        }
    }//GEN-LAST:event_indicador38ActionPerformed

    private void indicador39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador39ActionPerformed
        bloquearBotones(indicador39);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 39;
            llenarDatosCamarote(39);
        }
    }//GEN-LAST:event_indicador39ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (numeroCamaroteSeleccionado != 0) {
            variables.setNumeroCamarote(numeroCamaroteSeleccionado);
            this.dispose();
            new frmPagos().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "DEBE SELECCIONAR UN CAMAROTE");
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void indicador4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador4ActionPerformed
        bloquearBotones(indicador4);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);

        } else {
            numeroCamaroteSeleccionado = 4;
            llenarDatosCamarote(4);
        }
    }//GEN-LAST:event_indicador4ActionPerformed

    private void indicador23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador23ActionPerformed
        bloquearBotones(indicador23);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 23;
            llenarDatosCamarote(23);
        }
    }//GEN-LAST:event_indicador23ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        numeroCamaroteSeleccionado = 0;
        variables.setNumeroCamarote(0);
        this.dispose();

        frmSeleccionNivel seleccionador = new frmSeleccionNivel();
        seleccionador.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"<html><b style=\"color:black; font-size:13px;\">Est?? seguro de volver al Men?? Principal?</b></html>" , "Salir del M??dulo",
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
            for (int i = 1; i <= 52; i++) {
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
    private javax.swing.JButton indicador1;
    private javax.swing.JButton indicador10;
    private javax.swing.JButton indicador11;
    private javax.swing.JButton indicador12;
    private javax.swing.JButton indicador13;
    private javax.swing.JButton indicador14;
    private javax.swing.JButton indicador15;
    private javax.swing.JButton indicador16;
    private javax.swing.JButton indicador17;
    private javax.swing.JButton indicador18;
    private javax.swing.JButton indicador19;
    private javax.swing.JButton indicador2;
    private javax.swing.JButton indicador20;
    private javax.swing.JButton indicador21;
    private javax.swing.JButton indicador22;
    private javax.swing.JButton indicador23;
    private javax.swing.JButton indicador24;
    private javax.swing.JButton indicador25;
    private javax.swing.JButton indicador26;
    private javax.swing.JButton indicador27;
    private javax.swing.JButton indicador28;
    private javax.swing.JButton indicador29;
    private javax.swing.JButton indicador3;
    private javax.swing.JButton indicador30;
    private javax.swing.JButton indicador31;
    private javax.swing.JButton indicador32;
    private javax.swing.JButton indicador33;
    private javax.swing.JButton indicador34;
    private javax.swing.JButton indicador35;
    private javax.swing.JButton indicador36;
    private javax.swing.JButton indicador37;
    private javax.swing.JButton indicador38;
    private javax.swing.JButton indicador39;
    private javax.swing.JButton indicador4;
    private javax.swing.JButton indicador40;
    private javax.swing.JButton indicador41;
    private javax.swing.JButton indicador42;
    private javax.swing.JButton indicador43;
    private javax.swing.JButton indicador44;
    private javax.swing.JButton indicador45;
    private javax.swing.JButton indicador46;
    private javax.swing.JButton indicador47;
    private javax.swing.JButton indicador48;
    private javax.swing.JButton indicador49;
    private javax.swing.JButton indicador5;
    private javax.swing.JButton indicador50;
    private javax.swing.JButton indicador51;
    private javax.swing.JButton indicador52;
    private javax.swing.JButton indicador6;
    private javax.swing.JButton indicador7;
    private javax.swing.JButton indicador8;
    private javax.swing.JButton indicador9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextArea txtDatosCamarote;
    // End of variables declaration//GEN-END:variables
}
