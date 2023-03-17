package Animales;

import javax.swing.JOptionPane;

public class GATO extends Animales {

    private String pelaje;
    private String raza;

    public GATO(String pelaje, String raza) {
        this.pelaje = pelaje;
        this.raza = raza;
    }

    public GATO() {
    }

    public void DatosGATO() {

        setNombre(JOptionPane.showInputDialog("Digite el Nombre: "));
        setEspecie(JOptionPane.showInputDialog("Digite LA especie: "));

        pelaje = JOptionPane.showInputDialog("Digite el pelaje: ");
        raza = JOptionPane.showInputDialog("Digite la raza: ");
    }

    void MostrarDatosGATO() {
        JOptionPane.showMessageDialog(null, "Datos del Animal"
                + "\n Nombre : " + getNombre()
                + "\n Especie: " + getEspecie()
                + "\n Peso: " + raza
                + "\n Color: " + pelaje);

    }

}
