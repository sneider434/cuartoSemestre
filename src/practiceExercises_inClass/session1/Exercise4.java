package practiceExercises_inClass.session1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] edad= new int[5];
        for(int i =0;i<edad.length;i++){
            System.out.println("ingrese la edad del estudiante : "+ i);
            edad[i]= sc.nextInt();
        }
        int contadorMayor=0;
        final int mayorEdad =15;
        System.out.println("Estudiantes mayores o iguales a  : " + mayorEdad );


        sc.close();
    }
}
