package com.curso.java.generics;

public class ComparableGenericMethod {

    /**
     * Permitira calcular el máximo entre tres objetos, ya sea número
     */

    public static void main(String[] args) {

        System.out.println("Máximo de 1, 6, 3 es : "+maximo(1,6,3));
        System.out.println("Máximo de 12.3, 33.2, 34.2 es : "+maximo(12.3, 33.2, 34.2));
        System.out.println("Máximo de manzana, limón, aguacate  : "+maximo("manzana", "limón", "aguacate"));
    }

    /**
     * Se deberá de cumplir con el contrato es decir cualquier
     * objeto que se pase deberán de implentar  Comparable para poder
     * realizar la validación del máximo
     */
    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max =b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }
}
