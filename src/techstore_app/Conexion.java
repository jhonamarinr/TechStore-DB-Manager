/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techstore_app;

/*Jhon*/
import java.sql.Connection;
import java.sql.DriverManager;
/*Jhon*/

/**
 *
 * @author Jhon
 */
public class Conexion {
    
    /*Jhon*/
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/techstore_db",
                "root",
                "root1234"
            );
        } catch (Exception e) {
            System.out.println("Error de conexion a la BD");
            return null;
        }
    }
    /*Jhon*/
    
}
