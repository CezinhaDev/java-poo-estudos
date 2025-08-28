package br.com.project.POO.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("'12345-6'", "João", 1000);
        conta.mostrarInformacoes();
        conta.depositar(500);
        conta.sacar(200);
        conta.mostrarInformacoes();
    }
}
