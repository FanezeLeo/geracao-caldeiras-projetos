package br.com.caldeiras.screenmatch.principal;

import br.com.caldeiras.screenmatch.modelos.Filme;
import br.com.caldeiras.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        Filme filme = new Filme(
                "Interestelar",
                2014,
                true,
                45,
                "Christopher Nolan"
        );

        Filme filme2 = new Filme(
                "O Senhor dos Anéis: A Sociedade do Anel",
                2001,
                true,
                48,
                "Peter Jackson"
        );

        Serie serie = new Serie(
                "Stranger Things",
                2016,
                true,
                0,
                4,
                true,
                9,
                50
        );

        Serie serie2 = new Serie(
                "Breaking Bad",
                2008,
                true,
                0,
                5,
                false,
                13,
                47
        );

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme);
        filmes.add(filme2);

        ArrayList<Serie> series = new ArrayList<>();
        series.add(serie);
        series.add(serie2);

        System.out.println(filmes);
        System.out.println(series);

    }
}