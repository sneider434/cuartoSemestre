package practiceExercises.ejerciciosClase.Exercise19;

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
    // clases abstractes
    public abstract double calcularArea();
    public abstract double hallarPerimetro();
}
