package practiceExercises.EjerciciosParcial2.Exercise3;

public class Producto {
    private static final double IVA = 0.19;
    private String nombre;
    private double cantidad;
    private double precio;
    public Producto(String nombre, double cantidad , double precio){
        this.cantidad = cantidad;
        this.precio = precio;
        this.nombre = nombre;
    }
    public double calcularTotal(){
        return calcularTotal();
    }
    public void mostrarInformacion(){
        System.out.println( "producto : "+ nombre + " -  total : "+ calcularTotal());
    }
    public void mostrarInformacion(String mensaje){
        System.out.println(mensaje);
        mostrarInformacion();
    }
    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
}
