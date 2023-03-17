package com.mycompany.clase1;

import javax.swing.JOptionPane;

public class joptionentrada {

    public static void main(String[] args) {
        double valor1, valor2, suma,resta;
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el primer valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el Segundo valor: "));
        suma=valor1+valor2;
        resta=valor1-valor2;
        JOptionPane.showMessageDialog(null,"La suma es: "+ suma
        +"\n La resta es : "+resta);
    }

}
