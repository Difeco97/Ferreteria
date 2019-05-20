/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import CRUD.TablaSucursal;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class Sucursal extends javax.swing.JFrame {

   //Declaro el modelo de la tabla
    private DefaultTableModel modelTableSucursal;
     
    public Sucursal() {
       
        modelTableSucursal = new DefaultTableModel(null, getColumn());       
        initComponents();
        txtId.setEditable(false);
        
    }

    private String[] getColumn(){
        String columnas[] = new String[]{"ID","NIT","NOMBRE","DIRECCION","TELEFONO"};
        return columnas;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMenu = new javax.swing.JButton();
        lblDireccion = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSucursal = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        lblSucursal = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        txtNit = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        lblNit = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setText("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        lblDireccion.setForeground(new java.awt.Color(0, 0, 0));
        lblDireccion.setText("DIRECCION");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 93, 24));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 104, -1));

        lblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        lblTelefono.setText("TELEFONO");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 93, 24));

        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText("ID ");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 93, 24));

        tblSucursal.setModel(modelTableSucursal);
        jScrollPane1.setViewportView(tblSucursal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 104, -1));

        lblSucursal.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblSucursal.setForeground(new java.awt.Color(0, 0, 0));
        lblSucursal.setText("SUCURSAL");
        jPanel1.add(lblSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 280, 30));

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));
        jPanel1.add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 104, -1));

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, -1, -1));

        lblNit.setForeground(new java.awt.Color(0, 0, 0));
        lblNit.setText("NIT");
        jPanel1.add(lblNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 93, 24));

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, -1, -1));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 104, -1));

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("NOMBRE");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 93, 24));

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 104, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Valido los campos
        if(txtNit.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite el campo NIT");
            txtNit.requestFocus();
            return;
        }
        
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite el campo Nombre");
            txtNombre.requestFocus();
            return;
        }
         
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite el campo Direccion");
            txtDireccion.requestFocus();
            return;
        }
        
        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite el campo Telefono");
            txtTelefono.requestFocus();
            return;
        }
        
        //Instanciar la clase sucursal 
        TablaSucursal objSucursal = new TablaSucursal();
        
        //Declaro variables
        String nit;
        String nombre;
        String direccion;
        int telefono;
        boolean resultado;
        
        //Asignar los elementosd gráficos a las variables
        nit = txtNit.getText();
        nombre = txtNombre.getText();
        direccion = txtDireccion.getText();
        telefono = Integer.parseInt(txtTelefono.getText());
        
        resultado = objSucursal.insertarSucursal(nit,nombre,direccion,telefono);
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Registro Exitoso!");
        }else{
            JOptionPane.showMessageDialog(null, "Error al registrar");
        }
        
        //Limpio los campos
        
        txtId.setText("");
        txtNit.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        
         
        //Limpio la tabla
        modelTableSucursal.setNumRows(0);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Instancio la clase sucursal
        TablaSucursal objSucursal = new TablaSucursal();
        
        //Asigno el modelo para el JTable
        DefaultTableModel modeloTabla = (DefaultTableModel) tblSucursal.getModel();
        
        //Asigno a la variable indice el elemento seleccionado
        int indice = tblSucursal.getSelectedRow();
        
        //Asigno al campo nit el elemento a eliminar
        int id = (int) modeloTabla.getValueAt(indice, 0);
        
        //Elimo el registro seleccionado de la tabla
        modeloTabla.removeRow(indice);
        
        
        //Elimino el registro de la BD
        boolean resultado = objSucursal.eliminarSucursal(id);
        
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Registro Eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        }
        
        //Limpio los campos
        txtNit.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
//Valido los campos
        if(txtNit.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite el campo NIT");
            txtNit.requestFocus();
            return;
        }
        
        if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite el campo Nombre");
            txtNombre.requestFocus();
            return;
        }
         
        if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite el campo Direccion");
            txtDireccion.requestFocus();
            return;
        }
        
        if(txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Digite el campo Telefono");
            txtTelefono.requestFocus();
            return;
        }
        
        //Instanciar la clase sucursal 
        TablaSucursal objSucursal = new TablaSucursal();
        
        //Declaro variables
        int id;
        String nit;
        String nombre;
        String direccion;
        int telefono;
        boolean resultado;
        
        //Asignar los elementosd gráficos a las variables
        id = Integer.parseInt(txtId.getText());
        nit = txtNit.getText();
        nombre = txtNombre.getText();
        direccion = txtDireccion.getText();
        telefono = Integer.parseInt(txtTelefono.getText());
        
        resultado = objSucursal.actualizarSucursal(id,nit,nombre,direccion,telefono);
       
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente!");
        }else{
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }
        
        //Limpio los campos
        txtId.setText("");
        txtNit.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
             
        //Limpio la tabla
        modelTableSucursal.setNumRows(0);



    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
     modelTableSucursal.setNumRows(0);
        
        //Instancio la clase que contiene los metodos
        TablaSucursal objSucursal = new TablaSucursal();
        //Llamo al metodo cargar
        ResultSet resultado = objSucursal.cargarSucursal();
        //Llenos la tabla con los resultado del ResultSet    
        try {
            Object datos[] = new Object[5];
            while(resultado.next()){
                for (int i = 0; i < 5; i++){
                    datos[i] = resultado.getObject(i+1);
                }
                modelTableSucursal.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showInternalInputDialog(null, "Error: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Limpio los campos
        txtNit.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        
        //Limpio la tabla
        modelTableSucursal.setNumRows(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sucursal().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNit;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblSucursal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
