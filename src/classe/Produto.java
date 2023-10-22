package classe;

import java.util.Objects;

public class Produto {
    String nomeProduto;
    Double precoProduto;
    static Double descontoProduto = 0.25;
    static Double descontoFeriado = 0.30;

    static Double desconto(Double valorProduto, String feriado)
    {
        if(Objects.equals(feriado, "25/12") || Objects.equals(feriado, "13/08"))
        {
            return valorProduto * (1 - 0.30);
        }else
            return valorProduto * (1-0.25);
    }
}
