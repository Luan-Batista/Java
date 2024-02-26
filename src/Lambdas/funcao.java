package Lambdas;

import java.util.function.Function;

public class funcao {
    public static void main(String[] args) {
        Function<Integer,String> isParouImpar = valor-> valor % 2 == 0 ? "par": "impar";

        System.out.println(isParouImpar.apply(2));

        Function<String,String> oResultadoEh = val -> "o resultado é: " + val;

        String resultado = isParouImpar.andThen(oResultadoEh).apply(25);

        System.out.println(resultado);
    }
}
