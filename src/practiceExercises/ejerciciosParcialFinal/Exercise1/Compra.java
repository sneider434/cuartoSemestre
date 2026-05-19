package practiceExercises.ejerciciosParcialFinal.Exercise1;

import java.util.ArrayList;

public class Compra {
    public static final double  PUNTOSBASE =1000;
    public static double valorVenta(ArrayList<Producto> comprasCliente){
        double acumulador = 0;
        for(Producto p : comprasCliente){
            acumulador=acumulador+ p.getPrecio();
        }
        return acumulador;
    }
    public static int calcularPuntos(ArrayList<Producto>comprasCliente){
       double total = Compra.calcularPuntos(comprasCliente);
       return (int) (total / Compra.PUNTOSBASE);
    }
}
