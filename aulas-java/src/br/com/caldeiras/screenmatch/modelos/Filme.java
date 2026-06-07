package br.com.caldeiras.screenmatch.modelos;

import br.com.caldeiras.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano,
                 int duracaoEmMinutos, String diretor) {
        super(nome, anoDeLancamento, incluidoNoPlano, duracaoEmMinutos);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")\n"
                + "Diretor: " + this.getDiretor() + "\n"
                + "Nota: " + this.getClassificacao()+ "\n\n";
    }
}
