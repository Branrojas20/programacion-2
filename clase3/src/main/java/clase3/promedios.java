package clase3;

import java.util.Date;
import java.util.Scanner;

public class promedios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Date fecha = new Date();
        int nota;
        String respuesta = "s";
        while (respuesta.equals("S") || (respuesta.equals("s"))) {
            System.out.println("Digite la nota correspondiente entre 40-100");
            nota = entrada.nextInt();

            switch ((40 <= nota && nota < 70) ? 1
                    : (nota >= 70 && nota <= 80) ? 2
                            : (nota > 80 && nota <= 90) ? 3
                                    : (nota > 90 && nota <= 100) ? 4 : 5) {
                case 1:
                    System.out.println("La nota es insuficiente");
                     
                    break;
                case 2:
                    System.out.println("La nota da para pasar");
                    break;
                case 3:
                    System.out.println("tiene buena nota");
                    break;
                case 4:
                    System.out.println("Excelente  nota");
                    break;
                case 5:
                    System.out.println("Digite una nota valida");
                    break;

            }
            System.out.println("Desea continuar s/n");
            respuesta = entrada.next();
        }
    }
}
