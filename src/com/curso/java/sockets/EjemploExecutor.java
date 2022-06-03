package com.curso.java.sockets;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Runnable tarea = ()->{
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del Thread : "+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");
        };
        executorService.submit(tarea);
        executorService.shutdown(); // Permite al pagar el proceso
        System.out.println("Continuando con la ejecución del main 1");
        executorService.awaitTermination(2,TimeUnit.SECONDS); //Esperar a que finalicen todas las tareas y luego que se detenga el excecutor  para continuar con el proceso del hilo principal
        System.out.println("Continuando con la ejecución del main 2");
    }
}
