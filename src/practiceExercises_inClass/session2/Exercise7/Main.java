package practiceExercises_inClass.session2.Exercise7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Persona persona1 = new Persona(sc.nextLine(), sc.nextLine(), sc.nextInt());
        boolean estado = persona1.comprobarMayorEdad();
        System.out.println("Es mayor = "+estado);


        Persona persona2 = new Persona(sc.nextLine(), sc.nextLine(), sc.nextInt());
        estado = persona2.comprobarMayorEdad();
        System.out.println("Es mayor = "+estado);
    }
}
