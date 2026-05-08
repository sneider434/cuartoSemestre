package practiceExercises.EjerciciosParcial2.Exercise7;

public class Periodico extends MaterialBiblioteca{
    public Periodico(String nombre) {
        super(nombre);
    }
    @Override
    public void mostrarInformacion(){
        System.out.println( getNombre());
    }
}
