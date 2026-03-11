package practiceExercises_inClass.session2.Exercise11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuanto dinero desea retirar?");
        Usuario usuario1 = new Usuario(sc.nextDouble());
        System.out.println("Su retiro fue : " + usuario1.getSaldoConPropina());
        System.out.println("su saldo restante en la cuenta es de : "+usuario1.getSaldoFinal());


    }
}
