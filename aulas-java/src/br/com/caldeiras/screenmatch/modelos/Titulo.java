package br.com.caldeiras.screenmatch.modelos;

public class Titulo {
    String nomeDoFilme;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
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

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getValorTotalAvaliacoes() {
        return valorTotalAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
}
