package com.mycompany.clase1;

import java.util.Scanner;

public class entradadatos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 1) conocer mis variables
        double valor1, valor2, suma, resta, multiplicacion, division;
        // 2) conocer mis entradas
        System.out.println("Digite el primer numero: ");
        valor1 = entrada.nextDouble();
        System.out.println("Digite el segundo valor: ");
        valor2 = entrada.nextDouble();
        // proceso de datos

        suma = valor1 + valor2;
        resta = valor1 - valor2;
        multiplicacion = valor1 * valor2;
        division = valor1 / valor2;
        //salida de datos
        System.out.println("la suma es : " + suma
                + "\n La resta es : " + resta
                + "\n La multiplicacion es : " + multiplicacion
                + "\n La divicion es: " + division);

    }
}
