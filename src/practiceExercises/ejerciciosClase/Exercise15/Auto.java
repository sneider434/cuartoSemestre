package practiceExercises.ejerciciosClase.Exercise15;

public class Auto {
    private  String placa;
    private String color;

    public Auto(String placa,String color) {
        this.placa = placa;
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public String getColor() {
        return color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return "placa : " + placa + " color : "+ color;
    }
}
