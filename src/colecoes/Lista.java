package colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        Usuario user = new Usuario("Luan");
        lista.add(user);
        lista.add(new Usuario("Yhan"));
        lista.add(new Usuario("Marta"));
        lista.add(new Usuario("Pedro"));

        System.out.println(lista.get(3).nome); //acessando o usuario pelo indice
        for(Usuario NomeUsuarios: lista)
        {
            System.out.println(NomeUsuarios.nome);
        }
    }

}
