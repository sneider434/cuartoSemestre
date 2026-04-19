package practiceExercises.ejerciciosClase.Exercise17;

public class Principal {
    public static void main(String[] args) {

        Usuario usuarioNormal = new Usuario("Sneider lindarte", "104587623", 6);


        UsuarioPremium usuarioPremium = new UsuarioPremium("kaleth perez", "104568792", 4);


        System.out.println(usuarioNormal);
        System.out.println("Puede solicitar: " + usuarioNormal.verificarLibrosParaPrestar() + " libros más.");

        System.out.println(usuarioPremium);
        System.out.println("Puede solicitar: " + usuarioPremium.verificarLibrosParaPrestar() + " libros más.");

    }
}
