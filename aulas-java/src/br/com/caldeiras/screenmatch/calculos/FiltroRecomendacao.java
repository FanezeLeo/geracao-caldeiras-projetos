package br.com.caldeiras.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtro(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Preferidos!");
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("Bem avaliados!");
        } else {
            System.out.println("Boas opções!");
        }
    }
}
