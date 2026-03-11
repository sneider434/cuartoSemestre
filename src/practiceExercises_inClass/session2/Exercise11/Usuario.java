package practiceExercises_inClass.session2.Exercise11;

public class Usuario {
    private double saldoInicial = 1000000;
    private double saldoConPropina;
    private double saldoFinal;
    public Usuario( double saldoConPropina) {
        this.setSaldoConPropina(saldoConPropina);

    }
    public double getSaldoConPropina() {
        return saldoConPropina;

    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    public void setSaldoConPropina(double saldoConPropina) {
        if(saldoConPropina<saldoInicial){
            this.saldoConPropina = saldoConPropina;
            this.saldoFinal=this.saldoInicial-this.saldoConPropina;
        }else{
            System.out.println("Lo sentimnos su monto a retirar es superior a su sueldo inicial");
            this.saldoFinal=this.saldoInicial;
        }

    }

}
