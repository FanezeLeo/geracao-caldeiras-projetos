package br.com.caldeiras.praticando.data_hora.ajuste_vencimento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataVencimentoOriginal;
        LocalDate dataNovoVencimento;

        System.out.println("Digite a data de vencimento atual: ");
        dataVencimentoOriginal = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.println("Digite quantos meses de acrescimo no vencimento: ");
        dataNovoVencimento = dataVencimentoOriginal.plusMonths(scanner.nextInt());

        System.out.println(dataNovoVencimento.format(formatter));



    }
}
