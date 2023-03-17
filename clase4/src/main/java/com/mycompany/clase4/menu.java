package com.mycompany.clase4;

import java.util.Random;
import java.util.Scanner;

public class menu {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int opcion, numero, i;
        double suma = 0;
        do {
            System.out.println("Menu"
                    + "\n 1) Contador del 1 al 50 de 5 en 5"
                    + "\n 2) 10 datos pares e impares"
                    + "\n 3) 5 datos al azar y sumarlos"
                    + "\n 4) salir"
                    + "\n ingrese numero 1-2-3-4");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1://numeros de 5 en 5 impares
                    for (i = 0; i <= 50; i += 5) {
                        System.out.println("Los numeros son" + i);

                    }
                    break;

                case 2:
                    for (i = 0; i <= 10; i += 2) {
                        System.out.println("Los numeros pares: " + i);
                    }
                    for (i = 1; i <= 10; i += 2) {
                        System.out.println("Los numeros impares: " + i);
                    }
                case 3:

                    for (i = 0; i < 5; i++) {
                        numero = random.nextInt(100);
                        System.out.println("Número aleatorio: " + numero);
                        suma += numero;
                        System.out.println("La suma de los números aleatorios es: " + suma);
                    }

            }

        } while (opcion != 4);

    }
}
