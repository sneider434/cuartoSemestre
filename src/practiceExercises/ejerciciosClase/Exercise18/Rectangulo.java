package practiceExercises.ejerciciosClase.Exercise18;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(String nombre ,double base,double altura){
        super(nombre);
        this.setAltura(altura);
        this.setBase(base);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    @Override
    public double hallarArea(){
        return getBase()*getAltura();
    }
    @Override
    public String toString(){
        return "area de : "+getNombre() + " es : " + hallarArea();
    }
}
