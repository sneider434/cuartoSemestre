package practiceExercises.ejerciciosParcialFinal.Exercise1;

public class Persona {
    private String documento;
    private String nombres;

    public Persona(String documento,String  nombres) {
        this.setDocumento(documento);
        this.setNombres(nombres);
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
