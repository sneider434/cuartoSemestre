package practiceExercises_inClass.session1;

public class Exercise6 {
    public static void main(String[] args) {
        double[] salario={1600000,1850000,2100000,3000000};
        double salarioMinimo=2000000;
        double bono=100000;
        int lenghtSalari0 = salario.length;

        for(int i=0;i<lenghtSalari0;i++){
            if(salario[i]>=salarioMinimo){
                salario[i]=salario[i]+bono;
            }
        }

        for(int x=0;x<salario.length;x++){
            System.out.println(salario[x]);
        }

    }
}
