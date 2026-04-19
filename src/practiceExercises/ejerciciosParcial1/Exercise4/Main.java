package practiceExercises.ejerciciosParcial1.Exercise4;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("el pago por hora es de : $15 dolares");
        System.out.println("-------------------------------------");
        int[] horasT1 ={5,7,8,9,5};
        Empleado empleado1 = new Empleado(Calculos.sumarHoras(horasT1));
        int[] horasT2 ={4,7,2,9,5};
        Empleado empleado2 = new Empleado(Calculos.sumarHoras(horasT2));
        int[] horasT3 ={3,2,8,5,5};
        Empleado empleado3 = new Empleado(Calculos.sumarHoras(horasT3));
        int[] horasT4 ={4,7,7,9,5};
        Empleado empleado4 = new Empleado(Calculos.sumarHoras(horasT4));
        int[] horasT5 ={5,1,5,12,5};
        Empleado empleado5 = new Empleado(Calculos.sumarHoras(horasT5));
        int[] horasT6={5,7,3,5,4};
        Empleado empleado6 = new Empleado(Calculos.sumarHoras(horasT6));

        Empleado[] empleados={empleado1,empleado2,empleado3,empleado4,empleado5,empleado6};
        int cantidadEmpledos = empleados.length;
        int[] sueldos = Empleado.calcularSalario(empleados);
        double pagoTotalEmpresa=0;
        for(int i =0;i<cantidadEmpledos;i++){
            System.out.println("el empleado : "+i+" / trabajo un  total de horas : "+empleados[i].getHorasTrabajadas()+" horas");
            System.out.println("por lo tanto su pago es de : "+ sueldos[i]+" dolares ");
            pagoTotalEmpresa+=sueldos[i];
        }
        System.out.println("-------------------------------------");
        System.out.println(" el pago total de la empresa es de : "+ pagoTotalEmpresa+" dolares");
        System.out.println("-------------------------------------");







    }
}
