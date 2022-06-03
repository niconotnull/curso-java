package com.curso.java.sockets;

import java.util.concurrent.*;

public class EjemploFutureExecutor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Callable<String> tarea = ()->{
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del Thread : "+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");
            return "Algun resultado importante de la tarea";
        };
       Future<String> resultado = executorService.submit(tarea);
        executorService.shutdown(); // Permite al pagar el proceso
        System.out.println("Continuando con la ejecución del main 1");


        while (!resultado.isDone()){
            System.out.println("Ejecutando tarea");
            TimeUnit.MILLISECONDS.sleep(1500);
        }

        System.out.println("Resultado Futuro : "+resultado.isDone());
        System.out.println(resultado.get(4,TimeUnit.SECONDS));
        System.out.println(resultado.isDone());

    }
}
