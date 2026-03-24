package practiceExercises.ejerciciosClase.Exercise13;

public class Vehiculo {
    String duenoNombre;
    String modelo;
    int year;
    static int yearCurrent = 2026;
    public Vehiculo(String duenoNombre,String modelo, int year) {
        this.setDuenoNombre(duenoNombre);
        this.setModelo(modelo);
        this.setYear(year);
    }
    public int vejezVehiculo(){
        return Vehiculo.yearCurrent - this.year;
    }

    public String getDuenoNombre() {
        return duenoNombre;
    }

    public String getModelo() {
        return modelo;
    }

    public int getYear() {
        return year;
    }

    public void setDuenoNombre(String duenoNombre) {
        this.duenoNombre = duenoNombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
