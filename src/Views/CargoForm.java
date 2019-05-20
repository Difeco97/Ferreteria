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
        txtId.setEditable(false);
    }
    
    private String[] getColumn(){
        String columnas[] = new String[]{"ID","CÓDIGO","CARGO","SUELDO"};
        return columnas;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        lblCargoTitulo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCargo = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        lblSaldo = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblCargoTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCargoTitulo.setText("CARGO");

        lblId.setText("ID");

        tblCargo.setModel(modelTableCargo);
        tblCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCargoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCargo);

        lblCodigo.setText("CODIGO");

        txtCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargoKeyTyped(evt);
            }
        });

        lblCargo.setText("CARGO");

        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });

        lblSaldo.setText("SUELDO");

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnMenu.setText("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(664, 664, 664)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnActualizar)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMenu)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEliminar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnConsultar)
                                        .addGap(31, 31, 31)
                                        .addComponent(btnLimpiar)))))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblId)
                                        .addGap(83, 83, 83)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblCodigo)
                                        .addGap(53, 53, 53)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCargo)
                                        .addGap(53, 53, 53)
                                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSaldo)
                                        .addGap(50, 50, 50)
                                        .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(lblCargoTitulo)))
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCargoTitulo)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSaldo))))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnConsultar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnMenu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

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
