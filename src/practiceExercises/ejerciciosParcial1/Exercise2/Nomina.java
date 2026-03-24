package practiceExercises.ejerciciosParcial1.Exercise2;

public class Nomina {
    public static int contadorMayorSalarioMinimo(Empleado[] empleados){
        int contador=0;
        for( Empleado empleado :empleados){
            if(empleado.verificarSalarioMayorMinimo()){
                contador++;
            }
        }
        return contador;
    }
}
