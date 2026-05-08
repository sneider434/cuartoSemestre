package practiceExercises.EjerciciosParcial2.Exercise6;

public class Principal {
    public static void main(String[] args) {
        Moto moto1 = new Moto("wed-124","suzuki",2012);
        Carro carro1 = new Carro("dcc-345","ford",2023);
        Bus bus1 = new Bus("sgd-345","coopetran",2027);
        bus1.mostrarTipoServicio(); carro1.mostrarTipoServicio();moto1.mostrarTipoServicio();
    }
}
