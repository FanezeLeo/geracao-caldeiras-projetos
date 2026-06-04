package br.com.caldeiras.screenmatch.calculos;

import br.com.caldeiras.screenmatch.modelos.Filme;
import br.com.caldeiras.screenmatch.modelos.Serie;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Filme filme){
        this.tempoTotal += filme.getDuracaoEmMinutos();
    }

    public void inclui(Serie serie){
        this.tempoTotal += serie.getDuracaoEmMinutos();
    }
}
