package practiceExercises_inClass.session1;

import jdk.jshell.execution.LocalExecutionControl;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lectorDigito;
        final String[] DIGITO = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez"};
        System.out.println("INGRESA UN NUMERO ENTERO");
        lectorDigito= scanner.nextInt();
        if(lectorDigito>=0 && lectorDigito<10){
            System.out.println("numero = " + DIGITO[lectorDigito]);
        }else{
            System.out.println(" el numero ingresado no es un digito");
        }

    }
}
