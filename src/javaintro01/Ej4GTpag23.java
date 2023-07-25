/*
Define una variable que aloje tu nombre y otra que guarde tu edad. 
Imprime ambas variables por pantalla.

 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej4GTpag23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        int edad;
        
        Scanner leer;
        leer = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        nombre = leer.next();
        
        System.out.println("Ingresa tu edad: ");
        edad = leer.nextInt();
    }
    
}
