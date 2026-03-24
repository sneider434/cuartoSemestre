package practiceExercises.ejerciciosParcial1.Exercise3;

public class Persona {
    String nombre;
    String apellido;
    int dociumento;
    static int numero=1000000000;
    public Persona(String nombre,String apellido,int dociumento) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setDociumento(dociumento);
    }
    public static int contador(Persona[] personas){
        int contador=0;
        for(Persona persona:personas){
            if(persona.getDociumento()<Persona.numero){

            }
        }
        return contador++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDociumento() {
        return dociumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDociumento(int dociumento) {
        this.dociumento = dociumento;
    }
}
