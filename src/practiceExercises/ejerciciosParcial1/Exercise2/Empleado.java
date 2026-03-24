package practiceExercises.ejerciciosParcial1.Exercise2;

public class Empleado {
    private String documento;
    private String nombre;
    private  double salario;
    public static double salarioMinimo=2000000;
    public Empleado(String documento,String nombre,double salario) {
        this.setDocumento(documento);
        this.setNombre(nombre);
        this.setSalario(salario);
    }

    public boolean verificarSalarioMayorMinimo(){
        if(this.getSalario()>Empleado.salarioMinimo){
            return  true;
        }
        return false;
    }


    public String getDocumento() {

        return documento;
    }

    public String getNombre() {

        return nombre;
    }

    public double getSalario() {

        return salario;
    }

    public void setDocumento(String documento) {

        this.documento = documento;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        if(salario>=0){
            this.salario=salario;
        }
    }
}
