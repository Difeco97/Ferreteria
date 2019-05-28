/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import CRUD.TablaCargo;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USUARIO
 */
public class CargoForm extends javax.swing.JFrame {

   private DefaultTableModel modelTableCargo;
    
    public CargoForm() {
        
        modelTableCargo = new DefaultTableModel(null, getColumn());    
        initComponents();    
        this.setLocationRelativeTo(null);
        txtId.setEditable(false);
    }
    
    private String[] getColumn(){
        String columnas[] = new String[]{"ID","CÓDIGO","CARGO","SUELDO"};
        return columnas;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        lblCargo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtSueldo = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lblSaldo = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblCargoTitulo = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCargo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(760, 530));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 714, 118, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 111, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 111, -1));

        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("CODIGO");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 111, -1));

        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 100, 40));

        lblCargo.setForeground(new java.awt.Color(0, 0, 0));
        lblCargo.setText("CARGO");
        jPanel1.add(lblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 90, 40));

        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 111, -1));

        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setBorder(null);
        btnActualizar.setBorderPainted(false);
        btnActualizar.setContentAreaFilled(false);
        btnActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 110, 40));

        lblSaldo.setForeground(new java.awt.Color(0, 0, 0));
        lblSaldo.setText("SUELDO");
        jPanel1.add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        btnConsultar.setForeground(new java.awt.Color(0, 0, 0));
        btnConsultar.setText("CONSULTAR");
        btnConsultar.setBorder(null);
        btnConsultar.setBorderPainted(false);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 110, 40));

        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 90, 40));

        lblCargoTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCargoTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblCargoTitulo.setText("CARGO");
        jPanel1.add(lblCargoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        btnMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnMenu.setText("MENU");
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 70, 40));

        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        tblCargo.setForeground(new java.awt.Color(0, 0, 0));
        tblCargo.setModel(modelTableCargo);
        tblCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCargoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCargo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 580, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Valido los campos vacios
        if(txtCodigo.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el codigo");
           txtCodigo.requestFocus();
           return;
        }
        
        if(txtCargo.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el cargo");
           txtCargo.requestFocus();
           return;
        }
        
        if(txtSueldo.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el sueldo");
           txtSueldo.requestFocus();
           return;
        }
        
        //Declaro las variables
        String codigo;
        String cargo;
        int sueldo = 0;
        
        //Asigno los elementos graficos a las variables
        codigo = txtCodigo.getText();
        cargo = txtCargo.getText();
        sueldo = Integer.parseInt(txtSueldo.getText());
        
        //Instancio la clase cargo
        TablaCargo objCargo = new TablaCargo();
        
        boolean resultado = objCargo.insertarCargo(codigo,cargo,sueldo);
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Daoto ingresado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Erro al insertar");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       //Valido los campos vacios
        if(txtCodigo.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el codigo");
           txtCodigo.requestFocus();
           return;
        }
        
        if(txtCargo.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el cargo");
           txtCargo.requestFocus();
           return;
        }
        
        if(txtSueldo.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el sueldo");
           txtSueldo.requestFocus();
           return;
        }
        
        //Declaro las variables
        int id = 0;
        String codigo;
        String cargo;
        int sueldo = 0;
        
        //Asigno los elementos graficos a las variables
        id = Integer.parseInt(txtId.getText());
        codigo = txtCodigo.getText();
        cargo = txtCargo.getText();
        sueldo = Integer.parseInt(txtSueldo.getText());
        
        //Instancio la clase cargo
        TablaCargo objCargo = new TablaCargo();
        
        boolean resultado = objCargo.actualizarCargo(id,codigo,cargo,sueldo);
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Dato Actualizado Correctamenta");
        }else{
            JOptionPane.showMessageDialog(null, "Error al actualizar");
        }
        
        //Limpio los campos
       txtId.setText("");
       txtCodigo.setText("");
       txtCargo.setText("");
       txtSueldo.setText("");                                
        
        // Limpio las filas y las columnas de la tabla
        modelTableCargo.setNumRows(0);  
    }                                             
/*
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {                                             
       modelTableCargo.setNumRows(0);
        
        //Instancio la clase que contiene los metodos
        TablaCargo objCargo = new TablaCargo();
        //Llamo al metodo cargarEmpleado
        ResultSet resultado = objCargo.cargarCargo();
        //Llenos la tabla con los resultado del ResultSet    
        try {
            Object datos[] = new Object[4];
            while(resultado.next()){
                for (int i = 0; i < 4; i++){
                    datos[i] = resultado.getObject(i+1);
                }
                modelTableCargo.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showInternalInputDialog(null, "Error: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed
*/
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
      //Instancio la clase cargo
        TablaCargo objCargo = new TablaCargo();
        
        //Asigno el modelo para el JTable
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCargo.getModel();
        
        //Asigno el indice del elemento seleccionado
        int indice = tblCargo.getSelectedRow();
           
        //Asigno al campo cedula el elemto a eliminar
        //int cedula = Integer.parseInt((String)modeloTabla.getValueAt(indice,0));
        int idCargo = (int) modeloTabla.getValueAt(indice, 0);   
        
        //Elimino el registro de la tabla
        modeloTabla.removeRow(indice);
        
        //Elimino el registro
        boolean resultado = objCargo.eliminarCargo(idCargo);
        
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Dato eliminado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error al elimnar dato ");
        }
        
       //Limpio los campos
       txtId.setText("");
       txtCodigo.setText("");
       txtCargo.setText("");
       txtSueldo.setText("");                                
        
        // Limpio las filas y las columnas de la tabla
        modelTableCargo.setNumRows(0);
          
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Limpio los campos
       txtId.setText("");
       txtCodigo.setText("");
       txtCargo.setText("");
       txtSueldo.setText("");                                
        
        // Limpio las filas y las columnas de la tabla
        modelTableCargo.setNumRows(0);  
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        modelTableCargo.setNumRows(0);
        
        //Instancio la clase que contiene los metodos
        TablaCargo objCargo = new TablaCargo();
        //Llamo al metodo cargarEmpleado
        ResultSet resultado = objCargo.cargarCargo();
        //Llenos la tabla con los resultado del ResultSet    
        try {
            Object datos[] = new Object[4];
            while(resultado.next()){
                for (int i = 0; i < 4; i++){
                    datos[i] = resultado.getObject(i+1);
                }
                modelTableCargo.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showInternalInputDialog(null, "Error: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void tblCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCargoMouseClicked
        //Defino el modelo para el JTable
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCargo.getModel();

        //Asigno los elementos seleccionados de la tabla a los respectivos campos del formulario
        txtId.setText(modeloTabla.getValueAt(tblCargo.getSelectedRow(), 0).toString()); 
        txtCodigo.setText((String) modeloTabla.getValueAt(tblCargo.getSelectedRow(), 1));
        txtCargo.setText((String) modeloTabla.getValueAt(tblCargo.getSelectedRow(), 2));
        txtSueldo.setText(modeloTabla.getValueAt(tblCargo.getSelectedRow(), 3).toString());     }//GEN-LAST:event_tblCargoMouseClicked

    private void txtCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargoKeyTyped
           char validar=evt.getKeyChar();

        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txtCargoKeyTyped

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
        char validar=evt.getKeyChar();

     if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
    }//GEN-LAST:event_txtSueldoKeyTyped
}
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu objMenu = new Menu();
        objMenu.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(CargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargoForm().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCargoTitulo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTable tblCargo;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
