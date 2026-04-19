package practiceExercises.ejerciciosClase.Exercise18;

public abstract class Figura {
 private String nombre;

    public Figura(String nombre) {
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract double hallarArea();
}
