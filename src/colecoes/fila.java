package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args) {
        Queue<String> Fila = new LinkedList<>();
        Fila.add("Luan");
        Fila.add("Marcelo");
        Fila.add("Ana");
        Fila.add("Maria");
        Fila.add("Yhan");

        for(String pessoasNaFila: Fila) {
            System.out.println("nome: " + pessoasNaFila);

        }
    }


}
