package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add(2);
        conjunto.add("luan");


        System.out.println(conjunto);
        System.out.println("tamanho do conjunto: " + conjunto.size());
    }
}
