package br.com.caldeiras.praticando.data_hora.controle_expediente;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        int cargaHoraria;
        LocalTime entrada;
        LocalTime saidaReal;
        LocalTime saidaPrevista;
        long horasExtras;
        long minutosExtras;

        System.out.print("Digite o horário de entrada (HH:mm): ");
        entrada = LocalTime.parse(scanner.next(), formatter);

        System.out.print("Digite a carga horária diária (em horas): ");
        cargaHoraria = scanner.nextInt();

        System.out.print("Digite o horário real de saída (HH:mm): ");
        saidaReal = LocalTime.parse(scanner.next(), formatter);



        saidaPrevista = entrada.plusHours(cargaHoraria);

        Duration diferenca = Duration.between(saidaPrevista, saidaReal);
        horasExtras = diferenca.toHours();
        minutosExtras = diferenca.toMinutesPart();

        System.out.println("\nHorário de entrada: " + entrada.format(formatter));
        System.out.println("Horário de saída previsto: " + saidaPrevista.format(formatter));
        System.out.println("Horário real de saída: " + saidaReal.format(formatter));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;

            if (horasExtras > 0 || minutosExtras > 0) {
                sinal = "+";
            } else {
                sinal = "-";
            }

            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h " + Math.abs(minutosExtras) + "min");
        }


        scanner.close();
    }
}
