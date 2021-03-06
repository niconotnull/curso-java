package com.curso.java.sockets;

import com.curso.java.util.thread.ViajeTarea;

public class RunnableInterfaceLambda {

    public static void main(String[] args) throws InterruptedException {

        Thread mainHilo = Thread.currentThread();

        Runnable viaje1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "-" + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finalmente me voy de viaje a : " + Thread.currentThread().getName());
            System.out.println(mainHilo.getState());
        };


        Runnable viaje = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + "-"+Thread.currentThread().getName());
                    try {
                        Thread.sleep((long)(Math.random()*1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Finalmente me voy de viaje a : "+Thread.currentThread().getName());
                System.out.println(mainHilo.getState());
            }
        };


        Thread v1 = new Thread(viaje,"Isla de Pascua ");
        Thread v2 = new Thread(viaje,"Robinson Crusoe ");
        Thread v3 = new Thread(viaje,"Juan Fernandez ");
        Thread v4 = new Thread(viaje,"Isla de Chiloe");

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        v1.join();
        v2.join();
        v3.join();
        v4.join();



//        Thread.sleep(8000);

        System.out.println("Continuando con la ejecucion del método main : "+mainHilo.getName());
    }
}
