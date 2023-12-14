package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Consumer<Produto> imprimir = p -> System.out.println(p.nome + " " + " " + p.preco + " " + " " + p.desconto);
        int op = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.printf("\n informe a opção!!\n1- para inseir: ");
            op = scan.nextInt();
            switch (op)
            {
                case 1:
                    System.out.println("Informe respectivamente o nome, preço e desconto do produto: ");
                    String nome = scan.next();
                    Double preco = scan.nextDouble();
                    Double desconto = scan.nextDouble();
                    Produto produto = new Produto(nome,preco,desconto);
                    produtos.add(produto);
                    break;

                default:
                    break;
            }
        }while(op != 0);

        produtos.forEach(imprimir);
    }
}
