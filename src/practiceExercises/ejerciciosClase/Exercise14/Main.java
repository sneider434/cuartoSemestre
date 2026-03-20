package practiceExercises.ejerciciosClase.Exercise14;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("tulio","hylux",2002);
        int difirenciaModelo= vehiculo1.vejezVehiculo();
        System.out.println("años de difrenvcia = " + difirenciaModelo);

        Vehiculo vehiculo2 = new Vehiculo("trivinho","corola",2015);
        int difirenciaModelo2= vehiculo2.vejezVehiculo();
        System.out.println("años de difrenvcia = " + difirenciaModelo2);
    }
}
