package practiceExercises.EjerciciosParcial2.Exercise1;

public class EntradaVip extends EntradaCine{
    public EntradaVip(String pelicula, String horario, double precio) {
        super(pelicula, horario, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 1.50;
    }
}





