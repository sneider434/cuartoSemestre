package practiceExercises.ejerciciosParcialFinal.Exercise2;

public class ReciboLuz implements Pagos{
    public static final double IMPUESTOLUZ = 1.3;
    private double precio;

    public ReciboLuz(double precio) {
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
