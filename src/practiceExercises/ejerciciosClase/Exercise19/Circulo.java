package practiceExercises.ejerciciosClase.Exercise19;

public class Circulo extends Figura{
    private double radio;

    public Circulo(String nombre,double radio){
        super(nombre);
        this.setRadio(radio);
    }

    @Override
    public double hallarPerimetro() {
        double valorPerimetro = 2*(Math.PI*getRadio());
        return valorPerimetro;
    }

    @Override
    public double calcularArea() {
        double valorArea = Math.PI*Math.pow(getRadio(),2);
        return valorArea;
    }
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString(){
        return " la figura llamada : "+ getNombre() + " tiene un area de :  " + calcularArea() + " y un perimetro de : " + hallarPerimetro();
    }

}
