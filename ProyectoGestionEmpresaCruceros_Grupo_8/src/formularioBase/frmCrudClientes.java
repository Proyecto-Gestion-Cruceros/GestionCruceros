package formularioBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Clases.ClsValidaciones;
import Clases.Personas.ClsPersona;
import Clases.dbConnection;
import javax.swing.JOptionPane;

/**
 *
 * @author edmej
 */
public class frmCrudClientes extends javax.swing.JFrame {

    public frmCrudClientes() {
        initComponents();
    }

    ClsValidaciones validar = new ClsValidaciones();
    ClsPersona persona = new ClsPersona();
    dbConnection dbConn =  new dbConnection();
    Connection cn = dbConn.dbConexion();
    PreparedStatement ps = null;
    ResultSet rs;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombresCliente = new javax.swing.JTextField();
        txtApellidosCliente = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreoCliente = new javax.swing.JTextField();
        cmbEstadoCliente = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtIdentidadCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(1635, 1035));

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 45 Book", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Clientes:");

        jLabel2.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombres del Cliente:");

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellidos del Cliente:");

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Teléfono:");

        jLabel5.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Correo Electrónico:");

        jLabel6.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado:");

        txtNombresCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtNombresCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtNombresCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtApellidosCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtApellidosCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtApellidosCliente.setForeground(new java.awt.Color(0, 0, 0));

        txtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        txtTelefono.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));

        txtCorreoCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtCorreoCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtCorreoCliente.setForeground(new java.awt.Color(0, 0, 0));

        cmbEstadoCliente.setBackground(new java.awt.Color(204, 204, 204));
        cmbEstadoCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        cmbEstadoCliente.setForeground(new java.awt.Color(0, 0, 0));
        cmbEstadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " <Seleccione>", "Activo", "Inactivo" }));
        cmbEstadoCliente.setToolTipText("");

        btnAgregar.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregar.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 22)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 204, 51));
        btnModificar.setFont(new java.awt.Font("Avenir LT Std 45 Book", 0, 22)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección:");

        txtDireccionCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccionCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtDireccionCliente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Identidad Cliente:");

        txtIdentidadCliente.setBackground(new java.awt.Color(204, 204, 204));
        txtIdentidadCliente.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        txtIdentidadCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtIdentidadCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(121, 121, 121)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombresCliente)
                                    .addComponent(txtApellidosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdentidadCliente)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(627, 627, 627)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar)
                        .addGap(58, 58, 58)
                        .addComponent(btnModificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtIdentidadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCorreoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbEstadoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(143, 143, 143))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
          int telefono = Integer.parseInt(txtTelefono.getText());

        try
        {
            ps = cn.prepareStatement("Execute agregarCliente ?,?,?,?,?,?,?");
            ps.setString(1, txtIdentidadCliente.getText());
            ps.setString(2, txtNombresCliente.getText());
            ps.setString(3, txtApellidosCliente.getText());
            ps.setInt(4, telefono);
            ps.setString(5, txtCorreoCliente.getText());
            ps.setString(6, txtDireccionCliente.getText());
            ps.setString(7, cmbEstadoCliente.getSelectedItem().toString());
            
            JOptionPane.showMessageDialog(null, "Se agregó correctamente");
                    
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Se produjo un error al agregar" + ex);
        }
        finally{
            
            txtIdentidadCliente.setText(null);
            txtNombresCliente.setText(null);
            txtApellidosCliente.setText(null);
            txtTelefono.setText(null);
            txtCorreoCliente.setText(null);
            txtDireccionCliente.setText(null);
            cmbEstadoCliente.setSelectedItem(null);
        
        }
        
        if(!txtNombresCliente.getText().isBlank() && !txtApellidosCliente.getText().isBlank() && !txtTelefono.getText().isBlank() && !txtCorreoCliente.getText().isBlank() && !txtDireccionCliente.getText().isBlank())
        {
            
            if(validar.isLetras(txtNombresCliente.getText()) && validar.isLetras(txtApellidosCliente.getText()) && validar.isLetras(txtDireccionCliente.getText()))
            {
                if(txtTelefono.getText().length() == 8)
                {
                    
                    JOptionPane.showMessageDialog(this, "Se Ingresó correctamente");
                }
            }
            else
            {
                JOptionPane.showConfirmDialog(this, "Error al Ingresar el Cliente");
            }
            
        }       
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        
                  int telefono = Integer.parseInt(txtTelefono.getText());

        try
        {
            ps = cn.prepareStatement("Execute ModificarCliente ?,?,?,?,?,?,?");
            ps.setString(1, txtIdentidadCliente.getText());
            ps.setString(2, txtNombresCliente.getText());
            ps.setString(3, txtApellidosCliente.getText());
            ps.setInt(4, telefono);
            ps.setString(5, txtCorreoCliente.getText());
            ps.setString(6, txtDireccionCliente.getText());
            ps.setString(7, cmbEstadoCliente.getSelectedItem().toString());
            
            JOptionPane.showMessageDialog(null, "Se modificó correctamente");
                    
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Se produjo un error al modificar" + ex);
        }
        finally{
            
            txtIdentidadCliente.setText(null);
            txtNombresCliente.setText(null);
            txtApellidosCliente.setText(null);
            txtTelefono.setText(null);
            txtCorreoCliente.setText(null);
            txtDireccionCliente.setText(null);
            cmbEstadoCliente.setSelectedItem(null);
        
        }
        
        
        
        if(!txtNombresCliente.getText().isBlank() && !txtApellidosCliente.getText().isBlank() && !txtTelefono.getText().isBlank() && !txtCorreoCliente.getText().isBlank() && !txtDireccionCliente.getText().isBlank())
        {
            
            if(validar.isLetras(txtNombresCliente.getText()) && validar.isLetras(txtApellidosCliente.getText()) && validar.isLetras(txtDireccionCliente.getText()))
            {
                if(txtTelefono.getText().length() == 8)
                {
                    JOptionPane.showMessageDialog(this, "Se Modificó correctamente");
                }
            }
            else
            {
                JOptionPane.showConfirmDialog(this, "Error al Modificó el Cliente");
            }
            
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
       
        
    }//GEN-LAST:event_formWindowOpened

    
    
    

    
    
    
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
            java.util.logging.Logger.getLogger(frmCrudClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrudClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrudClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrudClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrudClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbEstadoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidosCliente;
    private javax.swing.JTextField txtCorreoCliente;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtIdentidadCliente;
    private javax.swing.JTextField txtNombresCliente;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
