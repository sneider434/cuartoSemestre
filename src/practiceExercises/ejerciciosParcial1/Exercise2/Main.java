package practiceExercises.ejerciciosParcial1.Exercise2;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("1097894521","trent",5000000);
        Empleado empleado2 = new Empleado("1049854769","kylian",1800000);
        Empleado empleado3 = new Empleado("1078521456","luka",1000000);

        Empleado[] empleados = {
                new Empleado("1097894521","trent",5000000),
                new Empleado("1049854769","kylian",1800000),
                new Empleado("1078521456","luka",1000000)
        };
        int total = Nomina.contadorMayorSalarioMinimo(empleados);
        System.out.println("total :"+total);

    }
}
