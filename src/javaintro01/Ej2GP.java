/*
 Escribir un programa que pida tu nombre,
lo guarde en una variable y lo muestre por pantalla.
 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej2GP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner leer = new Scanner(System.in);
    String nombre;
    System.out.println("Ingresa tu nombre: ");
    nombre = leer.nextLine();
    System.out.println("Tu nombre es: "+ nombre);
    }
    
}
