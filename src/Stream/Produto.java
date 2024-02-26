package src.Stream;

public class Produto {
    String nome;
    double preco;
    double desconto;

    public Produto(String nome, double preco, double desconto)
    {
        this.nome = nome;
        this.preco = preco - preco*desconto;
        this.desconto = desconto;
    }

}
