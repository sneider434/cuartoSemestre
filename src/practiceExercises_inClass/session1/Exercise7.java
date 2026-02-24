package practiceExercises_inClass.session1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1;
        String palabra2;
        String palabra3;

        System.out.println("ingrese la palabra numero 1 ");
        palabra1 = sc.nextLine();
        System.out.println("ingrese la palabra numero 2 ");
        palabra2=sc.nextLine();
        System.out.println("ingrese la palabra numero 3 ");
        palabra3=sc.nextLine();

        if(palabra1== palabra2 && palabra1== palabra3 && palabra2==palabra3){
            System.out.println("las 3 palabras son la misma");
        }else{
            System.out.println("las 3 palabras son diferentes");
        }

    }
}
