package practiceExercises.EjerciciosParcial2.Exercise8;

public class ServicioPublico {
    private String nombreUsuario;
    private double tarifaBase;
    private double consumo;

    public ServicioPublico(String nombreUsuario,double tarifaBase,double consumo) {
        this.nombreUsuario = nombreUsuario;
        this.consumo = consumo;
        this.tarifaBase = tarifaBase;
    }
    public void mostrarFactura() {
        System.out.println("Usuario: " + nombreUsuario);
        System.out.println("Total: " + calcularPago());
    }

    public void mostrarFactura(String mes) {
        System.out.println("Factura del mes: " + mes);
        mostrarFactura();
    }
    public double calcularPago(){
        return calcularPago();
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public double getConsumo() {
        return consumo;
    }
}
