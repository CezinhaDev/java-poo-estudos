package br.com.project.POO.Animall;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade, "Cachorro");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro " + getNome() + " está latindo.");
    }


}
