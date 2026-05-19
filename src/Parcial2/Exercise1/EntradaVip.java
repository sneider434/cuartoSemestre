package Parcial2.Exercise1;

public class EntradaVip extends EntradaCine{
    private static final double COSTOVIP = 1.50;
    public EntradaVip(String pelicula, String horario, double precio) {
        super(pelicula, horario, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() *COSTOVIP;
    }
}





