package FormulariosCrucero;

import Clases.clsMessage;
import Clases.dbConnection;
import FormularioIGP.frmIGP;

import Formularios.Pagos.frmPagos;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.swing.AbstractButton;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frmVistaCamarotesN3 extends javax.swing.JFrame {

    public frmVistaCamarotesN3() {
        initComponents();
    }
    dbConnection conexion = new dbConnection();
    clsVariablesViaje variables = new clsVariablesViaje();

    int cantidadOcupantes = variables.getNumeroPersonas();

    int numeroCamaroteSeleccionado = 0;
    PreparedStatement ps;
    ResultSet result = null;
    clsMessage message = new clsMessage();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        indicador106 = new javax.swing.JButton();
        indicador128 = new javax.swing.JButton();
        indicador122 = new javax.swing.JButton();
        indicador102 = new javax.swing.JButton();
        indicador105 = new javax.swing.JButton();
        indicador104 = new javax.swing.JButton();
        indicador101 = new javax.swing.JButton();
        indicador100 = new javax.swing.JButton();
        indicador103 = new javax.swing.JButton();
        indicador97 = new javax.swing.JButton();
        indicador96 = new javax.swing.JButton();
        indicador111 = new javax.swing.JButton();
        indicador99 = new javax.swing.JButton();
        indicador98 = new javax.swing.JButton();
        indicador112 = new javax.swing.JButton();
        indicador113 = new javax.swing.JButton();
        indicador114 = new javax.swing.JButton();
        indicador115 = new javax.swing.JButton();
        indicador116 = new javax.swing.JButton();
        indicador117 = new javax.swing.JButton();
        indicador118 = new javax.swing.JButton();
        indicador119 = new javax.swing.JButton();
        indicador120 = new javax.swing.JButton();
        indicador95 = new javax.swing.JButton();
        indicador121 = new javax.swing.JButton();
        indicador129 = new javax.swing.JButton();
        indicador131 = new javax.swing.JButton();
        indicador132 = new javax.swing.JButton();
        indicador133 = new javax.swing.JButton();
        indicador130 = new javax.swing.JButton();
        indicador134 = new javax.swing.JButton();
        indicador136 = new javax.swing.JButton();
        indicador109 = new javax.swing.JButton();
        indicador127 = new javax.swing.JButton();
        indicador135 = new javax.swing.JButton();
        indicador107 = new javax.swing.JButton();
        indicador110 = new javax.swing.JButton();
        indicador123 = new javax.swing.JButton();
        indicador125 = new javax.swing.JButton();
        indicador108 = new javax.swing.JButton();
        indicador126 = new javax.swing.JButton();
        indicador124 = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("CAMAROTES - NIVEL 2");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(740, 110, 450, 49);

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

        indicador106.setBackground(new java.awt.Color(102, 255, 51));
        indicador106.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador106.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador106);
        indicador106.setHideActionText(true);
        indicador106.setName("indicador106"); // NOI18N
        indicador106.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador106ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador106);
        indicador106.setBounds(1145, 345, 44, 40);

        indicador128.setBackground(new java.awt.Color(102, 255, 51));
        indicador128.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador128);
        indicador128.setHideActionText(true);
        indicador128.setName("indicador128"); // NOI18N
        indicador128.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador128ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador128);
        indicador128.setBounds(871, 426, 45, 30);

        indicador122.setBackground(new java.awt.Color(102, 255, 51));
        indicador122.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador122.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador122);
        indicador122.setHideActionText(true);
        indicador122.setName("indicador122"); // NOI18N
        indicador122.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador122ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador122);
        indicador122.setBounds(1131, 544, 44, 40);

        indicador102.setBackground(new java.awt.Color(102, 255, 51));
        indicador102.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador102.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador102);
        indicador102.setHideActionText(true);
        indicador102.setName("indicador102"); // NOI18N
        indicador102.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador102ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador102);
        indicador102.setBounds(843, 345, 44, 40);

        indicador105.setBackground(new java.awt.Color(102, 255, 51));
        indicador105.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador105.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador105);
        indicador105.setHideActionText(true);
        indicador105.setName("indicador105"); // NOI18N
        indicador105.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador105ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador105);
        indicador105.setBounds(1053, 345, 44, 40);

        indicador104.setBackground(new java.awt.Color(102, 255, 51));
        indicador104.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador104.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador104);
        indicador104.setHideActionText(true);
        indicador104.setName("indicador104"); // NOI18N
        indicador104.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador104ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador104);
        indicador104.setBounds(971, 345, 44, 40);

        indicador101.setBackground(new java.awt.Color(102, 255, 51));
        indicador101.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador101.setText("   ");
        indicador101.setToolTipText("");
        indicador101.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador101);
        indicador101.setHideActionText(true);
        indicador101.setName("indicador101"); // NOI18N
        indicador101.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador101ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador101);
        indicador101.setBounds(780, 345, 44, 40);

        indicador100.setBackground(new java.awt.Color(102, 255, 51));
        indicador100.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador100.setText("   ");
        indicador100.setToolTipText("");
        indicador100.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador100);
        indicador100.setHideActionText(true);
        indicador100.setName("indicador100"); // NOI18N
        indicador100.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador100ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador100);
        indicador100.setBounds(715, 345, 44, 40);

        indicador103.setBackground(new java.awt.Color(102, 255, 51));
        indicador103.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador103.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador103);
        indicador103.setHideActionText(true);
        indicador103.setName("indicador103"); // NOI18N
        indicador103.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador103ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador103);
        indicador103.setBounds(907, 345, 44, 40);

        indicador97.setBackground(new java.awt.Color(102, 255, 51));
        indicador97.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador97.setText("  ");
        indicador97.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador97);
        indicador97.setHideActionText(true);
        indicador97.setName("indicador97"); // NOI18N
        indicador97.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador97ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador97);
        indicador97.setBounds(525, 345, 44, 40);

        indicador96.setBackground(new java.awt.Color(102, 255, 51));
        indicador96.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador96.setText("  ");
        indicador96.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador96);
        indicador96.setHideActionText(true);
        indicador96.setName("indicador96"); // NOI18N
        indicador96.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador96ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador96);
        indicador96.setBounds(462, 345, 44, 40);

        indicador111.setBackground(new java.awt.Color(102, 255, 51));
        indicador111.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador111.setText("  ");
        indicador111.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador111);
        indicador111.setHideActionText(true);
        indicador111.setName("indicador111"); // NOI18N
        indicador111.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador111ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador111);
        indicador111.setBounds(380, 544, 44, 40);

        indicador99.setBackground(new java.awt.Color(102, 255, 51));
        indicador99.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador99.setText("   ");
        indicador99.setToolTipText("");
        indicador99.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador99);
        indicador99.setHideActionText(true);
        indicador99.setName("indicador99"); // NOI18N
        indicador99.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador99ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador99);
        indicador99.setBounds(652, 345, 44, 40);

        indicador98.setBackground(new java.awt.Color(102, 255, 51));
        indicador98.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador98.setText("  ");
        indicador98.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador98);
        indicador98.setHideActionText(true);
        indicador98.setName("indicador98"); // NOI18N
        indicador98.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador98ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador98);
        indicador98.setBounds(588, 345, 44, 40);

        indicador112.setBackground(new java.awt.Color(102, 255, 51));
        indicador112.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador112.setText("  ");
        indicador112.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador112);
        indicador112.setHideActionText(true);
        indicador112.setName("indicador112"); // NOI18N
        indicador112.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador112ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador112);
        indicador112.setBounds(463, 544, 44, 40);

        indicador113.setBackground(new java.awt.Color(102, 255, 51));
        indicador113.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador113.setText("   ");
        indicador113.setToolTipText("");
        indicador113.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador113);
        indicador113.setHideActionText(true);
        indicador113.setName("indicador113"); // NOI18N
        indicador113.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador113ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador113);
        indicador113.setBounds(526, 544, 44, 40);

        indicador114.setBackground(new java.awt.Color(102, 255, 51));
        indicador114.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador114.setText("   ");
        indicador114.setToolTipText("");
        indicador114.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador114);
        indicador114.setHideActionText(true);
        indicador114.setName("indicador114"); // NOI18N
        indicador114.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador114ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador114);
        indicador114.setBounds(589, 544, 44, 40);

        indicador115.setBackground(new java.awt.Color(102, 255, 51));
        indicador115.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador115.setText("   ");
        indicador115.setToolTipText("");
        indicador115.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador115);
        indicador115.setHideActionText(true);
        indicador115.setName("indicador115"); // NOI18N
        indicador115.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador115ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador115);
        indicador115.setBounds(653, 544, 44, 40);

        indicador116.setBackground(new java.awt.Color(102, 255, 51));
        indicador116.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador116.setText("   ");
        indicador116.setToolTipText("");
        indicador116.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador116);
        indicador116.setHideActionText(true);
        indicador116.setName("indicador116"); // NOI18N
        indicador116.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador116ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador116);
        indicador116.setBounds(716, 544, 44, 40);

        indicador117.setBackground(new java.awt.Color(102, 255, 51));
        indicador117.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador117.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador117);
        indicador117.setHideActionText(true);
        indicador117.setName("indicador117"); // NOI18N
        indicador117.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador117ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador117);
        indicador117.setBounds(781, 544, 44, 40);

        indicador118.setBackground(new java.awt.Color(102, 255, 51));
        indicador118.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador118.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador118);
        indicador118.setHideActionText(true);
        indicador118.setName("indicador118"); // NOI18N
        indicador118.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador118ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador118);
        indicador118.setBounds(844, 544, 44, 40);

        indicador119.setBackground(new java.awt.Color(102, 255, 51));
        indicador119.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador119.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador119);
        indicador119.setHideActionText(true);
        indicador119.setName("indicador119"); // NOI18N
        indicador119.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador119ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador119);
        indicador119.setBounds(908, 544, 44, 40);

        indicador120.setBackground(new java.awt.Color(102, 255, 51));
        indicador120.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador120.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador120);
        indicador120.setHideActionText(true);
        indicador120.setName("indicador120"); // NOI18N
        indicador120.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador120ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador120);
        indicador120.setBounds(972, 544, 44, 40);

        indicador95.setBackground(new java.awt.Color(102, 255, 51));
        indicador95.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador95.setText("  ");
        indicador95.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador95);
        indicador95.setHideActionText(true);
        indicador95.setName("indicador95"); // NOI18N
        indicador95.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador95ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador95);
        indicador95.setBounds(380, 345, 44, 40);

        indicador121.setBackground(new java.awt.Color(102, 255, 51));
        indicador121.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador121.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador121);
        indicador121.setHideActionText(true);
        indicador121.setName("indicador121"); // NOI18N
        indicador121.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador121ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador121);
        indicador121.setBounds(1053, 544, 44, 40);

        indicador129.setBackground(new java.awt.Color(102, 255, 51));
        indicador129.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador129);
        indicador129.setHideActionText(true);
        indicador129.setName("indicador129"); // NOI18N
        indicador129.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador129ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador129);
        indicador129.setBounds(932, 426, 45, 30);

        indicador131.setBackground(new java.awt.Color(102, 255, 51));
        indicador131.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador131);
        indicador131.setHideActionText(true);
        indicador131.setName("indicador131"); // NOI18N
        indicador131.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador131ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador131);
        indicador131.setBounds(810, 474, 45, 30);

        indicador132.setBackground(new java.awt.Color(102, 255, 51));
        indicador132.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador132);
        indicador132.setHideActionText(true);
        indicador132.setName("indicador132"); // NOI18N
        indicador132.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador132ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador132);
        indicador132.setBounds(871, 474, 45, 30);

        indicador133.setBackground(new java.awt.Color(102, 255, 51));
        indicador133.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador133);
        indicador133.setHideActionText(true);
        indicador133.setName("indicador133"); // NOI18N
        indicador133.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador133ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador133);
        indicador133.setBounds(932, 474, 45, 30);

        indicador130.setBackground(new java.awt.Color(102, 255, 51));
        indicador130.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador130);
        indicador130.setHideActionText(true);
        indicador130.setName("indicador130"); // NOI18N
        indicador130.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador130ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador130);
        indicador130.setBounds(992, 426, 45, 30);

        indicador134.setBackground(new java.awt.Color(102, 255, 51));
        indicador134.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador134);
        indicador134.setHideActionText(true);
        indicador134.setName("indicador134"); // NOI18N
        indicador134.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador134ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador134);
        indicador134.setBounds(992, 474, 45, 30);

        indicador136.setBackground(new java.awt.Color(102, 255, 51));
        indicador136.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador136);
        indicador136.setHideActionText(true);
        indicador136.setName("indicador136"); // NOI18N
        indicador136.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador136ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador136);
        indicador136.setBounds(1310, 454, 50, 23);

        indicador109.setBackground(new java.awt.Color(102, 255, 51));
        indicador109.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador109);
        indicador109.setHideActionText(true);
        indicador109.setName("indicador109"); // NOI18N
        indicador109.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador109ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador109);
        indicador109.setBounds(1325, 380, 34, 40);

        indicador127.setBackground(new java.awt.Color(102, 255, 51));
        indicador127.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador127);
        indicador127.setHideActionText(true);
        indicador127.setName("indicador127"); // NOI18N
        indicador127.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador127ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador127);
        indicador127.setBounds(810, 426, 45, 30);

        indicador135.setBackground(new java.awt.Color(102, 255, 51));
        indicador135.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador135);
        indicador135.setHideActionText(true);
        indicador135.setName("indicador135"); // NOI18N
        indicador135.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador135ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador135);
        indicador135.setBounds(1224, 454, 50, 23);

        indicador107.setBackground(new java.awt.Color(102, 255, 51));
        indicador107.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador107);
        indicador107.setHideActionText(true);
        indicador107.setName("indicador107"); // NOI18N
        indicador107.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador107ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador107);
        indicador107.setBounds(1224, 380, 34, 40);

        indicador110.setBackground(new java.awt.Color(102, 255, 51));
        indicador110.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador110);
        indicador110.setHideActionText(true);
        indicador110.setName("indicador110"); // NOI18N
        indicador110.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador110ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador110);
        indicador110.setBounds(1374, 380, 34, 40);

        indicador123.setBackground(new java.awt.Color(102, 255, 51));
        indicador123.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador123);
        indicador123.setHideActionText(true);
        indicador123.setName("indicador123"); // NOI18N
        indicador123.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador123ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador123);
        indicador123.setBounds(1191, 510, 34, 40);

        indicador125.setBackground(new java.awt.Color(102, 255, 51));
        indicador125.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador125);
        indicador125.setHideActionText(true);
        indicador125.setName("indicador125"); // NOI18N
        indicador125.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador125ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador125);
        indicador125.setBounds(1292, 510, 34, 40);

        indicador108.setBackground(new java.awt.Color(102, 255, 51));
        indicador108.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador108);
        indicador108.setHideActionText(true);
        indicador108.setName("indicador108"); // NOI18N
        indicador108.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador108ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador108);
        indicador108.setBounds(1275, 380, 34, 40);

        indicador126.setBackground(new java.awt.Color(102, 255, 51));
        indicador126.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador126);
        indicador126.setHideActionText(true);
        indicador126.setName("indicador126"); // NOI18N
        indicador126.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador126ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador126);
        indicador126.setBounds(1343, 510, 34, 40);

        indicador124.setBackground(new java.awt.Color(102, 255, 51));
        indicador124.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador124);
        indicador124.setHideActionText(true);
        indicador124.setName("indicador124"); // NOI18N
        indicador124.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador124ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador124);
        indicador124.setBounds(1242, 510, 34, 40);

        lblBackground.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/mapaNivel3FinalRed.png"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(270, 260, 1440, 410);

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Detalles del Camarote");
        jLabel2.setFocusTraversalPolicyProvider(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(800, 690, 330, 49);

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
        jScrollPane1.setBounds(730, 760, 450, 220);

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

    private void indicador131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador131ActionPerformed
        bloquearBotones(indicador131);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 131;
            llenarDatosCamarote(131);
        }
    }//GEN-LAST:event_indicador131ActionPerformed

    private void indicador132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador132ActionPerformed
        bloquearBotones(indicador132);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 132;
            llenarDatosCamarote(132);
        }
    }//GEN-LAST:event_indicador132ActionPerformed

    private void indicador134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador134ActionPerformed
        bloquearBotones(indicador134);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 134;
            llenarDatosCamarote(134);
        }
    }//GEN-LAST:event_indicador134ActionPerformed

    private void indicador95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador95ActionPerformed
        bloquearBotones(indicador95);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 95;
            llenarDatosCamarote(95);
        }
    }//GEN-LAST:event_indicador95ActionPerformed

    private void indicador96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador96ActionPerformed
        bloquearBotones(indicador96);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 96;
            llenarDatosCamarote(96);
        }
    }//GEN-LAST:event_indicador96ActionPerformed

    private void indicador97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador97ActionPerformed
        bloquearBotones(indicador97);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 97;
            llenarDatosCamarote(97);
        }
    }//GEN-LAST:event_indicador97ActionPerformed

    private void indicador98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador98ActionPerformed
        bloquearBotones(indicador98);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 98;
            llenarDatosCamarote(98);
        }
    }//GEN-LAST:event_indicador98ActionPerformed

    private void indicador99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador99ActionPerformed
        bloquearBotones(indicador99);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 99;
            llenarDatosCamarote(99);
        }
    }//GEN-LAST:event_indicador99ActionPerformed

    private void indicador100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador100ActionPerformed
        bloquearBotones(indicador100);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 100;
            llenarDatosCamarote(100);
        }
    }//GEN-LAST:event_indicador100ActionPerformed

    private void indicador101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador101ActionPerformed
        bloquearBotones(indicador101);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 101;
            llenarDatosCamarote(101);
        }
    }//GEN-LAST:event_indicador101ActionPerformed

    private void indicador102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador102ActionPerformed
        bloquearBotones(indicador102);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 102;
            llenarDatosCamarote(102);
        }
    }//GEN-LAST:event_indicador102ActionPerformed

    private void indicador103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador103ActionPerformed
        bloquearBotones(indicador103);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 103;
            llenarDatosCamarote(103);
        }
    }//GEN-LAST:event_indicador103ActionPerformed

    private void indicador104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador104ActionPerformed
        bloquearBotones(indicador104);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 104;
            llenarDatosCamarote(104);
        }
    }//GEN-LAST:event_indicador104ActionPerformed

    private void indicador105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador105ActionPerformed
        bloquearBotones(indicador105);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 105;
            llenarDatosCamarote(105);
        }
    }//GEN-LAST:event_indicador105ActionPerformed

    private void indicador106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador106ActionPerformed
        bloquearBotones(indicador106);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 106;
            llenarDatosCamarote(106);
        }
    }//GEN-LAST:event_indicador106ActionPerformed

    private void indicador107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador107ActionPerformed
        bloquearBotones(indicador107);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 107;
            llenarDatosCamarote(107);
        }
    }//GEN-LAST:event_indicador107ActionPerformed

    private void indicador108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador108ActionPerformed
        bloquearBotones(indicador108);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 108;
            llenarDatosCamarote(108);
        }
    }//GEN-LAST:event_indicador108ActionPerformed

    private void indicador109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador109ActionPerformed
        bloquearBotones(indicador109);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 109;
            llenarDatosCamarote(109);
        }
    }//GEN-LAST:event_indicador109ActionPerformed

    private void indicador110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador110ActionPerformed
        bloquearBotones(indicador110);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 110;
            llenarDatosCamarote(110);
        }
    }//GEN-LAST:event_indicador110ActionPerformed

    private void indicador111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador111ActionPerformed
        bloquearBotones(indicador111);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 111;
            llenarDatosCamarote(111);
        }
    }//GEN-LAST:event_indicador111ActionPerformed

    private void indicador112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador112ActionPerformed
        bloquearBotones(indicador112);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 112;
            llenarDatosCamarote(112);
        }
    }//GEN-LAST:event_indicador112ActionPerformed

    private void indicador113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador113ActionPerformed
        bloquearBotones(indicador113);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 113;
            llenarDatosCamarote(113);
        }
    }//GEN-LAST:event_indicador113ActionPerformed

    private void indicador114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador114ActionPerformed
        bloquearBotones(indicador114);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 114;
            llenarDatosCamarote(114);
        }
    }//GEN-LAST:event_indicador114ActionPerformed

    private void indicador115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador115ActionPerformed
        bloquearBotones(indicador115);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 115;
            llenarDatosCamarote(115);
        }
    }//GEN-LAST:event_indicador115ActionPerformed

    private void indicador116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador116ActionPerformed
        bloquearBotones(indicador116);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 116;
            llenarDatosCamarote(116);
        }
    }//GEN-LAST:event_indicador116ActionPerformed

    private void indicador117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador117ActionPerformed
        bloquearBotones(indicador117);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 117;
            llenarDatosCamarote(117);
        }
    }//GEN-LAST:event_indicador117ActionPerformed

    private void indicador118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador118ActionPerformed
        bloquearBotones(indicador118);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 118;
            llenarDatosCamarote(118);
        }
    }//GEN-LAST:event_indicador118ActionPerformed

    private void indicador119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador119ActionPerformed
        bloquearBotones(indicador119);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 119;
            llenarDatosCamarote(119);
        }
    }//GEN-LAST:event_indicador119ActionPerformed

    private void indicador120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador120ActionPerformed
        bloquearBotones(indicador120);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 120;
            llenarDatosCamarote(120);
        }
    }//GEN-LAST:event_indicador120ActionPerformed

    private void indicador121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador121ActionPerformed
        bloquearBotones(indicador121);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 121;
            llenarDatosCamarote(121);
        }
    }//GEN-LAST:event_indicador121ActionPerformed

    private void indicador122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador122ActionPerformed
        bloquearBotones(indicador122);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 122;
            llenarDatosCamarote(122);
        }
    }//GEN-LAST:event_indicador122ActionPerformed

    private void indicador123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador123ActionPerformed
        bloquearBotones(indicador123);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 123;
            llenarDatosCamarote(123);
        }
    }//GEN-LAST:event_indicador123ActionPerformed

    private void indicador124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador124ActionPerformed
        bloquearBotones(indicador124);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 124;
            llenarDatosCamarote(124);
        }
    }//GEN-LAST:event_indicador124ActionPerformed

    private void indicador125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador125ActionPerformed
        bloquearBotones(indicador125);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 125;
            llenarDatosCamarote(125);
        }
    }//GEN-LAST:event_indicador125ActionPerformed

    private void indicador126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador126ActionPerformed
        bloquearBotones(indicador126);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 126;
            llenarDatosCamarote(126);
        }
    }//GEN-LAST:event_indicador126ActionPerformed

    private void indicador127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador127ActionPerformed
        bloquearBotones(indicador127);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 127;
            llenarDatosCamarote(127);
        }
    }//GEN-LAST:event_indicador127ActionPerformed

    private void indicador128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador128ActionPerformed
        bloquearBotones(indicador128);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 128;
            llenarDatosCamarote(128);
        }
    }//GEN-LAST:event_indicador128ActionPerformed

    private void indicador129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador129ActionPerformed
        bloquearBotones(indicador129);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 129;
            llenarDatosCamarote(129);
        }
    }//GEN-LAST:event_indicador129ActionPerformed

    private void indicador130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador130ActionPerformed
        bloquearBotones(indicador130);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 130;
            llenarDatosCamarote(130);
        }
    }//GEN-LAST:event_indicador130ActionPerformed

    private void indicador133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador133ActionPerformed
        bloquearBotones(indicador133);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 133;
            llenarDatosCamarote(133);
        }
    }//GEN-LAST:event_indicador133ActionPerformed

    private void indicador135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador135ActionPerformed
        bloquearBotones(indicador135);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 135;
            llenarDatosCamarote(135);
        }
    }//GEN-LAST:event_indicador135ActionPerformed

    private void indicador136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador136ActionPerformed
        bloquearBotones(indicador136);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 136;
            llenarDatosCamarote(136);
        }
    }//GEN-LAST:event_indicador136ActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (numeroCamaroteSeleccionado != 0) {
            variables.setNumeroCamarote(numeroCamaroteSeleccionado);
            this.dispose();
            new frmPagos().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> DEBE SELECCIONAR UN CAMAROTE</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icono);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        retornarEstadoCamarote();
        verificarBotones();

    }//GEN-LAST:event_formWindowOpened

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

    public void retornarEstadoCamarote() {
        Enumeration elements = group.getElements();

        while (elements.hasMoreElements()) {

            AbstractButton button = (AbstractButton) elements.nextElement();
            button.setEnabled(true);
            button.setContentAreaFilled(false);
        }

    }

    public void verificarBotones() {
        try {
            for (int i = 95; i <= 136; i++) {
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
    private javax.swing.JButton indicador100;
    private javax.swing.JButton indicador101;
    private javax.swing.JButton indicador102;
    private javax.swing.JButton indicador103;
    private javax.swing.JButton indicador104;
    private javax.swing.JButton indicador105;
    private javax.swing.JButton indicador106;
    private javax.swing.JButton indicador107;
    private javax.swing.JButton indicador108;
    private javax.swing.JButton indicador109;
    private javax.swing.JButton indicador110;
    private javax.swing.JButton indicador111;
    private javax.swing.JButton indicador112;
    private javax.swing.JButton indicador113;
    private javax.swing.JButton indicador114;
    private javax.swing.JButton indicador115;
    private javax.swing.JButton indicador116;
    private javax.swing.JButton indicador117;
    private javax.swing.JButton indicador118;
    private javax.swing.JButton indicador119;
    private javax.swing.JButton indicador120;
    private javax.swing.JButton indicador121;
    private javax.swing.JButton indicador122;
    private javax.swing.JButton indicador123;
    private javax.swing.JButton indicador124;
    private javax.swing.JButton indicador125;
    private javax.swing.JButton indicador126;
    private javax.swing.JButton indicador127;
    private javax.swing.JButton indicador128;
    private javax.swing.JButton indicador129;
    private javax.swing.JButton indicador130;
    private javax.swing.JButton indicador131;
    private javax.swing.JButton indicador132;
    private javax.swing.JButton indicador133;
    private javax.swing.JButton indicador134;
    private javax.swing.JButton indicador135;
    private javax.swing.JButton indicador136;
    private javax.swing.JButton indicador95;
    private javax.swing.JButton indicador96;
    private javax.swing.JButton indicador97;
    private javax.swing.JButton indicador98;
    private javax.swing.JButton indicador99;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextArea txtDatosCamarote;
    // End of variables declaration//GEN-END:variables
}
