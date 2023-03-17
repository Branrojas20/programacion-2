/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea1;

import java.util.Scanner;

/**
 *
 * @author branr
 */
public class nota1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1)datos
        String nombre = null;
        double participacion = 0, primerparcial = 0, segundoparcial = 0, examenfinal = 0, notafinal = 0;
        // 2)Mis entradas
        System.out.println("Digite su nombre:");
        nombre = entrada.next();
        
        System.out.println("Digite la nota de participacion en clase: ");
        participacion = entrada.nextDouble();

        System.out.println("Digite la nota del primer parcial: ");
        primerparcial = entrada.nextDouble();

        System.out.println("Digite la nota del segundo parcial: ");
        segundoparcial = entrada.nextDouble();

        System.out.println("Digite la nota de su examen final: ");
        examenfinal = entrada.nextDouble();

        //3) proceso de datos
        participacion *= 0.20;
        primerparcial *= 0.20;
        segundoparcial *= 0.25;
        examenfinal *= 0.35;

        notafinal = participacion + primerparcial + segundoparcial + examenfinal;
        //4)salida de datos
        System.out.println("Nombre de estudiante: " + nombre
                + "\n La nota final es de: " + notafinal);
    }

}
