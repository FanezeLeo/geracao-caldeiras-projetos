package br.com.caldeiras.desafio.java_collections.modelo;

public class Produto implements Comparable<Produto>{
    private String descricao;
    private double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descricao + " - " + valor +"\n";
    }

    @Override
    public int compareTo(Produto produto) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(produto.valor));
    }
}
