package br.com.caldeiras.praticando.data_hora.verifica_data_evento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataDoEvento;
        LocalDate dataAtual = LocalDate.now();

        System.out.println("Digite o dia que o evento vai ocorrer: ");
        dataDoEvento = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.println("Data do evento: " + dataDoEvento.format(formatter));
        System.out.println("Data atual: " + dataAtual.format(formatter));
        if(dataDoEvento.isBefore(dataAtual)){
            System.out.println("O evento já ocorreu.");
        } else {
            System.out.println("O evento ainda não ocorreu.");
        }

        scanner.close();
    }
}
