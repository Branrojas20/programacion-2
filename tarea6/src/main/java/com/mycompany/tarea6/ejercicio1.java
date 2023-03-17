package com.mycompany.tarea6;

import java.util.Date;
import javax.swing.JOptionPane;

public class ejercicio1 {

    public static void main(String[] args) {
        //VARIABLES
        int menu;
        double area;
        int respuesta;

        double radio;

        String baseString;
        String alturaString;
        double base;
        double altura;

        String ladoString;
        double lado;

        boolean continuarmenu = true;

        do {

            menu = Integer.parseInt(JOptionPane.showInputDialog("<html><font size='8' face='Arial'><font color='red'><b>---- METODOS ----</b></font><br>"
                    + "<font size='5'>1. Metodo Para saber el area de un circulo </font><br>"
                    + "<font size='5'>2.  Metodo Para saber el area de un Tringulo</font><br>"
                    + "<font size='5'>3.  Metodo Para saber el area de un Cuadrado</font><br>"
                    + "<font size='5'>4.  Metodo Para saber el area de un Rectangulo </font><br>"
                    + "<font size='5'>5. salir </font><br></html>"));

            switch (menu) {

                case 1:

                    String radioString = JOptionPane.showInputDialog("<html><font size='5' face='Arial'><font color='black'><b>Introduce el radio del círculo:</font><br></html>");
                    radio = Double.parseDouble(radioString);
                    area = Math.PI * Math.pow(radio, 2);
                    JOptionPane.showMessageDialog(null, "<html><font size='8' face='Arial'><font color='blue'><b>El área del círculo es: " + area + "</font><br></html>");

                    break;

                case 2:

                    baseString = JOptionPane.showInputDialog("<html><font size='5' face='Arial'><font color='black'><b>Introduce la base del triángulo:</font><br></html>");
                    base = Double.parseDouble(baseString);

                    alturaString = JOptionPane.showInputDialog("<html><font size='5' face='Arial'><font color='black'><b>Introduce la altura del triángulo:</font><br></html>");
                    altura = Double.parseDouble(alturaString);

                    area = (base * altura) / 2;

                    JOptionPane.showMessageDialog(null, "<html><font size='5' face='Arial'><font color='black'><b>El área del triángulo es: " + area + "</font><br></html>");

                    break;

                case 3:

                    ladoString = JOptionPane.showInputDialog("<html><font size='5' face='Arial'><font color='black'><b>Introduce el lado del cuadrado:</font><br></html>");
                    lado = Double.parseDouble(ladoString);

                    area = lado * lado;

                    JOptionPane.showMessageDialog(null, "<html><font size='5' face='Arial'><font color='black'><b>El área del cuadrado es: " + area + "</font><br></html>");
                    break;
                case 4:

                    baseString = JOptionPane.showInputDialog("<html><font size='5' face='Arial'><font color='black'><b>Introduce la base del rectángulo:</font><br></html>");
                    base = Double.parseDouble(baseString);

                    alturaString = JOptionPane.showInputDialog("<html><font size='5' face='Arial'><font color='black'><b>Introduce la altura del rectángulo:</font><br></html>");
                    altura = Double.parseDouble(alturaString);

                    area = base * altura;

                    JOptionPane.showMessageDialog(null, "<html><font size='5' face='Arial'><font color='black'><b>El área del rectángulo es: " + area + "</font><br></html>");

                    break;
                case 5:
                    continuarmenu = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "<html><font size='5' face='Arial'><font color='black'><b>Opción no válida.</font><br></html>");
                    break;
            }

            if (continuarmenu) {
                respuesta = JOptionPane.showConfirmDialog(null, "<html><font size='5' face='Arial'><font color='blue'><b>¿Desea volver al menú?</font><br></html>");
                if (respuesta != JOptionPane.YES_OPTION) {
                    continuarmenu = false;
                }
            }

        } while (continuarmenu == true);

    }

}
