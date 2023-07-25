/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. 
Nota: investigar la función toUpperCase() y
toLowerCase() en Java.

 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej3GT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        String frase;
        System.out.println("Ingresa una frase: ");
        frase = entrada.nextLine();
        System.out.println("La frase que ingresaste es: "+ frase);
        
        //Mayúscula
        System.out.println("La frase que ingresaste en mayusculas es: "+ frase.toUpperCase());

        //Minúscula
        System.out.println("La frase que ingresaste en minuscula es: "+ frase.toLowerCase());
    }
    
}
