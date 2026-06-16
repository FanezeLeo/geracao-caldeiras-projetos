package br.com.caldeiras.praticando.data_hora.fuso_horario;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        ZonedDateTime horarioToquio = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println("Horário atual em Tóquio: " + horarioToquio.format(formatter));
    }
}
