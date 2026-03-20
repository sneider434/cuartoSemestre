package practiceExercises.ejerciciosClase.Exercise9;

public class Estudiante {
    String nombre;
    String codigo;
    double primerParcial;
    static final double notaMinimaAprobado=2.0;
    static final double notaMaximoAprobado=3.0;


    public Estudiante(String nombre,String codigo,double primerParcial){
        this.nombre=nombre;
        this.codigo=codigo;
        this.primerParcial=primerParcial;

    }
    public boolean comprobarNota(){
        if(this.primerParcial<Estudiante.notaMaximoAprobado && this.primerParcial>=Estudiante.notaMinimaAprobado){
            return  true;
        }
        return false;
    }
}

