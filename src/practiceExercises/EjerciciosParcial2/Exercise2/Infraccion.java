package practiceExercises.EjerciciosParcial2.Exercise2;

public class Infraccion {
    private double baseMulta;
    private String nombreConductor;
    private String licenciaVehiculo;
    private static int totalInfracciones;

    public Infraccion(double baseMulta,String nombreConductor, String licenciaVehiculo) {
        this.baseMulta = baseMulta;
        this.nombreConductor = nombreConductor;
        this.licenciaVehiculo = licenciaVehiculo;
        totalInfracciones++;
    }
    public double calcularMulta(){
        return calcularMulta();
    }
    public double getBaseMulta() {
        return baseMulta;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    public String getLicenciaVehiculo() {
        return licenciaVehiculo;
    }

    public static int getTotalInfracciones() {
        return totalInfracciones;
    }
}
