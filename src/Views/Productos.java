/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import CRUD.TablaProductos;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ModeloComboBox.Estado;

/**
 *
 * @author USUARIO
 */
public class Productos extends javax.swing.JFrame {
private DefaultTableModel modelTablaProductos;
    
    //Clase global para cargar el formulario
    private DefaultComboBoxModel modeloCombo;
       
    public Productos() {
        modelTablaProductos = new DefaultTableModel(null, getColumn());
        modeloCombo = new DefaultComboBoxModel(new String [] {});
        initComponents();
        txtId.setEditable(false);
        //Instancion al clase productos
        TablaProductos objproductos = new TablaProductos();
        
        //ResultSet
        ResultSet estados;
        //Instancio la clase estados
        estados = objproductos.consultarEstado();
        try {
            //Recorremos el resultado generado por la consulta
            while(estados.next()){
                //Con el metodo addElement vamos a agregar cada resultado al comboBox
                modeloCombo.addElement(new Estado(estados.getString("nit"), estados.getString("nombre")));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Consulta no hecha"+e.getMessage());
        }
    }
    
     //Metodo para cargar las columnas de la tabla
     private String[] getColumn(){
        String columnas[] = new String[]{"ID","CODIGO","NOMBRE","CANTIDAD","PRECIO","PROVEDOR NIT","DESCRIPCION"};
        return columnas;
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblProvedor = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtActualizar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setText("CODIGO");
        jPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 83, 20));

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
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 130, 30));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 105, -1));

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
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 100, 30));

        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("CANTIDAD");
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 83, 20));

        cboEstado.setModel(modeloCombo
        );
        jPanel1.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 105, -1));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 105, -1));

        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 105, -1));

        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("PRECIO");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 83, 20));

        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("DESCRIPCION");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        lblProvedor.setForeground(new java.awt.Color(0, 0, 0));
        lblProvedor.setText("PROVEDOR ID");
        jPanel1.add(lblProvedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 83, 20));

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
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 90, 30));

        tblProductos.setModel(modelTablaProductos);
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

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
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 110, 30));

        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELMINAR");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 110, 30));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 105, -1));

        txtActualizar.setForeground(new java.awt.Color(0, 0, 0));
        txtActualizar.setText("ACTUALIZAR");
        txtActualizar.setBorder(null);
        txtActualizar.setBorderPainted(false);
        txtActualizar.setContentAreaFilled(false);
        txtActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(txtActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, 130, 30));

        lblTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lblTitulo.setText("PRODUCTOS");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 250, 31));

        lblId.setForeground(new java.awt.Color(0, 0, 0));
        lblId.setText("ID");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 83, 20));
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 105, -1));

        lblNombre.setForeground(new java.awt.Color(0, 0, 0));
        lblNombre.setText("NOMBRE");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 83, 22));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 105, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/gancho.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       //Valido Campos Vacíos
       if(txtCodigo.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el codigo");
           txtCodigo.requestFocus();
           return;
        }
       
       if(txtNombre.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el nombre");
           txtNombre.requestFocus();
       }
       
       if(txtCantidad.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad");
           txtCantidad.requestFocus();
           return;
       }
       
       if(txtPrecio.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el precio");
           txtPrecio.requestFocus();
           return;
       }
       
       if(txtDescripcion.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar un descripcion");
           txtDescripcion.requestFocus();
       }
       
        //Creamos un objeto
        Estado objEstado = (Estado) cboEstado.getSelectedItem();
        //Asignamos el atributo del objeto seleccionado en el combo.
        String estado = objEstado.getNit(); //Ya aquí tenemos el id del estado seleccionado.
        
        if (objEstado == null) {
            JOptionPane.showMessageDialog(null, "Selecione un Provedor");
            cboEstado.requestFocus();
            return;
        }
               
        //Instancio la clase productos
        TablaProductos objproductos = new TablaProductos();
        
        //Declaro las variables
        int codigo;
        int cantidad;
        int precio;
        String nombre;
        String descripcion;
        
        //Asigno los valores del formulario a las variables
        codigo = Integer.parseInt(txtCodigo.getText());
        nombre = txtNombre.getText();
        cantidad =Integer.parseInt(txtCantidad.getText());
        precio = Integer.parseInt(txtPrecio.getText());
        descripcion = txtDescripcion.getText();
        
        //Llamo al metodo insertarProducto y guardo el nuevo registro
        boolean resultado = objproductos.insertarProducto(codigo,nombre,cantidad,precio,estado,descripcion);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Error");
            }else{
                JOptionPane.showMessageDialog(null, "Registro exitoso ");
            }     
            
        //Limpiamos los campos
        modelTablaProductos.setNumRows(0);
        
        //Limpio los campos
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        cboEstado.setSelectedIndex(0);
        txtDescripcion.setText("");

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
               TablaProductos objproductos = new TablaProductos();
        
        //Asigno el modelo para el JTabla
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
        
        //Asigno el indice del elemento seleccioando
        int indice = tblProductos.getSelectedRow();
        
        //Asigno el campo cedula al elemento eliminar
        int idTablaProducto = (int) modeloTabla.getValueAt(indice, 0);
        
        //Elimino el requisito de la tabla
        modeloTabla.removeRow(indice);
        
        //Elimino el registro
        boolean resultado = objproductos.eliminarProducto(idTablaProducto);
        
        if(resultado == true){
            JOptionPane.showMessageDialog(null, "Dato eliminado");
        }else{
            JOptionPane.showMessageDialog(null, "Error");
        }
        
            //Limpio la tabla
        modelTablaProductos.setNumRows(0);
        
        //Limpio los campos
        txtId.setText("");
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        cboEstado.setSelectedIndex(0);
        txtDescripcion.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarActionPerformed
        //Valido Campos Vacíos
       if(txtCodigo.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el codigo");
           txtCodigo.requestFocus();
           return;
        }
       
       if(txtNombre.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el nombre");
           txtNombre.requestFocus();
       }
       
       if(txtCantidad.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad");
           txtCantidad.requestFocus();
           return;
       }
       
       if(txtPrecio.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar el precio");
           txtPrecio.requestFocus();
           return;
       }
       
       if(txtDescripcion.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe ingresar un descripcion");
           txtDescripcion.requestFocus();
       }
       
        //Creamos un objeto
        Estado objEstado = (Estado) cboEstado.getSelectedItem();
        //Asignamos el atributo del objeto seleccionado en el combo.
        String estado = objEstado.getNit(); //Ya aquí tenemos el id del estado seleccionado.
        
        if (objEstado == null) {
            JOptionPane.showMessageDialog(null, "Selecione un Provedor");
            cboEstado.requestFocus();
            return;
        }
               
        //Instancio la clase productos
        TablaProductos objproductos = new TablaProductos();
        
        //Declaro las variables
        int codigo;
        int cantidad;
        int precio;
        int idTablaProduto;
        String nombre;
        String descripcion;
        
        //Asigno los valores del formulario a las variables
        idTablaProduto = Integer.parseInt(txtId.getText());
        codigo = Integer.parseInt(txtCodigo.getText());
        nombre = txtNombre.getText();
        cantidad =Integer.parseInt(txtCantidad.getText());
        precio = Integer.parseInt(txtPrecio.getText());
        descripcion = txtDescripcion.getText();
        
        //Llamo al metodo insertarProducto y guardo el nuevo registro
        boolean resultado = objproductos.actualizarProducto(idTablaProduto,codigo,nombre,cantidad,precio,estado,descripcion);
            if(resultado == true){
                JOptionPane.showMessageDialog(null, "Registro Actualizado Correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Error al actualiazar");
            }     
            
        //Limpiamos los campos
        modelTablaProductos.setNumRows(0);
        
        //Limpio los campos
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        cboEstado.setSelectedIndex(0);
        txtDescripcion.setText("");
   
    }//GEN-LAST:event_txtActualizarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       //Limpio la tabla
        modelTablaProductos.setNumRows(0);
        
       //Instancio la clase que contiene los metodos
       TablaProductos objproductos = new TablaProductos();
       
       //Llamo al metodo cargarEmpleado
       ResultSet resultado = objproductos.cargarProducto();
       
       //Llenos la tabla con los resultado del ResultSet   
        try {
            Object datos[] = new Object[7];
            while(resultado.next()){
                for (int i = 0; i < 7; i++){
                    datos[i] = resultado.getObject(i+1);
                }
                modelTablaProductos.addRow(datos);
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Error: "+e.getMessage()); 
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //Limpio la tabla
        modelTablaProductos.setNumRows(0);
        
        //Limpio los campos
        txtId.setText("");
        txtCodigo.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
        cboEstado.setSelectedIndex(0);
        txtDescripcion.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        //Defino el modelo para el JTable
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
        
        //Asigno los elementos seleccionados a los respectivos campos del formulario
        txtId.setText(modeloTabla.getValueAt(tblProductos.getSelectedRow(), 0) .toString());
        txtCodigo.setText(modeloTabla.getValueAt(tblProductos.getSelectedRow(), 1).toString());
        txtNombre.setText((String) modeloTabla.getValueAt(tblProductos.getSelectedRow(), 2));
        txtCantidad.setText(modeloTabla.getValueAt(tblProductos.getSelectedRow(), 3) .toString());
        txtPrecio.setText(modeloTabla.getValueAt(tblProductos.getSelectedRow(), 4). toString());
        String estadoProvedor = (String)modeloTabla.getValueAt(tblProductos.getSelectedRow(), 5);
        
        
        modeloCombo.setSelectedItem(estadoProvedor);

        this.cboEstado.setModel(modeloCombo);
              
        txtDescripcion.setText((String) modeloTabla.getValueAt(tblProductos.getSelectedRow(), 6));
    }//GEN-LAST:event_tblProductosMouseClicked

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

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        char validar=evt.getKeyChar();

        if(Character.isDigit(validar)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras");
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
                 char validar=evt.getKeyChar();

     if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
     }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
              char validar=evt.getKeyChar();

     if(Character.isLetter(validar)){
        getToolkit().beep();
        evt.consume();
        JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros");
     }
    }//GEN-LAST:event_txtPrecioKeyTyped

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProvedor;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblProductos;
    private javax.swing.JButton txtActualizar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
