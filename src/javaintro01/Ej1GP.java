/*
Escribir un programa que pida dos números enteros por teclado y
calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma

 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej1GP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
       
        System.out.println("Ingrese un número entero: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número entero: ");
        num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("La suma de los dos números ingresados es: "+ suma);
            
    }
    
}
