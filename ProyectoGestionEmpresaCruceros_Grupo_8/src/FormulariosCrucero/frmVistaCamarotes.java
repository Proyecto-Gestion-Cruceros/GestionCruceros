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

public class frmVistaCamarotes extends javax.swing.JFrame {

    public frmVistaCamarotes() {
        initComponents();
    }

    dbConnection conexion = new dbConnection();
    clsVariablesViaje variables = new clsVariablesViaje();
    clsMessage message = new clsMessage();
    int cantidadOcupantes = variables.getNumeroPersonas();

    int numeroCamaroteSeleccionado = 0;

    PreparedStatement ps;
    ResultSet result = null;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        indicador64 = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        indicador86 = new javax.swing.JButton();
        indicador80 = new javax.swing.JButton();
        indicador60 = new javax.swing.JButton();
        indicador63 = new javax.swing.JButton();
        indicador62 = new javax.swing.JButton();
        indicador59 = new javax.swing.JButton();
        indicador58 = new javax.swing.JButton();
        indicador61 = new javax.swing.JButton();
        indicador55 = new javax.swing.JButton();
        indicador54 = new javax.swing.JButton();
        indicador69 = new javax.swing.JButton();
        indicador57 = new javax.swing.JButton();
        indicador56 = new javax.swing.JButton();
        indicador70 = new javax.swing.JButton();
        indicador71 = new javax.swing.JButton();
        indicador72 = new javax.swing.JButton();
        indicador73 = new javax.swing.JButton();
        indicador74 = new javax.swing.JButton();
        indicador75 = new javax.swing.JButton();
        indicador76 = new javax.swing.JButton();
        indicador77 = new javax.swing.JButton();
        indicador78 = new javax.swing.JButton();
        indicador53 = new javax.swing.JButton();
        indicador79 = new javax.swing.JButton();
        indicador87 = new javax.swing.JButton();
        indicador89 = new javax.swing.JButton();
        indicador90 = new javax.swing.JButton();
        indicador91 = new javax.swing.JButton();
        indicador88 = new javax.swing.JButton();
        indicador92 = new javax.swing.JButton();
        indicador94 = new javax.swing.JButton();
        indicador67 = new javax.swing.JButton();
        indicador85 = new javax.swing.JButton();
        indicador93 = new javax.swing.JButton();
        indicador65 = new javax.swing.JButton();
        indicador68 = new javax.swing.JButton();
        indicador81 = new javax.swing.JButton();
        indicador83 = new javax.swing.JButton();
        indicador66 = new javax.swing.JButton();
        indicador84 = new javax.swing.JButton();
        indicador82 = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnMenuPrincipal1 = new javax.swing.JButton();
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
        jLabel1.setText("CAMAROTES - NIVEL 3");
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
        btnAtras.setBounds(0, 1020, 210, 70);

