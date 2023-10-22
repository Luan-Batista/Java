package colecoes;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1,"Luan");
        usuarios.put(2,"joao kleber");

        for(Map.Entry<Integer,String> user: usuarios.entrySet())
            System.out.println(user);

    }
}
