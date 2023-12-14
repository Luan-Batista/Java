package Lambdas;

public class CalculoTeste {
    public static void main(String[] args) {
        Calculo calculo = new Soma();
        System.out.println(calculo.Calculo(4,5));
        calculo = new Multiplicacao();
        System.out.println(calculo.Calculo(4,5));
    }
}
