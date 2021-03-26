package formularioBase;

import Clases.BuquesyViajesDisponibles.ClsBuques;
import Clases.ClsValidaciones;
import Clases.dbConnection;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCrudBuques extends javax.swing.JFrame {

    public frmCrudBuques() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNumCamarotes = new javax.swing.JTextField();
        txtNumNIveles = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombreBuque = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBuques = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCodBuque = new javax.swing.JTextField();

        jLabel1.setBackground(new java.awt.Color(255, 204, 51));
        jLabel1.setFont(new java.awt.Font("Balsamiq Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Viajes disponibles");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));

        txtNumCamarotes.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N

        txtNumNIveles.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Avenir LT Std 45 Book", 1, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 51));
        jLabel6.setText("BUQUES");

        jLabel7.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Número de niveles:");

        jLabel8.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Número de camarotes:");

        btnActualizar.setBackground(new java.awt.Color(255, 204, 51));
        btnActualizar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre de buque:");

        txtNombreBuque.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N

        jtBuques.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo buque", "Nombre buque", "N. Camarotes", "N. De Niveles", "Estado"
            }
        ));
        jtBuques.setEnabled(false);
        jtBuques.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBuquesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtBuques);

        btnEliminar.setBackground(new java.awt.Color(255, 204, 51));
        btnEliminar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo buque:");

        txtCodBuque.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        txtCodBuque.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(733, 733, 733))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNumNIveles, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumCamarotes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCodBuque, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 674, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtCodBuque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtNombreBuque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel8))
                            .addComponent(txtNumCamarotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txtNumNIveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(248, 248, 248))
        );

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

    PreparedStatement pps = null;
    ResultSet rs;
    Statement st;
    ResultSetMetaData rsmd;
    DefaultTableModel model;
    
    ClsValidaciones Validar = new ClsValidaciones();
    ClsBuques buques = new ClsBuques();
    
    
    private void limpiar() {
        txtCodBuque.setText(null);
        txtNombreBuque.setText(null);
        txtNumCamarotes.setText(null);
        txtNumNIveles.setText(null);
    }
    
    private void LlenarJtable(){
  
        model = (DefaultTableModel) jtBuques.getModel();
        model.setRowCount(0);
        
        try
        {
            pps = dbConnection.dbConexion().prepareStatement("SELECT * FROM [dbo].[buques]");
            rs = pps.executeQuery();
            rsmd = rs.getMetaData();
            
            int col = rsmd.getColumnCount();
            
            while(rs.next())
            {
                Object fil[] = new Object[col];
                for(int i = 0; i<col; i++)
                {
                    fil[i] = rs.getObject(i + 1);
                }
                model.addRow(fil);
                
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos en la tabla"+ex);
        }

    }
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
             
        
        if (!txtNombreBuque.getText().isBlank() && !txtNumCamarotes.getText().isBlank() && !txtNumNIveles.getText().isBlank()) {
            
            if (Validar.isLetras(txtNombreBuque.getText()) && Validar.isEntero(txtNumCamarotes.getText()) && Validar.isEntero(txtNumNIveles.getText())) {
                
                buques.setCodigoBuque(Integer.parseInt(txtCodBuque.getText()));
                buques.setNombreBuque(txtNombreBuque.getText());
                buques.setNumCamarotes(Integer.parseInt(txtNumCamarotes.getText()));
                buques.setNumNivel(Integer.parseInt(txtNumNIveles.getText()));
                
                buques.ActualizarBuque();
                
                JOptionPane.showMessageDialog(this, "Buque actualizado correctamente");
                
                LlenarJtable();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese correctamente los datos solicitados");
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese los datos solicitados");
            limpiar();
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    
        if (!txtNombreBuque.getText().isBlank() && !txtNumCamarotes.getText().isBlank() && !txtNumNIveles.getText().isBlank()) {
            
            if (Validar.isLetras(txtNombreBuque.getText()) && Validar.isEntero(txtNumCamarotes.getText()) && Validar.isEntero(txtNumNIveles.getText())) {
                
                buques.setNombreBuque(txtNombreBuque.getText());
                buques.setNumCamarotes(Integer.parseInt(txtNumCamarotes.getText()));
                buques.setNumNivel(Integer.parseInt(txtNumNIveles.getText()));
                buques.setEstado("Activo");
                buques.RegistrarBuque();
                
                JOptionPane.showMessageDialog(this, "Buque agregado correctamente");
                
                LlenarJtable();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese correctamente los datos solicitados");
                limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese los datos solicitados");
            limpiar();
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
        LlenarJtable();
        
    }//GEN-LAST:event_formWindowOpened

       
    private boolean VerificarBuque() {
        int resultado = 0;
        
        try {
            pps = dbConnection.dbConexion().prepareStatement("SELECT [estado] FROM [dbo].[buques] WHERE [nombreBuque] = ?");
            pps.setString(1, txtNombreBuque.getText());

            rs = pps.executeQuery();

            if (rs.next()) {
                
                buques.setEstadoIn(rs.getString("estado").trim());
                return true;
                
            } else {
                JOptionPane.showMessageDialog(null, "Buque no encontrado");
                return false;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar buque"+ex);
            return false;
        }
    }
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
        VerificarBuque();
        
        if(buques.verificarEstadoIn()){
            
            buques.setEstado("Inactivo");
            buques.setNombreBuque(txtNombreBuque.getText());
            buques.EliminarBuque();
           
            JOptionPane.showMessageDialog(this, "Buque eliminado");
            LlenarJtable();
            limpiar();
            
        }else{
  
            JOptionPane.showMessageDialog(this, "Ya se encuentra eliminado");
            limpiar();
            
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jtBuquesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBuquesMouseClicked
        
        int seleccionar = jtBuques.rowAtPoint(evt.getPoint());
        
        txtCodBuque.setText(String.valueOf(jtBuques.getValueAt(seleccionar, 0)));
        txtNombreBuque.setText(String.valueOf(jtBuques.getValueAt(seleccionar, 1)));
        txtNumCamarotes.setText(String.valueOf(jtBuques.getValueAt(seleccionar, 2)));
        txtNumNIveles.setText(String.valueOf(jtBuques.getValueAt(seleccionar, 3)));
        
    }//GEN-LAST:event_jtBuquesMouseClicked

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
            java.util.logging.Logger.getLogger(frmCrudBuques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrudBuques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrudBuques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrudBuques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrudBuques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtBuques;
    private javax.swing.JTextField txtCodBuque;
    private javax.swing.JTextField txtNombreBuque;
    private javax.swing.JTextField txtNumCamarotes;
    private javax.swing.JTextField txtNumNIveles;
    // End of variables declaration//GEN-END:variables
}
