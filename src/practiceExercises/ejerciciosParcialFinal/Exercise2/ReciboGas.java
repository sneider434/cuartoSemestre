package practiceExercises.ejerciciosParcialFinal.Exercise2;

public class ReciboGas implements Pagos {
    public static final double IMPUESTOGAS = 1.2;
    private double precio;

    public ReciboGas(double precio) {
        this.setPrecio(precio);
    }
    public double totalPagar(){
        return this.getPrecio()*ReciboGas.IMPUESTOGAS;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
