/*
 * Ejercicio 1 Guia Teorica
Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos
tipos de datos.
 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class JavaIntro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer;
        leer = new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre:");
        nombre = leer.next();
        System.out.println("Definimos variable String alojando el nombre: " + nombre);
    }
    
}
