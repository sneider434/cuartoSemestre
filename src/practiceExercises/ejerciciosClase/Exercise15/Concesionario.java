package practiceExercises.ejerciciosClase.Exercise15;

public class Concesionario{
    private static Auto[] autos = new Auto[10];
    private static int contador =0;


    public static Auto[] autos (){
        return autos();
    }

    public static void guardarAuto (Auto auto){
        if(contador<autos.length){
            autos[contador]=auto;
            contador++;
            System.out.println("Auto guardado :)");
        }else{
            System.out.println(" No hay espacio en el concesionario :(");
        }
    }
    public static  void mostraAutos (){
        System.out.println("autos en el concesionario");
        for (int i =0;i<contador;i++){
            System.out.println(" carro : "+(i+1));
            System.out.println(autos[i]);
        }
    }

}
