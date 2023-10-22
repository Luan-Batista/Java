package oo.composicoes;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.ignicao(1);
        System.out.println("O carro está ligado? " + c1.motor.ligado);
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());
        c1.pararCarro();
        System.out.println(c1.motor.giros());
        c1.frear();
    }
}
