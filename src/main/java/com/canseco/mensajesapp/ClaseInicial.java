
package com.canseco.mensajesapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


public class ClaseInicial {
    public static void main(String []args){
     
        Scanner scan = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.print("-------------------------------------");
            System.out.print("Aplicación de mensajes");
            System.out.print("  1.Crear Mensaje");
            System.out.print("  2.Listar Mensaje");
            System.out.print("  3.Editar Mensaje");
            System.out.print("  4.Eliminar Mensaje");
            System.out.print("  5.Salir");
            //Leemos opcion del usuario
            opcion = scan.nextInt();
            switch (opcion){
                case 1:
                    mensajesService.crearM();
                break;
                case 2:
                    mensajesService.listarM();
                break;
                case 3:
                    mensajesService.borrarM();
                break;
                case 4:
                    mensajesService.editarM();
                break;
                default:
                   
            }
                    
            
        }while(opcion!=5);
        
        
        
        
        
       
        
        
}
}
