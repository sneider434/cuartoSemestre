package practiceExercises.ejerciciosParcialFinal.Exercise3;
import java.util.ArrayList;
public class MostrarRecibos {
    public double verRecibos(ArrayList<Pagos> recibos){

        double contador = 0;
        for(Pagos p : recibos){
            contador = contador+p.totalPagar();

        }
        return contador;
    }
}
