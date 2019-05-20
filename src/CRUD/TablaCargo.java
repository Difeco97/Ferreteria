package CRUD;

import CargoApp.cargoPOA;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Conexion.Conexion;

public class TablaCargo extends cargoPOA{

    //Se instancia l aconexion
     Conexion objConec = new Conexion();

    @Override
    public boolean insertarCargo(String codigo, String nombre, int sueldo) {
        boolean resultado = false;        
            try {
                String sql = "insert into cargo(codigo, nombre, sueldo) values ('"+codigo+"','"+nombre+"','"+sueldo+"')";
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
    public boolean actualizarCargo(int idCargo, String codigo, String nombre, int sueldo) {
       boolean resultado = false;      
         
            try {
                String sql = "update cargo set codigo = '"+codigo+"', nombre = '"+nombre+"',sueldo = '"+sueldo+"' where idCargo = '"+idCargo+"'";
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
    public boolean eliminarCargo(int idCargo) {
          boolean resultado = false;
        
            try {
                String sql = "Delete from cargo where idCargo = "+idCargo;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ResultSet cargarCargo(){
        ResultSet resultado = null;
            try {
                String sql = "Select idCargo, codigo, nombre, sueldo from cargo";
                objConec.conectar();
                Statement st = objConec.conex.createStatement();
                resultado = st.executeQuery(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
            }
        return resultado;
    }
    
}