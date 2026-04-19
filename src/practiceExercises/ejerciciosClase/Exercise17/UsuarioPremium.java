package practiceExercises.ejerciciosClase.Exercise17;

public class UsuarioPremium extends Usuario {

    public UsuarioPremium(String nombre, String documento, int cantidadLibrosPrestados) {
        super(nombre, documento, cantidadLibrosPrestados);
    }

    @Override
    public int verificarLibrosParaPrestar() {
        int librosDisponibles = super.verificarLibrosParaPrestar();
        if (librosDisponibles == 0) {
            return BONO_LIBROS;
        } else {
            return librosDisponibles + BONO_LIBROS;
        }
    }
    @Override
    public String toString() {
        return "Usuario Premium: " + getNombre() + " | Documento: " + getDocumento() +
                " | Libros prestados: " + getCantidadLibrosPrestados();

    }

}