/*
1)) Realice un programa en java que calcule el número de CD y DVD que necesarios
para hacer una copia de seguridad de la información almacenada en un disco duro 
(Indicar información en GB) los CD almacenan 700MB=0.7GB y en DVD 4.7 GB. 
 */
package Tarea2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class problema1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.00");

        double cd = 0.7, dvd = 4.7;
        double copiaseguridad;
        double cantidadcd, cantidaddvd;

        System.out.println("Digite la cantidad de GB que quieres guardar: ");
        copiaseguridad = entrada.nextDouble();

        cantidaddvd = copiaseguridad / dvd;//4.7GB
        cantidadcd = copiaseguridad / cd;//700MB = 0.7GB
        //redondiar la cantidad 
        int cantidadCDredondeada = (int) Math.ceil(cantidadcd);
        int cantidadDVDredondeada = (int) Math.ceil(cantidaddvd);
        // salida
        System.out.println("cantidad de CD: " + cantidadCDredondeada
                + "\ncantidad de DVD: " + cantidadDVDredondeada);

    }
}
