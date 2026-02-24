package practiceExercises_inClass.session2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double valorNota1=0.7;
        double valorNota2=0.3;
        double nota1;
        double nota2;
        double notaFinal;
        System.out.println("ingrese la primera nota con valor de :"+valorNota1);
        nota1=sc.nextDouble();
        System.out.println("ingrese la primera nota con valor de :"+valorNota2);
        nota2=sc.nextDouble();
        notaFinal=(nota1*valorNota1)+(nota2*valorNota2);
        if(notaFinal>=3.0){
            System.out.println("Haz aprobado la materia sobre 3.0 haz sacado : "+ notaFinal);
        }else{
            System.out.println("No haz aprobado la materia sobre 3.0 haz sacado: "+ notaFinal);
        }
    }
}
