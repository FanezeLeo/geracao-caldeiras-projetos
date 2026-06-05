package br.com.caldeiras.screenmatch.principal;

import br.com.caldeiras.screenmatch.modelos.MinhasPreferidas;
import br.com.caldeiras.screenmatch.modelos.Musica;
import br.com.caldeiras.screenmatch.modelos.Podcast;

public class Main{
    public static void main(String[] args) {

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();

        Musica musica = new Musica();

        musica.setTitulo("Bohemian Rhapsody");
        musica.setAlbum("A Night at the Opera");
        musica.setArtista("Queen");
        musica.setGenero("Rock");

        Podcast podcast = new Podcast();

        podcast.setTitulo("Conversa Semanal");
        podcast.setHost("João Silva");
        podcast.setDescricao("Podcast com bate-papos sobre diversos assuntos do cotidiano.");

        for (int i = 0; i < 500; i++){
            musica.reproduz();
        }
        for (int i = 0; i < 100; i++){
            musica.curte();
        }

        for (int i = 0; i < 6; i++){
            podcast.reproduz();
        }
        for (int i = 0; i < 2; i++){
            podcast.curte();
        }

        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);

    }
}