package practiceExercises.EjerciciosParcial2.Exercise6;

public class Vehiculo {
    private String placa;
    private String marca;
    private int modelo;

    public Vehiculo(String placa,String marca,int modelo) {
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
    }
    public void mostrarTipoServicio(){
        System.out.println("Servicio general de transporte.");
    }

    public void mostrarDatos() {
        System.out.println(marca + " - " + placa + " - " + modelo);
    }

    public void mostrarDatos(String propietario) {
        System.out.println("Propietario: " + propietario);
        mostrarDatos();
    }
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }
}
