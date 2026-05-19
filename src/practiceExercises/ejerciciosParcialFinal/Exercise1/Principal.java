package practiceExercises.ejerciciosParcialFinal.Exercise1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Producto> comprasCliente = new ArrayList<>();
        Persona c1 = new Persona("109457416","kalet");
        Producto p1 = new Producto("papa",34);
        Producto p2 = new Producto("yuca",23);
        Producto p3 = new Producto("apio",45);
        Producto p4 = new Producto("agua",34);

        comprasCliente.add(p1);
        comprasCliente.add(p2);
        comprasCliente.add(p3);
        comprasCliente.add(p4);

        double valorFinal = Compra.valorVenta(comprasCliente);
        System.out.println("valorFinal = " + valorFinal);
        int puntosTotal = Compra.calcularPuntos(comprasCliente);
        System.out.println("puntosTotal = " + puntosTotal);
    }
}
