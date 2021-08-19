package com.curso.java.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class EjemploLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime fechaTiempo = LocalDateTime.now();
        System.out.println("Fecha tiempo : "+fechaTiempo);

        LocalDateTime fechaTiempo2 = LocalDateTime.of(2021, Month.AUGUST, 17, 13,40,59);
        System.out.println("Fecha tiempo otra forma : "+fechaTiempo2);

        LocalDateTime fechaTiempo3 = LocalDateTime.parse("2021-09-20T14:40:59");
        System.out.println("Fecha tiempo otra forma : "+fechaTiempo3);

        fechaTiempo= fechaTiempo.plusDays(1);
        System.out.println("Sumamos un día : "+fechaTiempo);

        Month mes = fechaTiempo.getMonth();
        System.out.println("Mes : "+mes);

        String formatoFecha =  fechaTiempo.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Formato Fecha 1: "+formatoFecha);

        String formatoFecha2 =  fechaTiempo.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Formato Fecha 2: "+formatoFecha2);

        String formatoFecha3 =  fechaTiempo.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("Formato Fecha 3: "+formatoFecha3);

        String formatoFecha4 =  fechaTiempo.format(DateTimeFormatter.ofPattern(" yyyy/MM/dd hh:mm:ss a"));
        System.out.println("Formato Fecha 4: "+formatoFecha4);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        System.out.println("Formato Fecha 5: "+dateTimeFormatter.format(fechaTiempo));

    }
}
