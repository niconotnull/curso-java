package com.curso.java.interfaces;

import com.curso.java.models.interfaces.crud.model.Cliente;
import com.curso.java.models.interfaces.crud.repository.*;
import com.curso.java.models.interfaces.crud.repository.generics.OrdenablePaginableCrudRepository;
import com.curso.java.util.Direccion;

public class EjemploClienteRepository {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepository<Cliente> repository = new ClienteListRepository();
        repository.crear(new Cliente("Nicolas", "Jimenez"));
        repository.crear(new Cliente("Hayden", "Cosme"));
        repository.crear(new Cliente("Isela", "Castro"));

        System.out.println("===LISTA===");
        repository.listar().forEach(System.out::println);
        System.out.println("===PAGINABLE===");
        repository.listar(0, 2).forEach(System.out::println);
        System.out.println("===ORDENAR===");
        repository.listar("nombre", Direccion.DESC).forEach(System.out::println);
        System.out.println("===EDITAR===");
        Cliente clienteUpdate = new Cliente("Miryam Hayden", "Aquino");
        clienteUpdate.setId(2);
        repository.editar(clienteUpdate);
        System.out.println(repository.porId(2));
        System.out.println("===ELIMINAR===");
        repository.eliminar(1);
        repository.listar().forEach(System.out::println);

    }
}
