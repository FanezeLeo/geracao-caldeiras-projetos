package br.com.caldeiras.praticando.condicional.verifica_dia_util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        String dia = scanner.nextLine();

        if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("terca") ||
                dia.equalsIgnoreCase("quarta") || dia.equalsIgnoreCase("quinta") ||
                dia.equalsIgnoreCase("sexta")){
            System.out.println(dia + " é um dia útil.");
        } else if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("domingo")){
            System.out.println(dia + " não é um dia útil.");
        } else {
            System.out.println(dia + " Não é um dia da semana");
        }
    }
}
