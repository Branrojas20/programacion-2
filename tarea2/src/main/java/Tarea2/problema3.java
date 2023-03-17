/*
3) Realice la tabla de multiplicar usando el ciclos for,
indique que tabla desea  y hasta donde la desea
 */
package Tarea2;

import java.util.Scanner;

public class problema3 {

    public static void main(String[] args) {
        int i;
        int numero;
        int tamano;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el numero que del cual desea saber la tabla: ");
        numero = entrada.nextInt();

        Scanner entradaLimite = new Scanner(System.in);
        System.out.println("Digite hasta que numero desea saber la tabla: ");
        tamano = entrada.nextInt();

        System.out.println("----Tabla del: " + numero + " ----");

        for (i = 0; i <= tamano; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
