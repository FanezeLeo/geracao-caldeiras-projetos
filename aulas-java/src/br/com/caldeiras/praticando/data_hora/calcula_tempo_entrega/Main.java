package br.com.caldeiras.praticando.data_hora.calcula_tempo_entrega;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int prazo;
        LocalDate dataDoPedido;
        String dataDaEntrega;

        System.out.println("Digite o prazo para a entregar ser feita e finalize seu pedido: ");
        prazo = scanner.nextInt();

        dataDoPedido = LocalDate.now();
        dataDaEntrega = dataDoPedido.plusDays(prazo).format(formatter);

        System.out.println("Data de entrega: " + dataDaEntrega);


    }
}
