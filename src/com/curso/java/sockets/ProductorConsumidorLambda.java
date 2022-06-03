package com.curso.java.sockets;

import com.curso.java.util.Consumidor;
import com.curso.java.util.Panaderia;
import com.curso.java.util.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class ProductorConsumidorLambda {

    public static void main(String[] args) {
        Panaderia p = new Panaderia();

        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                p.hornear("Pan numero : "+i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                p.consumirPan();
            }
        }).start();
    }

}
