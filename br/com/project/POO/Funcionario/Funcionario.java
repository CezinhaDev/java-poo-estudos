package br.com.project.POO.Funcionario;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularPagamento() {
        return salario; // pagamento base
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: " + salario);
    }
}