package practiceExercises.EjerciciosParcial2.Exercise4;

public class Pedido {
    private String nombreCliente;
    private String plato;
    private double valorPlato;
    public Pedido(String nombreCliente, String plato){
        this.nombreCliente = nombreCliente;
        this.plato=plato;
    }
    public Pedido(String nombreCliente,String plato, double valorPlato) {
        this.nombreCliente = nombreCliente;
        this.valorPlato = valorPlato;
        this.plato = plato;

    }
    public double calcularTotal(){
        return getValorPlato();
    }
    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getPlato() {
        return plato;
    }

    public double getValorPlato() {
        return valorPlato;
    }
}
