package practiceExercises.ejerciciosClase.Exercise10;

public class Persona {
  private String nombre;
  private int edad;

    public Persona(String nombre,int edad) {
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public String getNombre() {

        return nombre;
    }

    public int getEdad() {

        return edad;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad>0){
            this.edad = edad;
        }else{
            System.out.println(this.nombre + " tu edad no puede ser menor a 1 ");
        }

    }
}
