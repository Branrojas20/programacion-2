package com.mycompany.clase7;

import javax.swing.JOptionPane;

public class PrincipalEjecutar {

    public static void main(String[] args) {

        int limite, i;
        String respuesta = "s";
        while (respuesta.equals("s") || respuesta.equals("s")){
        limite = Integer.parseInt(JOptionPane.showInputDialog("digite cantidad de colaboradores"));
        for (i = 1; i <= limite; i++) {
            colaborador datos = new colaborador();
            datos.IngresarDatos();
            datos.imprimir();
        }
        respuesta = JOptionPane.showInputDialog("continuar S/s=continuar o N=salir");

    }
    }
}
