package practiceExercises_inClass.session2.Exercise9;

public class main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("sneider","192510",2.4);
        boolean datosNotas =estudiante1.comprobarNota();
        System.out.println(" usted esta habilitando? : "+datosNotas);
        Estudiante estudiante2 = new Estudiante("maria","192513",4.4);
        datosNotas =estudiante2.comprobarNota();
        System.out.println(" usted esta habilitando? : "+datosNotas);


    }
}
