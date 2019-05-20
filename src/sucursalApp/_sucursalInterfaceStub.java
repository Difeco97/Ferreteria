package sucursalApp;


/**
* sucursal/_sucursalInterfaceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from sucursal.idl
* lunes 13 de mayo de 2019 04:49:48 PM COT
*/

public class _sucursalInterfaceStub extends org.omg.CORBA.portable.ObjectImpl implements sucursalApp.sucursalInterface
{

  public boolean insertarSucursal (String nit, String nombre, String direccion, int telefono)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarSucursal", true);
                $out.write_wstring (nit);
                $out.write_wstring (nombre);
                $out.write_wstring (direccion);
                $out.write_long (telefono);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarSucursal (nit, nombre, direccion, telefono        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarSucursal

  public boolean actualizarSucursal (int idSucursal, String nit, String nombre, String direccion, int telefono)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarSucursal", true);
                $out.write_long (idSucursal);
                $out.write_wstring (nit);
                $out.write_wstring (nombre);
                $out.write_wstring (direccion);
                $out.write_long (telefono);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarSucursal (idSucursal, nit, nombre, direccion, telefono        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarSucursal

  public boolean eliminarSucursal (int idSucursal)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarSucursal", true);
                $out.write_long (idSucursal);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarSucursal (idSucursal        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarSucursal

  public void shoutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shoutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shoutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shoutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:sucursal/sucursalInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _sucursalInterfaceStub
