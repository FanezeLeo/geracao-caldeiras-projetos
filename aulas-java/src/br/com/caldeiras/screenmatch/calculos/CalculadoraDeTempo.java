package br.com.caldeiras.screenmatch.calculos;

import br.com.caldeiras.screenmatch.modelos.Filme;
import br.com.caldeiras.screenmatch.modelos.Serie;
import br.com.caldeiras.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
