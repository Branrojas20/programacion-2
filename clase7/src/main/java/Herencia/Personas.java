
package Herencia;



public class Personas {
    private String Nombre;
     private String Apellido;
      private int Edad;
       private int ID;
// Constructor inicializa los atributos
    public Personas(String Nombre, String Apellido, int Edad, int ID) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.ID = ID;
    }
    public Personas(){
        
    }
 //crear metodos setter y getter cuando los atributos son privados      

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    void datostudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
       
}
