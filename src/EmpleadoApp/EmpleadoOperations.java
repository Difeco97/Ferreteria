package EmpleadoApp;


/**
* EmpleadoApp/EmpleadoOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Empleado.idl
* lunes 13 de mayo de 2019 02:04:39 PM COT
*/

public interface EmpleadoOperations 
{
  boolean insertarEmpleado (int cedula, String nombres, String apellidos, String cargo_id, String sucursal_id);
  boolean actualizarEmpleado (int idTablaEmpleado, int cedula, String nombres, String apellidos, String cargo_id, String sucursal_id);
  boolean eliminarEmpleado (int idTablaEmpleado);
  void shoutdown ();
} // interface EmpleadoOperations