package practiceExercises.ejerciciosParcialFinal.Exercise3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pagos> recibos = new ArrayList<>();
        Cliente cliente1 = new Cliente("51513515",34,"rvcrvrrvrrhthv");
        Cliente cliente2 = new Cliente("fcercercvrec",24);
        ReciboLuz r1 = new ReciboLuz(50);
        ReciboAgua r2 = new ReciboAgua(80);
        ReciboGas r3 = new ReciboGas(70);

        recibos.add(r1);
        recibos.add(r2);
        recibos.add(r3);
        MostrarRecibos pago1 = new MostrarRecibos();
        double total = pago1.verRecibos(recibos);
        System.out.println("total = " + total);

        System.out.println(cliente1);
    }

}
