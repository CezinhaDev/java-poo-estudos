package br.com.project.POO.ContaBancaria;

public class ContaBancaria {
    private String numeroDaConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroDaConta, String titular, double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor){
        this.saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso.");

        if(valor < 0){
            System.out.println("Valor de saque inválido.");
        }else if(valor > saldo){
            System.out.println("Saldo insuficiente.");
        }
    }

    public void mostrarInformacoes(){
        System.out.println("Número da Conta: " + numeroDaConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
