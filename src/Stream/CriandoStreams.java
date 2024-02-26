package src.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        Stream<String> languages = Stream.of("Java ","Lua ","JS\n");
        languages.forEach(print);

        System.out.println("criando uma stram a partir de um array");
        String[] outrasLangs = {"lisp ", "cobol ", "PHP\n"};
        Stream.of(outrasLangs).forEach(print);
        Arrays.stream(outrasLangs).forEach(print);

        System.out.println("criando uma stream a partir de um colection");
        List<String> maisLangs = Arrays.asList("Kotlin ", "Ada ", "Fortran\n");
        maisLangs.stream().forEach(print);
        maisLangs.parallelStream().forEach(print);
    }
}
