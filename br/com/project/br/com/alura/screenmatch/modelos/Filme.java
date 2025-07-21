package br.com.project.br.com.alura.screenmatch.modelos;
public class Filme {
    // isso sao os atributos da classe Filme
    String nome; 
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private double SomaDasAvaliacoes;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }


    public void setNome(String nome) {
        this.nome = nome; // define o nome do filme, o this é usado para referenciar o atributo da classe
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento; // retorna o ano de lançamento do filme
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano; // retorna se o filme está incluído no plano
    }


    // esse é o construtor da classe Filme, que é chamado quando um objeto Filme é criado
    

    // esse é o método que exibe a ficha técnica do filme, que sao os atributos
    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    // isso se chama método, que é uma ação que a classe pode realizar
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


    public void setAnoDeLancamento(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAnoDeLancamento'");
    }


    public void setDuracaoEmMinutos(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDuracaoEmMinutos'");
    }
}


