package provedorApp;

/**
* provedor/provedorInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from provedores.idl
* lunes 13 de mayo de 2019 04:49:37 PM COT
*/

public final class provedorInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public provedorApp.provedorInterface value = null;

  public provedorInterfaceHolder ()
  {
  }

  public provedorInterfaceHolder (provedorApp.provedorInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = provedorApp.provedorInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    provedorApp.provedorInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return provedorApp.provedorInterfaceHelper.type ();
  }

}