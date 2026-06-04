package br.com.caldeiras.screenmatch.modelos;

public class Serie extends Filme{
    private int temporadas;
    private boolean ativa;
    private int episodiosPortemporada;
    private int minutoPorEpisodio;

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPortemporada * minutoPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPortemporada() {
        return episodiosPortemporada;
    }

    public void setEpisodiosPortemporada(int episodiosPortemporada) {
        this.episodiosPortemporada = episodiosPortemporada;
    }

    public int getMinutoPorEpisodio() {
        return minutoPorEpisodio;
    }

    public void setMinutoPorEpisodio(int minutoPorEpisodio) {
        this.minutoPorEpisodio = minutoPorEpisodio;
    }
}
