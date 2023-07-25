/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro1;

/**
 *
 * @author Rocio
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num0 = 5;
        int num1 = 5;
	int num2 = 5;
    
	int suma = num1 + num2;
    
	double division = num1 / num2;
    
	boolean logico = num2 < num1;
    
	num1++;
        
        System.out.println("El primer número es: "+ num0);
        System.out.println("El segundo número es: "+ num2);
        System.out.println("La suma de los dos números es: "+ suma);
        System.out.println("La división del primer número con el segundo número es: "+ division);
        System.out.println("El segundo número es menor al primer numero: "+ logico);
        System.out.println("El primer número incrementado es: "+ num1);

	}
    }
    
