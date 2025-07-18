package br.com.project;
public class Filme {
    // isso sao os atributos da classe Filme
    String nome; 
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;
    public double SomaDasAvaliacoes;

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    // esse é o construtor da classe Filme, que é chamado quando um objeto Filme é criado
    


    // esse é o método que exibe a ficha técnica do filme, que sao os atributos
    void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    // isso se chama método, que é uma ação que a classe pode realizar
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}


