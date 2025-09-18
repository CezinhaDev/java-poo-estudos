package br.com.project.POO.Projetos.CadastroDeAlunos;


import java.util.List;
import java.util.Scanner;

public class Service {

    private Scanner scanner = new Scanner(System.in);


    public void adicionarAluno(List<Aluno> alunos){
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        System.out.println("Digite a nota do aluno:");
        int nota = scanner.nextInt();
        scanner.nextLine(); // limpar buffer
        Aluno aluno = new Aluno(nome, nota);
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
    }

    public void removerAluno(List<Aluno> alunos){
        System.out.println("Digite o nome do aluno a ser removido:");
        String nome = scanner.nextLine();
        Aluno alunoParaRemover = null;
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)) {
                alunoParaRemover = aluno;
                break;
            }
        }
        if (alunoParaRemover != null) {
            alunos.remove(alunoParaRemover);
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public void listarAlunos(List<Aluno> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (Aluno aluno : alunos) {
                aluno.exibirInformacoes();
            }   
        }
    }

}
