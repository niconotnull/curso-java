package com.curso.java.generics;

import com.curso.java.models.generics.Cliente;
import com.curso.java.models.generics.ClientePremium;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class BoundedGenericsMethod {

    public static void main(String[] args) {

        ClientePremium[] clientesPremium = {new ClientePremium(1, "Jesus"), new ClientePremium(2, "Hayden")};
        Integer[] enteros = {1, 2, 3, 4, 5};
        String[] palabras = {"Always", "Usually", "Frequently", "Often", "Occasionally"};

        List<Integer> enterosList = fromArrayToList(enteros);
        List<String> srtringList =   fromArrayToList(palabras);
        List<ClientePremium> clientePremiumList = fromArrayToList(clientesPremium);
    }

    /**
     * Nos permite limitar el método genérico para que solo acepte numbers
     */
    public static <T extends  String> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends  Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    /**
     * En este método aceptara cualquier tipo o genérico que sea de tipo cliente y también sub-clases es
     * decir que hereden de la clase cliente
     * Se deberá de cumplir con el contrato
     */
    public static <T extends  Cliente> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    // Se deberá de cumplir con el contrato
    public static <T, G extends  Cliente & Collection<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }


}
