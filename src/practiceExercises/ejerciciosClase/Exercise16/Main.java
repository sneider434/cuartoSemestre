package practiceExercises.ejerciciosClase.Exercise16;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("ovidio","matematicas",3.45);
        Estudiante estudiante2 = new Estudiante("david","lenguaje",4.45);
        Estudiante estudiante3 = new Estudiante("jose","ingles",3.0);
        Estudiante estudiante4 = new Estudiante("salomon","artistica",3.9);
        Estudiante[] estudiantes={estudiante1,estudiante2,estudiante3,estudiante4};
        System.out.println(" la nota minima es = "+ Estudiante.notaMenor(estudiantes));
    }
}
