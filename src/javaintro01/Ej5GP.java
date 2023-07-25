/*
Escribir un programa que lea un número entero por teclado y
muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej5GP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número:");
        num = leer.nextInt();
        System.out.println("El número que ingresaste es: "+ num);
        
        System.out.println("El doble del número ingresado es: "+ num*2);
        System.out.println("El triple del número ingresado es: "+ num*3);
        System.out.println("La raíz cuadrada del número ingresado es: "+ Math.sqrt(num));
        
    }
    
}
