
package FormulariosCrucero;

import Clases.ClsFuncionesDB;
import Clases.ClsValidaciones;
import Clases.clsMessage;
import Clases.dbConnection;
import FormularioIGP.frmIGP;
import formularioBase.frmCrudClientes;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
import java.util.HashSet;
import javax.swing.DefaultListModel;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;


public class frmSeleccionClientes extends javax.swing.JFrame {

    public frmSeleccionClientes() {
        initComponents();
        txtBusqueda.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtBusqueda.getText());
                txtBusqueda.setText(cadena);
                repaint();

                if (validar.isEntero(txtBusqueda.getText())) {
                    txtBusqueda.setForeground(Color.black);
                    filtro(1);
                } else if (validar.isLetras(txtBusqueda.getText())) {
                    txtBusqueda.setForeground(Color.black);
                    filtro(2);
                } else if (txtBusqueda.getText() == null) {
                    txtBusqueda.setForeground(Color.black);
                } else {
                    txtBusqueda.setForeground(Color.red);
                }

            }
        }
        );

    }


    clsVariablesViaje variables = new clsVariablesViaje();
    public int cantidadClientes = 0;
    ListModel modeloLista;
    dbConnection conexion = new dbConnection();
    ClsValidaciones validar = new ClsValidaciones();
    Statement st;
    PreparedStatement ps;
    ResultSetMetaData rsmd;
    clsMessage message = new clsMessage();
    ResultSet result = null;
    String identidadCliente = "";
    String identidadClienteEliminar = "";
    String nombreCliente;
    private TableRowSorter trsfiltro;
    String filtro;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnAgregarCliente = new javax.swing.JButton();
        txtCantidadClientes = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSeleccionados = new javax.swing.JTable();
        btnEliminarCliente = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1920, 1080));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 79, 129));
        jPanel1.setPreferredSize(new java.awt.Dimension(1635, 1035));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/lupaRed.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 170, 50, 40);

        btnAtras.setBackground(new java.awt.Color(255, 204, 51));
        btnAtras.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("REGRESAR");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtras);
        btnAtras.setBounds(0, 1020, 210, 60);

        btnSiguiente.setBackground(new java.awt.Color(255, 204, 51));
        btnSiguiente.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnSiguiente.setForeground(new java.awt.Color(0, 0, 0));
        btnSiguiente.setText("SIGUIENTE");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente);
        btnSiguiente.setBounds(1710, 1020, 210, 60);

        tablaClientes.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIDAD", "NOMBRE COMPLETO", "TELEFONO", "CORREO ELECTRONICO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaClientes);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(110, 230, 1480, 440);

        btnAgregarCliente.setBackground(new java.awt.Color(255, 204, 51));
        btnAgregarCliente.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnAgregarCliente.setText("AGREGAR CLIENTE");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarCliente);
        btnAgregarCliente.setBounds(1640, 230, 220, 130);

        txtCantidadClientes.setEditable(false);
        txtCantidadClientes.setFont(new java.awt.Font("Doppio One", 0, 24)); // NOI18N
        txtCantidadClientes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadClientes.setText("0");
        jPanel1.add(txtCantidadClientes);
        txtCantidadClientes.setBounds(1320, 800, 170, 50);

        jLabel2.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CANTIDAD DE CLIENTES SELECCIONADOS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(1230, 760, 350, 24);

        jLabel3.setFont(new java.awt.Font("Doppio One", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTA DE CLIENTES SELECCIONADOS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 690, 300, 24);

        tablaSeleccionados.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        tablaSeleccionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IDENTIDAD", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSeleccionados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaSeleccionadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaSeleccionados);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(110, 730, 1010, 180);

        btnEliminarCliente.setBackground(new java.awt.Color(255, 153, 51));
        btnEliminarCliente.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnEliminarCliente.setText("ELIMINAR CLIENTE");
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarCliente);
        btnEliminarCliente.setBounds(880, 930, 240, 50);

        btnRegistrarCliente.setBackground(new java.awt.Color(255, 204, 51));
        btnRegistrarCliente.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnRegistrarCliente.setText("REGISTRAR CLIENTE");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarCliente);
        btnRegistrarCliente.setBounds(1640, 590, 220, 70);

        txtBusqueda.setFont(new java.awt.Font("Doppio One", 0, 14)); // NOI18N
        txtBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        jPanel1.add(txtBusqueda);
        txtBusqueda.setBounds(110, 170, 250, 40);

        btnLimpiar.setBackground(new java.awt.Color(255, 204, 51));
        btnLimpiar.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 0, 18)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar);
        btnLimpiar.setBounds(1640, 400, 220, 70);

        btnMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/imgBotonHome (2).png"))); // NOI18N
        btnMenuPrincipal.setBorderPainted(false);
        btnMenuPrincipal.setContentAreaFilled(false);
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenuPrincipal);
        btnMenuPrincipal.setBounds(1843, 2, 75, 70);

        jLabel4.setFont(new java.awt.Font("Avenir LT Std 65 Medium", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 51));
        jLabel4.setText("SELECCION DE CLIENTES");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(730, 60, 510, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        if (Integer.parseInt(txtCantidadClientes.getText()) > 0) {
            variables.setNumeroPersonas(Integer.parseInt(txtCantidadClientes.getText()));

            frmSeleccionViaje seleccionadorViaje = new frmSeleccionViaje();
            seleccionadorViaje.setVisible(true);

            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> DEBE SELECCIONAR AL MENOS UN CLIENTE!</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icono);

        }

    }//GEN-LAST:event_btnSiguienteActionPerformed

    
    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
            frmIGP igp = new frmIGP();
        igp.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        tablaClientes.getTableHeader().setReorderingAllowed(false);
        tablaClientes.getTableHeader().setForeground(Color.BLACK);
        tablaClientes.getTableHeader().setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
       
        tablaSeleccionados.getTableHeader().setReorderingAllowed(false);
        tablaSeleccionados.getTableHeader().setForeground(Color.BLACK);
        tablaSeleccionados.getTableHeader().setFont(new Font("Microsoft YaHei UI", Font.BOLD, 14));
        tablaClientes.setRowHeight(30);
        tablaSeleccionados.setRowHeight(30);
                
        if(variables.getCodigoOperacion() == 1){
            cargarDatos();
        }
        else if(variables.getCodigoOperacion() == 2){
                tablaClientes.setModel(variables.model);
                tablaSeleccionados.setModel(variables.model1);
                cantidadClientes = variables.getNumeroPersonas();
                txtCantidadClientes.setText("" + variables.getNumeroPersonas());
        }
    }//GEN-LAST:event_formWindowOpened

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        int row = tablaClientes.rowAtPoint(evt.getPoint());
        int col = tablaClientes.columnAtPoint(evt.getPoint());
        identidadCliente = null;
        identidadCliente = tablaClientes.getValueAt(row, 0).toString();
        nombreCliente = tablaClientes.getValueAt(row, 1).toString();

    }//GEN-LAST:event_tablaClientesMouseClicked

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed

        if (identidadCliente != "") {
            agregarTablaPequenia();
            eliminarTablaGrande(identidadCliente);
            identidadCliente = "";
            nombreCliente = "";
            cantidadClientes += 1;
            txtCantidadClientes.setText(""+cantidadClientes);
        } else {
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> SELECCIONE UN CLIENTE</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icono);
        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void tablaSeleccionadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaSeleccionadosMouseClicked
         int row = tablaSeleccionados.rowAtPoint(evt.getPoint());
        int col = tablaSeleccionados.columnAtPoint(evt.getPoint());

        identidadClienteEliminar = tablaSeleccionados.getValueAt(row, 0).toString();
        nombreCliente = tablaSeleccionados.getValueAt(row, 1).toString();

    }//GEN-LAST:event_tablaSeleccionadosMouseClicked

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        if (identidadClienteEliminar != "") {
            cargarDatosEspecificos(identidadClienteEliminar);
            eliminarTablaPequenia(identidadClienteEliminar);
            cantidadClientes -= 1;
            txtCantidadClientes.setText("" + cantidadClientes);
        }else{
            JOptionPane.showMessageDialog(null,"<html><b style=\"color:black; font-size:13px;\"> SELECCIONE UN CLIENTE</b></html>", "",JOptionPane.INFORMATION_MESSAGE, message.icono);        
        }

    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
       dispose();
       variables.resetVariables();
      new frmCrudClientes().setVisible(true);
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        trsfiltro = new TableRowSorter(tablaClientes.getModel());
        tablaClientes.setRowSorter(trsfiltro);
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cargarDatos();
        variables.model1 = (DefaultTableModel) tablaSeleccionados.getModel();
        variables.model1.setRowCount(0);
        
        txtCantidadClientes.setText("0");
        cantidadClientes = 0;
        variables.setNumeroPersonas(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
       
        int result = JOptionPane.showConfirmDialog(null, "<html><b style=\"color:black; font-size:13px;\">Esta seguro de volver al Menú Principal?</b></html>", "Salir del Módulo",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, message.icono);
        if (result == JOptionPane.YES_OPTION) {
            dispose();
            variables.resetVariables();
            frmIGP igp = new frmIGP();
            igp.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed


    public void filtro(int operacion) {
        filtro = txtBusqueda.getText();

        if (operacion == 1) {
            trsfiltro.setRowFilter(RowFilter.regexFilter(txtBusqueda.getText(), 0));
        } else if (operacion == 2) {
            trsfiltro.setRowFilter(RowFilter.regexFilter(txtBusqueda.getText(), 1));

        }

    }
    
    private void eliminarTablaGrande(String identidadEliminar) {
        variables.model = (DefaultTableModel) tablaClientes.getModel();

        for (int i = 0; i < variables.model.getRowCount(); i++) {
            String identidadComparar;
            identidadComparar = variables.model.getValueAt(i, 0).toString();

            if (identidadEliminar.equals(identidadComparar)) {

                variables.model.removeRow(i);
                break;
            }
        }
    }

    private void agregarTablaPequenia() {
        variables.model1 = (DefaultTableModel) tablaSeleccionados.getModel();
        variables.model1.addRow(new Object[]{identidadCliente, nombreCliente});
    }

    private void eliminarTablaPequenia(String identidadEliminarPequenio) {

        variables.model1 = (DefaultTableModel) tablaSeleccionados.getModel();

        for (int i = 0; i < variables.model1.getRowCount(); i++) {
            String identidadComparar;
            identidadComparar = variables.model1.getValueAt(i, 0).toString();

            if (identidadEliminarPequenio.equals(identidadComparar)) {
                variables.model1.removeRow(i);
                identidadClienteEliminar = "";
                break;
            }
        }
    }

    private void cargarDatos() {
        conexion = new ClsFuncionesDB();
        conexion.llenarJTable(tablaClientes, "select identidadCliente, CONCAT(nombres, ' ', apellidos), telefono, correoElectronico from clientes WHERE estado = 'Activo'");
        conexion = new dbConnection();
    }

    private void cargarDatosEspecificos(String identidad) {
        variables.model = (DefaultTableModel) tablaClientes.getModel();
        try {
            ps = conexion.dbConexion().prepareStatement("select identidadCliente, CONCAT(nombres, ' ', apellidos), telefono, correoElectronico from clientes WHERE identidadCliente = '" + identidad + "'");

            ResultSet result = ps.executeQuery();
            rsmd = result.getMetaData();

            int columna = rsmd.getColumnCount();

            while (result.next()) {
                Object fil[] = new Object[columna];
                for (int i = 0; i < columna; i++) {
                    fil[i] = result.getObject(i + 1);
                }
                variables.model.addRow(fil);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos en la tabla " + ex, "",JOptionPane.INFORMATION_MESSAGE, message.icon);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaSeleccionados;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCantidadClientes;
    // End of variables declaration//GEN-END:variables
}
