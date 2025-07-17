package br.com.project;
public class Filme {
    // isso sao os atributos da classe Filme
    String nome; 
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double SomaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    // esse é o método que exibe a ficha técnica do filme, que sao os atributos
    void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    // isso se chama método, que é uma ação que a classe pode realizar
    void avalia(double nota){
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    double pegaMedia(){
        return SomaDasAvaliacoes / totalDeAvaliacoes;
    }
}


