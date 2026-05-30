package practiceExercises.ejerciciosParcialFinal.Exercise2;

import java.util.ArrayList;

public class MostrarRecibos {
    public double verRecibos( ArrayList<Pagos> recibos){
        double acumulador=0;
        for(Pagos r: recibos){
            acumulador=acumulador+ r.totalPagar();
        }
        return acumulador;
    }
}
