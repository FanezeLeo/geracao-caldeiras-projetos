package br.com.caldeiras.praticando.data_hora.diferenca_horas;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        LocalTime hora1;
        LocalTime hora2;

        System.out.println("Digite a hora de inicio da tarefa (15:30):");
        hora1 = LocalTime.parse(scanner.nextLine(), formatter);
        System.out.println("Digite a hora de termino da tarefa (15:30):");
        hora2 = LocalTime.parse(scanner.nextLine(), formatter);

        Duration duration = Duration.between(hora1, hora2);

        System.out.println("Diferença de tempo: " + duration.toHours() + " horas e " + duration.toMinutesPart() + " minutos");



    }
}
