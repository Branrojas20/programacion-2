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
public class horastrabajo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1) Datos
        String nombre = null;
        double horasdia, salariohora, salariodia, salariosemana, salariomes, salarioano;

        // 2) Mis entradas
        System.out.println("Digite su nombre:");
        nombre = entrada.next();

        System.out.println("Digite las horas trabajadas: ");
        horasdia = entrada.nextDouble();

        System.out.println("Digite el salario por hora: ");
        salariohora = entrada.nextDouble();

        //3) proceso de datos
        salariodia = horasdia * salariohora;
        salariosemana = salariodia * 5;
        salariomes = salariosemana * 4.33;
        salarioano = salariomes * 12;

        //salida de datos
        System.out.println("Nombre del trabajador: " + nombre
                + "\n El salaraio en una hora es de : " + salariohora
                + "\n El salario en un dia es de: " + salariodia
                + "\n El salario en una sema es de:" + salariosemana
                + "\n El salario en un mes es de:" + salariomes
                + "\n El salario en ano es de:" + salarioano);
    }

}
