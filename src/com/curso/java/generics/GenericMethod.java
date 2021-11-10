package com.curso.java.generics;

import com.curso.java.models.generics.Cliente;

import java.util.Arrays;
import java.util.List;

public class GenericMethod {

    public static void main(String[] args) {

        Cliente[] clientes = {new Cliente(1, "Jesus"), new Cliente(2, "Hayden")};
        Integer[] enteros = {1, 2, 3, 4, 5};
        String[] palabras = {"Always", "Usually", "Frequently", "Often", "Occasionally"};

        List<Cliente> clientList = fromArrayToList(clientes);
        List<Integer> enterosList = fromArrayToList(enteros);
        List<String> wordsList = fromArrayToList(palabras);
        List<String> wordsList2 = fromArrayToList(palabras, clientes);
    }

    /**
     * Esto es un método concreto
     */
    public static List<Cliente> fromArrayToList(Cliente[] c) {
        return Arrays.asList(c);
    }

    /**
     * Esto es un método genérico
     * <T> : Indica que será un método genérico
     */
    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    /**
     * <T, G> : Definimos los tipos de datos genéricos como parámetros en el método
     * (T[] c, G[] g) : Aquí trabajamos con los tipos genéricos
     */
    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento.toString());
        }
        return Arrays.asList(c);
    }

}
