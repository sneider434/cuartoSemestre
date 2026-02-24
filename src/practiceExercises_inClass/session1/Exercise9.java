package practiceExercises_inClass.session1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double DOLLAR = 3690;
        double dolares;
        double tasaCombersion;
        System.out.println("Ingrese la cantidad de dolares que desea saber su valor a pesos colombianos");
        dolares = scanner.nextDouble();
        tasaCombersion= dolares*DOLLAR;
        System.out.println("los : "+ dolares + "  Dolares "+ " Convertidos a pesos colobianos son :" + tasaCombersion);


    }
}
