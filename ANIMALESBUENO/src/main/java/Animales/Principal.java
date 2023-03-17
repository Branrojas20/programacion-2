package Animales;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        int limite,i,altura,peso;
        String especie,nombre,raza,color,pelaje;
        
        limite = Integer.parseInt(JOptionPane.showInputDialog("Digite cantidad de animales: "));
        Animales[] animales = new Animales[limite];
        for ( i = 0; i < limite; i++) {
             especie = JOptionPane.showInputDialog("Digite especie del animal #" + (i + 1) + ": ");
            nombre = JOptionPane.showInputDialog("Digite nombre del " + especie + " #" + (i + 1) + ": ");
            LocalDate fechaNacimiento = LocalDate.parse(JOptionPane.showInputDialog("Digite fecha de nacimiento del " + especie + " #" + (i + 1) + " (formato yyyy-MM-dd): "));
            if (especie.equalsIgnoreCase("Caballo")) {
                 altura = Integer.parseInt(JOptionPane.showInputDialog("Digite altura del caballo #" + (i + 1) + ": "));
                 peso = Integer.parseInt(JOptionPane.showInputDialog("Digite peso del caballo #" + (i + 1) + ": "));
                animales[i] = new CABALLO();
            } else if (especie.equalsIgnoreCase("Perro")) {
                raza = JOptionPane.showInputDialog("Digite raza del perro #" + (i + 1) + ": ");
                 color = JOptionPane.showInputDialog("Digite color del perro #" + (i + 1) + ": ");
                animales[i] = new PERRO();
            } else if (especie.equalsIgnoreCase("Gato")) {
                pelaje = JOptionPane.showInputDialog("Digite pelaje del gato #" + (i + 1) + ": ");
                raza = JOptionPane.showInputDialog("Digite raza del gato #" + (i + 1) + ": ");
                animales[i] = new GATO();
            }
        }
        for (Animales animal : animales) {
            System.out.println(animal.getNombre() + " tiene " + animal.calcularEdad());
        }
    }

}
/////////////////////////////////////////////No logre los de los anos ///////////////////////////////////////////