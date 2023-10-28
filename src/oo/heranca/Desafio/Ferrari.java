package oo.heranca.Desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{
    boolean ligarAr, ligarTurbo;
    public Ferrari() {
        super(320);
        super.setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr)
            return 35;
        else if(ligarTurbo && ligarAr)
            return 30;
        else
            return 15;
    }
}
