package br.com.caldeiras.praticando.variaveis.convertendo_valor;

public class Main {
    public static void main(String[] args){
        double valorDouble = 19.6;
        int valorInt = (int) Math.round(valorDouble);

        System.out.println("O valordo produto é: " + valorInt);
    }
}
