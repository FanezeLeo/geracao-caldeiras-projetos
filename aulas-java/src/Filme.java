public class Filme {
    String nomeDoFilme;
    private int anoDeLancamento;
    private boolean incluidoNoPlano = true;
    private double valorTotalAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

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
