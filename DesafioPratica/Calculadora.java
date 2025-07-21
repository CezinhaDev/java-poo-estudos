package DesafioPratica;


//Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.

public class Calculadora {
    public static void main(String[] args) {
        int resultado = dobro(5);
        System.out.println("Resultado do dobro: " + resultado);
    }

    // Método para calcular o dobro de um número
    static int dobro(int numero) {
        return numero * 2;
    }
}
