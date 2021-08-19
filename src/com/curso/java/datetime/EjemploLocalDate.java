package com.curso.java.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {

    public static void main(String[] args) {

        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual  : " + fechaActual);
        System.out.println("Día  : " + fechaActual.getDayOfMonth());
        System.out.println("Mes  : " + fechaActual.getMonth());
        System.out.println("Año  : " + fechaActual.getYear());
        System.out.println("Día del año  : " + fechaActual.getDayOfYear());

        LocalDate fechaActual2 = LocalDate.of(2021, 8, 17);
        System.out.println("fechaActual2 : " + fechaActual2);

        LocalDate fechaActual3 = LocalDate.of(2021, Month.DECEMBER, 17);
        System.out.println("fechaActual3 : " + fechaActual3);

        LocalDate fechaActual4 = LocalDate.parse("2018-08-25");
        System.out.println("fechaActual4 : " + fechaActual4);

        LocalDate diaDeManana = LocalDate.now().plusDays(1);
        System.out.println("¿Qué fecha es mañana? " + diaDeManana);

        LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
        System.out.println("mesAnteriorMismoDia : " + mesAnteriorMismoDia);

        LocalDate mesAnteriorMismoDiaOtraForma = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("mesAnteriorMismoDiaOtraForma : " + mesAnteriorMismoDiaOtraForma);

        DayOfWeek diaSemana = LocalDate.parse("2021-08-19").getDayOfWeek();
        System.out.println("Día : " + diaSemana);

        int diaDelYear = LocalDate.of(2021, 8, 19).getDayOfYear();
        System.out.println("Día del año : " + diaDelYear);

        boolean esBiciesto = LocalDate.now().isLeapYear();
        System.out.println("Es Biciesto : " + esBiciesto);

        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2021-08-17"));
        System.out.println("Es antes : " + esAntes);

        boolean esDespues = LocalDate.of(2022, Month.DECEMBER, 17).isBefore(LocalDate.parse("2023-08-31"));
        System.out.println("Es despues : " + esDespues);

        System.out.println("======================================");
        LocalDate fechaEspanol = LocalDate.now();
        System.out.println("Fecha Actual : "+fechaEspanol);

        Month mes = fechaEspanol.getMonth();
        System.out.println("Mes : "+mes);
        System.out.println("Número del mes: "+mes.getValue());
        System.out.println("Mes en español: "+mes.getDisplayName(TextStyle.FULL, new Locale("es","ES")));

        System.out.println("======================================");
        LocalDate diaEspanol = LocalDate.now();
        System.out.println("Fecha Actual : "+diaEspanol);

        DayOfWeek dia = diaEspanol.getDayOfWeek();
        System.out.println("Día : "+dia);
        System.out.println("Nombre del día : "+dia.getValue());
        System.out.println("Nombre del día en español: "+dia.getDisplayName(TextStyle.FULL, new Locale("es","ES")));;


    }
}
