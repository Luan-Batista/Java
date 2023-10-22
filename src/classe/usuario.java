package classe;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.swing.text.StyledEditorKit;

public class usuario {
    String nome;
    String email;

    public boolean equals(Object objeto)
    {
        if(objeto instanceof usuario)
        {
        usuario user = (usuario) objeto;
        boolean nomeIgual = user.nome.equals(this.nome);
        boolean emailIgual = user.email.equals(this.email);
        return nomeIgual && emailIgual;
        }else{
            return false;
        }
    }
}
