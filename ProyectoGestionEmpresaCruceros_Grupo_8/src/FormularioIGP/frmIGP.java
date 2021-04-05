/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormularioIGP;

import FormularioCRUDcamarote.frmCRUDCamarote;
import Formularios.InicioSesion.frmInicioSesion;
import FormulariosCrucero.frmSeleccionClientes;
import formularioBase.frmCrudBuques;
import formularioBase.frmCrudClientes;
import formularioBase.frmCrudDestinosTuristicos;
import formularioBase.frmCrudPuertosDeSalida;
import formularioBase.frmCrudUsuarios;
import formularioBase.frmCrudViajesDisponibles;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class frmIGP extends javax.swing.JFrame {

  
    public frmIGP() {
        initComponents();
    }

    //  1 : Adminitrador
    //  2 : Agente de venta
    private int codigoAcceso = frmInicioSesion.tipoInicio;
    Icon icono = new ImageIcon(getClass().getResource("/Resources/Advertencia.png")); 
    Icon icon = new ImageIcon(getClass().getResource("/Resources/Error.png"));
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panEncabezado = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        panMenu = new javax.swing.JPanel();
        lblBotones = new javax.swing.JLabel();
        btnViajesDisponibles = new javax.swing.JButton();
        btnDestinosTuristicos = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        panSubMenu = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        btnBuques = new javax.swing.JButton();
        btnCamarotes = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnPuertos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panEncabezado.setBackground(new java.awt.Color(13, 54, 118));

        btnCerrar.setBackground(new java.awt.Color(13, 54, 118));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exitButton45.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnMinimizar1.setBackground(new java.awt.Color(13, 54, 118));
        btnMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minimize40.png"))); // NOI18N
        btnMinimizar1.setBorder(null);
        btnMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEncabezadoLayout = new javax.swing.GroupLayout(panEncabezado);
        panEncabezado.setLayout(panEncabezadoLayout);
        panEncabezadoLayout.setHorizontalGroup(
            panEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEncabezadoLayout.createSequentialGroup()
                .addContainerGap(1826, Short.MAX_VALUE)
                .addComponent(btnMinimizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        panEncabezadoLayout.setVerticalGroup(
            panEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEncabezadoLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addGroup(panEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinimizar1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        panMenu.setBackground(new java.awt.Color(0, 79, 129));
        panMenu.setForeground(new java.awt.Color(0, 114, 187));
        panMenu.setPreferredSize(new java.awt.Dimension(1635, 1035));
        panMenu.setLayout(null);

        lblBotones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Crucero.png"))); // NOI18N
        panMenu.add(lblBotones);
        lblBotones.setBounds(0, 240, 1630, 460);

        btnViajesDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        btnViajesDisponibles.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        btnViajesDisponibles.setForeground(new java.awt.Color(0, 0, 0));
        btnViajesDisponibles.setText("VIAJES DISPONIBLES");
        btnViajesDisponibles.setBorder(null);
        btnViajesDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajesDisponiblesActionPerformed(evt);
            }
        });
        panMenu.add(btnViajesDisponibles);
        btnViajesDisponibles.setBounds(30, 410, 1570, 80);

        btnDestinosTuristicos.setBackground(new java.awt.Color(255, 255, 255));
        btnDestinosTuristicos.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        btnDestinosTuristicos.setForeground(new java.awt.Color(0, 0, 0));
        btnDestinosTuristicos.setText("DESTINOS TURISTICOS");
        btnDestinosTuristicos.setBorder(null);
        btnDestinosTuristicos.setPreferredSize(new java.awt.Dimension(249, 30));
        btnDestinosTuristicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinosTuristicosActionPerformed(evt);
            }
        });
        panMenu.add(btnDestinosTuristicos);
        btnDestinosTuristicos.setBounds(30, 500, 1590, 80);

        btnFactura.setBackground(new java.awt.Color(255, 255, 255));
        btnFactura.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(0, 0, 0));
        btnFactura.setText("SELECCION VIAJE");
        btnFactura.setBorder(null);
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        panMenu.add(btnFactura);
        btnFactura.setBounds(30, 590, 1600, 80);

        panSubMenu.setBackground(new java.awt.Color(13, 54, 118));
        panSubMenu.setPreferredSize(new java.awt.Dimension(255, 0));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Logo BonVoyage Peq 250.png"))); // NOI18N

        btnClientes.setBackground(new java.awt.Color(241, 209, 90));
        btnClientes.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(0, 0, 0));
        btnClientes.setText("CLIENTES");
        btnClientes.setBorder(null);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnFacturas.setBackground(new java.awt.Color(241, 209, 90));
        btnFacturas.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        btnFacturas.setForeground(new java.awt.Color(0, 0, 0));
        btnFacturas.setText("FACTURAS");
        btnFacturas.setBorder(null);
        btnFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturasActionPerformed(evt);
            }
        });

        btnBuques.setBackground(new java.awt.Color(241, 209, 90));
        btnBuques.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        btnBuques.setForeground(new java.awt.Color(0, 0, 0));
        btnBuques.setText("BUQUES");
        btnBuques.setBorder(null);
        btnBuques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuquesActionPerformed(evt);
            }
        });

        btnCamarotes.setBackground(new java.awt.Color(241, 209, 90));
        btnCamarotes.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        btnCamarotes.setForeground(new java.awt.Color(0, 0, 0));
        btnCamarotes.setText("CAMAROTES");
        btnCamarotes.setBorder(null);
        btnCamarotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamarotesActionPerformed(evt);
            }
        });

        btnUsuario.setBackground(new java.awt.Color(241, 209, 90));
        btnUsuario.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuario.setText("USUARIOS");
        btnUsuario.setBorder(null);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(13, 54, 118));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cerrarS (1).png"))); // NOI18N
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setContentAreaFilled(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        btnPuertos.setBackground(new java.awt.Color(241, 209, 90));
        btnPuertos.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 24)); // NOI18N
        btnPuertos.setForeground(new java.awt.Color(0, 0, 0));
        btnPuertos.setText("PUERTOS SALIDA");
        btnPuertos.setBorder(null);
        btnPuertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuertosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSubMenuLayout = new javax.swing.GroupLayout(panSubMenu);
        panSubMenu.setLayout(panSubMenuLayout);
        panSubMenuLayout.setHorizontalGroup(
            panSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBuques, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCamarotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panSubMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panSubMenuLayout.createSequentialGroup()
                        .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(btnPuertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panSubMenuLayout.setVerticalGroup(
            panSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSubMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnBuques, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnCamarotes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnPuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(panSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(panMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1660, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(panEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1085, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(panSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 1040, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        frmSeleccionClientes factura = new frmSeleccionClientes();
        factura.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFacturaActionPerformed
  
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        int result = JOptionPane.showConfirmDialog(null,"<html><b style=\"color:black; font-size:13px;\">Está seguro que desea Salir?</b></html>" , "Salir del Programa",
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE, icono);
        if (result == JOptionPane.YES_OPTION) {

            dispose();   
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizar1ActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1ActionPerformed

    private void btnCamarotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamarotesActionPerformed
        frmCRUDCamarote crudCamarote = new frmCRUDCamarote();
        crudCamarote.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCamarotesActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
       frmCrudClientes crudClientes = new frmCrudClientes();
       crudClientes.setVisible(true);
       dispose();
     
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnBuquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuquesActionPerformed
       frmCrudBuques crudBuques = new frmCrudBuques();
       crudBuques.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBuquesActionPerformed

    private void btnFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturasActionPerformed
       new frmVerFacturas().setVisible(true);
       dispose();
    }//GEN-LAST:event_btnFacturasActionPerformed

    private void btnViajesDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajesDisponiblesActionPerformed
       frmCrudViajesDisponibles crudViajesDisponibles = new frmCrudViajesDisponibles();
       crudViajesDisponibles.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnViajesDisponiblesActionPerformed

    private void btnDestinosTuristicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinosTuristicosActionPerformed
       frmCrudDestinosTuristicos crudDestinosTuristicos = new frmCrudDestinosTuristicos();
       crudDestinosTuristicos.setVisible(true);
       dispose(); 
    }//GEN-LAST:event_btnDestinosTuristicosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            if (codigoAcceso == 1) {
                btnUsuario.setEnabled(true);
                btnClientes.setEnabled(true);
                btnBuques.setEnabled(true);
                btnCamarotes.setEnabled(true);
                btnFacturas.setEnabled(true);
                btnViajesDisponibles.setEnabled(true);
                btnDestinosTuristicos.setEnabled(true);
                btnFactura.setEnabled(true);
            } 
            else if (codigoAcceso == 2) {
                btnUsuario.setEnabled(false);
                btnClientes.setEnabled(true);
                btnBuques.setEnabled(false);
                btnCamarotes.setEnabled(false);
                btnFacturas.setEnabled(false);
                btnViajesDisponibles.setEnabled(false);
                btnDestinosTuristicos.setEnabled(false);
                btnFactura.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
       frmCrudUsuarios crudUsuarios = new frmCrudUsuarios();
       crudUsuarios.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "<html><b style=\"color:black; font-size:13px;\">Está seguro que desea Cerrar Sesión?</b></html>", "Cerrar Sesión",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, icono);
        if (result == JOptionPane.YES_OPTION) {
            frmInicioSesion inicioSesion = new frmInicioSesion();
            inicioSesion.setVisible(true);
            dispose();
        }

     
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnPuertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuertosActionPerformed
        new frmCrudPuertosDeSalida().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPuertosActionPerformed

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
            java.util.logging.Logger.getLogger(frmIGP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIGP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIGP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIGP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIGP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuques;
    private javax.swing.JButton btnCamarotes;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnDestinosTuristicos;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JButton btnPuertos;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnViajesDisponibles;
    private javax.swing.JLabel lblBotones;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panEncabezado;
    private javax.swing.JPanel panMenu;
    private javax.swing.JPanel panSubMenu;
    // End of variables declaration//GEN-END:variables
}
