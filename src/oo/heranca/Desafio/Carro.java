package oo.heranca.Desafio;

public class Carro{

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;
    private int delta = 5;
    public Carro (int velocidadeMaxima)
    {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }


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

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
