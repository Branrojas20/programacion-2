//Ejercicio 1:
//
//La universidad cuenta con 3 tipos de empleados para el cálculo del salario mensual.
//Tipo A   (Precio Hora 5000)
//Tipo B   (Precio Hora 3000)
//Tipo C   (Precio Hora 1575.25)
//Se debe implementar un procedimiento que calcule el salario mensual del empleado de acuerdo al tipo asignado.
//La fórmula es la siguiente:
//Salario Neto = Salario Bruto - Cargas Sociales
//Salario Bruto =  Cantidad Horas * precio Hora
//Precio Hora =  de acuerdo al tipo de empleado.
//
//El patrono, desea otorgar un bono de 5% sobre el salario bruto; siempre y 
//cuando la antiguedad del empleado sea superior a 10 años de laborar en la empresa.
//
//El sistema debe validar que no se ingrese un tipo de empleado diferente al establecido..
//Las cargas sociales son el 9,7% sobre el salario bruto.
package tarea3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("##.00");

        int tipo;
        double precioHora = 0;
        double years;
        double horasTrabajo;
        double salarioBruto;
        double salarioNeto;

        System.out.println("Seleccione tipo de empleado (1=A, 2=B o 3=C):");
        tipo = entrada.nextInt();
        switch (tipo) {
            case 1:
                precioHora = 5000;
                break;
            case 2:
                precioHora = 3000;
                break;
            case 3:
                precioHora = 1575.25;
                break;
            default:
                System.out.println("Tipo de empleado inválido");
                break;
        }
        System.out.println("Horas trabajadas:");
        horasTrabajo = entrada.nextDouble();
        
        System.out.println("Años trabajados en la empresa:");
        years = entrada.nextDouble();
        
        salarioBruto = horasTrabajo * precioHora;
        
        if (years >= 10) {
            salarioBruto *= 1.05;
        }
         salarioNeto = salarioBruto * (1 - 0.097);
        System.out.println("Precio por hora: " + precioHora
                + "\nSalario bruto: " + df.format(salarioBruto)
                + "\nSalario neto: " + df.format(salarioNeto));
    }
}
