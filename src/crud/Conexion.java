package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static String host = "jdbc:mysql://localhost";
    public static String usuario = "usuario";
    public static String contraseña = "contrasena";
    public static String bd = "banco";
    public static boolean bandera = false;
    
    public Connection getConnection(String host, String usuario, String contraseña, String bd){
    
        Connection con = null;
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(host + "/" + bd, usuario, contraseña);
            
            if(bandera == false){
                bandera = true;
                JOptionPane.showMessageDialog(null,"Conexión establecida correctamente");
            }
            
        }catch(Exception error){
            JOptionPane.showMessageDialog(null,"Se presentó el error de coneción: " + error);
        }
        
        return con;
    }
    
}
