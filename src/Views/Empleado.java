
package Views;

import CRUD.TablaEmpleado;
import ModeloComboBox.EstadoCargo;
import ModeloComboBox.EstadoSucur;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Empleado extends javax.swing.JFrame {

        //Se crea la clase global para cargar la tabla
        private DefaultTableModel modelTableEmpleado;
        
        //Se crea la calse global para cargar el ComboBox de la Sucursal
        private DefaultComboBoxModel modelComboSucursal;
        
         //Se crea la calse global para cargar el ComboBox del cargo
        private DefaultComboBoxModel modelComboCargo;
    public Empleado() {
        
        modelTableEmpleado = new DefaultTableModel(null, getColumn());
        modelComboSucursal = new DefaultComboBoxModel(new String [] {});
        modelComboCargo = new DefaultComboBoxModel(new String [] {});
        
         initComponents();
         
         //txtId.setEditable(false);

        //Instancio la clase empleado
        TablaEmpleado objEmpleado = new TablaEmpleado();
       
        //Resulset
        ResultSet estados;      
        
       //Instancio la clase que contiene los metodos
        estados = objEmpleado.consultarEstadoSucursal();
        try {
            //Recorremos el estado generado por la consulta
            while(estados.next()){
            //Recorremos el resultado generado por la consulta
            modelComboSucursal.addElement(new EstadoSucur(estados.getString("nit"), estados.getString("nombre")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no cargados "+e.getMessage());
        }
        
        //ResultSet
         ResultSet estadoCargo;
        //Instancio la clase que contiene los metodos
        estadoCargo = objEmpleado.consultarEstadoCargo();
        try {
            //Recorremos el estado generado por la consulta de cargo
            while(estadoCargo.next()){
            //Recorremos el resultado generado por la consulta
            modelComboCargo.addElement(new EstadoCargo(estadoCargo.getString("codigo"), estadoCargo.getString("nombre")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos no cargados "+e.getMessage());
        }
    }
    
    //Metodo para cargar las columnas de la tabla
    private String[] getColumn(){
        String columnas[] = new String[]{"ID","CEDULA","NOMBRES","APELLIDOS","CARGO","SUCURSAL"};
        return columnas;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtApellidos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        lblSucursal = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lblCedula = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        txtNombres = new javax.swing.JTextField();
        cbmSucursal = new javax.swing.JComboBox<>();
        lblNombre = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 123, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("EMPLEADO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        lblApellidos.setForeground(new java.awt.Color(0, 0, 0));
        lblApellidos.setText("APELLIDOS");
        jPanel1.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        lblCargo.setForeground(new java.awt.Color(0, 0, 0));
        lblCargo.setText("CARGO");
        jPanel1.add(lblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        tblEmpleado.setModel(modelTableEmpleado);
        jScrollPane1.setViewportView(tblEmpleado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 346, 326));

        lblSucursal.setForeground(new java.awt.Color(0, 0, 0));
        lblSucursal.setText("SUCURSAL");
        jPanel1.add(lblSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 120, 30));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 123, -1));

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
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 130, 30));

        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 63, 20));

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
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 430, 110, 30));

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 123, 31));

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
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 430, 130, 30));

        lblCedula.setForeground(new java.awt.Color(0, 0, 0));
        lblCedula.setText("CEDULA");
        jPanel1.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        cmbCargo.setModel(modelComboCargo);
        jPanel1.add(cmbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 123, -1));

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 123, 28));

        cbmSucursal.setModel(modelComboSucursal);
        jPanel1.add(cbmSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 123, -1));

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("NOMBRE");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 57, -1));

        btnMenu.setForeground(new java.awt.Color(0, 0, 0));
        btnMenu.setText("Menu");
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/seguridad.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
       //Valido Campos Vacíos
       if(txtCedula.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar la cedula");
           txtCedula.requestFocus();
           return;
        }
       
       if(txtNombres.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar los nombres");
           txtNombres.requestFocus();
           return;
       }
       
       if(txtApellidos.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar los apellidos");
           txtApellidos.requestFocus();
           return;
       }

       //Creamos un objeto para el estado Sucursal
        EstadoSucur objEstadoSucurNit = (EstadoSucur) cbmSucursal.getSelectedItem();
        //Asignamos el atributo del objeto seleccionado en el combo.
        String estadoNit = objEstadoSucurNit.getNit(); //Ya aquí tenemos el id del estado seleccionado.
        
        //Creamos el objeto para el estado Cargo
        EstadoCargo objEstadoCargoCodigo = (EstadoCargo) cmbCargo.getSelectedItem();
        //Asignamos el atributo del objeto seleccionado en el combo cargo
        String estadoCodigo = objEstadoCargoCodigo.getCodigo();
        
        if(cmbCargo == null){
            JOptionPane.showMessageDialog(null, "Inserte un cargo");
            cmbCargo.requestFocus();        
        }
        
        if(cbmSucursal == null){
            JOptionPane.showMessageDialog(null, "Inserte un cargo");
            cbmSucursal.requestFocus();        
        }
        
        //Instancio la clase
        TablaEmpleado objEmpleado = new TablaEmpleado();
       
       //Declaro Variables
       int cedula;
       String cargo;
       String sucursal;
       String nombres;
       String apellidos;
       
       //Asigno los valores del formulario a las variables
       cedula = Integer.parseInt(txtCedula.getText());
       nombres = txtNombres.getText();
       apellidos = txtApellidos.getText();
             
        boolean resultado = objEmpleado.insertarEmpleado(cedula,nombres,apellidos,estadoCodigo,estadoNit);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            }else{
                JOptionPane.showInputDialog(null, "Error al insertar");
            }
        
       //}
       
          //Limpio los campos
       txtId.setText("");
       txtCedula.setText("");
       txtNombres.setText("");
       txtApellidos.setText("");
       cmbCargo.setSelectedIndex(0);
       cbmSucursal.setSelectedIndex(0);                                        
        
        // Limpio las filas y las columnas de la tabla
        modelTableEmpleado.setNumRows(0);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        modelTableEmpleado.setNumRows(0);
        
        //Instancio la clase que contiene los metodos
        TablaEmpleado objEmpleado = new TablaEmpleado();
        //Llamo al metodo cargarEmpleado
        ResultSet resultado = objEmpleado.cargarEmpleado();
        //Llenos la tabla con los resultado del ResultSet    
        try {
            Object datos[] = new Object[6];
            while(resultado.next()){
                for (int i = 0; i < 6; i++){
                    datos[i] = resultado.getObject(i+1);
                }
                modelTableEmpleado.addRow(datos);
            }
        } catch (Exception e) {
            JOptionPane.showInternalInputDialog(null, "Error: "+ e.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       TablaEmpleado objEmpleado = new TablaEmpleado();
        
        //Asigno el modelo para el JTable
        DefaultTableModel modeloTabla = (DefaultTableModel) tblEmpleado.getModel();
        
        //Asigno el indice del elemento seleccionado
        int indice = tblEmpleado.getSelectedRow();
           
        //Asigno al campo cedula el elemto a eliminar
        //int cedula = Integer.parseInt((String)modeloTabla.getValueAt(indice,0));
        int idTablaEmpleado = (int) modeloTabla.getValueAt(indice, 0);   
        
        //Elimino el registro de la tabla
        modeloTabla.removeRow(indice);
        
        //Elimino el registro
        boolean resultado = objEmpleado.eliminarEmpleado(idTablaEmpleado);
        
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Dato eliminado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Error al elimnar dato ");
        }
        
       //Limpio los campos
       txtId.setText("");
       txtCedula.setText("");
       txtNombres.setText("");
       txtApellidos.setText("");
       cmbCargo.setSelectedIndex(0);
       cbmSucursal.setSelectedIndex(0);                                        
        
        // Limpio las filas y las columnas de la tabla
        modelTableEmpleado.setNumRows(0);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //Valido Campos Vacíos
       if(txtCedula.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar la cedula");
           txtCedula.requestFocus();
           return;
        }
       
       if(txtNombres.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar los nombres");
           txtNombres.requestFocus();
           return;
       }
       
       if(txtApellidos.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar los apellidos");
           txtApellidos.requestFocus();
           return;
       }

       //Creamos un objeto para el estado Sucursal
        EstadoSucur objEstadoSucurNit = (EstadoSucur) cbmSucursal.getSelectedItem();
        //Asignamos el atributo del objeto seleccionado en el combo.
        String estadoNit = objEstadoSucurNit.getNit(); //Ya aquí tenemos el id del estado seleccionado.
        
        //Creamos el objeto para el estado Cargo
        EstadoCargo objEstadoCargoCodigo = (EstadoCargo) cmbCargo.getSelectedItem();
        //Asignamos el atributo del objeto seleccionado en el combo cargo
        String estadoCodigo = objEstadoCargoCodigo.getCodigo();
       
        
        if(cmbCargo == null){
            JOptionPane.showMessageDialog(null, "Inserte un cargo");
            cmbCargo.requestFocus();        
        }
        
        if(cbmSucursal == null){
            JOptionPane.showMessageDialog(null, "Inserte un cargo");
            cbmSucursal.requestFocus();        
        }
        
        //Instancio la clase
        TablaEmpleado objEmpleado = new TablaEmpleado();
       
       //Declaro Variables
       int cedula;
       int idTabla;
       String cargo;
       String sucursal;
       String nombres;
       String apellidos;
       
       //Asigno los valores del formulario a las variables
       idTabla = Integer.parseInt(txtId.getText());
       cedula = Integer.parseInt(txtCedula.getText());
       nombres = txtNombres.getText();
       apellidos = txtApellidos.getText();
             
        boolean resultado = objEmpleado.actualizarEmpleado(idTabla,cedula,nombres,apellidos,estadoCodigo,estadoNit);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente");
            }else{
                JOptionPane.showInputDialog(null, "Error al actualizar");
            }
        
       //}
       
      //Limpio los campos
       txtId.setText("");
       txtCedula.setText("");
       txtNombres.setText("");
       txtApellidos.setText("");
       cmbCargo.setSelectedIndex(0);
       cbmSucursal.setSelectedIndex(0);                                        
        
        // Limpio las filas y las columnas de la tabla
        modelTableEmpleado.setNumRows(0);
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu objMenu = new Menu();
        objMenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
             char validar=evt.getKeyChar();

     if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
     }
        
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        char validar=evt.getKeyChar();

        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
       char validar=evt.getKeyChar();

        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

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
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cbmSucursal;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSucursal;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
