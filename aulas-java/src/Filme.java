public class Filme {
    String nomeDoFilme;
    int anoDeLancamento;
    boolean incluidoNoPlano = true;
    double valorTotalAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + nomeDoFilme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void adicionarAvaliacao(double nota){
        valorTotalAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double MediaAvaliacao(){
        return valorTotalAvaliacoes / totalDeAvaliacoes;
    }
}
