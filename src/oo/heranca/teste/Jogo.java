package oo.heranca;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        jogador j1 = new jogador();
        jogador j2 = new jogador();

        j1.y = 10;
        j1.x = 10;

        j2.y = 10;
        j2.x = 10;

        j1.vida = 100;
        j2.vida = 100;
        int op;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.printf("\n Digite: 1 - para andar com a peça: \n\t\t 0 - para encerrar o programa: ");
            op = scan.nextInt();
            switch (op)
            {
                case 1:
                    System.out.printf("\ninforme a direcao em que se deseja andar: \n");
                    Direcao movimento = Direcao.valueOf(scan.next().toUpperCase());
                    j1.andar(movimento);
                    break;
                case 2:
                    System.out.printf("jogador 1 começa atacando!");
                    int flag = 0;
                    while(flag == 0) {
                        j1.atacar(j2);
                        flag = 1;
                    }
                    System.out.printf("\nvez do jogador 2 atacar!");
                    j2.atacar(j1);
                    break;
                default:
                    break;
            }
        }while (op != 0);
        scan.close();

        System.out.println("casas andadas na direção norte: "+j1.y);
        System.out.println("casas andadas na direção sul: "+j1.x);
        System.out.println("vida dos jogadores: " + " "+ j1.vida + " " + j2.vida);



    }
}
