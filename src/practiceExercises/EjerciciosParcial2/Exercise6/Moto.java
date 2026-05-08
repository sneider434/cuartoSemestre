package practiceExercises.EjerciciosParcial2.Exercise6;

public class Moto extends Vehiculo{
    public Moto(String placa, String marca, int modelo) {
        super(placa, marca, modelo);
    }
    @Override
    public void mostrarTipoServicio(){
        System.out.println("Servicio rapido de mensajeria.");
    }
}
