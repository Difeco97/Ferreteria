package EmpleadoApp;

/**
* EmpleadoApp/EmpleadoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Empleado.idl
* lunes 13 de mayo de 2019 02:04:39 PM COT
*/

public final class EmpleadoHolder implements org.omg.CORBA.portable.Streamable
{
  public EmpleadoApp.Empleado value = null;

  public EmpleadoHolder ()
  {
  }

  public EmpleadoHolder (EmpleadoApp.Empleado initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EmpleadoApp.EmpleadoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EmpleadoApp.EmpleadoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EmpleadoApp.EmpleadoHelper.type ();
  }

}
