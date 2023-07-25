/*
 Ejercicio 1 Guia Teorica
Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos
tipos de datos.(char)
 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej1GuiaTchar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer;
        leer = new Scanner(System.in);
        System.out.println(" Las letras vocales son: ");
        char [] vocal = {'a','e','i', 'o', 'u'};
        System.out.println(vocal);
        System.out.println ("Definimos variable char alojando las vocales: a, e, i, o, u "+ vocal);    
}
}