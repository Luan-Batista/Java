package oo.composicoes;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Luan");
        Aluno aluno2 = new Aluno("Bruna");
        Aluno aluno3 = new Aluno("Joaquim");

        Curso curso1 = new Curso("Ciencia da computacao");
        Curso curso2 = new Curso("Psicologia");
        Curso curso3 = new Curso("Agronomia");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);
        curso2.adicionarAluno(aluno2);
        curso3.adicionarAluno(aluno3);

        for(Aluno aluno: curso1.alunos)
        {
            System.out.println("Estou matriculado no curso de "+curso1.nome + " e meu nome é "+aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.obterCursoPorNome("ciencia da computacao"));
    }
}
