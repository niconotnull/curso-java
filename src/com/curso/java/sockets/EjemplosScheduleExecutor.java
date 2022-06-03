package com.curso.java.sockets;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemplosScheduleExecutor {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        System.out.println("Alguna tarea en el main");
        executorService.schedule(()->{
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hola mundo tarea programada");
        },2000, TimeUnit.MICROSECONDS);

        System.out.println("Alguna otra tarea...");
        executorService.shutdown();
    }

}
