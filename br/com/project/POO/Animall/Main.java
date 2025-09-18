package br.com.project.POO.Animall;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 3);
        Animal gato = new Gato("Mimi", 2);

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
