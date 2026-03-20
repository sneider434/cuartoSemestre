package practiceExercises.ejerciciosClase.Exercise13;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("daniel","aristobal",1097345267);
        Persona persona2 = new Persona("aleb","aristobal",1092456321);
        Persona persona3 = new Persona("sergio","aristobal",805004);
        Persona persona4 = new Persona("daniela","aristobal",1097345267);
        Persona[] personas = {persona1,persona2,persona3};
        System.out.println(Persona.contador(personas));
    }

}
