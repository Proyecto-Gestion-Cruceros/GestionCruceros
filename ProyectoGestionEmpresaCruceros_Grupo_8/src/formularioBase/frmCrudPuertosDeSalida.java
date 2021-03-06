package formularioBase;

import Clases.ClsFuncionesDB;
import Clases.ClsValidaciones;
import Clases.PuertosSalida.clsPuertosSalidas;
import Clases.clsMessage;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class frmCrudPuertosDeSalida extends javax.swing.JFrame {

    public frmCrudPuertosDeSalida() {
        initComponents();
    }

    dbConnection conexion = new dbConnection();
    PreparedStatement ps;
    ResultSet rs;
    ResultSetMetaData rsm;
    DefaultTableModel dtm;
    DefaultTableModel temp;

    ClsValidaciones validar = new ClsValidaciones();
    clsPuertosSalidas puerto = new clsPuertosSalidas();

    clsMessage message = new clsMessage();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoPuertoSalida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombrePuertoSalida = new javax.swing.JTextField();
        btnActualizarPuertoSalida = new javax.swing.JButton();
        btnAgregarPuertoSalida = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPuertosSalida = new javax.swing.JTable();
        btnMenuPrincipal = new javax.swing.JButton();
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

        jLabel2.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("PUERTOS DE SALIDA");

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("C??digo de Puerto de Salida");

        txtCodigoPuertoSalida.setEditable(false);
        txtCodigoPuertoSalida.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Doppio One", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre del Puerto");

        txtNombrePuertoSalida.setFont(new java.awt.Font("Doppio One", 0, 16)); // NOI18N

        btnActualizarPuertoSalida.setBackground(new java.awt.Color(255, 204, 51));
        btnActualizarPuertoSalida.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnActualizarPuertoSalida.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizarPuertoSalida.setText("ACTUALIZAR");
        btnActualizarPuertoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarPuertoSalidaActionPerformed(evt);
            }
        });

        btnAgregarPuertoSalida.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregarPuertoSalida.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAgregarPuertoSalida.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregarPuertoSalida.setText("AGREGAR");
        btnAgregarPuertoSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPuertoSalidaActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 51));
        btnEliminar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPuertosSalida.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jPuertosSalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Puerto", "Nombre Puerto", "Estado Puerto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jPuertosSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPuertosSalidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jPuertosSalida);

        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenuPrincipal.setBorderPainted(false);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 341, Short.MAX_VALUE)
                .addComponent(btnAgregarPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(btnActualizarPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(300, 300, 300))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombrePuertoSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoPuertoSalida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(746, 746, 746)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtCodigoPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombrePuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarPuertoSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
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

    private void btnActualizarPuertoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarPuertoSalidaActionPerformed
        if (!txtCodigoPuertoSalida.getText().isBlank()) {
            if (!txtNombrePuertoSalida.getText().isBlank()) {
                if (validar.isLetras(txtNombrePuertoSalida.getText())) {
                    try {
                        puerto.setCodigoPuerto(Integer.parseInt(txtCodigoPuertoSalida.getText()));
                        puerto.setNombrePuerto(txtNombrePuertoSalida.getText());
                        if (puerto.ActualizarPuertoSalida()) {
                            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> PUERTO ACTUALIZADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.Icono);
                            Limpiar();
                            MostrarPuertosSalida();
                        } else {
                            JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL ACTUALIZAR </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.icon);

                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex, "", JOptionPane.INFORMATION_MESSAGE, message.icon);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE EL NOMBRE DEL PUERTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.icon);
                }
            } else {
                JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> NO PUEDE DEJAR EN BLANCO EL NOMBRE DEL PUERTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.icono);
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> DEBE SELECCIONAR UN PUERTO A MODIFICAR </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.icono);
        }
    }//GEN-LAST:event_btnActualizarPuertoSalidaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (!txtCodigoPuertoSalida.getText().isBlank()) {
            int result = JOptionPane.showConfirmDialog(null, "<html><b style=\"color:black; font-size:13px;\">??Est?? seguro de Eliminar Este Puerto?</b></html>", "Salir del M??dulo",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, message.icono);
            if (result == JOptionPane.YES_OPTION) {
                puerto.setCodigoPuerto(Integer.parseInt(txtCodigoPuertoSalida.getText()));
                puerto.EliminarPuertoSalida();
                JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> PUERTO ELIMINADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.Icono);
                Limpiar();
                MostrarPuertosSalida();
            }
        } else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> DEBE SELECCIONAR EL PUERTO A ELIMINAR </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.icono);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarPuertoSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPuertoSalidaActionPerformed
        if (!txtNombrePuertoSalida.getText().isBlank())
            if (validar.isLetras(txtNombrePuertoSalida.getText())) {
                puerto.setNombrePuerto(txtNombrePuertoSalida.getText());
                try {
                    if (puerto.AgregarPuertoSalida()) {
                        JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> PUERTO REGISTRADO CORRECTAMENTE </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.Icono);
                        Limpiar();
                        MostrarPuertosSalida();
                    } else {
                        JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> ERROR AL REGISTRAR </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.icon);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }

            } else {
                JOptionPane.showMessageDialog(this, "<html><b style=\"color:black; font-size:13px;\"> INGRESE CORRECTAMENTE EL NOMBRE DEL PUERTO </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.icon);
            }
        else {
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:black; font-size:13px;\"> INGRESE LOS DATOS NECESARIOS </b></html>", "", JOptionPane.INFORMATION_MESSAGE, message.icono);

        }
    }//GEN-LAST:event_btnAgregarPuertoSalidaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jPuertosSalida.getTableHeader().setReorderingAllowed(false);
        jPuertosSalida.getTableHeader().setForeground(Color.BLACK);
        jPuertosSalida.getTableHeader().setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        MostrarPuertosSalida();
        CodigoNuevoPuerto();
        jPuertosSalida.setRowHeight(30);
    }//GEN-LAST:event_formWindowOpened

    private void jPuertosSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPuertosSalidaMouseClicked
        int seleccionar = jPuertosSalida.rowAtPoint(evt.getPoint());
        txtCodigoPuertoSalida.setText(String.valueOf(jPuertosSalida.getValueAt(seleccionar, 0)));
        txtNombrePuertoSalida.setText(String.valueOf(jPuertosSalida.getValueAt(seleccionar, 1)));
    }//GEN-LAST:event_jPuertosSalidaMouseClicked

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "<html><b style=\"color:black; font-size:13px;\">??Est?? seguro de volver al Men?? Principal?</b></html>", "Salir del M??dulo",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, message.icono);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void limpiaTabla() {
        try {
            temp = (DefaultTableModel) jPuertosSalida.getModel();
            temp.setRowCount(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE, message.icon);
        }
    }

    private void MostrarPuertosSalida() {
        
        conexion = new ClsFuncionesDB();
        conexion.llenarJTable(jPuertosSalida, "SELECT [codigoPuerto], [nombrePuerto], [estado] FROM [agenciaCruceros].[dbo].[puertosSalida]");
        conexion = new dbConnection();
        
    }

    private void CodigoNuevoPuerto() {
        try {
            String obtenerUltimoCodigo;
            int UltimoCodigo;
            ps = dbConnection.dbConexion().prepareStatement("SELECT TOP 1 [codigoPuerto] FROM [agenciaCruceros].[dbo].[puertosSalida] order by [codigoPuerto] desc");
            rs = ps.executeQuery();

            if (rs.next()) {
                obtenerUltimoCodigo = rs.getString("codigoPuerto").trim();
                UltimoCodigo = Integer.parseInt(obtenerUltimoCodigo) + 1;
                txtCodigoPuertoSalida.setText("" + UltimoCodigo);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "", JOptionPane.INFORMATION_MESSAGE, message.icon);
        }

    }

    private void Limpiar() {
        txtCodigoPuertoSalida.setText(null);
        txtNombrePuertoSalida.setText(null);
        CodigoNuevoPuerto();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarPuertoSalida;
    private javax.swing.JButton btnAgregarPuertoSalida;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jPuertosSalida;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoPuertoSalida;
    private javax.swing.JTextField txtNombrePuertoSalida;
    // End of variables declaration//GEN-END:variables
}
