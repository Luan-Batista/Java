package DesafioModuloClasse;

public class Pessoa {
     String nomePessoa;
     Double pesoPessoa;

    Pessoa(String nome, Double peso)
    {
        this.nomePessoa = nome;
        this.pesoPessoa = peso;
    }

    void comer(comida Comida){
        this.pesoPessoa += Comida.pesoComida;
    }
}
