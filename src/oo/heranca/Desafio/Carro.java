package oo.heranca.Desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    int delta = 5;
    Carro (int velocidadeMaxima)
    {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    Carro 
    void acelerar()
    {
        if(velocidadeAtual >= 0 && velocidadeAtual < VELOCIDADE_MAXIMA) {
            velocidadeAtual += delta;
        }else
            velocidadeAtual = VELOCIDADE_MAXIMA;
    }

    void frear()
    {
        if(velocidadeAtual > 0)
            velocidadeAtual -= delta;
    }

    @Override
    public String toString() {
        return "velocidade atual é: "+velocidadeAtual+"Km/h";

    }




}
