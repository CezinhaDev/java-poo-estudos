package br.com.project;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Poderoso Chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 175;

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