        indicador64.setBackground(new java.awt.Color(0, 255, 0));
        indicador64.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador64.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador64);
        indicador64.setHideActionText(true);
        indicador64.setName("indicador64"); // NOI18N
        indicador64.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador64ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador64);
        indicador64.setBounds(1146, 345, 40, 40);

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

        indicador86.setBackground(new java.awt.Color(0, 255, 0));
        indicador86.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador86);
        indicador86.setHideActionText(true);
        indicador86.setName("indicador86"); // NOI18N
        indicador86.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador86ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador86);
        indicador86.setBounds(871, 426, 40, 30);

        indicador80.setBackground(new java.awt.Color(0, 255, 0));
        indicador80.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador80.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador80);
        indicador80.setHideActionText(true);
        indicador80.setName("indicador80"); // NOI18N
        indicador80.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador80ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador80);
        indicador80.setBounds(1132, 544, 40, 40);

        indicador60.setBackground(new java.awt.Color(0, 255, 0));
        indicador60.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador60.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador60);
        indicador60.setHideActionText(true);
        indicador60.setName("indicador60"); // NOI18N
        indicador60.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador60ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador60);
        indicador60.setBounds(845, 345, 40, 40);

        indicador63.setBackground(new java.awt.Color(0, 255, 0));
        indicador63.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador63.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador63);
        indicador63.setHideActionText(true);
        indicador63.setName("indicador63"); // NOI18N
        indicador63.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador63ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador63);
        indicador63.setBounds(1055, 345, 40, 40);

        indicador62.setBackground(new java.awt.Color(0, 255, 0));
        indicador62.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador62.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador62);
        indicador62.setHideActionText(true);
        indicador62.setName("indicador62"); // NOI18N
        indicador62.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador62ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador62);
        indicador62.setBounds(973, 345, 40, 40);

        indicador59.setBackground(new java.awt.Color(0, 255, 0));
        indicador59.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador59.setText("   ");
        indicador59.setToolTipText("");
        indicador59.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador59);
        indicador59.setHideActionText(true);
        indicador59.setName("indicador59"); // NOI18N
        indicador59.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador59ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador59);
        indicador59.setBounds(780, 345, 40, 40);

        indicador58.setBackground(new java.awt.Color(0, 255, 0));
        indicador58.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador58.setText("   ");
        indicador58.setToolTipText("");
        indicador58.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador58);
        indicador58.setHideActionText(true);
        indicador58.setName("indicador58"); // NOI18N
        indicador58.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador58ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador58);
        indicador58.setBounds(717, 345, 40, 40);

        indicador61.setBackground(new java.awt.Color(0, 255, 0));
        indicador61.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador61.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador61);
        indicador61.setHideActionText(true);
        indicador61.setName("indicador61"); // NOI18N
        indicador61.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador61ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador61);
        indicador61.setBounds(908, 345, 40, 40);

        indicador55.setBackground(new java.awt.Color(0, 255, 0));
        indicador55.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador55.setText("  ");
        indicador55.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador55);
        indicador55.setHideActionText(true);
        indicador55.setName("indicador55"); // NOI18N
        indicador55.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador55ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador55);
        indicador55.setBounds(525, 345, 40, 40);

        indicador54.setBackground(new java.awt.Color(0, 255, 0));
        indicador54.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador54.setText("  ");
        indicador54.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador54);
        indicador54.setHideActionText(true);
        indicador54.setName("indicador54"); // NOI18N
        indicador54.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador54ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador54);
        indicador54.setBounds(464, 345, 40, 40);

        indicador69.setBackground(new java.awt.Color(0, 255, 0));
        indicador69.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador69.setText("  ");
        indicador69.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador69);
        indicador69.setHideActionText(true);
        indicador69.setName("indicador69"); // NOI18N
        indicador69.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador69ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador69);
        indicador69.setBounds(385, 544, 40, 40);

        indicador57.setBackground(new java.awt.Color(0, 255, 0));
        indicador57.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador57.setText("   ");
        indicador57.setToolTipText("");
        indicador57.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador57);
        indicador57.setHideActionText(true);
        indicador57.setName("indicador57"); // NOI18N
        indicador57.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador57ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador57);
        indicador57.setBounds(654, 345, 40, 40);

        indicador56.setBackground(new java.awt.Color(0, 255, 0));
        indicador56.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador56.setText("  ");
        indicador56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador56);
        indicador56.setHideActionText(true);
        indicador56.setName("indicador56"); // NOI18N
        indicador56.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador56ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador56);
        indicador56.setBounds(589, 345, 40, 40);

        indicador70.setBackground(new java.awt.Color(0, 255, 0));
        indicador70.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador70.setText("  ");
        indicador70.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador70);
        indicador70.setHideActionText(true);
        indicador70.setName("indicador70"); // NOI18N
        indicador70.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador70ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador70);
        indicador70.setBounds(464, 544, 40, 40);

        indicador71.setBackground(new java.awt.Color(0, 255, 0));
        indicador71.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador71.setText("   ");
        indicador71.setToolTipText("");
        indicador71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador71);
        indicador71.setHideActionText(true);
        indicador71.setName("indicador71"); // NOI18N
        indicador71.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador71ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador71);
        indicador71.setBounds(525, 544, 40, 40);

        indicador72.setBackground(new java.awt.Color(0, 255, 0));
        indicador72.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador72.setText("   ");
        indicador72.setToolTipText("");
        indicador72.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador72);
        indicador72.setHideActionText(true);
        indicador72.setName("indicador72"); // NOI18N
        indicador72.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador72ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador72);
        indicador72.setBounds(589, 544, 40, 40);

        indicador73.setBackground(new java.awt.Color(0, 255, 0));
        indicador73.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador73.setText("   ");
        indicador73.setToolTipText("");
        indicador73.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador73);
        indicador73.setHideActionText(true);
        indicador73.setName("indicador73"); // NOI18N
        indicador73.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador73ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador73);
        indicador73.setBounds(654, 544, 40, 40);

        indicador74.setBackground(new java.awt.Color(0, 255, 0));
        indicador74.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador74.setText("   ");
        indicador74.setToolTipText("");
        indicador74.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador74);
        indicador74.setHideActionText(true);
        indicador74.setName("indicador74"); // NOI18N
        indicador74.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador74ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador74);
        indicador74.setBounds(717, 544, 40, 40);

        indicador75.setBackground(new java.awt.Color(0, 255, 0));
        indicador75.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador75.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador75);
        indicador75.setHideActionText(true);
        indicador75.setName("indicador75"); // NOI18N
        indicador75.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador75ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador75);
        indicador75.setBounds(780, 544, 40, 40);

        indicador76.setBackground(new java.awt.Color(0, 255, 0));
        indicador76.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador76.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador76);
        indicador76.setHideActionText(true);
        indicador76.setName("indicador76"); // NOI18N
        indicador76.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador76ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador76);
        indicador76.setBounds(845, 544, 40, 40);

        indicador77.setBackground(new java.awt.Color(0, 255, 0));
        indicador77.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador77.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador77);
        indicador77.setHideActionText(true);
        indicador77.setName("indicador77"); // NOI18N
        indicador77.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador77ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador77);
        indicador77.setBounds(908, 544, 40, 40);

        indicador78.setBackground(new java.awt.Color(0, 255, 0));
        indicador78.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador78.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador78);
        indicador78.setHideActionText(true);
        indicador78.setName("indicador78"); // NOI18N
        indicador78.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador78ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador78);
        indicador78.setBounds(973, 544, 40, 40);

        indicador53.setBackground(new java.awt.Color(0, 255, 0));
        indicador53.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador53.setText("  ");
        indicador53.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador53);
        indicador53.setHideActionText(true);
        indicador53.setName("indicador53"); // NOI18N
        indicador53.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador53ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador53);
        indicador53.setBounds(385, 345, 40, 40);

        indicador79.setBackground(new java.awt.Color(0, 255, 0));
        indicador79.setFont(new java.awt.Font("Doppio One", 0, 8)); // NOI18N
        indicador79.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador79);
        indicador79.setHideActionText(true);
        indicador79.setName("indicador79"); // NOI18N
        indicador79.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador79ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador79);
        indicador79.setBounds(1055, 544, 40, 40);

        indicador87.setBackground(new java.awt.Color(0, 255, 0));
        indicador87.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador87);
        indicador87.setHideActionText(true);
        indicador87.setName("indicador87"); // NOI18N
        indicador87.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador87ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador87);
        indicador87.setBounds(932, 426, 40, 30);

        indicador89.setBackground(new java.awt.Color(0, 255, 0));
        indicador89.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador89);
        indicador89.setHideActionText(true);
        indicador89.setName("indicador89"); // NOI18N
        indicador89.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador89ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador89);
        indicador89.setBounds(812, 474, 40, 30);

        indicador90.setBackground(new java.awt.Color(0, 255, 0));
        indicador90.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador90);
        indicador90.setHideActionText(true);
        indicador90.setName("indicador90"); // NOI18N
        indicador90.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador90ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador90);
        indicador90.setBounds(871, 474, 40, 30);

        indicador91.setBackground(new java.awt.Color(0, 255, 0));
        indicador91.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador91);
        indicador91.setHideActionText(true);
        indicador91.setName("indicador91"); // NOI18N
        indicador91.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador91ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador91);
        indicador91.setBounds(932, 474, 40, 30);

        indicador88.setBackground(new java.awt.Color(0, 255, 0));
        indicador88.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador88);
        indicador88.setHideActionText(true);
        indicador88.setName("indicador88"); // NOI18N
        indicador88.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador88ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador88);
        indicador88.setBounds(992, 426, 40, 30);

        indicador92.setBackground(new java.awt.Color(0, 255, 0));
        indicador92.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador92);
        indicador92.setHideActionText(true);
        indicador92.setName("indicador92"); // NOI18N
        indicador92.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador92ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador92);
        indicador92.setBounds(992, 474, 40, 30);

        indicador94.setBackground(new java.awt.Color(0, 255, 0));
        indicador94.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador94);
        indicador94.setHideActionText(true);
        indicador94.setName("indicador94"); // NOI18N
        indicador94.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador94ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador94);
        indicador94.setBounds(1305, 456, 50, 20);

        indicador67.setBackground(new java.awt.Color(0, 255, 0));
        indicador67.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador67);
        indicador67.setHideActionText(true);
        indicador67.setName("indicador67"); // NOI18N
        indicador67.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador67ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador67);
        indicador67.setBounds(1325, 380, 30, 40);

        indicador85.setBackground(new java.awt.Color(0, 255, 0));
        indicador85.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador85);
        indicador85.setHideActionText(true);
        indicador85.setName("indicador85"); // NOI18N
        indicador85.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador85ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador85);
        indicador85.setBounds(812, 426, 40, 30);

        indicador93.setBackground(new java.awt.Color(0, 255, 0));
        indicador93.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador93);
        indicador93.setHideActionText(true);
        indicador93.setName("indicador93"); // NOI18N
        indicador93.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador93ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador93);
        indicador93.setBounds(1224, 456, 50, 20);

        indicador65.setBackground(new java.awt.Color(0, 255, 0));
        indicador65.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador65);
        indicador65.setHideActionText(true);
        indicador65.setName("indicador65"); // NOI18N
        indicador65.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador65ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador65);
        indicador65.setBounds(1223, 380, 30, 40);

        indicador68.setBackground(new java.awt.Color(0, 255, 0));
        indicador68.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador68);
        indicador68.setHideActionText(true);
        indicador68.setName("indicador68"); // NOI18N
        indicador68.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador68ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador68);
        indicador68.setBounds(1375, 380, 30, 40);

        indicador81.setBackground(new java.awt.Color(0, 255, 0));
        indicador81.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador81);
        indicador81.setHideActionText(true);
        indicador81.setName("indicador81"); // NOI18N
        indicador81.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador81ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador81);
        indicador81.setBounds(1192, 510, 30, 40);

        indicador83.setBackground(new java.awt.Color(0, 255, 0));
        indicador83.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador83);
        indicador83.setHideActionText(true);
        indicador83.setName("indicador83"); // NOI18N
        indicador83.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador83ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador83);
        indicador83.setBounds(1293, 510, 30, 40);

        indicador66.setBackground(new java.awt.Color(0, 255, 0));
        indicador66.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador66);
        indicador66.setHideActionText(true);
        indicador66.setName("indicador66"); // NOI18N
        indicador66.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador66ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador66);
        indicador66.setBounds(1276, 380, 30, 40);

        indicador84.setBackground(new java.awt.Color(0, 255, 0));
        indicador84.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador84);
        indicador84.setHideActionText(true);
        indicador84.setName("indicador84"); // NOI18N
        indicador84.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador84ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador84);
        indicador84.setBounds(1340, 510, 30, 40);

        indicador82.setBackground(new java.awt.Color(0, 255, 0));
        indicador82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        group.add(indicador82);
        indicador82.setHideActionText(true);
        indicador82.setName("indicador82"); // NOI18N
        indicador82.setPreferredSize(new java.awt.Dimension(50, 50));
        indicador82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indicador82ActionPerformed(evt);
            }
        });
        jPanel1.add(indicador82);
        indicador82.setBounds(1242, 510, 30, 40);

        lblBackground.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/mapaSegundoNivelFINAL.png"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(270, 260, 1430, 410);

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Detalles del Camarote");
        jLabel2.setFocusTraversalPolicyProvider(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(790, 690, 330, 49);

        btnMenuPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenuPrincipal1.setBorderPainted(false);
        btnMenuPrincipal1.setContentAreaFilled(false);
        btnMenuPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipal1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenuPrincipal1);
        btnMenuPrincipal1.setBounds(1843, 2, 75, 70);

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
        jScrollPane1.setBounds(720, 750, 450, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void indicador89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador89ActionPerformed
        bloquearBotones(indicador89);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 89;
            llenarDatosCamarote(89);
        }
    }//GEN-LAST:event_indicador89ActionPerformed

    private void indicador90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador90ActionPerformed
        bloquearBotones(indicador90);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 90;
            llenarDatosCamarote(90);
        }
    }//GEN-LAST:event_indicador90ActionPerformed

    private void indicador92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador92ActionPerformed
        bloquearBotones(indicador92);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 92;
            llenarDatosCamarote(92);
        }
    }//GEN-LAST:event_indicador92ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        verificarBotones();
        retornarEstadoCamarote();
    }//GEN-LAST:event_formWindowOpened

    private void indicador53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador53ActionPerformed
        bloquearBotones(indicador53);

        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 53;
            llenarDatosCamarote(53);
        }

    }//GEN-LAST:event_indicador53ActionPerformed

    private void indicador54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador54ActionPerformed
        bloquearBotones(indicador54);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 54;
            llenarDatosCamarote(54);
        }
    }//GEN-LAST:event_indicador54ActionPerformed

    private void indicador55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador55ActionPerformed
        bloquearBotones(indicador55);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 55;
            llenarDatosCamarote(55);
        }
    }//GEN-LAST:event_indicador55ActionPerformed

    private void indicador56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador56ActionPerformed
        bloquearBotones(indicador56);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 56;
            llenarDatosCamarote(56);
        }
    }//GEN-LAST:event_indicador56ActionPerformed

    private void indicador57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador57ActionPerformed
        bloquearBotones(indicador57);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 57;
            llenarDatosCamarote(57);
        }
    }//GEN-LAST:event_indicador57ActionPerformed

    private void indicador58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador58ActionPerformed
        bloquearBotones(indicador58);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 58;
            llenarDatosCamarote(58);
        }
    }//GEN-LAST:event_indicador58ActionPerformed

    private void indicador59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador59ActionPerformed
        bloquearBotones(indicador59);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 59;
            llenarDatosCamarote(59);
        }
    }//GEN-LAST:event_indicador59ActionPerformed

    private void indicador60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador60ActionPerformed
        bloquearBotones(indicador60);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 60;
            llenarDatosCamarote(60);
        }
    }//GEN-LAST:event_indicador60ActionPerformed

    private void indicador61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador61ActionPerformed
        bloquearBotones(indicador61);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 61;
            llenarDatosCamarote(61);
        }
    }//GEN-LAST:event_indicador61ActionPerformed

    private void indicador62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador62ActionPerformed
        bloquearBotones(indicador62);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 62;
            llenarDatosCamarote(62);
        }
    }//GEN-LAST:event_indicador62ActionPerformed

    private void indicador63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador63ActionPerformed
        bloquearBotones(indicador63);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 63;
            llenarDatosCamarote(63);
        }
    }//GEN-LAST:event_indicador63ActionPerformed

    private void indicador64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador64ActionPerformed
        bloquearBotones(indicador64);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 64;
            llenarDatosCamarote(64);
        }
    }//GEN-LAST:event_indicador64ActionPerformed

    private void indicador65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador65ActionPerformed
        bloquearBotones(indicador65);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 65;
            llenarDatosCamarote(65);
        }
    }//GEN-LAST:event_indicador65ActionPerformed

    private void indicador66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador66ActionPerformed
        bloquearBotones(indicador66);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 66;
            llenarDatosCamarote(66);
        }
    }//GEN-LAST:event_indicador66ActionPerformed

    private void indicador67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador67ActionPerformed
        bloquearBotones(indicador67);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 67;
            llenarDatosCamarote(67);
        }
    }//GEN-LAST:event_indicador67ActionPerformed

    private void indicador68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador68ActionPerformed
        bloquearBotones(indicador68);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 68;
            llenarDatosCamarote(68);
        }
    }//GEN-LAST:event_indicador68ActionPerformed

    private void indicador69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador69ActionPerformed
        bloquearBotones(indicador69);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 69;
            llenarDatosCamarote(69);
        }
    }//GEN-LAST:event_indicador69ActionPerformed

    private void indicador70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador70ActionPerformed
        bloquearBotones(indicador70);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 70;
            llenarDatosCamarote(70);
        }
    }//GEN-LAST:event_indicador70ActionPerformed

    private void indicador71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador71ActionPerformed
        bloquearBotones(indicador71);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 71;
            llenarDatosCamarote(71);
        }
    }//GEN-LAST:event_indicador71ActionPerformed

    private void indicador72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador72ActionPerformed
        bloquearBotones(indicador72);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 72;
            llenarDatosCamarote(72);
        }
    }//GEN-LAST:event_indicador72ActionPerformed

    private void indicador73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador73ActionPerformed
        bloquearBotones(indicador73);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 73;
            llenarDatosCamarote(73);
        }
    }//GEN-LAST:event_indicador73ActionPerformed

    private void indicador74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador74ActionPerformed
        bloquearBotones(indicador74);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 74;
            llenarDatosCamarote(74);
        }
    }//GEN-LAST:event_indicador74ActionPerformed

    private void indicador75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador75ActionPerformed
        bloquearBotones(indicador75);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 75;
            llenarDatosCamarote(75);
        }
    }//GEN-LAST:event_indicador75ActionPerformed

    private void indicador76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador76ActionPerformed
        bloquearBotones(indicador76);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 76;
            llenarDatosCamarote(76);
        }
    }//GEN-LAST:event_indicador76ActionPerformed

    private void indicador77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador77ActionPerformed
        bloquearBotones(indicador77);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 77;
            llenarDatosCamarote(77);
        }
    }//GEN-LAST:event_indicador77ActionPerformed

    private void indicador78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador78ActionPerformed
        bloquearBotones(indicador78);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 78;
            llenarDatosCamarote(78);
        }
    }//GEN-LAST:event_indicador78ActionPerformed

    private void indicador79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador79ActionPerformed
        bloquearBotones(indicador79);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 79;
            llenarDatosCamarote(79);
        }
    }//GEN-LAST:event_indicador79ActionPerformed

    private void indicador80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador80ActionPerformed
        bloquearBotones(indicador80);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 80;
            llenarDatosCamarote(80);
        }
    }//GEN-LAST:event_indicador80ActionPerformed

    private void indicador81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador81ActionPerformed
        bloquearBotones(indicador81);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 81;
            llenarDatosCamarote(81);
        }
    }//GEN-LAST:event_indicador81ActionPerformed

    private void indicador82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador82ActionPerformed
        bloquearBotones(indicador82);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 82;
            llenarDatosCamarote(82);
        }
    }//GEN-LAST:event_indicador82ActionPerformed

    private void indicador83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador83ActionPerformed
        bloquearBotones(indicador83);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 83;
            llenarDatosCamarote(83);
        }
    }//GEN-LAST:event_indicador83ActionPerformed

    private void indicador84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador84ActionPerformed
        bloquearBotones(indicador84);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 84;
            llenarDatosCamarote(84);
        }
    }//GEN-LAST:event_indicador84ActionPerformed

    private void indicador85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador85ActionPerformed
        bloquearBotones(indicador85);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 85;
            llenarDatosCamarote(85);
        }
    }//GEN-LAST:event_indicador85ActionPerformed

    private void indicador86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador86ActionPerformed
        bloquearBotones(indicador86);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 86;
            llenarDatosCamarote(86);
        }
    }//GEN-LAST:event_indicador86ActionPerformed

    private void indicador87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador87ActionPerformed
        bloquearBotones(indicador87);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 87;
            llenarDatosCamarote(87);
        }
    }//GEN-LAST:event_indicador87ActionPerformed

    private void indicador88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador88ActionPerformed
        bloquearBotones(indicador88);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 88;
            llenarDatosCamarote(88);
        }
    }//GEN-LAST:event_indicador88ActionPerformed

    private void indicador91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador91ActionPerformed
        bloquearBotones(indicador91);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 91;
            llenarDatosCamarote(91);
        }
    }//GEN-LAST:event_indicador91ActionPerformed

    private void indicador93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador93ActionPerformed
        bloquearBotones(indicador93);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 93;
            llenarDatosCamarote(93);
        }
    }//GEN-LAST:event_indicador93ActionPerformed

    private void indicador94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indicador94ActionPerformed
        bloquearBotones(indicador94);
        if (numeroCamaroteSeleccionado != 0) {
            numeroCamaroteSeleccionado = 0;
            llenarDatosCamarote(0);
        } else {
            numeroCamaroteSeleccionado = 94;
            llenarDatosCamarote(94);
        }
    }//GEN-LAST:event_indicador94ActionPerformed

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

    private void btnMenuPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipal1ActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"<html><b style=\"color:black; font-size:13px;\">Est?? seguro de volver al Men?? Principal?</b></html>" , "Salir del M??dulo",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, message.icono);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            variables.resetVariables();
            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuPrincipal1ActionPerformed


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
            for (int i = 53; i <= 94; i++) {
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
    private javax.swing.JButton btnMenuPrincipal1;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.ButtonGroup group;
    private javax.swing.JButton indicador53;
    private javax.swing.JButton indicador54;
    private javax.swing.JButton indicador55;
    private javax.swing.JButton indicador56;
    private javax.swing.JButton indicador57;
    private javax.swing.JButton indicador58;
    private javax.swing.JButton indicador59;
    private javax.swing.JButton indicador60;
    private javax.swing.JButton indicador61;
    private javax.swing.JButton indicador62;
    private javax.swing.JButton indicador63;
    private javax.swing.JButton indicador64;
    private javax.swing.JButton indicador65;
    private javax.swing.JButton indicador66;
    private javax.swing.JButton indicador67;
    private javax.swing.JButton indicador68;
    private javax.swing.JButton indicador69;
    private javax.swing.JButton indicador70;
    private javax.swing.JButton indicador71;
    private javax.swing.JButton indicador72;
    private javax.swing.JButton indicador73;
    private javax.swing.JButton indicador74;
    private javax.swing.JButton indicador75;
    private javax.swing.JButton indicador76;
    private javax.swing.JButton indicador77;
    private javax.swing.JButton indicador78;
    private javax.swing.JButton indicador79;
    private javax.swing.JButton indicador80;
    private javax.swing.JButton indicador81;
    private javax.swing.JButton indicador82;
    private javax.swing.JButton indicador83;
    private javax.swing.JButton indicador84;
    private javax.swing.JButton indicador85;
    private javax.swing.JButton indicador86;
    private javax.swing.JButton indicador87;
    private javax.swing.JButton indicador88;
    private javax.swing.JButton indicador89;
    private javax.swing.JButton indicador90;
    private javax.swing.JButton indicador91;
    private javax.swing.JButton indicador92;
    private javax.swing.JButton indicador93;
    private javax.swing.JButton indicador94;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JTextArea txtDatosCamarote;
    // End of variables declaration//GEN-END:variables
}
