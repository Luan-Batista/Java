package DesafioModuloClasse;

public class jantar {
    public static void main(String[] args) {
        comida arroz = new comida("arroz",0.200);
        Pessoa pessoa1 = new Pessoa("Luan",80.0);
        for(int i=0;i<6;i++)
        {
            pessoa1.comer(arroz);
        }

        System.out.printf(" Nome da pessoa: %s \n Peso da pessoa: %.1fKg",pessoa1.nomePessoa,pessoa1.pesoPessoa);
    }
}
