package com.mycompany.clase4;

public class clase4 {

    public static void main(String[] args) {
        int[] numero = new int[5];
        String[] nombre = new String[5];
        int i;
        numero[0] = 20;
        numero[1] = 100;
        numero[2] = 99;
        numero[3] = 88;
        numero[4] = 78;
        for (i = 0; i < 5; i++) {
            System.out.println(i + 1 + " )Los numeros son " + numero[i]);
        }
        System.out.println("---------------------------");
        nombre[0] = "PEPE";
        nombre[1] = "ANA";
        nombre[2] = "SOFIA";
        nombre[3] = "MARIA";
        nombre[4] = "ELENA";
        for (i = 0; i < 5; i++) {
            System.out.println(i + 1 + ") El nombres son " + nombre[i]);
        }

    }
}
