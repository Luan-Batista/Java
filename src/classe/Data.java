package classe;

import java.util.Scanner;

public class Data{
    int dia, mes, ano, anoAtual;
    int idadePessoa()
    {
        return 2023 - ano;
    }

    Data(int x,int xx, int xxxx)
    {
        dia = x;
        mes = xx;
        ano = xxxx;
    }

    Data()
    {
        dia = 1; mes = 1; ano = 1970;
    }
    String criaData(Data x)
        {
            System.out.println("informe a data");
            Scanner scan = new Scanner(System.in);
            x.dia = scan.nextInt();
            x.mes = scan.nextInt();
            x.ano = scan.nextInt();

            return String.format( "%d/%d/%d",x.dia,x.mes,x.ano);
        }
    }

