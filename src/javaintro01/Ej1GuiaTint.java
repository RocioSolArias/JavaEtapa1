/*
 * Ejercicio 1 Guia Teorica
Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos
tipos de datos.(int)
 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej1GuiaTint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer;
        leer = new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        int num = leer.nextInt ();
        System.out.println("Definimos variable Int alojando el numero: " + num);
    }
    
}
