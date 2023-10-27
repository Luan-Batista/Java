package oo.heranca.Desafio;

public class Main {
    public static void main(String[] args) {

        Carro c = new Civic();
        Carro c1 = new Ferrari();
        c1.acelerar();
        c.acelerar();
        c.acelerar();
        c.acelerar();
        c1.acelerar();
        System.out.println(c);
        System.out.println(c1.velocidadeAtual);
    }
}
