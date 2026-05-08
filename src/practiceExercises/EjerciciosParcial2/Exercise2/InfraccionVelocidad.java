package practiceExercises.EjerciciosParcial2.Exercise2;

public class InfraccionVelocidad extends Infraccion{
    public InfraccionVelocidad(double baseMulta, String nombreConductor, String licenciaVehiculo) {
        super(baseMulta, nombreConductor, licenciaVehiculo);
    }
    @Override
    public double calcularMulta(){
        return getBaseMulta() * 1.40;
    }
}
