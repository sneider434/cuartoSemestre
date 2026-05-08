package practiceExercises.EjerciciosParcial2.Exercise7;

public class MaterialBiblioteca {
    private String nombre;
    private String autor;
    private int anoPublicacion;
    private static int totalMateriales;

    public MaterialBiblioteca(String nombre,String autor,int anoPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        totalMateriales++;
    }

    public MaterialBiblioteca(String nombre,String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    public MaterialBiblioteca(String nombre) {
        this.nombre = nombre;
    }
    public void mostrarInformacion(){
        System.out.println(nombre + " - " + autor + " - " + anoPublicacion);
    }

    public static int getTotalMateriales() {
        return totalMateriales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }
}
