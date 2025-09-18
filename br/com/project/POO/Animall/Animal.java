package br.com.project.POO.Animall;

public class Animal {
    private String nome;
    private int idade;
    private String especie;
    Animal[] animals = new Animal[]{

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    // Getters necessários para as subclasses
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    // Método que pode ser sobrescrito (polimorfismo)
    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Espécie: " + especie);
    }
}
