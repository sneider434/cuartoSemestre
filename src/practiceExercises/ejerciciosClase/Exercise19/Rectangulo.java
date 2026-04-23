package practiceExercises.ejerciciosClase.Exercise19;

public class Rectangulo extends Figura{
    private double ancho;
    private double largo;

    public Rectangulo(String nombre, double largo, double ancho){
        super(nombre);
        this.setAncho(ancho);
        this.setLargo(largo);
    }

    @Override
    public double hallarPerimetro() {
        double valorPerimetro =2*(getAncho()+ getLargo() );
        return valorPerimetro;
    }

    @Override
    public double calcularArea() {
        double valorArea = getAncho() * getLargo();
        return valorArea;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }


    @Override
    public String toString(){
        return " la figura llamada : "+ getNombre() + " tiene un area de :  " + calcularArea() + " y un perimetro de : " + hallarPerimetro();

    }


}
