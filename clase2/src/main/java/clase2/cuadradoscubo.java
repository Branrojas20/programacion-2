package clase2;

import java.text.DecimalFormat;
import java.util.Scanner;


public class cuadradoscubo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.00");
       
        double numero;

        System.out.println("Digite el numero: ");
        numero = entrada.nextDouble();
        System.out.println("El cuadrado es: " + Math.pow(numero, 2)
                + "\n el cubo es: " + Math.pow(numero, 3)
                + "\n La raiz cuadrada es: " + Math.sqrt(numero)
                + "\nLa raiz cubica es n:" + Math.cbrt(numero));

    }
}
