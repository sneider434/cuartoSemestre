package practiceExercises.ejerciciosParcialFinal.Exercise1;

public class ClienteOcasional extends Persona {
    private int puntos;

    public ClienteOcasional(String documento, String nombres, int puntos) {
        super(documento, nombres);
        this.setPuntos(puntos);
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
