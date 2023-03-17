package Herencia;

import javax.swing.JOptionPane;

public class Estudiante extends Personas {

    private String Nivel;
    private int Nota1;
    private int Nota2;
    private int Nota3;
    private double Promedio;

    public Estudiante(String Nivel, int Nota1, int Nota3, double Promedio, String Nombre, String Apellido, int Edad, int ID) {
        super(Nombre, Apellido, Edad, ID);//atributos heredados
        this.Nivel = Nivel;
        this.Nota1 = Nota1;
        this.Nota3 = Nota3;
        this.Promedio = Promedio;
    }
    Estudiante(){
    
    }

    void DatosEstudiantes() {
        setNombre(JOptionPane.showInputDialog("Ingrse el nombre del Estudiante"));
        setApellido(JOptionPane.showInputDialog("Ingrse el Apellido del alumno"));
        setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Estudiante")));
        setID(Integer.parseInt(JOptionPane.showInputDialog("Digite el Id del estudiante")));

        Nivel = JOptionPane.showInputDialog("Ingres el nivel del estudiante: ");
        Nota1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 1 en base 100"));
        Nota2 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 2 en base 100"));
        Nota3 = Integer.parseInt(JOptionPane.showInputDialog("Digite la nota 3 en base 100"));
        Promedio = (double) (Nota1 + Nota2 + Nota3) / 3;

    }
   
    void MostrarDatos() {
        JOptionPane.showInputDialog(null, "Datos del estudiante"
                + "\n El Nombre es : " + getNombre()
                + "\n El apellido es : " + getApellido()
                + "\n La edad es : " + getEdad()
                + "\n El ID es: " + getID()
                + "\n El nivel es :" + Nivel
                + "\n El promedio es: " + Promedio);
    }
}
