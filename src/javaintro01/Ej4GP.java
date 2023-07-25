/*
 Dada una cantidad de grados centígrados 
se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class Ej4GP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double gradosc;
        System.out.println("Ingrese una cantidad de grados centigrados: ");
        gradosc = leer.nextDouble();
        System.out.println("La cantidad de grados centigrados ingresados es: "+ gradosc);
        
        double gfahrenheit = (32 + (9 * gradosc /5));
        System.out.println("La cantidad de grados centigrados ingresados equivale a: "+ gfahrenheit + " grados Fahrenheit");
    }
    
}
