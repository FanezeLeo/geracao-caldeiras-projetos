package br.com.caldeiras.screenmatch.excecao;

public class ErroDadoInvalido extends Throwable{
    private String message;

    public ErroDadoInvalido (String message){
        this.message = message;
    }

    @Override
    public  String getMessage() {
        return this.message;
    }
}
