package practiceExercises.EjerciciosParcial2.Exercise5;

public class PlanBasico extends PlanGinmnasio{
    public PlanBasico(int edad, double valorMensual, String nombre) {
        super(edad, valorMensual, nombre);
    }
    @Override
    public double calcularPagoMensual(){
        return getValorMensual();
    }
}
