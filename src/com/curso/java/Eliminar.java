package com.curso.java;


import com.google.gson.Gson;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import java.util.*;


public class Eliminar {

    static final int MINUTES_PER_HOUR = 60;
    static final int SECONDS_PER_MINUTE = 60;
    static final int SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

    public static void main(String[] args) throws IOException{

        Gson gson = new Gson();
        String fe = "1649170676367";


        long l=Long.parseLong(fe);



        Date a = new Date(l);
        System.out.println(a.toString());



        String vv = " [{\"paisId\":1,\"marcaId\":9,\"sucursalId\":38109,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada  Fuera de Horario\",\"estatus\":1},{\"paisId\":1,\"marcaId\":9,\"sucursalId\":38109,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada  Fuera de Horario\",\"estatus\":1},{\"paisId\":1,\"marcaId\":9,\"sucursalId\":38109,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada  Fuera de Horario\",\"estatus\":1},{\"paisId\":1,\"marcaId\":9,\"sucursalId\":38109,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada  Fuera de Horario\",\"estatus\":1}]";



        String b3 = "[{\"paisId\":4,\"marcaId\":9,\"sucursalId\":17314,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada: Fuera de Horario\",\"fechaRegistro\":\"1649137402133\",\"estatus\":1},{\"paisId\":4,\"marcaId\":9,\"sucursalId\":17317,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada: Fuera de Horario\",\"fechaRegistro\":\"1649137402133\",\"estatus\":1},{\"paisId\":4,\"marcaId\":9,\"sucursalId\":17319,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada: Fuera de Horario\",\"fechaRegistro\":\"1649137402133\",\"estatus\":1},{\"paisId\":4,\"marcaId\":9,\"sucursalId\":17327,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada: Fuera de Horario\",\"fechaRegistro\":\"1649137402133\",\"estatus\":1},{\"paisId\":4,\"marcaId\":9,\"sucursalId\":17328,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada: Fuera de Horario\",\"fechaRegistro\":\"1649137402133\",\"estatus\":1}]";

        String b5= "[{\"paisId\":1,\"marcaId\":9,\"sucursalId\":38109,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada  Fuera de Horario\",\"estatus\":1},{\"paisId\":1,\"marcaId\":9,\"sucursalId\":38109,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada  Fuera de Horario\",\"estatus\":1}]";


        String b6 = "[{\"paisId\":1,\"marcaId\":9,\"sucursalId\":38109,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada  Fuera de Horario\",\"estatus\":1},{\"paisId\":1,\"marcaId\":9,\"sucursalId\":38109,\"puntoDeVenta\":3,\"response\":\"Tienda Cerrada  Fuera de Horario\",\"estatus\":1}]";

        String r =  listaMessagess(vv);

        System.out.println(r);

    }


   static private String listaMessagess(String list) {
        Gson gson = new Gson();
        ConexionDTO[] opItems;
        StringBuilder html = new StringBuilder("<ul>");
        SimpleDateFormat changeFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date s;

        String jsonList = list.replace("=", "\":").replace(", ", "\", ").
                replace(", ", ", \"").replace("{", "{\"")
                .replace("}", "\"}").replace(":", ":\"")
                .replace("}\", \"", "},");

        System.out.println(jsonList);
        opItems = gson.fromJson(jsonList, ConexionDTO[].class);

        for (ConexionDTO a : opItems) {

            html.append("<li style=\"line-height:160%\">" + " Marca: ").append(a.getMarcaId()).append(", Sucursal: ").append(a.getSucursalId()).append(", País: ").append(a.getPaisId()).append(", Mensaje: ").append(a.getResponse()).append("</li>");
        }
        html.append("</ul>");

        return html.toString();
    }


   static  private String listaMessages2(String list) {
        Gson gson = new Gson();
        ConexionDTO[] opItems;
        StringBuilder html = new StringBuilder("<ul>");
        SimpleDateFormat changeFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date s;

        String jsonList = list.replace("=", "\":").replace(", ", "\", ").
                replace(", ", ", \"").replace("{", "{\"")
                .replace("}", "\"}").replace(":", ":\"")
                .replace("\"\"","\"" )
         .replace(",", "\",")
                .replace("\"\",\"","\", \"" )
                .replace("}\",","}," );

       System.out.println(jsonList);
        opItems = gson.fromJson(jsonList, ConexionDTO[].class);

        for (ConexionDTO a : opItems) {

            html.append("<li style=\"line-height:160%\">" + " Marca: ").append(a.getMarcaId()).append(", Sucursal: ").append(a.getSucursalId()).append(", País: ").append(a.getPaisId()).append(", Mensaje: ").append(a.getResponse()).append("</li>");
        }
        html.append("</ul>");

        return html.toString();
    }

    static private String listaMessages(String list) {
        Gson gson = new Gson();
        ConexionDTO[] opItems;
        StringBuilder html = new StringBuilder("<ul>");
        SimpleDateFormat changeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date s;

        String jsonList = list.replace("=", "\":").replace(", ", "\", ").
                replace(", ", ", \"").replace("{", "{\"")
                .replace("}", "\"}").replace(":", ":\"");
        System.out.println(jsonList);
        opItems = gson.fromJson(jsonList, ConexionDTO[].class);

        for (ConexionDTO a : opItems) {
            s = new Date(Long.parseLong(a.getFechaRegistro()));
            html.append("<li style=\"line-height:160%\">" + " Marca: ").append(a.getMarcaId()).append(", Sucursal: ").append(a.getSucursalId()).append(", País: ").append(a.getPaisId()).append(", Fecha: ").append(changeFormat.format(s)).append(", Mensaje: ").append(a.getResponse()).append("</li>");
        }
        html.append("</ul>");

        return html.toString();
    }


    private static long  getSeconds2(String scheduledDeliveryTime) {
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            LocalDateTime fechaProgramada = LocalDateTime.parse(scheduledDeliveryTime, dateTimeFormatter);
            if (LocalDateTime.now().isBefore(fechaProgramada)) {
                long[] time = getTime(LocalDateTime.now(), fechaProgramada);
                LocalTime hayden = LocalTime.of((int) time[0], (int) time[1], (int) time[2]);
                System.out.println("Fecha actual : " + LocalDateTime.now());
                System.out.println("Fecha programada : " + fechaProgramada);
                System.out.println("Segundos  en enviarse la orden : " + hayden.toSecondOfDay());
                return hayden.toSecondOfDay();
            }
        } catch (Exception e) {
            System.out.println("Error al obtener los segundos : " + e.getMessage());
        }
        return  0;
    }



    private static void getSeconds(String scheduledDeliveryTime) {
        try {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            LocalDateTime fechaProgramada = LocalDateTime.parse(scheduledDeliveryTime, dateTimeFormatter);

            if( LocalDateTime.now().isBefore(fechaProgramada)){

                long time[] = getTime( LocalDateTime.now(),fechaProgramada);
                LocalTime hayden  = LocalTime.of((int)time[0] ,(int)time[1], (int)time[2]);
                System.out.println("hayden : "+hayden.toSecondOfDay());
                System.out.println("Fecha actual : " + LocalDateTime.now());
                System.out.println("Fecha programada : " + fechaProgramada);
                System.out.println("Segundos  en enviarse la orden : " + hayden.toSecondOfDay());
//            System.out.println("Ticket :" + ticket);

            }
        } catch (Exception e) {
            System.out.println("Error en la fecha: " + e.getMessage());
        }
    }


    private static Period getPeriod(LocalDateTime dob, LocalDateTime now) {
        return Period.between(dob.toLocalDate(), now.toLocalDate());
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
