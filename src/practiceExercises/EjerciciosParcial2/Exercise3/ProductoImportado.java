package practiceExercises.EjerciciosParcial2.Exercise3;

public class ProductoImportado extends Producto{
    private double costoImportacion = 1.25;
    public ProductoImportado(String nombre, double cantidad, double precio) {
        super(nombre, cantidad, precio);
    }
    @Override
    public double calcularTotal(){
        return (getCantidad()*getPrecio())*costoImportacion;
    }

}
