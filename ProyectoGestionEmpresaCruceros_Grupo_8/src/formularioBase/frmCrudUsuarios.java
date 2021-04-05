/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioBase;

import Clases.Personas.clsUsuarios;
import Clases.Personas.ClsPersona;
import FormularioIGP.frmIGP;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class frmCrudUsuarios extends javax.swing.JFrame {

    public frmCrudUsuarios() {
        initComponents();
    }

    clsUsuarios Usuario = new clsUsuarios(); 
    ClsPersona Persona = new ClsPersona(); 
    
    Icon icono = new ImageIcon(getClass().getResource("/Resources/Advertencia.png"));
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plSeleccionUsuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAgenteVenta = new javax.swing.JButton();
        btnAdministrador = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 79, 129));
        setUndecorated(true);
        setSize(new java.awt.Dimension(32767, 32767));

        plSeleccionUsuario.setBackground(new java.awt.Color(0, 79, 129));

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("      USUARIOS");

        btnAgenteVenta.setBackground(new java.awt.Color(255, 204, 51));
        btnAgenteVenta.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 24)); // NOI18N
        btnAgenteVenta.setForeground(new java.awt.Color(0, 0, 0));
        btnAgenteVenta.setText("AGENTE DE VENTAS");
        btnAgenteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgenteVentaActionPerformed(evt);
            }
        });

        btnAdministrador.setBackground(new java.awt.Color(255, 204, 51));
        btnAdministrador.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 24)); // NOI18N
        btnAdministrador.setForeground(new java.awt.Color(0, 0, 0));
        btnAdministrador.setText("ADMINISTRADOR");
        btnAdministrador.setPreferredSize(new java.awt.Dimension(192, 32));
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });

        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenuPrincipal.setBorderPainted(false);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plSeleccionUsuarioLayout = new javax.swing.GroupLayout(plSeleccionUsuario);
        plSeleccionUsuario.setLayout(plSeleccionUsuarioLayout);
        plSeleccionUsuarioLayout.setHorizontalGroup(
            plSeleccionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plSeleccionUsuarioLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(btnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 552, Short.MAX_VALUE)
                .addComponent(btnAgenteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plSeleccionUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(plSeleccionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plSeleccionUsuarioLayout.createSequentialGroup()
                        .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plSeleccionUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(786, 786, 786))))
        );
        plSeleccionUsuarioLayout.setVerticalGroup(
            plSeleccionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSeleccionUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241)
                .addGroup(plSeleccionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgenteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(316, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plSeleccionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plSeleccionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
       Usuario.setUsuario("Administrador");
       frmCrudUsuariosAVAD frmUsuarios = new frmCrudUsuariosAVAD();
       frmUsuarios.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnAgenteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgenteVentaActionPerformed
       Usuario.setUsuario("Agente de ventas");
       frmCrudUsuariosAVAD frmUsuarios = new frmCrudUsuariosAVAD();
       frmUsuarios.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnAgenteVentaActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        int result = JOptionPane.showConfirmDialog(null,"<html><b style=\"color:black; font-size:13px;\">Está seguro de volver al Menú Principal?</b></html>" , "Salir del Módulo",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, icono);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmCrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCrudUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCrudUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnAgenteVenta;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel plSeleccionUsuario;
    // End of variables declaration//GEN-END:variables
}
