package br.com.project.POO.Pessoaa;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void maiorDeIdade(){
        if(idade >= 18){
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }
    }

}
