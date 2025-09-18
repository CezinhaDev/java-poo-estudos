package br.com.project.POO.Pessoaa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Cesar", 10);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        pessoa.maiorDeIdade();
    }
}
