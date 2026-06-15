package br.com.caldeiras.praticando.variaveis.conversao_fahrenheit;

public class Main {
    public static void main(String[] args) {
        int celsius = 27;

        double fahrenheit = (celsius * 9 / 5.0) + 32;

        System.out.printf("A temperatura em Fahrenheit é: %.1f",fahrenheit);
    }
}
