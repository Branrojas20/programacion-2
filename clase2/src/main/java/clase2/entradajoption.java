package clase2;

import javax.swing.JOptionPane;

public class entradajoption {

    public static void main(String[] args) {
        String cadena;
        int entero;
        double decimal;
        char caracter;

        cadena = JOptionPane.showInputDialog("Digite el valor de cadena");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite el entero"));
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite el caracter"));
        caracter = JOptionPane.showInputDialog("Digite el caracter").charAt(0);

        JOptionPane.showMessageDialog(null, "La cadena es : " + cadena
                + "\nEl entero es: " + entero
                + "\nEl decimal es:" + decimal
                + "\nEl caracter es : " + caracter);
    }
}
