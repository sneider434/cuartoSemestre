package practiceExercises.EjerciciosParcial2.Exercise2;

public class InfraccionSinLicencia extends Infraccion{
    public InfraccionSinLicencia(double baseMulta, String nombreConductor, String licenciaVehiculo) {
        super(baseMulta, nombreConductor, licenciaVehiculo);

    }
    @Override
    public double calcularMulta(){
        return getBaseMulta() * 1.80;
    }

}
