
package com.mycompany.clase7;

import javax.swing.JOptionPane;

public class colaborador {
     // atributos 

    String Nombre;
    String Puesto;
    int Edad;
    int SalarioBase;
    float Comision;
    float Dedicacion;
    float SalarioNeto;
//crear metodo

    public void IngresarDatos() {
        Nombre = JOptionPane.showInputDialog("digite el nombre del colaborador");
        Puesto = JOptionPane.showInputDialog("digite el puesto del colaborador");
        Edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la Edad del colaborador:"));
       SalarioBase = Integer.parseInt(JOptionPane.showInputDialog("Digite el salariobase del colaborador:"));
    
        Comision = SalarioBase * 0.10f;
        Dedicacion = SalarioBase * 0.07f;
        SalarioNeto = SalarioBase + Comision + Dedicacion;

    }

    public void imprimir() {
        JOptionPane.showInputDialog(null, "datos del colaborador"
                + "\n el Nombre es:" + Nombre
                + "\n el Puesto es:" + Puesto
                + "\n la Edad es:" + Edad
                + "\n el SalarioBase es:" + SalarioBase
                + "\n la Salario Neto es:" + SalarioNeto);
        
    }

    public void DatosColaborador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void MostararDatosColaborador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}

