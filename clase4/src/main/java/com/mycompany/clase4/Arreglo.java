package com.mycompany.clase4;

import java.util.Scanner;

public class Arreglo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        char j;
        float[] numero = new float[5];
        System.out.println("Vector con numero");
        for (i = 0; i < 5; i++) {
            System.out.println("Digite los numeros");
            numero[i] = entrada.nextFloat();
        }
        for (i = 5; i > 5; i--) {
            System.out.println(i + 1 + ") Los numeros son :" + numero[i]);

        }

//      for ( i = 5; i >= 0; i--) {
//          System.out.println(i+1+ ") Los numeros son :"+numero[i]);
//        
        // }
        System.out.println("Imprime el abecedario");

        for (j = 'a'; j <= 'z'; j++) {
            System.out.println("El abecedario es:" + j);
        }

    }
}
