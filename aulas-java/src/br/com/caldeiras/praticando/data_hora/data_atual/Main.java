package br.com.caldeiras.praticando.data_hora.data_atual;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dataAtual = LocalDateTime.now();

        System.out.println("Data atual: " + dataAtual.toLocalDate());
        System.out.println("Hora atual: " + dataAtual.toLocalTime());
    }
}
