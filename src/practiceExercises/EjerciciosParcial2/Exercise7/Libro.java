package practiceExercises.EjerciciosParcial2.Exercise7;

public class Libro extends MaterialBiblioteca{
    public Libro(String nombre, String autor, int anoPublicacion) {
        super(nombre, autor, anoPublicacion);
    }
    @Override
    public void mostrarInformacion(){
        System.out.println(getAutor() + " - " + getNombre() + " - " + getAnoPublicacion());
    }
}
