/*
2) Realice un programa en java donde se ingrese producto y se indique
el monto del producto y el monto con descuento igual mente indique el
monto total a pagar. Camisas (Escribir precio) descuento 6%, 
Vestidos (Escribir precio) descuento 12%, Zapatos (Escribir precio)
descuento 9%, Pantalones (Escribir precio) descuento (4%).
 */
package Tarea2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class problema2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.00");

        int productos;
        int Camisas = 10, Vestidos = 20, Zapatos = 30, Pantalones = 40;
        double precio = 0, descuento = 0, montofinal = 0;

        int camisascanitidad = 0, vestidoscantidad = 0, zapatoscantidad = 0, pantalonescantidad = 0;

        System.out.println("Elija el producto que desea: ");

        System.out.println("10 para Camisas");
        System.out.println("20 para Vestidos");
        System.out.println("30 para Zapatos");
        System.out.println("40 para Pantalones");
        System.out.println("Digite el numero del producto elegido: ");

        productos = entrada.nextInt();

        switch (productos) {

            case 10://camisas
                System.out.println("Cantidad de camisas que desea: ");
                camisascanitidad = entrada.nextInt();
                // Camisas;
                precio = 7500 * camisascanitidad;
                descuento = precio * 0.06;
                montofinal = precio - descuento;
                System.out.println("Producto:  camisas ");
                System.out.println("cantidad:" + camisascanitidad);
                System.out.println("Precios: " + precio);
                System.out.println("Descuento de 6%: " + df.format(descuento));
                System.out.println("Mont Final: " + df.format(montofinal));
                break;

            case 20:// Vestidos;

                System.out.println("Cantidad de vestidos que desea: ");
                vestidoscantidad = entrada.nextInt();

                precio = 18000 * vestidoscantidad;
                descuento = precio * 0.12;
                montofinal = precio - descuento;

                System.out.println("Producto:  Vestidos");
                System.out.println("cantidad:" + vestidoscantidad);
                System.out.println("Precios : " + precio);
                System.out.println("Descuento de 12%: " + df.format(descuento));
                System.out.println("Mont Final: " + df.format(montofinal));
                break;

            case 30://  Zapatos;

                System.out.println("Cantidad de zapatos que desea: ");
                zapatoscantidad = entrada.nextInt();

                precio = 7500 * zapatoscantidad;
                descuento = precio * 0.09;
                montofinal = precio - descuento;

                System.out.println("Producto:  Zapatos ");
                System.out.println("cantidad:" + zapatoscantidad);
                System.out.println("Precios: " + precio);
                System.out.println("Descuento del 9%: " + df.format(descuento));
                System.out.println("Mont Final: " + df.format(montofinal));
                break;

            case 40://  Pantalones;

                System.out.println("Cantidad de pantalones que desea: ");
                pantalonescantidad = entrada.nextInt();

                precio = 7500 * pantalonescantidad;
                descuento = precio * 0.04;
                montofinal = precio - descuento;

                System.out.println("Producto:  Pantalones ");
                System.out.println("cantidad:" + pantalonescantidad);
                System.out.println("Precios: " + precio);
                System.out.println("Descuento del 4%: " + df.format(descuento));
                System.out.println("Mont Final: " + df.format(montofinal));
                break;

            default:
                System.out.println("Error");
        }
    }
}
