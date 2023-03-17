package clase3;

public class numerosaleatorios {

    public static void main(String[] args) {

        //ingrese 10 posiciones con numeros aleatorios
        //entre 0 y 100 y sume dichos numeros
        int i, numero, suma = 0;
        System.out.println("ciclo for");
        for (i = 1; i <= 10; i++) {
            numero = (int) Math.floor(Math.random() * 100);
            suma += numero;
            System.out.println(i + ": El numero es: " + numero);
        }
        System.out.println("La suma es : " + suma);
    }
}
