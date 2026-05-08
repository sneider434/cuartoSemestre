package practiceExercises.ejerciciosClase.Exercise20;

public class Sobreescritura {
    public static void main(String[] args) {
        Loro loro1 =  new Loro();
        loro1.volar();
        System.out.println(loro1);
        Paloma paloma1 = new Paloma();
        paloma1.volar();
        System.out.println(paloma1);
        Pinguino pinguino1 = new Pinguino();
        pinguino1.volar();
        System.out.println(pinguino1);
    }
}
