package Formularios.InicioSesion;

import Clases.ClsValidaciones;
import Clases.clsMessage;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import javax.swing.JOptionPane;

public class frmInicioSesion extends javax.swing.JFrame {

    public frmInicioSesion() {
        initComponents();
    }

    ClsInicioSesion clase = new ClsInicioSesion();
    ClsValidaciones v = new ClsValidaciones();
    public static String identidadEmpleado;
    public static int tipoInicio;
    
    clsMessage message = new clsMessage(); 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtContra = new javax.swing.JPasswordField();
        chkMostrarContra = new javax.swing.JCheckBox();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INICIO DE SESIÓN");
        setName("frmInicioLogin"); // NOI18N
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BON VOYAGE CRUISE LINE");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(130, 70, 1539, 49);

        jLabel2.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1120, 450, 73, 26);

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1090, 530, 108, 26);

        txtUsuario.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtUsuario.setToolTipText("Ingrese su identidad");
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(1210, 450, 203, 30);

        btnIniciarSesion.setBackground(new java.awt.Color(255, 204, 51));
        btnIniciarSesion.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setText("INICIAR SESIÓN");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion);
        btnIniciarSesion.setBounds(1210, 670, 195, 63);

        jLabel8.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Logo BonVoyage Peq.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(320, 330, 400, 443);

        jLabel9.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 51));
        jLabel9.setText("¡BIENVENIDO!");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(1150, 320, 300, 49);

        jSeparator1.setBackground(new java.awt.Color(255, 204, 51));
        jSeparator1.setForeground(new java.awt.Color(255, 204, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(890, 160, 10, 820);

        txtContra.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N
        txtContra.setToolTipText("Ingrese su contraseña");
        jPanel1.add(txtContra);
        txtContra.setBounds(1210, 530, 200, 30);

        chkMostrarContra.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        chkMostrarContra.setForeground(new java.awt.Color(255, 255, 255));
        chkMostrarContra.setText("Mostrar Contraseña");
        chkMostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarContraActionPerformed(evt);
            }
        });
        jPanel1.add(chkMostrarContra);
        chkMostrarContra.setBounds(1430, 530, 230, 30);

        btnCerrar.setBackground(new java.awt.Color(13, 54, 118));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exitButton45.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar);
        btnCerrar.setBounds(1870, 10, 40, 35);

        btnMinimizar1.setBackground(new java.awt.Color(13, 54, 118));
        btnMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minimize40.png"))); // NOI18N
        btnMinimizar1.setBorder(null);
        btnMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnMinimizar1);
        btnMinimizar1.setBounds(1820, 30, 40, 12);

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


        dbConnection.dbConexion();
    }//GEN-LAST:event_formWindowOpened

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        
        if (!txtUsuario.getText().isBlank() && !txtContra.getPassword().equals("")) {
            if (v.isEntero(txtUsuario.getText()) && txtUsuario.getText().length() == 13) {
                if (clase.verificarInicio(txtUsuario.getText(), txtContra.getPassword())) {
                    tipoInicio = clase.codigoEntra;        
                    identidadEmpleado = txtUsuario.getText();
                    frmIGP IGP = new frmIGP();
                    IGP.setVisible(true);
                    this.dispose();
                } else {      
                    JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> USUARIO O CONTRASEÑA INCORRECTOS</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icon);
                }
            } else {
                JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> VERIFIQUE VALORES</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icono);
            }
        } else {
             JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> INGRESE VALORES</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icono);
        }


    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void chkMostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarContraActionPerformed
        if(chkMostrarContra.isSelected()){
            txtContra.setEchoChar((char)0);
        }else{
            txtContra.setEchoChar('*');
        }
    }//GEN-LAST:event_chkMostrarContraActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        int result = JOptionPane.showConfirmDialog(null,"<html><b style=\"color:black; font-size:13px;\">Está seguro que desea Salir?</b></html>" , "Salir del Programa",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, message.icono);
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JCheckBox chkMostrarContra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
