package DesafioPratica;
public class PrincipalCarro {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(); // Cria uma instância da classe Carro
        meuCarro.modelo = "Fusca";
        meuCarro.ano = 1976;
        meuCarro.cor = "azul";

        // Exibe as informações do carro
        System.out.println("Informações do Carro:");
        System.out.println("----------------------");
        meuCarro.exibeInformacoes();

        // Avalia o carro
        meuCarro.avalia(4.5);
        meuCarro.avalia(3.8);
        meuCarro.avalia(5.0);

        double mediaAvaliacoes = meuCarro.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);
    }
}
