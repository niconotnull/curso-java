package com.curso.java.generics;

import com.curso.java.models.generics.Cliente;
import com.curso.java.models.generics.ClientePremium;

import java.util.Arrays;
import java.util.List;

public class WildCardsMethod {

    /**
     * Los wildCards o comodines solo se pueden utilizar en listas
     */

    public static void main(String[] args) {

        Cliente[] clientes = {new Cliente(1, "Jesus"), new Cliente(2, "Hayden")};
        ClientePremium[] clientesPremium = {new ClientePremium(1, "Jesus"), new ClientePremium(2, "Hayden")};

        List<Cliente> clientList = fromArrayToList(clientes);
        List<ClientePremium> clientePremiumsList = fromArrayToList(clientesPremium);

        imprimirClientes2(clientList);
        imprimirClientes2(clientePremiumsList);

    }

    /**
     * Aplicamos el comodín para poder imprimir cualquier objeto que herede de la clase cliente  para nuestro
     * caso será ClientePremium ya que en el método si
     * guiente no lo permite
     * <? extends Cliente> Si se podrá imprimir cualquier tipo de cliente
     */
    public  static void imprimirClientes2(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    /**
     * Este método nos permitirá imprimir objetos de la lista de tipo  ClientePremium
     * por que aunque ClientePremium herede de la clase cliente, nada tiene que ver con List
     */
    public  static void imprimirClientes(List<Cliente> clientes){
        clientes.forEach(System.out::println);
    }

    /**
     * En este método aceptara cualquier tipo o genérico que sea de tipo cliente y también sub-clases es
     * decir que hereden de la clase cliente
     * Se deberá de cumplir con el contrato
     */
    public static <T extends  Cliente> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }



}
