//ingresar 6 nombres 
//ingresar 6notas
//imprimir en la salida el nombre con la nota meyor
//y el nombre con la nota menor
//imprimir promedio global
package com.mycompany.clase4;

import java.util.Scanner;

public class promedionotas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombre = new String[6];
        double[] nota = new double[6];
        int i, notamaxima = 0, notaminima = 101;
        String nombremaximo = "", nombreminimo = "";
        float promedio = 0;
        for (i = 0; i < 6; i++) {

            System.out.println("Digite el nombre y la nota del alumno: ");
            nombre[i] = entrada.next();
            nota[i] = entrada.nextDouble();
            promedio = (float) (promedio + nota[i] / 6);

        }
        if (nota[i] > notamaxima) {
            notamaxima = (int) nota[i];
            nombremaximo = nombre[i];
        }
        if (nota[i] < notaminima) {
            notaminima = (int) nota[i];
            nombreminimo = nombre[i];
        }
        System.out.println("Impresion de Nombre y Notas");
        for (i = 0; i < 6; i++) {
            System.out.println(i + 1 + ")" + nombre[i] + " Tiene una nota de :" + nota[i]);
        }
        System.out.println("Impresion de Promedios");
        System.out.println(nombremaximo + " Tiene la nota mayor :" + notamaxima);

        System.out.println(nombreminimo + " Tiene la nota manor :" + notaminima);

        System.out.println("El promedio general es: " + promedio);

    }

}
