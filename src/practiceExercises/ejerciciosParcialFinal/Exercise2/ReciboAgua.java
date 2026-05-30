package practiceExercises.ejerciciosParcialFinal.Exercise2;

public class ReciboAgua implements Pagos {
    public static final double IMPUESTOAGUA =1.4;
    private double precio;

    public ReciboAgua(double precio) {
        this.setPrecio(precio);
    }
    public double totalPagar(){
        return this.getPrecio()*ReciboLuz.IMPUESTOLUZ;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
