
package CRUD;

import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import provedorApp.provedorInterfacePOA;


public class TablaProvedor extends provedorInterfacePOA{
           Conexion objConec = new Conexion();

    @Override
    public boolean insertarProvedor(String nit, String nombre, String direccion, int telefono) {
      
        boolean resultado = false;        
            try {
                String sql = "insert into provedores(nit, nombre, direccion, telefono) values ('"+nit+"','"+nombre+"','"+direccion+"','"+telefono+"')";
                objConec.conectar();
                Statement st = objConec.conex.createStatement();
                int valor = st.executeUpdate(sql);
                if (valor > 0) {
                    resultado = true;
                }
                objConec.conex.close();
                st.close();
            } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Error al insertar"+e.getMessage());
            }
        return resultado;
        
        
    }

    @Override
    public boolean actualizarProvedor(int idTablaProvedor, String nit, String nombre, String direccion, int telefono) {
       
        boolean resultado = false;      
            try {
                String sql = "Update provedores set nit = '"+nit+"', nombre = '"+nombre+"',direccion = '"+direccion+"', telefono = '"+telefono+"' where idTablaProvedor = '"+idTablaProvedor+"' ";
                objConec.conectar();
                Statement st = objConec.conex.createStatement();
                int valor = st.executeUpdate(sql);
                if (valor>0){
                resultado = true;
            }
                objConec.conex.close();
                st.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar"+e.getMessage());
            }        
        return resultado;   
    }

    @Override
    public boolean eliminarProvedor(int idTablaProvedor) {
        
        boolean resultado = false;
        
            try {
                String sql = "Delete from provedores where idTablaProvedor = "+idTablaProvedor;
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

    @Override
    public void shoutdown() {
        }
         public ResultSet cargarProvedor(){
        ResultSet resultado = null;
        try {
            String sql = "Select idTablaProvedor,nit,nombre,direccion,telefono from provedores";
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            resultado = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
        }
    return resultado;
        
        
    }
    



}
  