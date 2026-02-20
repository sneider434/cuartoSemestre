package practiceExercises_inClass.session1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[6];
        int entradaEdad;
        for(int i=0;i<edades.length;i++){
            System.out.println("ingrese la edad del estudiante : "+ (i+1));
            edades[i]= scanner.nextInt();
        }

        for(int i=0;i<edades.length;i++){
            System.out.println("----------------------------------------------------------------");
            System.out.println("edad del estudiante : "+ (i+1));
            System.out.println("----------------------------------------------------------------");
            System.out.println(edades[i]);

        }

    }
}
