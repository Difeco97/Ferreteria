
package CRUD;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import productosApp.productoPOA;


public class TablaProductos extends productoPOA  {

    //Instancio la clase conexión
    Conexion objConec = new Conexion();
    
    @Override
    public boolean insertarProducto(int codigo, String nombre, int cantidad, int precio, String provedores_nit, String descripcion) {
        boolean resultado = false; 
        
            try {
                String sql = "insert into productos(codigo, nombre, cantidad, precio, provedores_nit, descripcion) values ('"+codigo+"','"+nombre+"','"+cantidad+"','"+precio+"','"+provedores_nit+"',"
                        + "'"+descripcion+"')";
                objConec.conectar();
                Statement st = objConec.conex.createStatement();
                int valor = st.executeUpdate(sql);
                if (valor > 0){
                    resultado = true;
                }
                objConec.conex.close();
                st.close();        
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al insertar "+e.getMessage());
        }
        return false;
    }

    @Override
    public boolean actualizarProducto(int idTablaProducto, int codigo, String nombre, int cantidad, int precio, String provedores_nit, String descripcion) {
        boolean resultado = false;      
        
        try {
            String sql = "update productos set codigo = '"+codigo+"', nombre = '"+nombre+"',cantidad = '"+cantidad+"', precio = '"+precio+"', provedores_nit = '"+provedores_nit+"', descripcion = '"+descripcion+"' where idTablaProducto = '"+idTablaProducto+"'";
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if (valor>0){
                resultado = true;
            }
            objConec.conex.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar "+e.getMessage());
        }        
        return resultado; 
    }

    @Override
    public boolean eliminarProducto(int idTablaProducto) {
         boolean resultado = false;
       
        try {
            String sql = "Delete from productos where idTablaProducto = '"+idTablaProducto+"' ";
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            int valor = st.executeUpdate(sql);
            if(valor>0){
                resultado = true;
            }
            objConec.conex.close();
            st.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar" + e.getMessage());
        }
        return resultado;
    }
  
    public ResultSet cargarProducto(){
        ResultSet resultado = null;
        try {
            String sql = "Select idTablaProducto,codigo,nombre,cantidad,precio,provedores_nit,descripcion from productos";
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            resultado = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+e.getMessage());
        }
        return resultado;
    }
    
    public ResultSet consultarEstado(){
        ResultSet resultado = null;
        try {
            String sentenciaSql = "Select nit, nombre from provedores";
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            resultado = st.executeQuery(sentenciaSql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al consultar: "+ e.getMessage());
        }
            return resultado;
    }
    
}
