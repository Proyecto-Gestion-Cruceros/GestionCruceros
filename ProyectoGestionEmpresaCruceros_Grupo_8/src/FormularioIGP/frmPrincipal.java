
package FormularioIGP;




public class frmPrincipal extends javax.swing.JFrame {

    public frmPrincipal() {
        initComponents();
        

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMenu = new javax.swing.JPanel();
        lblBotones = new javax.swing.JLabel();
        btnViajesDisponibles = new javax.swing.JButton();
        btnDestinosTuristicos = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        panEncabezado = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        btnMaximizar = new javax.swing.JButton();
        btnMinimizar1 = new javax.swing.JButton();
        panSubMenu = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();
        btnUsuario2 = new javax.swing.JButton();
        btnUsuario3 = new javax.swing.JButton();
        btnUsuario4 = new javax.swing.JButton();
        btnUsuario5 = new javax.swing.JButton();
        btnUsuario1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        panMenu.setBackground(new java.awt.Color(0, 79, 129));
        panMenu.setForeground(new java.awt.Color(0, 114, 187));
        panMenu.setPreferredSize(new java.awt.Dimension(1635, 1035));
        panMenu.setLayout(null);

        lblBotones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/cruceroBotones.png"))); // NOI18N
        panMenu.add(lblBotones);
        lblBotones.setBounds(40, 140, 1550, 640);

        btnViajesDisponibles.setBackground(new java.awt.Color(255, 255, 255));
        btnViajesDisponibles.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 36)); // NOI18N
        btnViajesDisponibles.setForeground(new java.awt.Color(0, 0, 0));
        btnViajesDisponibles.setText("VIAJES DISPONIBLES");
        btnViajesDisponibles.setBorder(null);
        panMenu.add(btnViajesDisponibles);
        btnViajesDisponibles.setBounds(40, 400, 1550, 100);

        btnDestinosTuristicos.setBackground(new java.awt.Color(255, 255, 255));
        btnDestinosTuristicos.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 36)); // NOI18N
        btnDestinosTuristicos.setForeground(new java.awt.Color(0, 0, 0));
        btnDestinosTuristicos.setText("DESTINOS TURISTICOS");
        btnDestinosTuristicos.setBorder(null);
        panMenu.add(btnDestinosTuristicos);
        btnDestinosTuristicos.setBounds(40, 510, 1550, 100);

        btnFactura.setBackground(new java.awt.Color(255, 255, 255));
        btnFactura.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 36)); // NOI18N
        btnFactura.setForeground(new java.awt.Color(0, 0, 0));
        btnFactura.setText("FACTURA ");
        btnFactura.setBorder(null);
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });
        panMenu.add(btnFactura);
        btnFactura.setBounds(40, 620, 1550, 120);

        getContentPane().add(panMenu);
        panMenu.setBounds(260, 50, 1660, 1030);

        panEncabezado.setBackground(new java.awt.Color(13, 54, 118));

        btnCerrar.setBackground(new java.awt.Color(13, 54, 118));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/exitButton45.png"))); // NOI18N
        btnCerrar.setBorder(null);

        btnMaximizar.setBackground(new java.awt.Color(13, 54, 118));
        btnMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/maximize40.png"))); // NOI18N
        btnMaximizar.setBorder(null);
        btnMaximizar.setPreferredSize(new java.awt.Dimension(40, 35));

        btnMinimizar1.setBackground(new java.awt.Color(13, 54, 118));
        btnMinimizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/minimize40.png"))); // NOI18N
        btnMinimizar1.setBorder(null);

        javax.swing.GroupLayout panEncabezadoLayout = new javax.swing.GroupLayout(panEncabezado);
        panEncabezado.setLayout(panEncabezadoLayout);
        panEncabezadoLayout.setHorizontalGroup(
            panEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEncabezadoLayout.createSequentialGroup()
                .addContainerGap(1717, Short.MAX_VALUE)
                .addComponent(btnMinimizar1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMaximizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addGap(41, 41, 41))
        );
        panEncabezadoLayout.setVerticalGroup(
            panEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEncabezadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinimizar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMaximizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(panEncabezado);
        panEncabezado.setBounds(0, 0, 1920, 50);

        panSubMenu.setBackground(new java.awt.Color(13, 54, 118));
        panSubMenu.setPreferredSize(new java.awt.Dimension(255, 0));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Logo BonVoyage Peq 250.png"))); // NOI18N

        btnMenuPrincipal.setBackground(new java.awt.Color(250, 188, 20));
        btnMenuPrincipal.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 20)); // NOI18N
        btnMenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        btnMenuPrincipal.setText("MENU PRINCIPAL");
        btnMenuPrincipal.setBorder(null);

        btnUsuario2.setBackground(new java.awt.Color(241, 209, 90));
        btnUsuario2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 20)); // NOI18N
        btnUsuario2.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuario2.setText("CLIENTES");
        btnUsuario2.setBorder(null);

        btnUsuario3.setBackground(new java.awt.Color(241, 209, 90));
        btnUsuario3.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 20)); // NOI18N
        btnUsuario3.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuario3.setText("PUERTOS SALIDA");
        btnUsuario3.setBorder(null);

        btnUsuario4.setBackground(new java.awt.Color(241, 209, 90));
        btnUsuario4.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 20)); // NOI18N
        btnUsuario4.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuario4.setText("BUQUES");
        btnUsuario4.setBorder(null);

        btnUsuario5.setBackground(new java.awt.Color(241, 209, 90));
        btnUsuario5.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 20)); // NOI18N
        btnUsuario5.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuario5.setText("CAMAROTES");
        btnUsuario5.setBorder(null);

        btnUsuario1.setBackground(new java.awt.Color(241, 209, 90));
        btnUsuario1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 20)); // NOI18N
        btnUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuario1.setText("USUARIOS");
        btnUsuario1.setBorder(null);

        javax.swing.GroupLayout panSubMenuLayout = new javax.swing.GroupLayout(panSubMenu);
        panSubMenu.setLayout(panSubMenuLayout);
        panSubMenuLayout.setHorizontalGroup(
            panSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
            .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panSubMenuLayout.setVerticalGroup(
            panSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSubMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btnUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        getContentPane().add(panSubMenu);
        panSubMenu.setBounds(0, 45, 260, 1040);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     
       
    }//GEN-LAST:event_formWindowOpened

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFacturaActionPerformed


    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnDestinosTuristicos;
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnMaximizar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnMinimizar1;
    private javax.swing.JButton btnUsuario1;
    private javax.swing.JButton btnUsuario2;
    private javax.swing.JButton btnUsuario3;
    private javax.swing.JButton btnUsuario4;
    private javax.swing.JButton btnUsuario5;
    private javax.swing.JButton btnViajesDisponibles;
    private javax.swing.JLabel lblBotones;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panEncabezado;
    private javax.swing.JPanel panMenu;
    private javax.swing.JPanel panSubMenu;
    // End of variables declaration//GEN-END:variables
}
