package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    public Connection conex;
        
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex=DriverManager.getConnection("jdbc:mysql://localhost/ferreteria","root","");
            System.out.println("Conexion Establecida");     
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conex;
    }
}