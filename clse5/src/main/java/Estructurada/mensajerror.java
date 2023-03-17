
package Estructurada;

import java.util.Scanner;

public class mensajerror {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;
        try{
        System.out.println("Digite numero");
        numero=entrada.nextInt();
        System.out.println("El numero es:"+ numero);
        }catch(Exception e){
            System.out.println("ingrese un dato entero");
        }

    }
}