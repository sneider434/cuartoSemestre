package practiceExercises.EjerciciosParcial2.Exercise6;

public class Carro extends Vehiculo{
    public Carro(String placa, String marca, int modelo) {
        super(placa, marca, modelo);
    }
    @Override
    public void mostrarTipoServicio(){
        System.out.println("Servicio particular o familiar.");
    }
}
