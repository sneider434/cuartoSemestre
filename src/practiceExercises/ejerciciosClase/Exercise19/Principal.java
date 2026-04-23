package practiceExercises.ejerciciosClase.Exercise19;
import java.util.ArrayList;
public class Principal {

    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo("mark",23));
        figuras.add(new Triangulo("nolan",5,6,7));
        figuras.add(new Rectangulo("thragg",24,12));
        // Mostrar
        for(Figura f: figuras){
            System.out.println(f);
        }
    }
}
