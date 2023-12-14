package Lambdas;

import java.util.function.BinaryOperator;

public class Calculo3 {
    public static void main(String[] args) {
        
        BinaryOperator<Double> calc = (x,y)->{
            return x+y;
        };
        System.out.println("doma de x + y" + calc.apply(2.0, 5.0));
        calc = (x,y)-> x*y;

        System.out.println("doma de x + y" + calc.apply(2.0, 5.0));

    }
}
