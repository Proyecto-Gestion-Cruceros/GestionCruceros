/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormulariosCrucero;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(3287, 1058));
        jPanel1.setLayout(null);

        lblBackground.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/perfilDelCrucero.png"))); // NOI18N
        jPanel1.add(lblBackground);
        lblBackground.setBounds(30, 140, 1880, 600);

        btnNivelUno.setBackground(new java.awt.Color(255, 255, 255));
        btnNivelUno.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        btnNivelUno.setText("NIVEL 1");
        jPanel1.add(btnNivelUno);
        btnNivelUno.setBounds(120, 450, 1520, 50);

        btnNivelDos.setBackground(new java.awt.Color(255, 255, 255));
        btnNivelDos.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        btnNivelDos.setText("NIVEL 2");
        btnNivelDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelDosActionPerformed(evt);
            }
        });
        jPanel1.add(btnNivelDos);
        btnNivelDos.setBounds(50, 501, 1660, 50);

        btnNivelTres.setBackground(new java.awt.Color(255, 255, 255));
        btnNivelTres.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        btnNivelTres.setText("NIVEL 3");
        btnNivelTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelTresActionPerformed(evt);
            }
        });
        jPanel1.add(btnNivelTres);
        btnNivelTres.setBounds(30, 552, 1700, 40);

        btnNivelCuatro.setBackground(new java.awt.Color(255, 255, 255));
        btnNivelCuatro.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        btnNivelCuatro.setText("NIVEL 4                        ");
        btnNivelCuatro.setPreferredSize(new java.awt.Dimension(184, 29));
        btnNivelCuatro.setRequestFocusEnabled(false);
        btnNivelCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNivelCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(btnNivelCuatro);
        btnNivelCuatro.setBounds(30, 594, 1840, 70);

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("SELECCION DE NIVEL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(770, 80, 430, 49);

        btnAtras.setBackground(new java.awt.Color(255, 204, 51));
        btnAtras.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("ATRAS");
        jPanel1.add(btnAtras);
        btnAtras.setBounds(0, 990, 210, 60);

        btnSiguiente.setBackground(new java.awt.Color(255, 204, 51));
        btnSiguiente.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("SIGUIENTE");
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(1700, 990, 210, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNivelDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelDosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNivelDosActionPerformed

    private void btnNivelTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNivelTresActionPerformed

    private void btnNivelCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNivelCuatroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNivelCuatroActionPerformed

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
