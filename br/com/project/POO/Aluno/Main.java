package br.com.project.POO.Aluno;

public class Main {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.0};
        Aluno aluno = new Aluno("João", "12345", notas);
        aluno.verificaAprovado();
    }
}
