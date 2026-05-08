package practiceExercises.EjerciciosParcial2.Exercise4;

public class PedidoDomicilio extends Pedido{
    private static final double  COMISIONENVIO = 1.20;
    public PedidoDomicilio(String nombreCliente, String plato, double valorPlato) {
        super(nombreCliente, plato, valorPlato);
    }
    @Override
    public double calcularTotal(){
        return getValorPlato()*COMISIONENVIO;
    }
}
