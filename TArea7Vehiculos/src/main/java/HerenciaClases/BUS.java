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
public class BUS extends VEHICULO{
      private String COLOR;
    private int CAPACIDAD;

    public BUS(String COLOR, int CAPACIDAD, String MARCA, int MODELO) {
        super(MARCA, MODELO);
        this.COLOR = COLOR;
        this.CAPACIDAD = CAPACIDAD;
    }

  public BUS()
    {
        
    }
    void Datos() {
        //   MARCA = JOptionPane.showInputDialog("Digite la Marca del vehiculo: ");
        //   MODELO = Integer.parseInt(JOptionPane.showInputDialog("Digite el Modelo del vehiculo: "));
        setMARCA(JOptionPane.showInputDialog("Ingrse Marca del Vehiculo: "));
        setMODELO(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el MODELO del Vehiculo:")));

        COLOR = JOptionPane.showInputDialog("Digite el Color del vehiculo: ");
        CAPACIDAD = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del Vehiculo:"));
    }

    void MostrarDatos() {
        JOptionPane.showInputDialog(null, "Datos del BUS"
                + "\n Marca : " + getMARCA()
                + "\n MODELO: " + getMODELO()
                + "\n COLOR: " +COLOR
                + "\n CAPACIDAD: " +CAPACIDAD) ;

    }
}
