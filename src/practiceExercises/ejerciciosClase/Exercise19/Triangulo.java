package practiceExercises.ejerciciosClase.Exercise19;

import javax.swing.*;

public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(String nombre, double ladoA,double ladoB , double ladoC){
        super(nombre);
        this.setLadoA(ladoA);
        this.setLadoB(ladoB);
        this.setLadoC(ladoC);
    }

    @Override
    public double hallarPerimetro() {
        double valorPerimetro = (getLadoA() + getLadoB() + getLadoC());
        return valorPerimetro;
    }

    @Override
    public double calcularArea() {
        double semiPerimetro = (getLadoA() + getLadoB() + getLadoC())/2;
        double valorArea = Math.sqrt(semiPerimetro*((semiPerimetro - getLadoA()) * (semiPerimetro - getLadoB()) * (semiPerimetro - getLadoC())));
        return valorArea;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    @Override
    public String toString(){
        return " la figura llamada : "+ getNombre() + " tiene un area de :  " + calcularArea() + " y un perimetro de : " + hallarPerimetro();

    }


}
