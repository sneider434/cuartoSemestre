package practiceExercises.ejerciciosParcialFinal.Exercise2;

public class Cliente extends Persona{
    String codigo;

    public Cliente(String nombre, int edad, String codigo) {
        super(nombre, edad);
        this.setCodigo(codigo);
    }
    public Cliente(String nombre, int edad) {
        super(nombre, edad);
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
