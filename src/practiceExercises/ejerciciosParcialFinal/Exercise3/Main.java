package practiceExercises.ejerciciosParcialFinal.Exercise3;

public class Main {
    public static void main(String[] args) {
        double[][] lotes =  {
                {5,5},
                {4,4},
                {3,4}
        };
        double[] mostrarAreas = Promedios.calculaAreas(lotes);
        double longitud = lotes.length;
        System.out.println(" promedio de  bases : " + mostrarAreas[0]);
        System.out.println(" promedio de alturas : " + mostrarAreas[1]);
    }

}
