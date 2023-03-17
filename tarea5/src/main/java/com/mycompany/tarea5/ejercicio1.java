package com.mycompany.tarea5;

import java.util.Arrays;
import java.util.Random;

public class ejercicio1 {

    public static void main(String[] args) {

        Random rand = new Random();

        ////////VARIABLES//////////    
        int i, j;
        int suma = 0;    //inicializar simepre en 0 
        int[][] matriz = new int[4][4];
        int[] sumaFilas = new int[4];
        int[] sumaColumnas = new int[4];
        int[][] matrizfinal = new int[4][4]; // donde van las sumas
        //////////////////////////////////////////////////
        // matriz 4x4

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(9); // Generar números aleatorios entre 0 y 8
            }
        }
////////////////////////////////////////////////////////
        // Calcular la suma de las columnas

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                suma += matriz[j][i];
            }
            sumaColumnas[i] = suma;
            suma = 0;   ///siempre inicializar en o
        }
////////////////////////////////////////////////////////
        // Calcular la suma de las filas

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                suma += matriz[i][j];
            }
            sumaFilas[i] = suma;
            suma = 0;///siempre inicializar en o
        }

        // Crear matriz resultante de 4x4 con las sumas de las columnas y filas
/////////////////////////////////////////////////////////
        // Copiar la matriz original
        for (i = 0; i < 3; i++) {
            matrizfinal[i] = Arrays.copyOf(matriz[i], 4);
        }
/////////////////////////////////////////////////////
        // Añadir las sumas de las columnas
        for (i = 0; i < 3; i++) {
            matrizfinal[3][i] = sumaColumnas[i];
        }
//////////////////////////////////////////////////
        // Añadir las sumas de las filas
        for (i = 0; i < 3; i++) {
            matrizfinal[i][3] = sumaFilas[i];
        }
/////////////////////////////////////////////////////
        // matriz final
        System.out.println("Matriz:");
        printMatriz(matrizfinal);
        //////////////////////////////////////////////
    }

    public static void printMatriz(int[][] matriz) {
        int i, j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
