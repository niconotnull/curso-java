package com.curso.java.ejemplos.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConjuntoService {

    static int M = 2;
    private Object [] cto;
    private int cardinal; // ES el número total de elementos del conjunto
    private int capasidad;

    public ConjuntoService(){
        cto = new Object[M];
        capasidad = M;
        cardinal = 0;
    }

    public boolean esVacio(){
        return  cardinal == 0;
    }

    // Agregamos un elemento al conjunto, no se pueden agregar elementos duplicados al conjunto
    public void agregarElemento(Object element){
        if(!pertenece(element)){
            if(capasidad == cardinal){
                Object [] newCto = new Object[capasidad+M];
                for(int a = 0 ; a< cto.length; a++){
                    newCto[a] = cto[a];
                }
                cto = newCto;
            }
            cto[cardinal++] = element;
        }
    }

    // Valida si el elemente ya pertenece al conjunto
    public boolean pertenece(Object element){
        int k =  0;
        boolean encontrado = false;

        while (k < cardinal && !encontrado){
           encontrado = cto[k].equals(element);
           k++;
        }
        return encontrado;
    }

    // Visualizar el conjunto actual
    public void visualizar(){
        for (int a = 0 ; a< cardinal; a++){
            System.out.print(cto[a]+ " ");
        }
        System.out.println();
    }

}
