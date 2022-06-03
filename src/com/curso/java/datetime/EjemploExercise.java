package com.curso.java.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class EjemploExercise {
    static final int MINUTES_PER_HOUR = 60;
    static final int SECONDS_PER_MINUTE = 60;
    static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;


    public static void main(String[] args) {
        String hora = "16-12-2021 21:04:00";
        long seconds = getSeconds(hora, 21333);

        if (seconds > 0) {
            System.out.println("Enviando la notificación:");
        } else {
            System.out.println("El ticket  no se envío por que la fecha expiro. ");
        }

    }


    private static long  getSeconds(String scheduledDeliveryTime, Integer ticket) {
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            LocalDateTime fechaProgramada = LocalDateTime.parse(scheduledDeliveryTime, dateTimeFormatter);
            if (LocalDateTime.now().isBefore(fechaProgramada)) {
                long[] time = getTime(LocalDateTime.now(), fechaProgramada);
                LocalTime hayden = LocalTime.of((int) time[0], (int) time[1], (int) time[2]);
                System.out.println("Fecha actual : " + LocalDateTime.now());
                System.out.println("Fecha programada : " + fechaProgramada);
                System.out.println("Segundos en enviarse la orden : " + hayden.toSecondOfDay());
                System.out.println("Ticket: " + ticket);
                return hayden.toSecondOfDay();
            }
        } catch (Exception e) {
            System.out.println("Error al obtener los segundos : " + e.getMessage());
        }
        return  0;
    }



    private static long[] getTime(LocalDateTime dob, LocalDateTime now) {
        LocalDateTime today = LocalDateTime.of(now.getYear(),
                now.getMonthValue(), now.getDayOfMonth(), dob.getHour(), dob.getMinute(), dob.getSecond());
        Duration duration = Duration.between(today, now);
        long seconds = duration.getSeconds();
        long hours = seconds / SECONDS_PER_HOUR;
        long minutes = ((seconds % SECONDS_PER_HOUR) / SECONDS_PER_MINUTE);
        long secs = (seconds % SECONDS_PER_MINUTE);
        return new long[]{hours, minutes, secs};
    }
}
