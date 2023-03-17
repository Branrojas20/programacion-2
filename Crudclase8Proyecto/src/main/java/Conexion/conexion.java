
package Conexion;
import java.sql.*; // significa que va a tarer todas las librerias que ocupe de sql
public class conexion {
    Connection con; //esto es una clase de sql 
    public conexion()
    {
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cruddatos","root","");
    }catch(Exception e){
    System.out.print("No se pudo conectar a las DB"+e);
    }
    }
    public Connection getConnection(){
    return con;
    
    }
}
