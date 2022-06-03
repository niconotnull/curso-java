package com.curso.java.sockets;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class AgendarTareaTimer {

    public static void main(String[] args) {

        Timer temporizador = new Timer();
        temporizador.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en : "+new Date() + " nombre del Thread "+Thread.currentThread().getName());
                System.out.println("Finaliza el tiempo");
                temporizador.cancel();
            }
        }, 5000);

        System.out.println("Agendando una tarea para 5 segundos más...");
    }
}
