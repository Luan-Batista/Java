package colecoes;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<Usuario>();
        usuarios.add(new Usuario("Luan"));
        usuarios.add(new Usuario("guilherme"));

        boolean resultado = usuarios.contains(new Usuario("guilherme"));
        System.out.println(resultado);

    }

}
