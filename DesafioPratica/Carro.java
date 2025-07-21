package DesafioPratica;
public class Carro {

    // Atributos da classe Carro
    String modelo;
    int ano;
    String cor;
    double somaDasAvaliacoes;
    int numAvaliacoes;
    // Métodos da classe Carro
    void exibeInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }
    // Método para avaliar o carro
    // Recebe uma nota e acumula na soma das avaliações
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }
    // Método para calcular a média das avaliações
    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }
}
