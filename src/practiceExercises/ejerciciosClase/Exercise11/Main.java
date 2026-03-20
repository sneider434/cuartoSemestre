package practiceExercises.ejerciciosClase.Exercise11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuanto desea retirar?");
        double dineroSacar = sc.nextDouble();
        Usuario usuario1 = new Usuario(dineroSacar);
        double sueldoRestante = Usuario.proceso(usuario1);
        System.out.println(" su suledo restante en el banco es de = "+sueldoRestante);


    }
}
