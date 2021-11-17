package com.curso.java.interfaces;

import com.curso.java.models.interfaces.crud.model.Cliente;
import com.curso.java.models.interfaces.crud.model.Producto;
import com.curso.java.models.interfaces.crud.repository.ClienteListRepository;
import com.curso.java.models.interfaces.crud.repository.ProductListRepository;
import com.curso.java.models.interfaces.crud.repository.generics.OrdenablePaginableCrudRepository;
import com.curso.java.util.Direccion;

public class EjemploProductoRepository {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepository<Producto> repository = new ProductListRepository();
        repository.crear(new Producto("Apple Watch", 11500.99));
        repository.crear(new Producto("Imac", 38769.33));
        repository.crear(new Producto("Ipod", 3734.34));

        System.out.println("===LISTA===");
        repository.listar().forEach(System.out::println);
        System.out.println("===PAGINABLE===");
        repository.listar(0, 2).forEach(System.out::println);
        System.out.println("===ORDENAR===");
        repository.listar("nombre", Direccion.DESC).forEach(System.out::println);
        System.out.println("===EDITAR===");
        Producto productoUpdate = new Producto("MacBook Pro", 78390.90);
        productoUpdate.setId(2);
        repository.editar(productoUpdate);
        System.out.println(repository.porId(2));
        System.out.println("===ELIMINAR===");
        repository.eliminar(1);
        repository.listar().forEach(System.out::println);

    }
}
