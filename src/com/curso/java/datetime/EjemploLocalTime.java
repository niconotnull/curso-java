package com.curso.java.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {

    public static void main(String[] args) {

        LocalTime hora = LocalTime.now();
        System.out.println("Fecha Actual: "+hora);
        System.out.println("Hora: "+hora.getHour());
        System.out.println("Minutos : "+hora.getMinute());
        System.out.println("Segundos: "+hora.getSecond());

        LocalTime seisConTreinta = LocalTime.of(6,30, 59);
        System.out.println("seisConTreinta : "+seisConTreinta);
        seisConTreinta =  LocalTime.parse("06:30");
        System.out.println("Otra forma : "+ seisConTreinta);

        LocalTime horaSumar = LocalTime.now().plus(1, ChronoUnit.HOURS);
        System.out.println("Sumamos una hora: "+horaSumar);

        LocalTime horaRestar = LocalTime.now().minus (2, ChronoUnit.HOURS);
        System.out.println("Restamos dos horas: "+horaRestar);

        boolean esAnterior = LocalTime.parse("12:10").isBefore(LocalTime.now());
        System.out.println("Es anterior :"+esAnterior);


    }
}
