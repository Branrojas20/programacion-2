package clase2;

import java.util.Scanner;

/*
Ingrese valor y determine si es 0 neutro,positivo,negativo y par o impar
 */
public class condicionales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //1)datos
        int numero, i, limite;
        String respuesta="s";
        while(respuesta.equals("S")||(respuesta.equals("s"))){
        System.out.println("Digitela cantidad de numeros: ");
        limite = entrada.nextInt();
        for (i = 1; i <= limite; i++) {
            //3) proceso de datos
            System.out.println("Digite un numero: ");
            numero = entrada.nextInt();
            //4)salida de datos
            if (numero == 0) {
                System.out.println("El numero es neutro: " + numero);
            } else if (numero > 0) {
                System.out.println("El numero es positivo: " + numero);
            } else {
                System.out.println("El numero  es negativo: " + numero);
            }
            if (numero % 2 == 0) {
                System.out.println("El numero  es par: " + numero);
            } else {
                System.out.println("El numero es Impar: " + numero);
            }
 System.out.println("Desea continuar s/n");
 respuesta= entrada.next();}
        }//cierra la main
    }
}
