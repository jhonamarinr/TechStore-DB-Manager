/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package techstore_app;

/*Jhon*/import java.sql.Connection;

/**
 *
 * @author Jhon
 */
public class Techstore_app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Jhon*/
        System.out.println("Iniciando sistema...");
        
        Connection conn = Conexion.conectar();

        if (conn != null) {
            System.out.println("Conectado correctamente a la base de datos 'techstore_db'");
        } else {
            System.out.println("No se pudo conectar a la base de datos");
        }
        /*Jhon*/

    }
    
}
