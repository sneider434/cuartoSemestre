package Parcial2.Exercise1;

public class EntradaCine {
    public static final String NOMBRE_CINE = "Cine Colombia";
    public static final double DESCUENTO = 0.25;
    private String pelicula;
    private String horario;
    private double precio;

    public EntradaCine(String pelicula, String horario, double precio) {
        this.setPrecio(precio);
        this.setPelicula(pelicula);
        this.setHorario(horario);
    }
    public double calcularPrecioFinal() {
        return precio;
    }
    public void MostrarVentas(){
        System.out.println(" pelicula :  "+getPelicula() );
        System.out.println(  "tiene un precio final : "+calcularPrecioFinal());
    }
    public String getPelicula() {
        return pelicula; }
    public String getHorario() {
        return horario; }
    public double getPrecio() {
        return precio; }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }
    public void setHorario(String horario){
        this.horario=horario;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

}
