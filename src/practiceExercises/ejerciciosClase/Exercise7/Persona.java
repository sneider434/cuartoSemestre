package practiceExercises.ejerciciosClase.Exercise7;

public class Persona {
    String documento;
    String nombres;
    int edad;
    static final int mayorEdad = 18;
    public Persona(String documento,String nombres ,int edad){
        this.edad=edad;
        this.documento=documento;
        this.nombres=nombres;
    }
    public boolean comprobarMayorEdad (){
        if(this.edad>=Persona.mayorEdad){
            return true;
        }
        return false;

    }


}
