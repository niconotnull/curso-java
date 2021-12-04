package com.curso.java.patrones;

public class Singleton {

    /**
     * El patron singleton permite crear solo una instancia de una clase
     * es un patrón creacional
     */


    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            ConexionDBSingleton con = ConexionDBSingleton.getInstance();
            System.out.println("con ="+con);
        }
    }
}
