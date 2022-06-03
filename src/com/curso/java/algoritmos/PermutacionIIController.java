package com.curso.java.algoritmos;


/**
 * Colorario:  El número total de permutaciones de n objetos diferentes tomados de n en n esta dado por
 * P(n,n) = n(n-1)(n-2)... 1 = n!
 *
 * Teorema :  Si P representa el número de permutaciones distintas de n elementos tomados de n en n, en donde hay un primer
 * tipo de p objetos iguales entre si, q objetos iguales entre si de un segundo tipo, r objetos
 * iguales entre si de un tercer tipo, y así sucesivamente entonces:
 *
 * P  =  n!
 *      ----------
 *      p!q!r!
 */
public class PermutacionIIController {

    public static void main(String[] args) {
//        System.out.println("Ejemplo 1: "+ ejemplo1(7));
//        System.out.println("Ejemplo 2: "+ ejemplo2(7));

//        String []
    }



    /**
     * Cuantas diferentes quitas de basket ball pueden formarse si hay 7 jugadores disponibles para
     * para jugar cualquier posición
     *
     * Podemos considerar que el resultado es igual al número de permutaciones de 7 objetos tomados de 5 en 5
     * el cual por la formula  es
     */
    public static int ejemplo1(int n) {
        int q = 5;
        if (n <= 1 || n == 2) {
            return 1;
        } else {
            return n * ejemplo1(n - 1);
        }
    }


    /**
     * Calcular el número de permutaciones diferentes que pueden formarse con las letras 'acasias' tomadas
     * todas a la vez
     *
     * Solución:  La palabra contiene 7 letras de las cuales 3 son a, 2 son c y el resto diferentes, Por tanto
     * por el teorema 3 el número de permutaciones diferentes es:
     *    7!
     *  ------
     *   3!2!
     *
     */
    public static int ejemplo2(String palabra) {

        return  0;

    }


    /**
     *  La búsqueda binaria es un método de localizacion de una clave especifica dentro de una lista o array ordenado
     *  de n elementos que realiza una exploración de la lista hasta que se encuentra o se decide que no está en la lista
     *  El algoritmo de búsqueda binaria se puede describir recursivamente aplicando la tecnica divide y venceras
     *
     */



    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }





}




