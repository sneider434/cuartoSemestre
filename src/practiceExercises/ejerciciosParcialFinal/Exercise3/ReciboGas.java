package practiceExercises.ejerciciosParcialFinal.Exercise3;

public class ReciboGas implements  Pagos{
    public static final double IMPUESTOGAS = 1.1;
    private double precio ;
    public ReciboGas(double precio){
        this.setPrecio(precio);
    }

    @Override
    public double totalPagar() {
        return getPrecio()*IMPUESTOGAS;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
