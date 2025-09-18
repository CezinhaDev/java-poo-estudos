package br.com.project.POO.ContaBancariaa;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("12345-6", 1000.0);
        conta.exibirInformacoes();
        conta.depositar(500.0);
        conta.sacar(200.0);
        conta.exibirInformacoes();
    }
}
