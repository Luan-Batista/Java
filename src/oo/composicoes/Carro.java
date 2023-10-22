package oo.composicoes;

public class Carro {
    Motor motor = new Motor();
    void acelerar()
    {
        if(motor.ligado)
            motor.fatorInjecao += 0.5;
        else
            System.out.println("Impossível acelerar. O carro está desligado!!");
    }

    void pararCarro()
    {
        while(motor.fatorInjecao > 0)
            motor.fatorInjecao -= 0.5;
    }

    void frear()
    {
        if(motor.fatorInjecao > 0)
            motor.fatorInjecao -= 0.5;
        else
            System.out.println("O carro está parado");
    }

    void ignicao(int chave)
    {
        if(!motor.ligado && chave == 1)
        {
            motor.fatorInjecao = 0.5;
            motor.ligado = true;
        }else if(motor.ligado && chave == 0)
        {
            motor.fatorInjecao = 0;
            motor.ligado = false;
        }
    }

}
