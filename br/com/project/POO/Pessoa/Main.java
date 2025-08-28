package br.com.project.POO.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa =  new Pessoa ("joao", 30, 1.75, 70);
        pessoa.calculaImc(70);
        pessoa.fazerAniversario();
        pessoa.exibeInformacoes();
    }
}
