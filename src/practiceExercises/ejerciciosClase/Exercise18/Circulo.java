package practiceExercises.ejerciciosClase.Exercise18;

public class Circulo extends Figura{
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public double hallarArea(){
        return Math.PI*Math.pow(getRadio(),2);
    }
    @Override
    public String toString(){
        return "area de : "+getNombre() + " es : " + hallarArea();
    }
}
