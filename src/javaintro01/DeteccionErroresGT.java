/*
Detección Errores. Guía Teórica. Pag 14.
	string nombre
  	bolean bandera
  	char char;
 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author Rocio
 */
public class DeteccionErroresGT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       	String nombre;
  	boolean bandera = true;
  	char caracter = 'R';
        
        Scanner leer;
        leer = new Scanner(System.in);
        System.out.println("Cuál es tu nombre: ");
        nombre = leer.next();
        
        System.out.println("¿Tu nombre es Rocío?: "+ bandera);
        
        System.out.println("El primer caracter de tu nombre es: "+ caracter);
       
    }
    
}
