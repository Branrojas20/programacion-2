/*
ingrese metros cubicos de agua
8 metros cubicos o menos paga 10000 colones
despues de 8 metros cubicos hasta los 14 metros cubicos se paga el base (10000)
mas 800 colones por metro cubico adicional,
despues de los 14 metros cubicos se paga el base de los 8 (10000)
mas el adicional entre 8 y 14 metros, mas 500 colones para cada metro cubico adicional.

ejemplo:
9metros= 10800

15metros= (10000) + (6metros*800)+ 500


son 500 cada vez que se pasa de 14
 */
package clase2;

import java.util.Scanner;

public class recibodeagua {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //1)datos
        int metrosutilizados, metros1, metros2;
        int preciobase;

        int precio2;
        int metros3, metros4;
        //3) proceso de datos
        System.out.println("Ingrse metros cubicos gastados: ");
        metrosutilizados = entrada.nextInt();
        //4)salida de datos

        preciobase = 10000;

        metros1 = 800;
        metros2 = preciobase + ((metrosutilizados - 8) * metros1);

        precio2 = 14800;
        metros3 = 500;
        metros4 = precio2 + ((metrosutilizados - 14) * metros3);

        if (metrosutilizados <= 8) {

            System.out.println("El monto a pagar es de: " + preciobase);

        } else if ((metrosutilizados > 8) && (metrosutilizados <= 14)) {

            System.out.println("El monto a pagar es de: " + metros2);
        } else {
            System.out.println("El monto a pagar: " + metros4);
        }

    }
}
