package practiceExercises.EjerciciosParcial2.Exercise5;

public class PlanGinmnasio {
    private int edad;
    private String nombre;
    private double valorMensual;
    private static int contador;

    public PlanGinmnasio(int edad,double valorMensual,String nombre) {
        this.edad = edad;
        this.nombre = nombre;
        this.valorMensual = valorMensual;
        contador++;
    }
    public void registrarUsuario(String nombre){
        this.nombre = nombre;
    }
    public void registrarUsuario(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public double calcularPagoMensual(){
        return calcularPagoMensual();
    }
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValorMensual() {
        return valorMensual;
    }
}
