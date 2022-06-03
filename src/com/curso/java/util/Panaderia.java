package com.curso.java.util;

public class Panaderia {

    private String pan;
    private boolean disponible;

    public synchronized void hornear(String masa){
        while (disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.pan = masa;
        System.out.println("Panadero hornea el pan "+this.pan);
        this.disponible = true;
        notify();
    }

    public synchronized String consumirPan(){
        while (!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("El cliente se come el pan "+this.pan);
        this.disponible = false;
        notify();
        return  pan;
    }

}
