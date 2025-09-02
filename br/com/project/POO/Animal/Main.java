package br.com.project.POO.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Genérico", 5);
        animal.emitirSom();

        Cachorro cachorro = new Cachorro("Rex", 3);
        cachorro.emitirSom();

        Gato gato = new Gato("Miau", 2);
        gato.emitirSom();
    }
}
    