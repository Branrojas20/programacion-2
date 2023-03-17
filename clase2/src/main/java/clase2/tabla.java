/*

 */
package clase2;

import java.util.Scanner;

public class tabla {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int limite, tabla, i;
        String respuesta = "s";

        System.out.println("Digite el nuemro al multiplicar: ");
        tabla = entrada.nextInt();
        System.out.println("Digite el limite de multiplicaciones: ");
        limite = entrada.nextInt();
        while (respuesta.equals("S") || (respuesta.equals("s"))) {

             for (i = 0; i <= limite; i++) {
                System.out.println(tabla + " * " + i + "=" + tabla * i);

            }
            System.out.println("Desea continuar s/n");
            respuesta = entrada.next();
        }

    }
}
