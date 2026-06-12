package practiceExercises.ejerciciosParcialFinal.Exercise2;

import java.util.ArrayList;

public class Polimorfismo {
    public static void main(String[] args) {
        ArrayList<Pagos> recibos = new ArrayList<>();
        Cliente c1 = new Cliente("pepitoeggregrgrgergrggerg",14,"1925");
        Cliente c2 = new Cliente("void",34);

        ReciboAgua rca1 = new ReciboAgua(70);
        ReciboGas rcg1 = new ReciboGas(45);
        ReciboLuz rcl1 = new ReciboLuz(63);


        recibos.add(rca1);
        recibos.add(rcg1);
        recibos.add(rcl1);





    }
}
