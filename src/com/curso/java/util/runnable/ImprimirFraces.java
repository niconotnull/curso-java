package com.curso.java.util.runnable;

import com.curso.java.sockets.SincronizacionThread;

public class ImprimirFraces implements Runnable{

    private String frase1;
    private String frase2;


    public ImprimirFraces(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        SincronizacionThread.imprimirFraces(this.frase1, this.frase2);
    }
}
