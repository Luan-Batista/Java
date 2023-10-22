package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> ListaAprovados = new TreeSet<String>();
        ListaAprovados.add("Luan");
        ListaAprovados.add("Pedro");
        ListaAprovados.add("Bruna");
        ListaAprovados.add("Bianca");
        ListaAprovados.add("Lucca");
        for(String candidatos: ListaAprovados)
            System.out.println(candidatos);
    }
}
