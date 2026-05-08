package practiceExercises.EjerciciosParcial2.Exercise5;

public class PlanFamiliar extends PlanGinmnasio {
    public PlanFamiliar(int edad, double valorMensual, String nombre) {
        super(edad, valorMensual, nombre);
    }
    @Override
    public double calcularPagoMensual(){
        return calcularPagoMensual()* 1.55;
    }
}
