package com.curso.java.sockets;

import com.curso.java.util.Consumidor;
import com.curso.java.util.Panaderia;
import com.curso.java.util.Panadero;

public class ProductorConsumidor {

    public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
