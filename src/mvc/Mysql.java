/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Coba
 */
public class Mysql {
    
   private Connection conexion=null;
   private final String servidor="localhost";
   private final String database="proyecto";
   private final String usuario="root";
   private final String password="2017";
   private String url="";

    public Mysql() {
    }
   
   public Connection openDb()
   {
        try {
           this.url="jdbc:mysql://"+servidor+"/"+database;
           this.conexion=DriverManager.getConnection(url,usuario,password);
           return conexion;
       } catch (SQLException ex) {
           Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
       }
       return conexion;
   }
   
   public void closeDb()
   {
       if(this.conexion!=null)
       {
           try {
               this.conexion.close();
           } catch (SQLException ex) {
               Logger.getLogger(Mysql.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   }
    
}
