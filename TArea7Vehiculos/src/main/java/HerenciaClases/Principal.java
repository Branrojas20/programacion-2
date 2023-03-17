/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaClases;

import javax.swing.JOptionPane;

/**
 *
 * @author branr
 */
public class Principal {
      public static void main(String[] args) {
        int limite, i;
        String respuesta = "s";
        while (respuesta.equals("s") || respuesta.equals("s")) {
            limite = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de VEHICULOS"));
            for (i = 1; i <= limite; i++) {

                BUS imprimir = new BUS();
                imprimir.Datos();
                imprimir.MostrarDatos();

                TAXI buscar = new TAXI();
                buscar.DatosTX();
                buscar.MostrarDatosTX();

            }

            respuesta = JOptionPane.showInputDialog("continuar S/s=continuar o N=salir");
        }
    }
}
