package POO;

import java.util.Scanner;

public class vehiculo {

    String color;
    String marca;
    int kms;
    String modelo;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        vehiculo taxi = new vehiculo();// objeto de la clase vehiculo
        taxi.color = "Rojo";
        taxi.marca = "Bmw";
        taxi.kms = 1200;
        taxi.modelo = "M2";
        System.out.println("El color del taxi es:" + taxi.color);
        System.out.println("La marca del taxi es:" + taxi.marca);
        System.out.println("El Kilometraje del taxi es:" + taxi.kms);
        System.out.println("El modelo del taxi es:" + taxi.modelo);
        System.out.println("-----------------------------------");
        System.out.println("Este es otro objeto");

        vehiculo bus = new vehiculo();
        System.out.println("digite el color");
        bus.color = entrada.next();
        System.out.println("digite el kilometraje");
        bus.kms = entrada.nextInt();
        System.out.println("digite la marca");
        bus.marca = entrada.next();
        System.out.println("digite el modelo");
        bus.modelo = entrada.next();
        System.out.println("-------------------------");
        System.out.println("El color del taxi es:" + bus.color);
        System.out.println("La marca del taxi es:" + bus.marca);
        System.out.println("El Kilometraje del taxi es:" + bus.kms);
        System.out.println("El modelo del taxi es:" + bus.modelo);
    }

}
