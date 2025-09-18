package br.com.project.POO.ListAnimal;

import java.util.ArrayList;
import java.util.List;

import br.com.project.POO.Animal.Animal;
import br.com.project.POO.Animal.Cachorro;
import br.com.project.POO.Animal.Gato;

public class Main {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        // adicionando animais à lista
        animais.add(new Cachorro("Rex", 3));
        animais.add(new Gato("Mimi", 2));
        animais.add(new Cachorro("Buddy", 5));
        animais.add(new Gato("Luna", 1));
        animais.add(new Cachorro("Max", 4));

        for(Animal animal : animais){
            System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade() + ", Tipo: " + animal.getTipo());
            animal.emitirSom();
        }
    }
}
