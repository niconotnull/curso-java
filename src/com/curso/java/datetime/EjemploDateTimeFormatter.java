package com.curso.java.datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EjemploDateTimeFormatter {

    public static void main(String[] args) {

        LocalTime horaActual =  LocalTime.now();
        LocalTime horaActual2 =  LocalTime.parse("13:24:59");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("Hora con formato1 : "+horaActual.format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH:mm:ss a");
        System.out.println("Hora con formato2 : "+horaActual2.format(dateTimeFormatter2));
        System.out.println("Hora con formato3 : "+horaActual2.format(dateTimeFormatter));

        System.out.println("Otra forma1 : "+dateTimeFormatter.format(horaActual));
        System.out.println("Otra forma2 : "+dateTimeFormatter2.format(horaActual2));
    }
}
