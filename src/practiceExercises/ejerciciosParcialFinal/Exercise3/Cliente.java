package practiceExercises.ejerciciosParcialFinal.Exercise3;

public class Cliente extends Persona{
    private String codigo;
    public Cliente(String codigo,int edad,String nombre){
        super(edad,nombre);
    }
    public Cliente(String nombre,int edad){
        super(edad,nombre);
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    @Override
    public String toString() {
        return "Cliente: [Nombre: " + getNombre() +
                ", Edad: " + getEdad() +
                ", Código: " + this.codigo + "]";
    }

}
