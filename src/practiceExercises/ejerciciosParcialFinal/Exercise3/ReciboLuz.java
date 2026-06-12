package practiceExercises.ejerciciosParcialFinal.Exercise3;

public class ReciboLuz implements  Pagos{
    public static final double IMPUESTOlUZ = 1.3;
    private double precio;

    public ReciboLuz(double precio){
        this.setPrecio(precio);
    }
    @Override
    public double totalPagar(){
        return getPrecio()*IMPUESTOlUZ;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
