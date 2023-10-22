package oo.composicoes;

public class Item {
    String nome;
    int quantidade;
    double preco;
    Item (String nome, int quantidade,double preco){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
