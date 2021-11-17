package com.curso.java.interfaces;

import com.curso.java.models.interfaces.crud.model.Cliente;
import com.curso.java.models.interfaces.crud.repository.ClienteListRepository;
import com.curso.java.models.interfaces.crud.repository.CrudRepository;
import com.curso.java.models.interfaces.crud.repository.OrdenableRepository;
import com.curso.java.models.interfaces.crud.repository.PaginableRepository;
import com.curso.java.util.Direccion;

public class EjemploRepository {
    public static void main(String[] args) {

        CrudRepository repository = new ClienteListRepository();
        repository.crear(new Cliente("Nicolas", "Jimenez"));
        repository.crear(new Cliente("Hayden", "Cosme"));
        repository.crear(new Cliente("Isela", "Castro"));

        System.out.println("===LISTA===");
        repository.listar().forEach(System.out::println);
        System.out.println("===PAGINABLE===");
        ((PaginableRepository)repository).listar(0, 2).forEach(System.out::println);
        System.out.println("===ORDENAR===");
       ((OrdenableRepository)repository).listar("nombre", Direccion.DESC).forEach(System.out::println);
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
