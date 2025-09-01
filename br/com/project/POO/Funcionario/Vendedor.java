package br.com.project.POO.Funcionario;

public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    @Override
    public double calcularPagamento() {
        return salario + comissao;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Comissão: " + comissao);
        System.out.println("Pagamento total: " + calcularPagamento());
    }




}