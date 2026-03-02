package practiceExercises_inClass.session3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona persona1= new Persona();

        System.out.println("ingrese su primer nombre");
        persona1.firstName= scanner.nextLine();

        System.out.println("ingrese su segundo nombre");
        persona1.midleName= scanner.nextLine();

        System.out.println("ingrese su primer apellido");
        persona1.lastName= scanner.nextLine();

        System.out.println("ingrese su segundo apellido");
        persona1.secondLastname= scanner.nextLine();

        System.out.println("ingrese su edad");
        persona1.age= scanner.nextInt();

        System.out.println("ingrese su estatura en metros");
        persona1.height= scanner.nextDouble();

        System.out.println("ingrese su sexo ");
        System.out.println(" 1" + "M");
        System.out.println(" 2" + "F");
        persona1.sex= scanner.nextLine();

        System.out.println("if you married?");
        System.out.println("1)."+ " : yes ");
        System.out.println("2)."+ " : no ");
        int preguntaCasado=scanner.nextInt();
        if(preguntaCasado==1){
            persona1.married=true;
        }else if(preguntaCasado==2){
            persona1.married=false;
        }


    }
}
