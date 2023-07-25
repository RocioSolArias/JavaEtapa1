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
public class HolaMundo {
    
    public static void main(String[] args) {
        
        //Números enteros
        byte entero;
        short numerogrande;
    	int numero;
        long numeromax;
        //Números decimales
        float decimal;
        double decimales;
        //Carácter
        char caracter;
        //Condicional: es verdadero o falso
        boolean decision = true;
                
        //Números enteros
        entero = 12;
        numerogrande = 12456;
        numero = 1245656;
        numeromax = 12456323;
        //Números decimales
        decimal = 3.45f;
        decimales = 3.45546;
        //Carácter
        caracter = 'a';
        
        System.out.println("Hola mundo! Definiremos distintos tipos de datos: ");
        //Números enteros
        System.out.println("Número byte: "+ entero);
        System.out.println("Número short: "+ numerogrande);
        System.out.println("Número int: "+ numero);
        System.out.println("Número long: "+ numeromax);
        //Números decimales
        System.out.println("Número float: "+ decimal);
        System.out.println("Número double: "+ decimales);
        //Caracter
        System.out.println("Dato char: "+ caracter);
        System.out.println("¿Tu primer nombre es Rocío?: "+ decision);
    
    
    }
}
