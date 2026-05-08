package practiceExercises.EjerciciosParcial2.Exercise7;

public class Revista extends MaterialBiblioteca{
    public Revista(String nombre, String autor) {
        super(nombre, autor);
    }
    @Override
    public void mostrarInformacion(){
        System.out.println(getAutor() + " - " + getNombre());
    }
}
