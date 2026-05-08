package practiceExercises.EjerciciosParcial2.Exercise8;

public class Energia  extends ServicioPublico{
    private static final double RECARGO_ENERGIA = 0.18;
    public Energia(String nombreUsuario, double tarifaBase, double consumo) {
        super(nombreUsuario, tarifaBase, consumo);
    }
    @Override
    public double calcularPago(){
        return (getConsumo()*getTarifaBase())*RECARGO_ENERGIA;
    }
}
