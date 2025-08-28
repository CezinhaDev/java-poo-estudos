package br.com.project.POO.Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private int peso;
    private double altura;

    public Pessoa(String nome, int idade, double altura, int peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public void fazerAniversario() {
        this.idade += 1;
        System.out.println("Feliz aniversário " + this.nome + "! Agora você tem " + this.idade + " anos.");
    }

    public void calculaImc(int peso) {

        double imc = peso / (altura * altura);
        System.out.printf("\nO IMC de %s é %.2f%n", nome, imc);


        if (imc > 25) {
            System.out.printf("%s está acima do peso.%n", nome);
        } else if (imc < 18.5) {
            System.out.printf("%s está abaixo do peso.%n", nome);
        } else {
            System.out.printf("%s está com o peso ideal.%n", nome);
        }

    }

    public void exibeInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
