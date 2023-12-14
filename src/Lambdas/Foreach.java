package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Luan", "mateus", "otavio");

        aprovados.forEach((nome)-> {System.out.println(nome + "!!!");});//usando função lambda
        aprovados.forEach(System.out::println);//passando por referencia
    }
}
