package practiceExercises.EjerciciosParcial2.Exercise4;

public class PedidoEspecial extends Pedido{
    private static final double DESCUENTO = 0.12;
    public PedidoEspecial(String nombreCliente, String plato, double valorPlato) {
        super(nombreCliente, plato, valorPlato);
    }
    @Override
    public double calcularTotal(){
        return -(getValorPlato()*DESCUENTO)+(getValorPlato());
    }
}
