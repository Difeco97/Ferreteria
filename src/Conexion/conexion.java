package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
    public Connection conex;
        
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex=DriverManager.getConnection("jdbc:mysql://localhost/bdferreteria","root","");
            System.out.println("Conexion Establecida");     
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conex;
    }
}