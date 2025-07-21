package br.com.project;

import br.com.project.br.com.alura.screenmatch.modelos.Filme; // Importa a classe Filme do pacote correto

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);

        // Exibe a ficha técnica do filme
        System.out.println("Ficha Técnica do Filme:");
        System.out.println("-------------------------");
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());
        System.out.println(meuFilme.pegaMedia());
    }
}