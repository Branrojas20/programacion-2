package Herencia;

import com.mycompany.clase7.colaborador;
import javax.swing.JOptionPane;

public class PrincipalEjecutar {

    public static void main(String[] args) {
        int limite, i;
        String respuesta = "s";
        while (respuesta.equals("s") || respuesta.equals("s")) {
            limite = Integer.parseInt(JOptionPane.showInputDialog("digite cantidad de colaboradores"));
            for (i = 1; i <= limite; i++) {
                colaborador imprimircolaborador = new colaborador();
                imprimircolaborador.DatosColaborador();
                imprimircolaborador.MostararDatosColaborador();

                Estudiante imprimir = new Estudiante();
                imprimir.DatosEstudiantes();
                imprimir.MostrarDatos();
            }
            respuesta = JOptionPane.showInputDialog("continuar S/s=continuar o N=salir");
        }
    }
}
