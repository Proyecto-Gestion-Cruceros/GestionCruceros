package FormularioIGP;

import Clases.ClsFuncionesDB;
import Clases.clsMessage;
import Clases.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmVerFacturas extends javax.swing.JFrame {

    public frmVerFacturas() {
        initComponents();
    }

    protected int idFactura = 0;
    dbConnection cn = new dbConnection();
    PreparedStatement ps;
    DefaultTableModel facturas;
    ResultSetMetaData rsmd;
    clsMessage message = new clsMessage();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFacturas = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));

        jLabel11.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 51));
        jLabel11.setText("FACTURAS GENERADAS");

        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenuPrincipal.setBorderPainted(false);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        tablaFacturas.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° FACTURA", "NOMBRE COMPLETO", "TELEFONO", "CORREO ELECTRONICO", "BUQUE", "ID VIAJE", "N° CAMAROTE", "SUBTOTAL", "IMPUESTO PORTUARIO", "ISV", "DESCUENTO", "PROPINA", "TOTAL PAGADO", "FECHA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFacturas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaFacturas);
        if (tablaFacturas.getColumnModel().getColumnCount() > 0) {
            tablaFacturas.getColumnModel().getColumn(0).setPreferredWidth(25);
            tablaFacturas.getColumnModel().getColumn(1).setPreferredWidth(180);
            tablaFacturas.getColumnModel().getColumn(3).setPreferredWidth(180);
            tablaFacturas.getColumnModel().getColumn(5).setPreferredWidth(30);
            tablaFacturas.getColumnModel().getColumn(6).setPreferredWidth(40);
            tablaFacturas.getColumnModel().getColumn(7).setPreferredWidth(30);
            tablaFacturas.getColumnModel().getColumn(8).setPreferredWidth(100);
            tablaFacturas.getColumnModel().getColumn(9).setPreferredWidth(30);
            tablaFacturas.getColumnModel().getColumn(10).setPreferredWidth(30);
            tablaFacturas.getColumnModel().getColumn(11).setPreferredWidth(30);
            tablaFacturas.getColumnModel().getColumn(12).setPreferredWidth(50);
            tablaFacturas.getColumnModel().getColumn(13).setPreferredWidth(100);
        }

        txtBusqueda.setFont(new java.awt.Font("Doppio One", 0, 14)); // NOI18N
        txtBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lupaRed.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(706, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(721, 721, 721))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarJTable(1);
    }//GEN-LAST:event_formWindowOpened

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        int result = JOptionPane.showConfirmDialog(this,"<html><b style=\"color:black; font-size:13px;\">Está seguro de volver al Menú Principal?</b></html>" , "Salir del Módulo",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, message.icono);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void tablaFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturasMouseClicked

        idFactura = 0;
        int row = tablaFacturas.rowAtPoint(evt.getPoint());
        idFactura = (int) tablaFacturas.getValueAt(row, 0);
        new frmClientesFacturaVista2(idFactura).setVisible(true);
        
    }//GEN-LAST:event_tablaFacturasMouseClicked

    private void cargarJTable(int opcion){
        try {
            cn = new ClsFuncionesDB();
            if(opcion == 1)
            {
                cn.llenarJTable(tablaFacturas, "SELECT codigoFactura, CONCAT(nombres, apellidos)nomb, telefono, correoElectronico, bu.nombreBuque, ff.idViaje, "
                    + "codigoCamarote, subtotal, impuestoPortuario, CONVERT(varchar, ISV), descuento, propina, totalPagar, CONVERT(varchar, fecha, 0)fecha FROM facturaFinal ff " +
                    "INNER JOIN clientes c ON ff.identidadCliente = c.identidadCliente " +
                    "INNER JOIN buques bu ON ff.codigoBuque = bu.codigoBuque");
            }
            else{
                cn.llenarJTable(tablaFacturas, "SELECT codigoFactura, CONCAT(nombres, apellidos)nomb, telefono, correoElectronico, bu.nombreBuque, ff.idViaje, "
                    + "codigoCamarote, subtotal, impuestoPortuario, CONVERT(varchar, ISV), descuento, propina, totalPagar, CONVERT(varchar, fecha, 0)fecha FROM facturaFinal ff " +
                    "INNER JOIN clientes c ON ff.identidadCliente = c.identidadCliente " +
                    "INNER JOIN buques bu ON ff.codigoBuque = bu.codigoBuque WHERE codigoFactura LIKE '"+txtBusqueda.getText()+"%' OR c.nombres LIKE '"+txtBusqueda.getText()+"%'");
            }}catch(Exception ex){
                System.out.println("" + ex);
            }
    }
    
    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
       
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void txtBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyPressed
      
    }//GEN-LAST:event_txtBusquedaKeyPressed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        cargarJTable(2);
    }//GEN-LAST:event_txtBusquedaKeyReleased
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFacturas;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
