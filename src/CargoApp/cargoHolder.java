package CargoApp;

/**
* CargoApp/cargoHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Cargo.idl
* lunes 13 de mayo de 2019 02:04:11 PM COT
*/

public final class cargoHolder implements org.omg.CORBA.portable.Streamable
{
  public CargoApp.cargo value = null;

  public cargoHolder ()
  {
  }

  public cargoHolder (CargoApp.cargo initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = CargoApp.cargoHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    CargoApp.cargoHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return CargoApp.cargoHelper.type ();
  }

}