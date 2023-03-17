package Estructurada;

import java.util.Scanner;

public class matriz {

    public static void main(String[] args) {
        int i, j;
        int[][] matriz = new int[3][3];
        for (j = 0; j < 3; j++) {
            for (i = 0; 1 < 3; i++) {
                matriz[i][j] = (int) Math.floor(Math.random() * 9);
            }
        }
        for (j = 0; j < 3; j++) {
            for (i = 0; i < 3; i++) {
                System.out.print(matriz[i][j] + "");
            }
            System.out.println("");
        }
        System.out.println("---------------");
        for (j = 0; j < 3; j++) {
            for (i = 0; i < 3; i++) {
                System.out.print(matriz[j][i] + "");
            }
            System.out.println("");
        }
    }
}
