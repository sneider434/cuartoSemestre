package practiceExercises_inClass.session1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double estatura;
        double peso;
        double imc;
        System.out.println("ingrese su estatura");
        estatura = scanner.nextDouble();
        System.out.println("ingrese su peso");
        peso= scanner.nextDouble();
        imc = peso/(estatura*estatura);
        System.out.println(" su indice de masa corporal es de = "+ imc);

    }
}
