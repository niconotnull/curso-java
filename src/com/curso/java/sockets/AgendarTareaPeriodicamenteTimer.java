package com.curso.java.sockets;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class AgendarTareaPeriodicamenteTimer {

    public static void main(String[] args) {

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        AtomicInteger contadorAtomic = new AtomicInteger(3);

        Timer temporizador = new Timer();
        temporizador.schedule(new TimerTask() {
//            int contador = 3;
            @Override
            public void run() {
                int i  = contadorAtomic.getAndDecrement();
                if (i > 0) {
                    toolkit.beep();
                    System.out.println("Tarea periodica "+i+"   en : " + new Date() + " nombre del Thread " + Thread.currentThread().getName());
                } else {
                    System.out.println("Finaliza el tiempo");
                    temporizador.cancel();
                }
            }
        }, 5000, 10000);

        System.out.println("Agendando una tarea para 5 segundos más...");
    }
}
