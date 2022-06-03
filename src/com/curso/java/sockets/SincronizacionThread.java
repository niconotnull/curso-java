package com.curso.java.sockets;

import com.curso.java.util.runnable.ImprimirFraces;

public class SincronizacionThread {

    public static void main(String[] args) throws InterruptedException {

        new Thread(new ImprimirFraces("Hola ","Que tal"  )).start();
        new Thread(new ImprimirFraces("Quien ","eres tu?"  )).start();

        Thread.sleep(100);
        Thread thr3 =  new Thread(new ImprimirFraces("Muchas ","gracias"  ));
        thr3.start();
        Thread.sleep(100);
        System.out.println(thr3.getState());

    }

    // Varios hilos accederan a este hilo, y sincronizarlo
    public synchronized static void imprimirFraces(String frace1, String frace2){
        System.out.println(frace1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(frace2);
    }

}
