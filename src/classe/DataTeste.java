package classe;

import javafx.scene.SubScene;

public class DataTeste {
    public static void main(String[] args) {
        String dataformatada;
        Data criaData = new Data();
        System.out.printf("%d/%d/%d\n",criaData.dia, criaData.mes, criaData.ano);
        criaData = new Data(31,8,2003);
        System.out.printf("%d/%d/%d\n",criaData.dia,criaData.mes,criaData.ano);
        dataformatada = criaData.criaData(criaData);
        System.out.println(dataformatada);
    }



}