package oo.composicoes.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();
    double valorTotalItens=0;

    void adicionarItem(Produto produto, int qntd)
    {
        this.itens.add(new Item(produto,qntd));
    }

    void adiconarItem(String nome,double preco,int qntd)
    {
        this.itens.add(new Item(new Produto(nome,preco),qntd));
    }
    double valorTotal()
    {
        for(Item item: itens)
        {
            valorTotalItens += (item.quantidade * item.produto.preco);
        }
        return valorTotalItens;
    }
}