package src.Stream;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DesafioFilter {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        Produto produto1 = new Produto("calca skinny",300,0.3);

        Function<Produto,String> chamadaPromocional = p -> "aproveite " + p.nome + " por " + p.preco;

        Stream<Produto> prod = Stream.of(produto1);
        prod.filter(p->p.desconto <= 0.3)
                .map(chamadaPromocional)
                .forEach(System.out::println);

    }
}
