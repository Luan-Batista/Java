package oo.composicoes;

import java.util.Scanner;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.cliente = "Luan Batista";
        int op=0;
        do{
            System.out.println("digite 0 para adicionar itens na sacola e 1 para sair: ");
            Scanner scan = new Scanner(System.in);
            do {
                op = scan.nextInt();
                if(op != 0 && op != 1)
                    System.out.println("opcao invalida!\ndigite 0 para adicionar itens na sacola e 1 para sair: ");
            }while (op != 0 && op != 1);

            switch (op){
                case 1:
                    break;
                case 0:
                    System.out.println("insira os itens na seguinte formatação: 'nome do item' 'quantidade' 'valor': ");
                    compra.itens.add(new Item(scan.next(),scan.nextInt(),scan.nextDouble()));
                    break;
            }
        }while(op != 1);

        System.out.printf("%s\n%s",compra.cliente,compra.itens);
        System.out.printf("Valor total da compra:%.2f ",compra.valorTotal());
    }
}
