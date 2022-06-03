package com.curso.java.sockets;

import com.curso.java.util.thread.NombreThread;

public class ThreadExtends {

    public static void main(String[] args) throws InterruptedException {
        Thread hilo1 = new NombreThread("Nicolas");
        hilo1.start();
//        Thread.sleep(100);
        Thread hilo2 = new NombreThread("Hayden");
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Miriam");
        hilo3.start();

        System.out.println("Estado : "+hilo1.getState());
    }
}
