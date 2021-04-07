package Formularios.Pagos;

import Clases.ClsValidaciones;
import Clases.clsMessage;
import Clases.dbConnection;
import FormularioIGP.frmIGP;

import Formularios.InicioSesion.frmInicioSesion;
import FormulariosCrucero.clsVariablesViaje;
import FormulariosCrucero.frmVistaCamarotes;
import FormulariosCrucero.frmVistaCamarotesN2;
import FormulariosCrucero.frmVistaCamarotesN3;
import FormulariosCrucero.frmVistaCamarotesN4;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.print.PrinterJob;
import java.io.*;
import java.sql.*;
import java.text.DecimalFormat;
import java.time.LocalDate;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;

public class frmPagos extends javax.swing.JFrame {

    
    public frmPagos() {
        initComponents();
    }

    DecimalFormat df = new DecimalFormat("0.##");

    PreparedStatement ps;
    clsVariablesViaje variablesViaje = new clsVariablesViaje();
    ClsPagos pago = new ClsPagos();
    ClsValidaciones v = new ClsValidaciones();
    DefaultTableModel modelCliente = variablesViaje.getModel1();
    String identidadC = modelCliente.getValueAt(0, 0).toString();
    File temp;
    String msgMetodoPago = null;
    
    clsMessage message = new clsMessage();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtNumFactura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPuertoPartida = new javax.swing.JTextField();
        btnConsultarPersonas = new javax.swing.JButton();
        txtFechaFin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        txtPuertoDestino = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNivelCubierta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNumeroCamarote = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombreCrucero = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        jrbVisa = new javax.swing.JRadioButton();
        jrbMasterCard = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtTitularTarjeta = new javax.swing.JTextField();
        txtNumeroTarjeta = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmbMesVencimiento = new javax.swing.JComboBox<>();
        cmbAnioVencimiento = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        txtCVC = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblISV = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblPropina = new javax.swing.JLabel();
        lblTotalPagar = new javax.swing.JLabel();
        jrbEfectivo = new javax.swing.JRadioButton();
        jLabel33 = new javax.swing.JLabel();
        txtCantidadRecibida = new javax.swing.JTextField();
        txtCambioEfectivo = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblImpuestoPort = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        lblPrecioCamarote = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblCantPersonas = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txtCantDias = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PAGOS");
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setName("frmPago"); // NOI18N
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("DESGLOSE");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 630, 230, 49);

        txtNumFactura.setEditable(false);
        txtNumFactura.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtNumFactura);
        txtNumFactura.setBounds(520, 170, 102, 30);

        jLabel2.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Número de Factura");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 170, 180, 26);

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha Inicio");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1170, 170, 110, 26);

        txtPuertoPartida.setEditable(false);
        txtPuertoPartida.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtPuertoPartida);
        txtPuertoPartida.setBounds(1170, 280, 182, 40);

        btnConsultarPersonas.setBackground(new java.awt.Color(255, 204, 51));
        btnConsultarPersonas.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnConsultarPersonas.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultarPersonas.setText("CONSULTAR PERSONAS");
        btnConsultarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPersonasActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarPersonas);
        btnConsultarPersonas.setBounds(440, 330, 285, 42);

        txtFechaFin.setEditable(false);
        txtFechaFin.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtFechaFin);
        txtFechaFin.setBounds(1400, 210, 130, 40);

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Fin");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1400, 170, 89, 26);

        jLabel5.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre cliente");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 250, 142, 26);

        jLabel6.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Puerto de partida");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(1170, 250, 164, 26);

        txtNombre1.setEditable(false);
        txtNombre1.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtNombre1);
        txtNombre1.setBounds(320, 280, 255, 40);

        txtFechaInicio.setEditable(false);
        txtFechaInicio.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtFechaInicio);
        txtFechaInicio.setBounds(1170, 210, 130, 40);

        txtPuertoDestino.setEditable(false);
        txtPuertoDestino.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtPuertoDestino);
        txtPuertoDestino.setBounds(1400, 280, 182, 40);

        jLabel8.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Puerto de destino");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(1400, 250, 165, 26);

        txtNombre2.setEditable(false);
        txtNombre2.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtNombre2);
        txtNombre2.setBounds(600, 280, 255, 40);

        btnPagar.setBackground(new java.awt.Color(255, 204, 51));
        btnPagar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnPagar.setForeground(new java.awt.Color(0, 0, 0));
        btnPagar.setText("PAGAR");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPagar);
        btnPagar.setBounds(1725, 1020, 195, 63);

        jLabel9.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo electronico");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(320, 410, 168, 26);

        txtCorreo.setEditable(false);
        txtCorreo.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtCorreo);
        txtCorreo.setBounds(320, 440, 255, 40);

        jLabel10.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Número de telefóno");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(320, 490, 186, 26);

        txtTel.setEditable(false);
        txtTel.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtTel);
        txtTel.setBounds(320, 520, 255, 40);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(6, 593, 1910, 10);

        jLabel11.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 51));
        jLabel11.setText("PAGO DE PAQUETE");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(790, 40, 470, 49);

        jLabel13.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nivel de cubierta");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1170, 430, 158, 26);

        txtNivelCubierta.setEditable(false);
        txtNivelCubierta.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtNivelCubierta);
        txtNivelCubierta.setBounds(1170, 460, 182, 40);

        jLabel14.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Número de camarote");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1400, 430, 197, 26);

        txtNumeroCamarote.setEditable(false);
        txtNumeroCamarote.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtNumeroCamarote);
        txtNumeroCamarote.setBounds(1400, 460, 169, 40);

        jLabel15.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre crucero");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1170, 340, 147, 26);

        txtNombreCrucero.setEditable(false);
        txtNombreCrucero.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtNombreCrucero);
        txtNombreCrucero.setBounds(1170, 370, 171, 40);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(860, 600, 10, 470);

        jLabel16.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 51));
        jLabel16.setText("PAGO");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(1340, 630, 130, 49);

        btnAtras.setBackground(new java.awt.Color(255, 204, 51));
        btnAtras.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(0, 1020, 195, 63);

        buttonGroup1.add(jrbVisa);
        jrbVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbVisaActionPerformed(evt);
            }
        });
        jPanel1.add(jrbVisa);
        jrbVisa.setBounds(1010, 720, 28, 42);

        buttonGroup1.add(jrbMasterCard);
        jrbMasterCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMasterCardActionPerformed(evt);
            }
        });
        jPanel1.add(jrbMasterCard);
        jrbMasterCard.setBounds(1150, 720, 28, 42);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoMaster.png"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(1190, 720, 65, 42);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/logoVisa.png"))); // NOI18N
        jPanel1.add(jLabel18);
        jLabel18.setBounds(1040, 720, 65, 42);

        jLabel19.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Titular de la tarjeta");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(1010, 780, 184, 26);

        txtTitularTarjeta.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtTitularTarjeta);
        txtTitularTarjeta.setBounds(1010, 810, 249, 40);

        txtNumeroTarjeta.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtNumeroTarjeta);
        txtNumeroTarjeta.setBounds(1010, 910, 249, 40);

        jLabel20.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Número de tarjeta");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(1010, 880, 173, 26);

        jLabel21.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Vencimiento");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(1310, 780, 117, 26);

        cmbMesVencimiento.setFont(new java.awt.Font("Doppio One", 0, 13)); // NOI18N
        cmbMesVencimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(cmbMesVencimiento);
        cmbMesVencimiento.setBounds(1310, 810, 70, 28);

        cmbAnioVencimiento.setFont(new java.awt.Font("Doppio One", 0, 13)); // NOI18N
        cmbAnioVencimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031" }));
        jPanel1.add(cmbAnioVencimiento);
        cmbAnioVencimiento.setBounds(1390, 810, 80, 28);

        jLabel22.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("CVC");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(1310, 880, 37, 26);

        txtCVC.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtCVC);
        txtCVC.setBounds(1310, 910, 63, 40);

        jLabel23.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Subtotal");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(530, 700, 79, 26);

        jLabel25.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Descuento");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(510, 820, 97, 26);

        jLabel26.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Total a Pagar");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(270, 940, 126, 26);

        jLabel27.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Propina");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(535, 860, 80, 26);

        lblSubTotal.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblSubTotal.setForeground(new java.awt.Color(255, 204, 0));
        lblSubTotal.setText("16000.00");
        jPanel1.add(lblSubTotal);
        lblSubTotal.setBounds(630, 700, 88, 26);

        lblISV.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblISV.setForeground(new java.awt.Color(255, 204, 0));
        lblISV.setText("2400.00");
        jPanel1.add(lblISV);
        lblISV.setBounds(630, 780, 90, 26);

        lblDescuento.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblDescuento.setForeground(new java.awt.Color(255, 204, 0));
        lblDescuento.setText("0.00");
        jPanel1.add(lblDescuento);
        lblDescuento.setBounds(630, 820, 100, 26);

        lblPropina.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblPropina.setForeground(new java.awt.Color(255, 204, 0));
        lblPropina.setText("1600.00");
        jPanel1.add(lblPropina);
        lblPropina.setBounds(630, 860, 100, 26);

        lblTotalPagar.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblTotalPagar.setForeground(new java.awt.Color(255, 204, 0));
        lblTotalPagar.setText("20000.00");
        jPanel1.add(lblTotalPagar);
        lblTotalPagar.setBounds(420, 940, 100, 26);

        jrbEfectivo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jrbEfectivo);
        jrbEfectivo.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jrbEfectivo.setForeground(new java.awt.Color(255, 255, 255));
        jrbEfectivo.setText("Efectivo");
        jrbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEfectivoActionPerformed(evt);
            }
        });
        jPanel1.add(jrbEfectivo);
        jrbEfectivo.setBounds(1310, 720, 106, 42);

        jLabel33.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Cambio en efectivo");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(1510, 880, 190, 26);

        txtCantidadRecibida.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtCantidadRecibida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantidadRecibidaKeyReleased(evt);
            }
        });
        jPanel1.add(txtCantidadRecibida);
        txtCantidadRecibida.setBounds(1510, 810, 180, 40);

        txtCambioEfectivo.setEditable(false);
        txtCambioEfectivo.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtCambioEfectivo);
        txtCambioEfectivo.setBounds(1510, 910, 230, 40);

        jLabel34.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Cantidad Recibida");
        jPanel1.add(jLabel34);
        jLabel34.setBounds(1510, 780, 170, 26);

        jLabel28.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Impuesto Portuario");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(430, 740, 180, 26);

        lblImpuestoPort.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblImpuestoPort.setForeground(new java.awt.Color(255, 204, 0));
        lblImpuestoPort.setText("2400.00");
        jPanel1.add(lblImpuestoPort);
        lblImpuestoPort.setBounds(630, 740, 120, 26);

        jLabel12.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Edad");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(600, 410, 47, 26);

        txtEdad.setEditable(false);
        txtEdad.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtEdad);
        txtEdad.setBounds(600, 440, 110, 40);

        jLabel29.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Precio del camarote");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(90, 760, 200, 26);

        lblPrecioCamarote.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblPrecioCamarote.setForeground(new java.awt.Color(255, 204, 0));
        lblPrecioCamarote.setText("16000.00");
        jPanel1.add(lblPrecioCamarote);
        lblPrecioCamarote.setBounds(290, 760, 88, 26);

        jLabel30.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Cantidad de personas");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(70, 800, 204, 26);

        lblCantPersonas.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        lblCantPersonas.setForeground(new java.awt.Color(255, 204, 0));
        lblCantPersonas.setText("2400.00");
        jPanel1.add(lblCantPersonas);
        lblCantPersonas.setBounds(290, 800, 120, 26);

        jLabel31.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("ISV");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(580, 780, 30, 26);

        txtCantDias.setEditable(false);
        txtCantDias.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        jPanel1.add(txtCantDias);
        txtCantDias.setBounds(1400, 370, 171, 40);

        jLabel24.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cantidad de días");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(1400, 340, 180, 26);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        txtTitularTarjeta.setEnabled(false);
        cmbMesVencimiento.setEnabled(false);
        cmbAnioVencimiento.setEnabled(false);
        txtNumeroTarjeta.setEnabled(false);
        txtCVC.setEnabled(false);
        txtCantidadRecibida.setEnabled(false);
        txtCambioEfectivo.setText("0.00");
        btnPagar.setEnabled(false);

        pago.obtenerDatosClase(identidadC);
        cargarDatos(identidadC, variablesViaje.getCodigoViaje());

        lblCantPersonas.setText("" + variablesViaje.getNumeroPersonas());
        lblSubTotal.setText("$ " + df.format(pago.calcSubTotal()));
        lblImpuestoPort.setText("$ " + df.format(pago.calcImpuestoPortuario()));
        lblISV.setText("$ " + df.format(pago.calcISV()));
        lblDescuento.setText("$ " + df.format(pago.calcDescuento()));
        lblPropina.setText("$ " + df.format(pago.calcPropina()));
        lblTotalPagar.setText("$ " + df.format(pago.calcTotal()));
        lblPrecioCamarote.setText("$ " + df.format(pago.getPrecioCamarote()));
    }//GEN-LAST:event_formWindowOpened

    private void btnConsultarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPersonasActionPerformed
        new frmClientesFactura().setVisible(true);
    }//GEN-LAST:event_btnConsultarPersonasActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        int mesActual = LocalDate.now().getMonthValue();
        int anioActual = LocalDate.now().getYear();
        if(jrbVisa.isSelected() || jrbMasterCard.isSelected())
        {
            if(!txtTitularTarjeta.getText().isEmpty() && !txtNumeroTarjeta.getText().isEmpty() && !txtCVC.getText().isEmpty())
            {
                if(v.isEntero(txtNumeroTarjeta.getText()) && v.isEntero(txtCVC.getText()) && v.isLetras(txtTitularTarjeta) && (txtCVC.getText().length() == 3 || txtCVC.getText().length() == 4) &&
                        txtNumeroTarjeta.getText().length() == 16)
                {
                    if(Integer.parseInt(cmbAnioVencimiento.getSelectedItem().toString()) >= anioActual)
                    {
                        if(Integer.parseInt(cmbMesVencimiento.getSelectedItem().toString()) > mesActual || Integer.parseInt(cmbAnioVencimiento.getSelectedItem().toString()) > anioActual)
                        {
                            if (jrbVisa.isSelected()) {
                                msgMetodoPago = "Tarjeta VISA con terminación X-" + txtNumeroTarjeta.getText().substring(txtNumeroTarjeta.getText().length() - 4);
                            } else if (jrbMasterCard.isSelected()) {
                                msgMetodoPago = "Tarjeta MASTERCARD con terminación X-" + txtNumeroTarjeta.getText().substring(txtNumeroTarjeta.getText().length() - 4);
                            }
                            imprimirFactura();
                            this.dispose();
                            new frmIGP().setVisible(true);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"<html><b style=\"color:black; font-size:13px;\"> INGRESE UN MES DE VENCIMIENTO CORRECTO</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icono);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"<html><b style=\"color:black; font-size:13px;\"> INGRESE UN AÑO DE VENCIMIENTO CORRECTA</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icono);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"<html><b style=\"color:black; font-size:13px;\"> VERIFIQUE LOS VALORES INGRESADOS</b></html>", "",JOptionPane.INFORMATION_MESSAGE,  message.icono);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"<html><b style=\"color:black; font-size:13px;\"> INGRESE DATOS DE PAGO</b></html>", "",JOptionPane.INFORMATION_MESSAGE,  message.icono);
            }
        }
        else if(jrbEfectivo.isSelected())
        {
            
                if(!txtCantidadRecibida.getText().isEmpty())
                {
                    if(v.isDecimal(txtCantidadRecibida.getText()) || v.isEntero(txtCantidadRecibida.getText()))
                    {
                        msgMetodoPago = "Efectivo";
                        imprimirFactura();
                        this.dispose();
                        new frmIGP().setVisible(true);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this,"<html><b style=\"color:black; font-size:13px;\"> VERIFIQUE LOS VALORES INGRESADOS</b></html>", "",JOptionPane.INFORMATION_MESSAGE,  message.icono);
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"<html><b style=\"color:black; font-size:13px;\"> INGRESE DATOS DE PAGO</b></html>", "",JOptionPane.INFORMATION_MESSAGE,  message.icono);
                }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"<html><b style=\"color:black; font-size:13px;\"> SELECCIONE UN MÉTODO DE PAGO</b></html>", "",JOptionPane.INFORMATION_MESSAGE,  message.icono);
        }
        
        
    }//GEN-LAST:event_btnPagarActionPerformed

    private void jrbVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbVisaActionPerformed
        if(jrbVisa.isSelected()){
            limpiarTextBox();
            btnPagar.setEnabled(true);
            txtCambioEfectivo.setText("0.00");
            txtTitularTarjeta.setEnabled(true);
            cmbMesVencimiento.setEnabled(true);
            cmbAnioVencimiento.setEnabled(true);
            txtNumeroTarjeta.setEnabled(true);
            txtCVC.setEnabled(true);
            txtCantidadRecibida.setText(lblTotalPagar.getText());
            txtCantidadRecibida.setEnabled(false);
        }
        else{
            btnPagar.setEnabled(false);
            txtTitularTarjeta.setEnabled(false);
            cmbMesVencimiento.setEnabled(false);
            cmbAnioVencimiento.setEnabled(false);
            txtNumeroTarjeta.setEnabled(false);
            txtCVC.setEnabled(false);
            txtCantidadRecibida.setEnabled(false);
        }
    }//GEN-LAST:event_jrbVisaActionPerformed

    private void jrbMasterCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMasterCardActionPerformed
        if(jrbMasterCard.isSelected()){
            limpiarTextBox();
            btnPagar.setEnabled(true);
            txtCambioEfectivo.setText("0.00");
            txtTitularTarjeta.setEnabled(true);
            cmbMesVencimiento.setEnabled(true);
            cmbAnioVencimiento.setEnabled(true);
            txtNumeroTarjeta.setEnabled(true);
            txtCVC.setEnabled(true);
            txtCantidadRecibida.setText(lblTotalPagar.getText());
            txtCantidadRecibida.setEnabled(false);
        }
        else{
            btnPagar.setEnabled(false);
            txtTitularTarjeta.setEnabled(false);
            cmbMesVencimiento.setEnabled(false);
            cmbAnioVencimiento.setEnabled(false);
            txtNumeroTarjeta.setEnabled(false);
            txtCVC.setEnabled(false);
            txtCantidadRecibida.setEnabled(false);
        }
    }//GEN-LAST:event_jrbMasterCardActionPerformed

    private void jrbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEfectivoActionPerformed
        if(jrbEfectivo.isSelected()){
            limpiarTextBox();
            btnPagar.setEnabled(false);
            txtTitularTarjeta.setEnabled(false);
            cmbMesVencimiento.setEnabled(false);
            cmbAnioVencimiento.setEnabled(false);
            txtNumeroTarjeta.setEnabled(false);
            txtCVC.setEnabled(false);
            txtCantidadRecibida.setEnabled(true);
            
        }
        else{
            txtTitularTarjeta.setEnabled(false);
            cmbMesVencimiento.setEnabled(false);
            cmbAnioVencimiento.setEnabled(false);
            txtNumeroTarjeta.setEnabled(false);
            txtCVC.setEnabled(false);
            txtCantidadRecibida.setEnabled(false);
        }
    }//GEN-LAST:event_jrbEfectivoActionPerformed

    private void txtCantidadRecibidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadRecibidaKeyReleased
        if(!jrbMasterCard.isSelected() || !jrbVisa.isSelected())
        {
            if(!txtCantidadRecibida.getText().isEmpty())
            {
                double total = pago.getTotal();
                double recibido = Double.parseDouble(txtCantidadRecibida.getText());
            
                if(recibido >= total)
                {
                    txtCambioEfectivo.setText("" + df.format(recibido - total));
                    btnPagar.setEnabled(true);
                }
                else
                {
                    txtCambioEfectivo.setText("MONTO MAYOR REQUERIDO");
                     btnPagar.setEnabled(false);
                }
            
            }
            else
            {
                txtCambioEfectivo.setText("0.00");
                btnPagar.setEnabled(false);
            }
        }
        else
        {
            txtCambioEfectivo.setText("0.00");
            btnPagar.setEnabled(false);
        }
        
    }//GEN-LAST:event_txtCantidadRecibidaKeyReleased

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        switch (variablesViaje.getNivelBarco()) {
            case 1:
                new frmVistaCamarotesN4().setVisible(true);
                break;
            case 2:
                new frmVistaCamarotesN3().setVisible(true);
                break;
            case 3:
                new frmVistaCamarotes().setVisible(true);
                break;
            case 4:
                new frmVistaCamarotesN2().setVisible(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"<html><b style=\"color:black; font-size:13px;\">Está seguro de volver al Menú Principal?</b></html>" , "Salir del Módulo",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, message.icono);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            variablesViaje.resetVariables();
            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void cargarDatos(String identidadCliente, int idViaje) {
        
        try{
            ps = dbConnection.dbConexion().prepareStatement("SELECT nombres n1, apellidos n2, telefono tl, correoElectronico ce FROM clientes WHERE identidadCliente = ?");
            ps.setString(1, identidadCliente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txtNombre1.setText(rs.getString("n1"));
                txtNombre2.setText(rs.getString("n2"));
                txtTel.setText(rs.getString("tl"));
                txtCorreo.setText(rs.getString("ce"));
                txtEdad.setText("" + pago.getEdadCliente());
                txtCantDias.setText("" + pago.getCantDias());
            }
            
            
            ps = dbConnection.dbConexion().prepareStatement("SELECT MAX(codigoFactura)cf FROM [dbo].[facturaFinal]");
            rs = null;
            rs = ps.executeQuery();
            if(rs.next()){
                txtNumFactura.setText("" + (rs.getInt("cf") + 1));
            }
            
            
            ps = dbConnection.dbConexion().prepareStatement("SELECT B.nombreBuque as nb, C.nombrePuerto as np, D.nombreDestino as nd, A.fechaSalida as fs, A.fechaRegreso as fr FROM [dbo].[viajesDisponibles] A INNER JOIN [dbo].[buques] B  ON A.codigoBuque = B.codigoBuque INNER JOIN [dbo].[puertosSalida] C ON A.codigoPuertoSalida = C.codigoPuerto INNER JOIN [dbo].[destinosTuristicos] D ON A.codigoDestino = D.codigoDestino WHERE A.idViaje = ?");
            ps.setInt(1, idViaje);
            ResultSet result = ps.executeQuery();
            if (result.next()) {
                txtNombreCrucero.setText(result.getString("nb"));
                txtPuertoPartida.setText(result.getString("np"));
                txtPuertoDestino.setText(result.getString("nd"));
                txtFechaInicio.setText(result.getString("fs"));
                txtFechaFin.setText(result.getString("fr"));
                txtNivelCubierta.setText("" + variablesViaje.getNivelBarco());
                txtNumeroCamarote.setText("" + variablesViaje.getNumeroCamarote());

            }
            
        }catch(SQLException ex){
            System.out.println(""+ex.getMessage());
        }

    }
    
    private void generarFactura(){
        Document document = new Document(PageSize.LETTER);
        try {
            String DOPPIOONE = getClass().getResource("/Resources/DoppioOne-Regular.ttf").toString();
            BaseFont baseFont = BaseFont.createFont(DOPPIOONE, BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(temp));
            document.open();
            
            Image img = new Image(Image.getInstance(getClass().getResource("/Resources/Logo BonVoyage Peq.png"))) {
            };
            
            PdfContentByte canvas = writer.getDirectContentUnder();
            img.setAbsolutePosition(210, 10);
            canvas.saveState();
            PdfGState state = new PdfGState();
            state.setFillOpacity(0.3f);
            canvas.setGState(state);
            canvas.addImage(img);
            canvas.restoreState();
            
            Font DoppioN = new Font(baseFont, 13);
            Font DoppioNN = new Font(baseFont, 16);
            DoppioNN.setStyle(Font.UNDERLINE);
            Paragraph numeroFactura = new Paragraph("Número de Factura: 0000" + txtNumFactura.getText(), DoppioN);
            numeroFactura.setAlignment(Element.ALIGN_LEFT);
            document.add(numeroFactura);
            
            Font DoppioT = new Font(baseFont, 18);
            DoppioT.setStyle(Font.BOLD);
            Paragraph titulo = new Paragraph("FACTURA DE VIAJE\n\n", DoppioT);
            titulo.setAlignment(Element.ALIGN_CENTER);
            document.add(titulo);
            
            document.add(new Paragraph("Identidad:                         " + identidadC.toString(), DoppioN));
            document.add(new Paragraph("Nombre Cliente:              " + txtNombre1.getText() + " " + txtNombre2.getText(), DoppioN));
            document.add(new Paragraph("Teléfono:                           " + txtTel.getText(), DoppioN));
            document.add(new Paragraph("Correo Electrónico:         " + txtCorreo.getText(), DoppioN));
            document.add(new Paragraph("Edad:                                  " + txtEdad.getText() + " Años", DoppioN));
            
            Paragraph integrantes = new Paragraph("INTEGRANTES\n\n", DoppioN);
            integrantes.setAlignment(Element.ALIGN_CENTER);
            document.add(integrantes);
            
            PdfPTable pdfTable = new PdfPTable(modelCliente.getColumnCount());
            pdfTable.setTotalWidth(530);
            pdfTable.setLockedWidth(true);
            for(int i=0; i < modelCliente.getColumnCount();i++){
                PdfPCell cell = new PdfPCell(new Paragraph(modelCliente.getColumnName(i), DoppioN));
                cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
                pdfTable.addCell(cell);
            }
            for(int j=0; j < modelCliente.getRowCount(); j++){
                for(int k=0;k < modelCliente.getColumnCount(); k++){
                    PdfPCell cell2 = new PdfPCell(new Paragraph(modelCliente.getValueAt(j, k).toString(), DoppioN));
                    cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    pdfTable.addCell(cell2);
                }
            }
            document.add(pdfTable);
            
            Paragraph detalleFactura = new Paragraph("\nDETALLES DE FACTURA\n\n", DoppioN);
            detalleFactura.setAlignment(Element.ALIGN_CENTER);
            document.add(detalleFactura);
            
            document.add(new Paragraph("Crucero:                               " + txtNombreCrucero.getText(), DoppioN));
            document.add(new Paragraph("Cubierta Nivel:                   " + txtNivelCubierta.getText(), DoppioN));
            document.add(new Paragraph("Camarote Número:           " + txtNumeroCamarote.getText(), DoppioN));
            
            document.add(new Paragraph("\nPrecio del Camarote:         " + lblPrecioCamarote.getText() + " Por Persona", DoppioN));
            document.add(new Paragraph("Cantidad de Personas:      " + lblCantPersonas.getText(), DoppioN));
            document.add(new Paragraph("Cantidad de Días:                " + txtCantDias.getText(), DoppioN));
            document.add(new Paragraph("\nSubtotal:                               " + lblSubTotal.getText(), DoppioN));
            document.add(new Paragraph("Impuesto Portuario:           " + lblImpuestoPort.getText() + "          (5%)", DoppioN));
            document.add(new Paragraph("ISV:                                          " + lblISV.getText() + "          (7%)", DoppioN));
            document.add(new Paragraph("Descuento:                             " + lblDescuento.getText() + "          (25%) Mayores de 60 Años", DoppioN));
            document.add(new Paragraph("Propina:                                  " + lblPropina.getText() + "          (10%)", DoppioN));
            document.add(new Paragraph("Método de Pago:                  " + msgMetodoPago, DoppioN));
            
            document.add(new Paragraph("\nTotal Pagado:                    " + lblTotalPagar.getText(), DoppioNN));
            
            document.newPage();
            Image imgIti = new Image(Image.getInstance(getClass().getResource("/Resources/vonVoyageIModeloItinerario.png"))) {
            };
            PdfContentByte canvas2 = writer.getDirectContentUnder();
            imgIti.scaleToFit(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());
            imgIti.setAbsolutePosition(0, 0);
            canvas2.saveState();
            PdfGState state2 = new PdfGState();
            state2.setFillOpacity(0.9f);
            canvas2.setGState(state2);
            canvas2.addImage(imgIti);
            canvas2.restoreState();
            
            PdfContentByte canvas3 = writer.getDirectContentUnder();
            
            canvas3.saveState();
            canvas3.beginText();
            canvas3.moveText(100, 535);
            canvas3.setFontAndSize(baseFont, 16);
            canvas3.showText("" + txtPuertoPartida.getText());
            canvas3.endText();
            canvas3.beginText();
            canvas3.moveText(110, 515);
            canvas3.setFontAndSize(baseFont, 16);
            canvas3.showText("" + txtFechaInicio.getText());
            canvas3.endText();
            
            canvas3.beginText();
            canvas3.moveText(240, 460);
            canvas3.setFontAndSize(baseFont, 16);
            canvas3.showText("¡TIEMPO DE DIVERSIÓN!");
            canvas3.endText();
            
            canvas3.beginText();
            canvas3.moveText(90, 230);
            canvas3.setFontAndSize(baseFont, 16);
            canvas3.showText("" + txtPuertoDestino.getText());
            canvas3.endText();
            canvas3.beginText();
            canvas3.moveText(85, 210);
            canvas3.setFontAndSize(baseFont, 16);
            canvas3.showText("" + txtFechaFin.getText());
            canvas3.endText();
            
            canvas3.restoreState();
            
            
            
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
            temp.deleteOnExit();
            document.close();
        } 
        
    }
    
    private void imprimirFactura() {
        try {
            PrinterJob job = PrinterJob.getPrinterJob();

            if (pago.insertarViajeBD(Integer.parseInt(txtNumFactura.getText()), identidadC, frmInicioSesion.identidadEmpleado, variablesViaje.getCodigoBuque(), variablesViaje.getCodigoViaje(), variablesViaje.getNumeroCamarote())) {
                    temp = File.createTempFile("tempFactura00000" + txtNumFactura.getText(), ".pdf");
                    generarFactura();
                    JOptionPane.showMessageDialog(this,"<html><b style=\"color:black; font-size:13px;\"> GENERACIÓN DE VIAJE CORRECTA IMPRIMIENDO FACTURA...</b></html>", "",JOptionPane.INFORMATION_MESSAGE,  message.icono);
                    if (job.printDialog() == true) {
                        PDDocument document = PDDocument.load(temp);
                        job.setPageable(new PDFPageable(document));
                        job.print();
                        temp.deleteOnExit();
                        variablesViaje.resetVariables();
                    }
                    
            }
            else{
                JOptionPane.showMessageDialog(this,"<html><b style=\"color:black; font-size:13px;\"> DEBE SELECCIONAR DONDE IMPRIMIR LA FACTURA</b></html>", "",JOptionPane.INFORMATION_MESSAGE,  message.icono);
                imprimirFactura();
            }
        } catch (Exception ex) {
            temp.deleteOnExit();
        }
    }
    
    private void limpiarTextBox(){
        txtTitularTarjeta.setText(null);
            cmbMesVencimiento.setSelectedIndex(0);
            cmbAnioVencimiento.setSelectedIndex(0);
            txtNumeroTarjeta.setText(null);
            txtCVC.setText(null);
            txtCantidadRecibida.setText(null);
            txtCambioEfectivo.setText(null);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConsultarPersonas;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnPagar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbAnioVencimiento;
    private javax.swing.JComboBox<String> cmbMesVencimiento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton jrbEfectivo;
    private javax.swing.JRadioButton jrbMasterCard;
    private javax.swing.JRadioButton jrbVisa;
    private javax.swing.JLabel lblCantPersonas;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblISV;
    private javax.swing.JLabel lblImpuestoPort;
    private javax.swing.JLabel lblPrecioCamarote;
    private javax.swing.JLabel lblPropina;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JTextField txtCVC;
    private javax.swing.JTextField txtCambioEfectivo;
    private javax.swing.JTextField txtCantDias;
    private javax.swing.JTextField txtCantidadRecibida;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaFin;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtNivelCubierta;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombreCrucero;
    private javax.swing.JTextField txtNumFactura;
    private javax.swing.JTextField txtNumeroCamarote;
    private javax.swing.JTextField txtNumeroTarjeta;
    private javax.swing.JTextField txtPuertoDestino;
    private javax.swing.JTextField txtPuertoPartida;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtTitularTarjeta;
    // End of variables declaration//GEN-END:variables
}
