package practiceExercises.ejerciciosClase.Exercise11;

public class Usuario {
    static double saldoInical = 1000000;
    double retiro;

    public Usuario(double retiro) {
        this.setRetiro(retiro);
    }

    public double getRetiro() {
        return retiro;
    }

    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }
    public static double proceso(Usuario usuario){
        if(Usuario.saldoInical> usuario.getRetiro()){
            Usuario.saldoInical-=usuario.getRetiro();
            System.out.println("retiro exitoso" );
        }else{
            System.out.println("no se pudo retirar");
        }
        return Usuario.saldoInical;
    }
}
