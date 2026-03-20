package practiceExercises.ejerciciosClase.Exercise6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Impuestos persona1= new Impuestos();
        System.out.println("ingrese el monto ganador de la loteria");
        persona1.ganadorLoteria1= sc.nextDouble();
        if(persona1.ganadorLoteria1>= persona1.limiteLibreImpuestos){
            persona1.ganadorLoteria1= persona1.ganadorLoteria1-(persona1.ganadorLoteria1* persona1.impuestoExcedente);
            System.out.println("Se aplico impuestos del 40% debido a que su monto supera los 100 salarios minimos");
            System.out.println("Su monto neto es de : "+ persona1.ganadorLoteria1);
        }else{
            persona1.ganadorLoteria1= persona1.ganadorLoteria1-(persona1.ganadorLoteria1* persona1.impuestoSinExcedente);
            System.out.println("Se aplico impuestos del 20% debido a que su monto no supera los 100 salarios minimos");
            System.out.println("Su monto neto es de : "+ persona1.ganadorLoteria1);

        }
    }
}
