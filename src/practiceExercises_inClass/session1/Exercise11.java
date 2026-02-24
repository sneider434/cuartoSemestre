package practiceExercises_inClass.session1;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double promedio;
        double mitadPromedio;
        System.out.println("ingrese la nota : 1");
        nota1= sc.nextDouble();
        System.out.println("ingrese la nota : 2");
        nota2= sc.nextDouble();
        System.out.println("ingrese la nota : 3");
        nota3= sc.nextDouble();
        promedio=(nota1+nota2+nota3)/3;
        mitadPromedio=promedio*0.50;

    }
}
