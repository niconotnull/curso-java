package com.curso.java.sockets;

import com.curso.java.util.thread.ViajeTarea;

public class RunnableInterface {

    public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de Pascua ")).start();
        new Thread(new ViajeTarea("Robinson Crusoe ")).start();
        new Thread(new ViajeTarea("Juan Fernandez ")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();
    }
}
