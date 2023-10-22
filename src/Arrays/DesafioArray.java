package Arrays;

import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i,qntdNotas;
        double media = 0;
        System.out.println("informe quantas notas deseja inserir: ");
        qntdNotas = scan.nextInt();
        Double array[] = new Double[qntdNotas];
        for(i=0;i<array.length;i++)
        {
            System.out.printf("nota [%d]: ",i+1);
            array[i] = scan.nextDouble();
        }

        for(Double nota:array)
        {
            media += nota;
        }
        System.out.println(" media do aluno: " + media / array.length);
    }
}
