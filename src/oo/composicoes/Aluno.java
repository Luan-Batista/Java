package oo.composicoes;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    String nome;
    List<Curso> cursos = new ArrayList<>();

    Aluno (String nome){
        this.nome = nome;
    }
    void adicionarCurso(Curso curso)
    {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    boolean obterCursoPorNome(String nome)
    {
        for(Curso curso: this.cursos)
        {
            if(curso.nome.equalsIgnoreCase(nome))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
