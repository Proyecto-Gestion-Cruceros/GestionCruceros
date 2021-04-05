package formularioBase;

import Clases.ClsValidaciones;
import Clases.DestinosTuristicos.ClsDestinosTuristicos;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import java.awt.Color;
import java.awt.Font;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edmej
 */
public class frmCrudDestinosTuristicos extends javax.swing.JFrame {

    /**
     * Creates new form frmCrudDestinosTuristicos
     */
    public frmCrudDestinosTuristicos() {
        initComponents();
        btnMenuPrincipal.setOpaque(false);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.setBorderPainted(false);
    }


    Icon icon = new ImageIcon(getClass().getResource("/Resources/Error.png"));
    Icon icono = new ImageIcon(getClass().getResource("/Resources/Advertencia.png"));
    Icon Icono = new ImageIcon(getClass().getResource("/Resources/Check.png"));
     
    ClsValidaciones validar = new ClsValidaciones();
    ClsDestinosTuristicos destinos = new ClsDestinosTuristicos();
    dbConnection dbConn =  new dbConnection();
    Connection cn = dbConn.dbConexion();
    PreparedStatement ps = null;
    ResultSet rs;
    
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    DefaultTableModel temp;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreDestino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        cmbEstadoDestino = new javax.swing.JComboBox<>();
        btnMenuPrincipal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTDestinos = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();

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
        jLabel1.setText("Destinos Turisticos");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del Destino");

        txtNombreDestino.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreDestino.setFont(new java.awt.Font("Doppio One", 1, 16)); // NOI18N
        txtNombreDestino.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreDestino.setCaretColor(new java.awt.Color(204, 204, 204));
        txtNombreDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel5.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado del Destino");

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
        btnModificar.setText("Actializar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        cmbEstadoDestino.setBackground(new java.awt.Color(255, 255, 255));
        cmbEstadoDestino.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        cmbEstadoDestino.setForeground(new java.awt.Color(0, 0, 0));
        cmbEstadoDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " <Seleccione>", "Activo", "Inactivo" }));

        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        jTDestinos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTDestinos.setForeground(new java.awt.Color(0, 0, 0));
        jTDestinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Destino", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTDestinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTDestinosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTDestinos);

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 22)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(409, 409, 409)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(586, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEstadoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(727, 727, 727))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbEstadoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(197, 197, 197)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(425, 425, 425))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTDestinos.getTableHeader().setReorderingAllowed(false);
        jTDestinos.getTableHeader().setForeground(Color.BLACK);
        jTDestinos.getTableHeader().setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        LimpiarTabla();
        LlenarTabla();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        if(!txtNombreDestino.getText().isBlank() || cmbEstadoDestino.getSelectedItem() != "<Seleccione>")
        {
            if(validar.isLetras(txtNombreDestino.getText()))
            { 
                
                if(cmbEstadoDestino.getSelectedIndex() == 0 || txtNombreDestino.getText().isEmpty() || txtNombreDestino.getText() == null)
                {
                    JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> INGRESE UN NOMBRE Y UN ESTADO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);

                }
                else 
                {
                    destinos.setNombre_Destino(txtNombreDestino.getText());
                    destinos.setEstado(cmbEstadoDestino.getSelectedItem().toString());
                    
                    try{
                
                    if(destinos.AgregarDestino())
                    {
                        JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> SE REGISTRO CORRECTAMENTE EL DESTINO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);
                        LimpiarTabla();
                        LlenarTabla();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> YA EXISTE UN DESTINO CON ESE NOMBRE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);

                    }
                
                    }
                    catch(Exception ex)
                    {
                       JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, icon); 
                    }
                }  
            }
            else
            {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE UN NOMBRE VALIDO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
            }
        }
        else
        {
           JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> DEBE INGRESAR TODOS LOS DATOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
        } 
                
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if(txtNombreDestino.getText().isBlank() || cmbEstadoDestino.getSelectedItem() != "<Seleccione>")
        {
            if(validar.isLetras(txtNombreDestino.getText()))
            {
                             
                if(cmbEstadoDestino.getSelectedIndex() == 0 || txtNombreDestino.getText() == null)
                {
                    JOptionPane.showMessageDialog(this,"<html><b style=\"color:black; font-size:13px;\"> SELECCIONE UN ESTADO VALIDO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
                }
                else 
                {
                    destinos.setNombre_Destino(txtNombreDestino.getText());
                    destinos.setEstado(cmbEstadoDestino.getSelectedItem().toString());
                    
                    try{
                
                    if(destinos.ActualizarDestino())
                    {
                        JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> DESTINO ACTUALIZADO CORRECTAMENTE </b></html>", "",JOptionPane.INFORMATION_MESSAGE, Icono);
                        LimpiarTabla();
                        LlenarTabla();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL INTENTAR ACTUALIZAR EL DESTINO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);

                    }
                
                    }
                    catch(Exception ex)
                    {
                        JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, icon); 
                    }
                    
                }
            }
            else
            {
                 JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE UN NOMBRE VALIDO </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icon);
            }
        }
        else
        {
           JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> DEBE INGRESAR TODOS LOS DATOS </b></html>", "",JOptionPane.INFORMATION_MESSAGE, icono);
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed
  
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jTDestinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTDestinosMouseClicked
       
        int select = jTDestinos.rowAtPoint(evt.getPoint());
        txtNombreDestino.setText(String.valueOf(jTDestinos.getValueAt(select, 0)));
        
                
    }//GEN-LAST:event_jTDestinosMouseClicked

    
    public void LimpiarTabla()
    {
        
        try
        {
            temp = (DefaultTableModel) jTDestinos.getModel();
            temp.setRowCount(0);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, icon); 
        }
        
    }
    
    public void LlenarTabla()
    {
        
        try{
            
            ps = dbConnection.dbConexion().prepareStatement("Select [nombreDestino], [estado] from [dbo].[destinosTuristicos]");
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
            
            dtm = (DefaultTableModel) this.jTDestinos.getModel();
            for (int i = 0; i < data.size(); i++) {
                dtm.addRow(data.get(i));
            }  
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "",JOptionPane.INFORMATION_MESSAGE, icon); 
        }
        
    }
    
    public void Limpiar()
    {
        
        txtNombreDestino.setText(null);
        cmbEstadoDestino.setSelectedIndex(0);
        
        
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
            java.util.logging.Logger.getLogger(frmCrudDestinosTuristicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrudDestinosTuristicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrudDestinosTuristicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrudDestinosTuristicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrudDestinosTuristicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbEstadoDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTDestinos;
    private javax.swing.JTextField txtNombreDestino;
    // End of variables declaration//GEN-END:variables
}
