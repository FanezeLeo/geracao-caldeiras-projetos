package br.com.caldeiras.praticando.data_hora.formatando_data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");

        String data = LocalDate.now().format(formatterData);
        String hora = LocalTime.now().format(formatterHora);

        System.out.println("Data formatada: " + data);
        System.out.println("Hora formatada: " + hora);
    }
}
