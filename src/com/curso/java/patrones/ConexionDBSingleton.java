package com.curso.java.patrones;

public class ConexionDBSingleton {

    private static  ConexionDBSingleton instance;

    private ConexionDBSingleton(){
        System.out.println("Conectándose algún motor de base de datos");
    }

    public static ConexionDBSingleton getInstance(){
        if(instance == null){
            instance = new ConexionDBSingleton();
        }
        return instance;
    }
}
