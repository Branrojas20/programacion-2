/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaClases;

/**
 *
 * @author branr
 */
public class VEHICULO {
      private String MARCA;
    private int MODELO;
    

    public VEHICULO(String MARCA, int MODELO) {
        this.MARCA = MARCA;
        this.MODELO = MODELO;
       
    }
    public VEHICULO()
    {
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public int getMODELO() {
        return MODELO;
    }

    public void setMODELO(int MODELO) {
        this.MODELO = MODELO;
    }
  
}
