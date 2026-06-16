package br.com.caldeiras.praticando.data_hora.conversor_fuso;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        ZonedDateTime horarioAtual = ZonedDateTime.now();
        ZonedDateTime horarioSydney = horarioAtual.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        System.out.println("Horário atual no sistema: " + horarioAtual.format(formatter));
        System.out.println("Horário atual em Sydney: " + horarioSydney.format(formatter));
    }
}
