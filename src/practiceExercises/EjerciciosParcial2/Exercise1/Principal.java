package practiceExercises.EjerciciosParcial2.Exercise1;

public class Principal {
    public static void main(String[] args){
    EntradaNino voletoNino1 = new EntradaNino("avatar","6 pm",23);
    EntradaVip voletoVip1 = new EntradaVip("dune","5 pm",46);
    voletoVip1.agregarVoletas(voletoVip1);
    voletoNino1.agregarVoletas(voletoNino1);

    }
}
