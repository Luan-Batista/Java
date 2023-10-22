package classe;

import com.sun.xml.internal.bind.v2.model.annotation.AnnotationReader;

public class AreaCirc {
    double raio;
    static double pi = 3.1415;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }
    Double area(){
        return pi * Math.pow(raio,2);
    }
}
