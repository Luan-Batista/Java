package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Function<Produto,Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco *  1.085 :  preco;
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
        //UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
        Function<Double,String> formatado = preco -> ("R$"+preco).replace(".", ",");

        Produto p;
        p = new Produto("violao",2700.00,0.13);

        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                //.andThen(arredondar)
                .andThen(formatado)
                .apply(p);

        System.out.println("o preco final é " + preco);
    }
}
