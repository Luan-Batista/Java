package oo.polimorfismo;public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(79.00);
        Comida ingrediente1 = new Arroz(0.15);
        Comida ingrediente2 = new Feijao(0.08);
        Comida sobremesa = new Sorvete(0.40);
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());
    }
}
