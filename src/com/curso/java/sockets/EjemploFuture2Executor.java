package com.curso.java.sockets;

import java.util.concurrent.*;

public class EjemploFuture2Executor {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
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

        Callable<Integer> tarea2 =  ()->{
            System.out.println("Iniciando tarea 2...");
            TimeUnit.SECONDS.sleep(3);
          return 10;
        };

        Future<String> resultado = executorService.submit(tarea);
        Future<String> resultado2 = executorService.submit(tarea);
        Future<Integer> resultado3 = executorService.submit(tarea2);


        executorService.shutdown(); // Permite al pagar el proceso
        System.out.println("Continuando con la ejecución del main 1");


        while (!(resultado.isDone() && resultado2.isDone() && resultado3.isDone())){
            System.out.println(String.format("resultado1: %s -resultado2: %s -resultado3: %s",
                    resultado.isDone()?"Finalizo":"en proceso",
                    resultado2.isDone()?"Finalizo":"en proceso",
                    resultado3.isDone()?"Finalizo":"en proceso"));
            TimeUnit.MILLISECONDS.sleep(1000);
        }

        System.out.println("Obtenemos resultado de la tarea1: "+resultado.get());
        System.out.println("Finaliza la tarea1: "+resultado.isDone());

        System.out.println("Obtenemos resultado de la tarea2: "+resultado2.get());
        System.out.println("Finaliza la tarea2: "+resultado2.isDone());

        System.out.println("Obtenemos resultado de la tarea3: "+resultado3.get());
        System.out.println("Finaliza la tarea3: "+resultado3.isDone());

    }
}
