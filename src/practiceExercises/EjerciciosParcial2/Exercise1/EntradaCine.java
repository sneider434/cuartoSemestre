package practiceExercises.EjerciciosParcial2.Exercise1;

import java.util.ArrayList;

public class EntradaCine {
    public static final String NOMBRE_CINE = "Cine Colombia";
    private ArrayList<EntradaCine> voletas;
    private String pelicula;
    private String horario;
    private double precio;

    public EntradaCine(String pelicula, String horario, double precio) {
        this.setPrecio(precio);
        this.setPelicula(pelicula);
        this.setHorario(horario);
        voletas = new ArrayList<>();
    }

    public void agregarVoletas(EntradaCine voleta){
        voletas.add(voleta);
    }
    public String getPelicula() { return pelicula; }
    public String getHorario() { return horario; }
    public double getPrecio() { return precio; }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    public void setHorario(String horario){
        this.horario=horario;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double calcularPrecioFinal() {
        return precio;
    }
}
