
package Animales;

import java.time.LocalDate;
import java.time.Period;


public class Animales {
      private String nombre;
   private  String especie;
    LocalDate fechaNacimiento;

    public Animales(String nombre, String especie, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.especie = especie;
        this.fechaNacimiento = fechaNacimiento;
        
    }
public Animales(){


}
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
     public String calcularEdad() {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, hoy);
        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        return años + " años, " + meses + " meses y " + dias + " días";
    }
}
