package practiceExercises.EjerciciosParcial2.Exercise6;

public class Bus extends Vehiculo{
    public Bus(String placa, String marca, int modelo) {
        super(placa, marca, modelo);
    }
    @Override
    public void mostrarTipoServicio(){
        System.out.println("servicio prioritario de mensajeria");
    }
}
