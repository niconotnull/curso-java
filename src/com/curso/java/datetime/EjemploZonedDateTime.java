package com.curso.java.datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

// https://en.wikipedia.org/wiki/List_of_tz_database_time_zones

public class EjemploZonedDateTime {

    public static void main(String[] args) {

        LocalDateTime fechaLocal =  LocalDateTime.now();
//        LocalDateTime fechaLocal = LocalDateTime.parse("2021/09/20 12:45", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

//        ZoneId newYork = ZoneId.of("America/New_York");
        ZonedDateTime zoneNY = ZonedDateTime.of(fechaLocal, ZoneOffset.of("-04:00"));

        System.out.println("Hora de partida en NewYork: " + zoneNY);

//        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zoneMadrid = zoneNY.withZoneSameInstant(ZoneOffset.of("+02:00"));
        System.out.println("Hora de llegada Madrid : " + zoneMadrid);

        System.out.println("========================================");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalles del viaje a España");
        System.out.println("Partida newYork : "+dateTimeFormatter.format(zoneNY));
        System.out.println("Llgada Madrid : "+dateTimeFormatter.format(zoneMadrid));




    }
}
