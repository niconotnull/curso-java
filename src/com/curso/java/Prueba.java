package com.curso.java;

import com.google.gson.Gson;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Prueba {


    public  void leer() throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("src/test/resources/stringtoolong.txt");
//        String stringTooLong = IOUtils.toString(fis, "UTF-8");
    }

    public String listaMessages(String list) {
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
}
