/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormulariosCrucero;

import javax.swing.JOptionPane;

/**
 *
 * @author OscarM
 */
public class frmSeleccionNivel extends javax.swing.JFrame {

    /**
     * Creates new form frmSeleccionNivel
     */
    public frmSeleccionNivel() {
        initComponents();
    }
    
        clsVariablesViaje variables = new clsVariablesViaje();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBackground = new javax.swing.JLabel();
        btnNivelUno = new javax.swing.JButton();
        btnNivelDos = new javax.swing.JButton();
        btnNivelTres = new javax.swing.JButton();
        btnNivelCuatro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(3287, 1058));
        jPanel1.setLayout(null);

        lblBackground.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/perfilDelCrucero2.png"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(150, 120, 1410, 600);

        btnNivelUno.setBackground(new java.awt.Color(255, 255, 255));
        btnNivelUno.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        btnNivelUno.setText("NIVEL 1");
        btnNivelUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelUnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNivelUno);
        btnNivelUno.setBounds(170, 430, 1260, 39);

        btnNivelDos.setBackground(new java.awt.Color(255, 255, 255));
        btnNivelDos.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        btnNivelDos.setText("NIVEL 2      ");
        btnNivelDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelDosActionPerformed(evt);
            }
        });
        jPanel1.add(btnNivelDos);
        btnNivelDos.setBounds(150, 470, 1340, 39);

        btnNivelTres.setBackground(new java.awt.Color(255, 255, 255));
        btnNivelTres.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        btnNivelTres.setText("NIVEL 3                ");
        btnNivelTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelTresActionPerformed(evt);
            }
        });
        jPanel1.add(btnNivelTres);
        btnNivelTres.setBounds(150, 510, 1400, 40);

        btnNivelCuatro.setBackground(new java.awt.Color(255, 255, 255));
        btnNivelCuatro.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        btnNivelCuatro.setText("           NIVEL 4                        ");
        btnNivelCuatro.setPreferredSize(new java.awt.Dimension(184, 29));
        btnNivelCuatro.setRequestFocusEnabled(false);
        btnNivelCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(btnNivelCuatro);
        btnNivelCuatro.setBounds(150, 550, 1380, 40);

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("SELECCION DE NIVEL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(620, 90, 430, 49);

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
        btnAtras.setBounds(0, 970, 210, 60);

        btnSiguiente.setBackground(new java.awt.Color(255, 204, 51));
        btnSiguiente.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("SIGUIENTE");
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(1430, 970, 210, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1641, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNivelDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelDosActionPerformed
          dispose();
         
        frmVistaCamarotesN3 frmCamarote3 = new frmVistaCamarotesN3();
        variables.setNivelBarco(2);
        frmCamarote3.setVisible(true); 
    }//GEN-LAST:event_btnNivelDosActionPerformed

    private void btnNivelTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelTresActionPerformed
        dispose();
        frmVistaCamarotes frmCamarote2 = new frmVistaCamarotes();
        variables.setNivelBarco(3);
        frmCamarote2.setVisible(true); 
    }//GEN-LAST:event_btnNivelTresActionPerformed

    private void btnNivelCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelCuatroActionPerformed
          dispose();

        frmVistaCamarotesN2 frmCamarote1 = new frmVistaCamarotesN2();
        frmCamarote1.setVisible(true); 
                variables.setNivelBarco(4);
    }//GEN-LAST:event_btnNivelCuatroActionPerformed

    private void btnNivelUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelUnoActionPerformed
        dispose();

        frmVistaCamarotesN4 frmCamarote4 = new frmVistaCamarotesN4();
        frmCamarote4.setVisible(true); 
        variables.setNivelBarco(1);
    }//GEN-LAST:event_btnNivelUnoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        variables.setNivelBarco(0);
        this.dispose();

    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(frmSeleccionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSeleccionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSeleccionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSeleccionNivel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSeleccionNivel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnNivelCuatro;
    private javax.swing.JButton btnNivelDos;
    private javax.swing.JButton btnNivelTres;
    private javax.swing.JButton btnNivelUno;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackground;
    // End of variables declaration//GEN-END:variables
}
