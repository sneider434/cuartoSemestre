package practiceExercises.ejerciciosParcialFinal.Exercise2;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre,int edad ) {
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
