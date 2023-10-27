package oo.polimorfismo;public class Pessoa {
    double peso;
    public Pessoa(double peso)
    {
        setPeso(peso);
    }

    void comer(Comida comida)
    {
        this.peso += comida.peso;
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
