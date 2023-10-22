package oo.composicoes.desafio;

public class Clienteteste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Luan");
        Compra compra1 = new Compra();
        Compra compra2 = new Compra();

        compra1.adiconarItem("Feijao carioca", 9.57,5);
        compra2.adiconarItem("notebook", 3000.05 ,1);
        cliente.compras.add(compra1);
        cliente.compras.add(compra2);
        System.out.println("valor total da compra: " + cliente.obterValorTotal());
    }
}
