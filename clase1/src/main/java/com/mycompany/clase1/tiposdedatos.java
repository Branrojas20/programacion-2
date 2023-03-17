/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase1;

/**
 *
 * @author branr
 */
public class tiposdedatos { // esta es la clase 

    public static void main(String[] args) { // este es el main
//tipos de datos
        byte byteentero = 127;
        short shortentero = 1200;
        int entero = 19000;
        long longentero = 2939939;
        // datos con decimales o flotantes

        float decimal = 12.6f;
        double doubledecimal = 88.45;
        //tipos de datos de cadena o string

        char caracter = 's';
        String cadena = "Hola mundo";
        boolean decision = true;

        System.out.println("El valor  del byte es :" + byteentero
                + "\n El valor short es: " + shortentero
                + "\n El valor int es: " + entero
                + "\n El valor del long:" + longentero);

        System.out.println("---------------");
        System.out.println("El valor flotante es : " + decimal
                + "\n El valor double es :" + doubledecimal);

        System.out.println("---------------");
        System.out.println("El valor del caracter es:" + caracter
                + "\n El valor de cadenas es :" + cadena
                + "\n El valor de booleano es : " + decision);

    }
}
