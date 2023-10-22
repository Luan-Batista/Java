package classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto camiseta = new Produto();
        Produto calco = new Produto();
        camiseta.precoProduto = 250.99;
        calco.precoProduto = 500.00;
        System.out.printf("valor final: %.2f",(1 - Produto.descontoFeriado) * camiseta.precoProduto);
    }
}
