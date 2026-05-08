package practiceExercises.EjerciciosParcial2.Exercise5;

public class PlanPremiun extends PlanGinmnasio{
    public PlanPremiun(int edad, double valorMensual, String nombre) {
        super(edad, valorMensual, nombre);
    }
    @Override
    public double calcularPagoMensual(){
        return calcularPagoMensual()*1.85;
    }
}
