package br.com.caldeiras.screenmatch.principal;

import br.com.caldeiras.screenmatch.modelos.Filme;
import br.com.caldeiras.screenmatch.modelos.Serie;
import br.com.caldeiras.screenmatch.modelos.Titulo;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Random random = new Random();


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



        List<Filme> filmes = new ArrayList<>();
        filmes.add(filme);
        filmes.add(filme2);

        List<Serie> series = new ArrayList<>();
        series.add(serie);
        series.add(serie2);

        List<Titulo> assistidos = new ArrayList<>();

        assistidos.add(filme);
        assistidos.add(filme2);
        assistidos.add(serie);
        assistidos.add(serie2);
//        Collections.sort(assistidos);
        assistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));

        for (Titulo x: assistidos){
            if(x instanceof Filme){
                x.avalia(random.nextInt(6) + 5);
                x.avalia(random.nextInt(6) + 5);
            }
        }

        for(Titulo x: assistidos){
            System.out.println(x);
        }
    }
}