package practiceExercises_inClass.session1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("ingrese la base del rectangulo");
        base= scanner.nextDouble();
        System.out.println("ingrese altura del rectangulo");
        altura= scanner.nextDouble();
        area=base*altura;
        System.out.println("el area del rectangulo es : "+ area);
    }
}
