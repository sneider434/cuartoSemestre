package practiceExercises_inClass.session1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int gradeStudent = 5;
        double quizzStudent;
        System.out.println("ingrese la nota del estudiante");
        quizzStudent= scanner.nextInt();
        if (quizzStudent>=3.0){
            System.out.println(" el estudiante del grado = "+ gradeStudent + " a aprobado el quizz");
        }else{
            System.out.println(" el estudiante del grado = "+ gradeStudent + " no aprobado el quizz");
        }
        scanner.close();

    }


}
