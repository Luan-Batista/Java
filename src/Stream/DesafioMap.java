package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9);
        //converter o numero para binario
        //inverter o binario
        //converter o binario invertido para decimal

        UnaryOperator<String> convert = s -> new StringBuilder(s).reverse().toString();
        Function<String,Integer> decimal = s -> Integer.parseInt(s,2);
        Consumer<String> println = System.out::println;
        Consumer<Integer>println2 = System.out::println;;
        System.out.println("converter");
        nums.stream()
                .map(Integer::toBinaryString).forEach(println);

        System.out.println("inverter...");
        nums.stream()
                .map(Integer::toBinaryString)
                .map(convert).forEach(println);

        System.out.println("converter para decimal...");
        nums.stream()
                .map(Integer::toBinaryString)
                .map(convert)
                .map(decimal).forEach(println2);
    }
}
