package practiceExercises.ejerciciosClase.Exercise16;

public class Estudiante {
    String nombre;
    String asisgnatura;
    double calificacionFinal;
    static double notaFinal=5.0;
    public Estudiante(String nombre,String asisgnatura, double calificacionFinal) {
        this.setNombre(nombre);
        this.setAsisgnatura(asisgnatura);
        this.setCalificacionFinal(calificacionFinal);
    }

    public static double notaMenor( Estudiante[] estudiantes){
        double notaMinima=0;
        for(Estudiante estudiante:estudiantes){
            if(estudiante.getCalificacionFinal()<Estudiante.notaFinal){
                notaMinima=estudiante.getCalificacionFinal();
            }
        }
        return notaMinima;
    }
    public String getNombre() {
        return nombre;
    }

    public String getAsisgnatura() {
        return asisgnatura;
    }

    public double getCalificacionFinal() {
        return calificacionFinal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAsisgnatura(String asisgnatura) {
        this.asisgnatura = asisgnatura;
    }

    public void setCalificacionFinal(double calificacionFinal) {
        this.calificacionFinal = calificacionFinal;
    }
}
