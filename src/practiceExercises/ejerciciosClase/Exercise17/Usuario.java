package practiceExercises.ejerciciosClase.Exercise17;

public class Usuario {
    private String nombre;
    private String documento;
    private int cantidadLibrosPrestados;


    public static final int MAX_LIBROS = 5;
    public static final int BONO_LIBROS = 2;


    public Usuario(String nombre, String documento, int cantidadLibrosPrestados) {
        this.setDocumento(documento);
        this.setNombre(nombre);
        this.setCantidadLibrosPrestados(cantidadLibrosPrestados);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getCantidadLibrosPrestados() {
        return cantidadLibrosPrestados;
    }

    public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
        this.cantidadLibrosPrestados = cantidadLibrosPrestados;
    }

    public int verificarLibrosParaPrestar() {
        if (cantidadLibrosPrestados < MAX_LIBROS) {
            return MAX_LIBROS - cantidadLibrosPrestados;
        } else {
            return 0; // No puede prestar más
        }
    }
    @Override
    public String toString() {
        return "Usuario: " + nombre + " | Documento: " + documento +
                " | Libros prestados: " + cantidadLibrosPrestados;
    }

}