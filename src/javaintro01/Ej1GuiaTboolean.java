/*
 Ejercicio 1 Guia Teorica
Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos
tipos de datos.(boolean)
 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej1GuiaTboolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer;
        leer = new Scanner(System.in);
        System.out.println("Ingresa verdadero(true) or falso (false): Tu primer nombre es: Rocío?");
        boolean resp = leer.nextBoolean();
        System.out.println ("Definimos variable boolean alojando la respuesta: " + resp);
    }
    
}
