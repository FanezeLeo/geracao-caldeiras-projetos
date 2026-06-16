package br.com.caldeiras.praticando.data_hora.lembrete_pagamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataVencimento;
        LocalDate dataLembrete;

        System.out.println("Digite a data de vencimento: ");
        dataVencimento = LocalDate.parse(scanner.nextLine(), formatter);

        dataLembrete = dataVencimento.minusDays(5);

        System.out.println("Data do lembrete: " + dataLembrete.format(formatter));
    }
}
