//Ejercicio 2:
//Utilicé un switch y realice los siguientes programas según corresponda cada case.
//
//Case 1:
//
//Cree un programa que capture la cantidad de votos para dos candidatos, 
//calcule el porcentaje de cada uno e indique quien fue el ganador.
//
//case 2:
//
//Realice  un programa que imprima n cantidad de datos impares  y sume dichos número al final.
//case 3:
//
//Realice  un programa que imprima n cantidad de datos pares y sume dichos número al final.
//case 4:
//Realice un programa que ingrese un ciclo del 1 al 40 y 
//se imprima los numero múltiplos de 5 y 6 y se indique en la salida, imprimir también los que no son múltiplos.
//
//Indicar también si se desea continuar o no
package tarea3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int menu;
        int i;
        int n;
        int sumaImpares;
        int sumaPares;
        int num;
        String divisible5;
        String divisible6;
        String Nodivisible5;
        String Nodivisible6;
        int votos;
        int candidato1;
        int candidato2;
        int voto;
        boolean continuar = true;
        int votonew;
        boolean validar = false;
        String respuesta = "s";
        while (respuesta.equals("S") || (respuesta.equals("s"))) {
            System.out.println("MENU \n"
                    + "1.Calculo de votos \n"
                    + "2. Cantidad de datos impares \n"
                    + "3. Cantidad  de datos pares \n"
                    + "4. Calcular multiplos de 5 y 6 ");
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    votos = 0;
                    candidato1 = 0;
                    candidato2 = 0;
                    continuar = true;
                    do {
                        System.out.println("Por cual candidato desea votar: \n"
                                + "1.Candidato 1\n"
                                + "2.Candidato 2");
                        voto = entrada.nextInt();
                        votos++;
                        if (voto == 1) {
                            candidato1++;
                        } else {
                            candidato2++;
                        }
                        System.out.println("Desea votar de nuevo: \n"
                                + "1.SI \n"
                                + "2.NO ");
                        continuar = entrada.nextInt() != 2;
                    } while (continuar);

                    System.out.println("El resultado de votos es: \n"
                            + "Cantiad total de los votos: " + votos + "\n"
                            + "Votos al candidato 1: " + candidato1 + "\n"
                            + "Votod al candidato 2: " + candidato2 + "\n"
                            + "Porcentaje de los votos al candidato 1: " + (candidato1 * 100) / votos + "%\n"
                            + "Porcentaje de los votos al candidato 2: " + (candidato2 * 100) / votos + "%");
                    break;

                case 2:
                    System.out.println("Digite un entero positivo: ");
                    n = entrada.nextInt();
                    sumaImpares = 0;
                    for (i = 1; i <= n; i++) {
                        if (i % 2 != 0) {
                            sumaImpares += i;
                        }
                    }
                    System.out.println("La suma de los numeros impares hasta " + n + " es : " + sumaImpares);
                    break;

                case 3:
                    System.out.println("Ingrese un entero positivo: ");
                    n = entrada.nextInt();
                    sumaPares = 0;
                    for (i = 2; i <= n; i += 2) {
                        sumaPares += i;
                    }
                    System.out.println("La suma de los numeros pares hasta " + n + " es : " + sumaPares);
                    break;
                case 4:
                    divisible5 = "";
                    divisible6 = "";
                    Nodivisible5 = "";
                    Nodivisible6 = "";

                    for (i = 1; i <= 40; i++) {
                        if (i % 5 == 0) {
                            divisible5 += i + "\n";
                        } else if (i % 6 == 0) {
                            divisible6 += i + "\n";
                        } else if (i % 5 != 0) {
                            Nodivisible5 += i + "\n";
                        } else {
                            Nodivisible6 += i + "\n";
                        }
                    }

                    System.out.println("Los números divisibles entre cinco son: \n" + divisible5);
                    System.out.println("Los números divisibles entre seis son: \n" + divisible6);
                    System.out.println("Los números no divisibles entre cinco son: \n" + Nodivisible5);
                    System.out.println("Los números no divisibles entre seis son: \n" + Nodivisible6);
                    break;
            }
            System.out.println("Desea continuar s/n");
            respuesta = entrada.next();
        }
    }
}
