
package CRUD;

import sucursalApp.sucursalInterfacePOA;
import Conexion.Conexion;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class TablaSucursal extends sucursalInterfacePOA{

    //Instancio la clase conexión
    Conexion objConec = new Conexion();
    
    @Override
    public boolean insertarSucursal(String nit, String nombre, String direccion, int telefono) {
         boolean resultado = false;        
            try {
                String sql = "insert into sucursal(nit, nombre, direccion, telefono) values ('"+nit+"','"+nombre+"','"+direccion+"','"+telefono+"')";
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
    public boolean actualizarSucursal(int idSucursal, String nit, String nombre, String direccion, int telefono) {
       boolean resultado = false;      
        
        try {
            String sql = "update sucursal set nit = '"+nit+"', nombre = '"+nombre+"',direccion = '"+direccion+"', telefono = '"+telefono+"' where idSucursal = '"+idSucursal+"'";
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
    public boolean eliminarSucursal(int idSucursal) {
         boolean resultado = false;
       
        try {
            String sql = "Delete from sucursal where idSucursal = '"+idSucursal+"' ";
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
        return resultado;  }

    @Override
    public void shoutdown() {
        
    }
       public ResultSet cargarSucursal(){
        ResultSet resultado = null;
        try {
            String sql = "Select idSucursal,nit,nombre,direccion,telefono from sucursal";
            objConec.conectar();
            Statement st = objConec.conex.createStatement();
            resultado = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
        }
        return resultado;
    }
    
}
