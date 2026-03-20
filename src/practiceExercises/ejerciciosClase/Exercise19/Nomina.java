package practiceExercises.ejerciciosClase.Exercise19;

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
