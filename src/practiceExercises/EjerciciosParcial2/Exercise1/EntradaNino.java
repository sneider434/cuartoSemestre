package practiceExercises.EjerciciosParcial2.Exercise1;

public class EntradaNino extends EntradaCine{
    public EntradaNino(String pelicula, String horario, double precio) {
        super(pelicula, horario, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 0.70;
    }
}
