package practiceExercises.ejerciciosClase.Exercise16;

public class Principal {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario();

        Auto auto1 = new Auto("FGH-54G", "Rojo");
        Moto moto1 = new Moto("SDF-51S", "Negro");

        concesionario.guardarAuto(auto1);
        concesionario.guardarMoto(moto1);

        concesionario.mostrarVehiculos();

    }
}
