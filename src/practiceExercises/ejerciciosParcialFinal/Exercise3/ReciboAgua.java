package practiceExercises.ejerciciosParcialFinal.Exercise3;


public class ReciboAgua implements Pagos{
    public static final double IMPUESTOAGUA = 1.4;
    private double precio ;
    public ReciboAgua(double precio){
        this.setPrecio(precio);
    }

    @Override
    public double totalPagar(){
        return getPrecio()*IMPUESTOAGUA;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        this.precio = precio;
    }
}
