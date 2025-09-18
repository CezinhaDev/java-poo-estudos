package br.com.project.POO.Projetos.CadastroDeAlunos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Service service = new Service();
            List<Aluno> alunos = new ArrayList<>();

            boolean parar = false;

            do {
                exibirMenu();
                int opcao = scanner.nextInt();
                scanner.nextLine(); // limpar buffer

                switch (opcao) {
                    case 1:
                        service.adicionarAluno(alunos);
                        break;
                    case 2:
                        service.removerAluno(alunos);
                        break;
                    case 3:
                        service.listarAlunos(alunos);
                        break;
                    case 4:
                        parar = true;
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (!parar);
        }
    }

    public static void exibirMenu() {
        System.out.println("\n=== Menu de Alunos ===");
        System.out.println("1 - Adicionar Aluno");
        System.out.println("2 - Remover Aluno");
        System.out.println("3 - Listar Alunos");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
    }
}
