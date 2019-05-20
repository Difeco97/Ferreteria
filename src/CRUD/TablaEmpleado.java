package CRUD;

import  EmpleadoApp.EmpleadoPOA;
import java.sql.*;
import javax.swing.JOptionPane;
import Conexion.Conexion;



public class TablaEmpleado extends EmpleadoPOA {
    //Instancio la clase conexión
    Conexion objConec = new Conexion();

    @Override
    public boolean insertarEmpleado(int cedula, String nombres, String apellidos, String cargo_id, String sucursal_id)
    {
       boolean resultado = false;        
            try {
                String sql = "insert into empleado(cedula, nombres, apellidos, cargo_id, sucursal_id) values ('"+cedula+"','"+nombres+"','"+apellidos+"','"+cargo_id+"','"+sucursal_id+"')";
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
    public boolean actualizarEmpleado(int idTablaEmpleado, int cedula, String nombres, String apellidos, String cargo_id, String sucursal_id) {
       
        boolean resultado = false;      
         
            try {
                String sql = "update empleado set cedula = '"+cedula+"', nombres = '"+nombres+"',apellidos = '"+apellidos+"', cargo_id = '"+cargo_id+"', sucursal_id = '"+sucursal_id+"' where idTablaEmpleado = '"+idTablaEmpleado+"'";
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
    public boolean eliminarEmpleado(int idTablaEmpleado) {
         boolean resultado = false;
        
            try {
                String sql = "Delete from empleado where idTablaEmpleado = "+idTablaEmpleado;
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
        public ResultSet cargarEmpleado()        {
        ResultSet resultado = null;
            try {
                String sql = "Select idTablaEmpleado, cedula, nombres, apellidos, cargo_id, sucursal_id from empleado";
                objConec.conectar();
                Statement st = objConec.conex.createStatement();
                resultado = st.executeQuery(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error"+ e.getMessage());
            }
        return resultado;
    }
    
    public ResultSet consultarEstadoSucursal(){
        ResultSet resultado = null;
            try {
                String sql = "Select nit, nombre from sucursal";
                objConec.conectar();
                Statement st = objConec.conex.createStatement();
                resultado = st.executeQuery(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en la consulta " + e.getMessage());
            }
        return resultado;
    }
           
    public ResultSet consultarEstadoCargo(){
        ResultSet resultado = null;
            try {
                String sql = "Select codigo, nombre from cargo";
                objConec.conectar();
                Statement st = objConec.conex.createStatement();
                resultado = st.executeQuery(sql);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error en la consulta " + e.getMessage());
            }
        return resultado;

    }

    
}
    

