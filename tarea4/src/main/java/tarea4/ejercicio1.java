/*
realice los siguientes vectores:

haga tres vectores :

1) el primero de 10 posiciones con números aleatorios  entre 1 y 50, 


2) el segundo vector de 20 posiciones, con numero aleatorios entre 1 y 100,

3) el  tercer vector de 30 posiciones con numero aleatorios entre 1 y 150



Obtenga la suma , mayor, menor de   cada vector.

Imprima en la salida los resultados de los tres  vectores.

Utilice un menú usando do while, igualemente indique si desea continuar o no


 */
package tarea4;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class ejercicio1 {

    public static void main(String args) {

        int[] vector1 = new int[10];
        int[] vector2 = new int[20];
        int[] vector3 = new int[30];
        boolean seguir = true;
        String respuesta = "";
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la opcion: \n"
                    + "1. 10 números aleatorios entre 1 y 50.\n"
                    + "2. 20 números aleatorios entre 1 y 100\n"
                    + "3. 30 números aleatorios entre 1 y 150\n"));

            switch (opcion) {

                case 1:
                    generarNumerosAleatorios(vector1, 1, 50);
                    mostrarResultados(vector1);
                    break;
                case 2:
                    generarNumerosAleatorios(vector2, 1, 100);
                    mostrarResultados(vector2);
                    break;
                case 3:
                    generarNumerosAleatorios(vector3, 1, 150);
                    mostrarResultados(vector3);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }

            respuesta = JOptionPane.showInputDialog("Desea continuar: SI / NO ");
            seguir = respuesta.equalsIgnoreCase("SI");

        } while (seguir);

    }

    public static void generarNumerosAleatorios(int[] vector, int min, int max) {
        int i;

        Random random = new Random();
        for (i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(max - min + 1) + min;
        }
    }

    public static void mostrarResultados(int[] vector) {
        int suma;
        int mayor;
        int menor;
        int i;
        String mensaje;

        suma = Arrays.stream(vector).sum();
        mayor = Arrays.stream(vector).max().getAsInt();
        menor = Arrays.stream(vector).min().getAsInt();

        mensaje = "Los números generados son:\n";
        for (i = 0; i < vector.length; i++) {
            //(i + 1) + para enumerar en clase 4.
            mensaje += (i + 1) + ")     " + vector[i] + "\n";
        }

        mensaje += " La suma de los números es: " + suma + "\n";
        mensaje += "El mayor número es: " + mayor + "\n";
        mensaje += "El menor número es: " + menor + "\n";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
