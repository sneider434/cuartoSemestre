package practiceExercises.ejerciciosParcialFinal.Exercise3;

public class Promedios {

    public static double[] calculaAreas (double[][] lotes){
        double longitud = lotes.length;
        double[] areas = new double[2];
        double contadorBases=0;
        double contadorAlturas=0;
        for(int i=0;i<longitud;i++){
            contadorBases += lotes[i][0];
            contadorAlturas += lotes[i][1];
        }
        areas[0]=contadorBases/longitud;
        areas[1]=contadorAlturas/longitud;
        return areas;
    }
}
