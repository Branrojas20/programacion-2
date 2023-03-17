package Animales;

import javax.swing.JOptionPane;

public class PERRO extends Animales {

    private String raza;
    private String color;

    public PERRO(String raza, String color) {
        this.raza = raza;
        this.color = color;
    }

    public PERRO() {

    }

    public void DatosPERRO() {

        setNombre(JOptionPane.showInputDialog("Digite el Nombre: "));
        setEspecie(JOptionPane.showInputDialog("Digite LA especie: "));

        raza = JOptionPane.showInputDialog("Digite la raza: ");
        color = JOptionPane.showInputDialog("Digite el Color: ");
    }

    void MostrarDatosPERRO() {
        JOptionPane.showMessageDialog(null, "Datos del Animal"
                + "\n Nombre : " + getNombre()
                + "\n Especie: " + getEspecie()
                + "\n Peso: " + raza
                + "\n Color: " + color);

    }

}
