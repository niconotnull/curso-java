package com.curso.java.models.interfaces;

public interface Imprimible {

    final static String TEXT= "Imprimiendo un valor por defecto";

    String imprimir();

    default String imprimir2(){
        return  TEXT;
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}
