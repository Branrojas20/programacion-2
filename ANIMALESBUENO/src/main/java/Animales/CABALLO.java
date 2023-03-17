
package Animales;

import java.time.LocalDate;
import javax.swing.JOptionPane;



public class CABALLO extends Animales {
    
     private int altura;
    private int peso;

    public CABALLO(int altura, int peso, String nombre, String especie, LocalDate fechaNacimiento) {
        super(nombre, especie, fechaNacimiento);
        this.altura = altura;
        this.peso = peso;
    }
public CABALLO(){

}
    public void DatosCABALLO(){
        
    setNombre(JOptionPane.showInputDialog("Digite el Nombre: "));
     setEspecie(JOptionPane.showInputDialog("Digite LA especie: "));
//      setFechaNacimiento(Integer.parseInt(JOptionPane.showInputDialog("Digite el Color del vehiculo: ")));
    
    
        altura= Integer.parseInt(JOptionPane.showInputDialog("Digite la altura: "));
        peso= Integer.parseInt(JOptionPane.showInputDialog("Digite el peso: "));
        
        
//          
    }
    void MostrarDatosCaballo()
    {
      JOptionPane.showMessageDialog(null,"Datos del Animal"
             + "\n Nombre : " + getNombre()
               + "\n Especie: " + getEspecie()
               + "\n Altura: " +altura
                + "\n Peso: " +peso) ;
    
    }

  
   
}
