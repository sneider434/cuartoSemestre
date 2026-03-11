package practiceExercises_inClass.session2.Exercise11;

public class Usuario {
    private double saldoInicial = 1000000;
    private double saldoConPropina;

    public Usuario( double saldoConPropina) {
        this.setSaldoConPropina(saldoConPropina);
    }
    public double getSaldoConPropina() {
        return saldoConPropina;
    }

    public void setSaldoConPropina(double saldoConPropina) {
        if(saldoConPropina<saldoInicial){
            this.saldoConPropina = saldoConPropina;
        }else{
            System.out.println("Lo sentimnos su monto a retirar es superior a su sueldo inicial");
        }
    }
    public boolean sueldoRestante(double mostrarSueldo){
         mostrarSueldo = this.saldoInicial-this.saldoConPropina;

    }
}
