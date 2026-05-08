package practiceExercises.EjerciciosParcial2.Exercise3;

public class Principal {
    public static void main(String[] args) {
        ProductoDescuento p1 = new ProductoDescuento("uvas",23,45);
        ProductoImportado p2 = new ProductoImportado("peras",12,60);
        p1.mostrarInformacion(); p2.mostrarInformacion();
    }
}
