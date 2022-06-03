package com.curso.java.algoritmos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursivoController {

    static  final  String MESSAGE1 = "Ingrese un número...";
    static  final  String MESSAGE2 = "Ingrese una leta...";

    public static void main(String[] args) throws IOException {

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));


        int option = 0;
        do {
            System.out.println("ALGORITMOS RECURSIVOS....");
            System.out.println("1.- Algoritmo recursivo de la función matemática que suma los n primeros números enteros positivos ");
            System.out.println("2.- Definición recursiva de la serie Fibonacci ");
            System.out.println("3.- Definición iterativa de la serie Fibonacci");
            System.out.println("4.- Método recursivo que calcula el factorial de un número n");
            System.out.println("5.- Dado un número natural n obtener la suma de los dígitos de que consta recursiva");
            System.out.println("6.- Dado un número natural n obtener la suma de los dígitos de que consta iterativa");
            System.out.println("7.- Recursividad indirecta");
            System.out.println("8.- Salir");

            option = Integer.parseInt(entrada.readLine());

            switch (option) {

                case 1:
                    System.out.println(MESSAGE1);
                    System.out.println("Suma de los n primero número: " + sumanEnteros(Integer.parseInt(entrada.readLine())));
                    break;
                case 2:
                    System.out.println(MESSAGE1);
                    System.out.println("Serie fibonacci recursiva: " + fibonacci(Integer.parseInt(entrada.readLine())));
                    break;
                case 3:
                    System.out.println(MESSAGE1);
                    System.out.println("Serie fibonacci iterativa 2: " + fibonacci2(Integer.parseInt(entrada.readLine())));
                    break;
                case 4:
                    System.out.println(MESSAGE1);
                    System.out.println("Factorial: " + factorial(Integer.parseInt(entrada.readLine())));
                    break;
                case 5:
                    System.out.println(MESSAGE1);
                    System.out.println("Suma de los dígitos : " + sumaRecursiva((Integer.parseInt(entrada.readLine()))));
                    break;
                case 6:
                    System.out.println(MESSAGE1);
                    System.out.println("Suma de los dígitos : " + sumaIterativa((Integer.parseInt(entrada.readLine()))));
                    break;
                case 7:
                    System.out.println(MESSAGE2);
                    String a = entrada.readLine();
                    metodoA(a.charAt(0));
                    System.out.println();
                    break;
                default:
                    System.out.println("No es una opción valida");
                    break;

            }
        } while (option != 8);

    }


    // Algoritmo recursivo de la función matemática que suma los n primeros números enteros positivos
    // S(n) = n + S(n-1)
    // Condición de parada S(1) = 1
    static  int sumanEnteros(int num){
        if(num == 1){
            return  1;
        }else{
            return  num + sumanEnteros(num-1);
        }
    }

    // Definición recursiva de la serie Fibonacci
    // fibonacci(n) = n    si n = 0 ó n = 1
    // fibonacci(n) = fibonacci(n-1) fibonacci(n-2)
    static int fibonacci(int n){
        if(n == 0 || n ==1){
            return n;
        }else{
            return  fibonacci(n-1) + fibonacci(n-2);
        }
    }

    // Algoritmo fibonacci iterativo
    static int fibonacci2(int n){

        if(n == 0 || n == 1){
            return n;
        }
        int a = 0;
        int b = 1;

        for(int v = 2; v<=n ; v++){
            int x;
            x = a;
            a = b;
            b = x + a;
        }
        return b;

    }

    // Método recursivo que calcula el factorial de un número n
    // La componente base del método recurisvo que calcula el factorial es n = 0  o un incluso = 1,
    // ya que en ambos casos el factorial es 1
    //  n! = 1   si n = 0  o n = 1 (componente base)
    //  n! = n(n - 1)  si n > 1
    static int factorial(int n){
        if(n<=1){
            return 1;
        }else {
            return  n * factorial(n-1);
        }
    }


    // Recursividad indirecta:  la recursividad indirecta se produce cuando un método llama a otro
    // que eventualmente terminará llamando de nuevo al primer método
    static void metodoA(char c){
        if(c > 'A'){
            metodoB(c);
            System.out.print(c + " ");
        }else {
            System.out.print(c+ " ");
        }


    }

    static void metodoB(char c){
        metodoA(--c);
    }


    // Dado un número natural n obtener la suma de los dígitos de que consta
    // suma = suma(n/10) + modulo(n,10)  para n > 9
    // suma = n                          para <= 9 caso base
    static  int sumaRecursiva(int n){
        if(n <= 9){
            return n;
        }else {
            return sumaRecursiva(n/10) + n%10;
        }
    }

    static int sumaIterativa(int n){
        int suma = 0 ;
        while (n>9){
            suma +=n%10;
            n /=10;
        }
        return (suma+n);
    }

}
