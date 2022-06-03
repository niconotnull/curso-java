package com.curso.java.algoritmos;

import java.util.Arrays;

public class OrdenacionController {

    public static void main(String[] args) {

        int [] cto1 = {3,5,4,2,1,10,6};
        double [] cto2 = {3,5,4,2,1,10,6};
        ordIntercambio(cto1);

        ordSeleccion(cto2);
    }

    /**
     * Algoritmo de ordenación por intercambio
     * El algoritmo se basa en la lectura sucesiva de la lista a ordenar, comparando el elemento inferior
     * de la lista con los restantes y efectuando un intercambio de posiciones cuando el orden resultante de la
     * comparación no sea el correcto.
     * Ejemplo el elemento indice 0 se compara con cada elemento posterior de la lista de indices 1, 2, 3.., en cada
     * comparación se comprueba si el elemento siguiente es más pequeño que el elemento de indice 0 y en ese caso se
     * intercambian
     */
    public static void ordIntercambio(int []a){
        int i,j;
       for(i =0 ; i<a.length-1;i++){
           // situa minimo de a[i+1]... a[n-1]
           for(j=i+1; j<a.length; j++){
               if(a[i]> a[j]){
                   intercambiar(a, i,j);
               }
           }
       }
        Arrays.stream(a).forEach(System.out::println);

    }

    public static void intercambiar(int []a, int i, int j){
        int aux = a[i];
        a[i]= a[j];
        a[j]= aux;
    }



    /**
     * Algoritmo de ordenación por selección
     */
    public static void ordSeleccion(double[] a) {
        int indiceMenor, i, j, n;
        n = a.length;

        for (i = 0; i < n - 1; i++) {
            // comienza la exploración en indice i
            indiceMenor = i;
            // j explora la sublista  a[i+1]..a[n-1]
            for (j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMenor]) {
                    indiceMenor = j;
                }
                // Sitúa el elemento más pequeño en a[i]
                if (i != indiceMenor) {
                    intercambiar(a, i, indiceMenor);
                }
            }
        }
    }

    public static void intercambiar(double []a, int i, int j){
        double aux = a[i];
        a[i]= a[j];
        a[j]= aux;
    }

}


