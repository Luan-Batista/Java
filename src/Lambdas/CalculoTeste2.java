package Lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> {return a+b;};
        System.out.println(soma.Calculo(4,5));
    }

}
