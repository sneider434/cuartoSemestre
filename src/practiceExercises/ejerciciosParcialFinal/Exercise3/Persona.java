package practiceExercises.ejerciciosParcialFinal.Exercise3;

public class Persona {
    private int edad;
    private String nombre;
    public Persona(int edad , String nombre){
        this.setEdad(edad);
        this.setNombre(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length()> 10){
            this.nombre=nombre.substring(0,10);
        }else{
            this.nombre = nombre;
        }
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;
    }
}
