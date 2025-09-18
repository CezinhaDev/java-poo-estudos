package br.com.project.POO.Animall;

public class Gato extends Animal {
    public Gato(String nome, int idade){
        super(nome, idade, "gato");
    }
    @Override
    public void emitirSom() {
        System.out.println("O gato " + getNome() + " está miando.");
    }
}
