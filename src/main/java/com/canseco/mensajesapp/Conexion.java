
package com.canseco.mensajesapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
    public Connection get_conect(){
        Connection conectar = null;
       try{
           conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajesapp", "root", "");
           if (conectar != null){
               System.out.print("Exito en la Conexion");
           }else {
               System.out.print("NO hubo Exito en la Conexion");
           }
       }catch(SQLException ex){
           
           System.out.print(ex);
       } 
       return conectar;
    }
}
