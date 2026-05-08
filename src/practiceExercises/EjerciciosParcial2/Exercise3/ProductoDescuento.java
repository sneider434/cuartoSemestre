package practiceExercises.EjerciciosParcial2.Exercise3;

public class ProductoDescuento extends Producto{
    private double descuento = 0.15;
    public ProductoDescuento(String nombre, double cantidad, double precio) {
        super(nombre, cantidad, precio);
    }
    @Override
    public double calcularTotal(){
        return -((getCantidad()*getPrecio())*descuento)+(getPrecio()*getCantidad());
    }
}
