package oo.composicoes.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();
    double valorTotal = 0;
    Cliente(String nome)
    {
        this.nome = nome;
    }

    double obterValorTotal()
    {
        for(Compra compra: compras)
        {
            valorTotal += compra.valorTotal();
        }
        return valorTotal;
    }
}
