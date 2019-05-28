/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import CRUD.TablaProvedor;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USUARIO
 */
public class Provedor extends javax.swing.JFrame {

    //Declaro el modelo de la tabla
    private DefaultTableModel modelTableProvedor;
    
    public Provedor() {
        modelTableProvedor = new DefaultTableModel(null, getColumn());
        initComponents();
        this.setLocationRelativeTo(null);
        txtId.setEditable(false);
    }
    
    //Metodo para cargar las columnas de la tabla
    private String[] getColumn(){
        String columnas[] = new String[]{"ID","NIT","NOMBRE","DIRECCION","TELEFONO"};
        return columnas;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        lblNit = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProvedor = new javax.swing.JTable();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 110, 25));

        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 112, 25));

        lblNit.setForeground(new java.awt.Color(0, 0, 0));
        lblNit.setText("NIT");
        jPanel1.add(lblNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 112, 25));
        jPanel1.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 110, 25));

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("NOMBRE");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 112, 25));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 110, 25));

        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("DIRECCION");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 112, 25));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 110, 25));

        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("TELEFONO");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 112, 25));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 110, 25));

        tblProvedor.setModel(modelTableProvedor);
        tblProvedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProvedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProvedor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 75, 410, 327));

        btnConsultar.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setBorder(null);
        btnConsultar.setBorderPainted(false);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 422, 120, 30));

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 422, 110, 30));

        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 422, 130, 30));

        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 422, 110, 30));

        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(572, 422, 100, 30));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PROVEEDOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        btnMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnMenu.setText("MENU");
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 472, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/camion-de-reparto.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
       //Limpio los campos
       txtNit.setText("");
       txtNombre.setText("");
       txtDireccion.setText("");
       txtTelefono.setText("");
       
       // Limpio las filas y las columnas de la tabla
        modelTableProvedor.setNumRows(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
      modelTableProvedor.setNumRows(0);
        
        //Instancio la clase que contiene los metodos
        TablaProvedor objProvedor = new TablaProvedor();
        //Llamo al metodo cargarProvedor
        ResultSet resultado = objProvedor.cargarProvedor();
        //Llenos la tabla con los resultado del ResultSet    
        try {
            Object datos[] = new Object[5];
            while(resultado.next()){
                for (int i = 0; i < 5; i++){
                    datos[i] = resultado.getObject(i+1);
                }
                modelTableProvedor.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showInternalInputDialog(null, "Error: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        TablaProvedor objProvedor = new TablaProvedor();
        
        //Asigno el modelo para el JTable
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProvedor.getModel();
        
        //Asigno el indice del elemento seleccionado
        int indice = tblProvedor.getSelectedRow();
           
        //Asigno al campo cedula el elemto a eliminar
        //int cedula = Integer.parseInt((String)modeloTabla.getValueAt(indice,0));
        int idTablaProvedor = (int) modeloTabla.getValueAt(indice, 0);   
        
        //Elimino el registro de la tabla
        modeloTabla.removeRow(indice);
        
        //Elimino el registro
        boolean resultado = objProvedor.eliminarProvedor(idTablaProvedor);
        
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Dato eliminado correctamente");
        }else{
           JOptionPane.showMessageDialog(null, "Error al elimnar dato");
        }
       
        //Limpio los campos
       txtNit.setText("");
       txtNombre.setText("");
       txtDireccion.setText("");
       txtTelefono.setText("");
              
       // Limpio las filas y las columnas de la tabla
        modelTableProvedor.setNumRows(0);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //Valido Campos Vacíos
       if(txtNit.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el Nit");
           txtNit.requestFocus();
           return;
        }
       
       if(txtNombre.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el nombre");
           txtNombre.requestFocus();
           return;
       }
       
       if(txtDireccion.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar los apellidos");
           txtDireccion.requestFocus();
           return;
       }
       
       if(txtTelefono.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el telefono");
           txtTelefono.requestFocus();
       }
       
        //Instancio la clase
        TablaProvedor objProvedor = new TablaProvedor();        
        
       //Declaro Variables
       String nit;
       int idTablaProvedor;
       String nombre;
       String direccion;
       int telefono;
       
       //Asigno los valores del formulario a las variable
       idTablaProvedor=Integer.parseInt(txtId.getText());
       nit = txtNit.getText();
       nombre = txtNombre.getText();
       direccion = txtDireccion.getText();
       telefono = Integer.parseInt(txtTelefono.getText());
       
       //Ejecuto el metodo actualizarProvedor
        boolean resultado = objProvedor.actualizarProvedor(idTablaProvedor,nit,nombre,direccion,telefono);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Actualizacion Exitosa");
            }else{
                JOptionPane.showInputDialog(null, "Error al Actualizar");
            }
        
       //}
       
       //Limpio los campos
       txtId.setText("");
       txtNit.setText("");
       txtNombre.setText("");
       txtDireccion.setText("");
       txtTelefono.setText("");
              
       // Limpio las filas y las columnas de la tabla
        modelTableProvedor.setNumRows(0);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       //Valido Campos Vacíos
       if(txtNit.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el Nit");
           txtNit.requestFocus();
           return;
        }
       
       if(txtNombre.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el nombre");
           txtNombre.requestFocus();
           return;
       }
       
       if(txtDireccion.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar los apellidos");
           txtDireccion.requestFocus();
           return;
       }
       
       if(txtTelefono.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el telefono");
           txtTelefono.requestFocus();
       }
       
        //Instancio la clase
        TablaProvedor objProvedor = new TablaProvedor();
        
       //Declaro Variables
       String nit;
       String nombre;
       String direccion;
       int telefono;
       
       //Asigno los valores del formulario a las variables
       nit =txtNit.getText();
       nombre = txtNombre.getText();
       direccion = txtDireccion.getText();
       telefono = Integer.parseInt(txtTelefono.getText());
       
       //Ejecuto el metodo insertarEmpleado
        boolean resultado = objProvedor.insertarProvedor(nit,nombre,direccion,telefono);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            }else{
                JOptionPane.showInputDialog(null, "Error al insertar");
            }
        
       //}
       
       //Limpio los campos
       txtNit.setText("");
       txtNombre.setText("");
       txtDireccion.setText("");
       txtTelefono.setText("");
              
       // Limpio las filas y las columnas de la tabla
        modelTableProvedor.setNumRows(0);


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblProvedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProvedorMouseClicked
       //Defino el modelo para el JTable
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProvedor.getModel();

        //Asigno los elementos seleccionados de la tabla a los respectivos campos del formulario
        txtId.setText(modeloTabla.getValueAt(tblProvedor.getSelectedRow(), 0) .toString());
        txtNit.setText((String)modeloTabla.getValueAt(tblProvedor.getSelectedRow(), 1));
        txtNombre.setText((String) modeloTabla.getValueAt(tblProvedor.getSelectedRow(), 2));
        txtDireccion.setText((String) modeloTabla.getValueAt(tblProvedor.getSelectedRow(), 3));
        txtTelefono.setText(modeloTabla.getValueAt(tblProvedor.getSelectedRow(), 4). toString()); 
    }//GEN-LAST:event_tblProvedorMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu objMenu = new Menu();
        objMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char validar=evt.getKeyChar();

        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
            char validar=evt.getKeyChar();

     if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
     }
    }//GEN-LAST:event_txtTelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Provedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Provedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblProvedor;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
