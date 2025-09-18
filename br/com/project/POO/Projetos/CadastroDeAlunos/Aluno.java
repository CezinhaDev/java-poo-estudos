package br.com.project.POO.Projetos.CadastroDeAlunos;

public class Aluno {
    private String nome;
    private int nota;

    public Aluno() {
    }

    public Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", nota=" + nota + "]";
    }

 
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("-----------------------");
    }

    
    
}
