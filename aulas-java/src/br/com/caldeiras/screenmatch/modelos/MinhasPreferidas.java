package br.com.caldeiras.screenmatch.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 8){
            System.out.println(audio.getTitulo() + " é considerado um sucesso!!");
        } else {
            System.out.println(audio.getTitulo() + " é um muito procurado!");
        }
    }
}
