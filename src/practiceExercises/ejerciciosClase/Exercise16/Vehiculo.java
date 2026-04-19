package practiceExercises.ejerciciosClase.Exercise16;

public class Vehiculo {
    private String placa;
    private String color;

    public Vehiculo(String placa,String color) {
        this.setColor(color);
        this.setPlaca(placa);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return "placa :"+placa+" color : "+color;
    }
}
