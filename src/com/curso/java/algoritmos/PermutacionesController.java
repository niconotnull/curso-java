package com.curso.java.algoritmos;

/**
 * Cada unos de los diferentes arreglos que pueden hacerse con una parte de los elementos o con todos lo elementos,
 * de un conjunto se llama una permutación
 * Conviene observar que el orden es una característica de especial importancia de una permutación. Cuando variamos el orden de los
 * elementos de una permutación  se dice que permutamos dichos elementos
 */

public class PermutacionesController {


    public static void main(String[] args) {

        int [] cto ={2,4,5,7};
    //   3 2   1
        System.out.println(vocales(("Hola mundo").toUpperCase()));
        System.out.println(f(4));
//        System.out.println(permutacionPares(cto));



    }


    /**
     * Ejemplo 2:  Hallar el número de enteros diferentes de tres cifras que puedan formarse
     * con el conjunto dado: ITERATIVO
     */
    public static int permutacion1(int n) {
        int a;
        int b = 1;

        while (n > 0) {
            a = b;
            b = a * (n--);
        }

        return b;
    }

    /**
     * Ejemplo 2:  Hallar el número de enteros diferentes de tres cifras que puedan formarse
     * con el conjunto dado: RECURSIVO
     */
    public static int permutacion2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * permutacion1(n - 1);
        }
    }


    /**
     * Cúantos enteros son pares del ejemplo 2
     */
    public static int permutacionPares(int [] cto){
        int p = 0;
        // Buscar los número pares;
        for (int i = 0; i < cto.length; i++) {
            if((cto[i]%2) == 0){
                p++;
            }
        }
        int  r = cto.length;
        int a = 1;
        int b =1;

        while (r > p){
            a = b;
            b = a * (r-p);
            r--;
        }
        return  b;
    }




    // Hallar la permutación de cuatro númeroS con  repetición
    public static int permutacion5(int n) {
        // 24
        int a ;
        int b = 1;
        int x = n;
        while (n > 0) {
            a = b;
            b = a * (x);
            n--;
        }

        return b;
    }



    // Hallar la permutación de cuatro número con  repeticion
    public static int permutacion3(int n) {
        if(n == 1){
            return 1;
        }else {
            System.out.println(n);
            return   n * permutacion1(n);
        }
    }

    // Escribir un método Iterativo para carcular el número de vocales una cadena
    public static int vocales(String p){
        char [] v = {'A', 'E','I','O','U' };
        int r = 0;

        for (int i = 0; i < p.length(); i++) {
            for (int j = 0; j <v.length ; j++) {
                    if(p.charAt(i) == v[j]){
                        r++;
                    }
            }
        }

        return r;
    }


    // Escribir un método recurivo para carcular el número de vocales una cadena

   static int f(int n){
        if(n == 0){
            return  1;
        }else if(n == 1){
            return 2;

        }else {
            return 2 * f(n - 2) + f(n - 1);
        }
    }
}
