package Lambdas;
import java.util.function.Predicate;
public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isCaro = produto -> produto.preco * (1 - produto.desconto) > 750.00;
        Produto prod = new Produto("playstation",5000.00,0.95);
        System.out.println(isCaro.test(prod));
    }
}
