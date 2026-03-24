package practiceExercises.ejerciciosParcial1.Exercise4;

public class Empleado {
    int horasTrabajadas;
    static int tarifaHora = 15;
    public Empleado(int horasTrabajadas) {
        this.setHorasTrabajadas(horasTrabajadas);
    }
    public static int[] calcularSalario( Empleado[] empleados){
        int trabajadores=empleados.length;
        int[] sueldoTrabajador=new int[trabajadores];
            for(int i =0;i<trabajadores;i++){
                sueldoTrabajador[i]=tarifaHora*empleados[i].getHorasTrabajadas();
            }
            return sueldoTrabajador;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
