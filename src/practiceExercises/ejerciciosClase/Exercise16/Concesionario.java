package practiceExercises.ejerciciosClase.Exercise16;
import java.util.ArrayList;
public class Concesionario {
    private ArrayList<Auto> autos;
    private ArrayList<Moto> motos;

    public Concesionario() {
        autos = new ArrayList<>();
        motos = new ArrayList<>();
    }

    public void guardarAuto(Auto auto) {
        autos.add(auto);
    }

    public void guardarMoto(Moto moto) {
        motos.add(moto);
    }

    public void mostrarVehiculos() {
        System.out.println("Autos en el concesionario:");
        for (Auto a : autos) {
            System.out.println(a);
        }
        System.out.println("Motos en el concesionario:");
        for (Moto m : motos) {
            System.out.println(m);
        }
    }

}
