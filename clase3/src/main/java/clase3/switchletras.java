package clase3;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class switchletras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char letra;
        System.out.println("Digite la letra correspondiente: ");
        letra = entrada.nextLine().charAt(0);
        switch (letra) {

            case 'A' | 'a':
                System.out.println("Hola a todos");
                break;
            case 'B' | 'b':
                System.out.println("Exceelente todo");
                break;
            default:
                System.out.println("Digite una letra valida: ");
        }

    }
}
