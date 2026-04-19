package practiceExercises.ejerciciosClase.Exercise15;

public class Principal {
    public static void main(String[] args) {

        Auto auto1 = new Auto("shc-234","verde");
        Auto auto2 = new Auto("lkh-346","rojo");
        Auto auto3 = new Auto("wex-450","azul");



        Concesionario.guardarAuto(auto1);
        Concesionario.guardarAuto(auto2);
        Concesionario.guardarAuto(auto3);

        Concesionario.mostraAutos();

    }
}
