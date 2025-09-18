package br.com.project.POO.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020);
        carro.ligar();
        carro.exibeInformacoes();
        carro.desligar();
    }
}
