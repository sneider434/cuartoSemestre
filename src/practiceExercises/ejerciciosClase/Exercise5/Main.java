package practiceExercises.ejerciciosClase.Exercise5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitudMatriz= Estacion.ESTACIONES.length;
        System.out.println("Ingrese en que mes estamos");
        String mes = sc.nextLine();

        for (int i =0;i<longitudMatriz;i++){
            for(int x = 1;x<Estacion.ESTACIONES[i].length;x++){
                if(Estacion.ESTACIONES[i][x].equalsIgnoreCase(mes)){
                    System.out.println("Estamos en : "+ Estacion.ESTACIONES[i][0]);
                }

            }
        }
    }

}
