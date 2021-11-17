package com.curso.java.models.interfaces.crud.repository;

import com.curso.java.models.interfaces.crud.model.Producto;
import com.curso.java.models.interfaces.crud.repository.generics.AbstractListRepository;
import com.curso.java.util.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ProductListRepository extends AbstractListRepository<Producto> {
    @Override
    public void editar(Producto producto) {
        Producto cli = this.porId(producto.getId());
        cli.setDescription(producto.getDescription());
        cli.setPrecio(producto.getPrecio());
    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);

        listaOrdenada.sort((a, b) -> {
                    int resultado = 0;
                    if (dir == Direccion.ASC) {
                        resultado = ordenar(a, b, campo);
                    } else if (dir == Direccion.DESC) {
                        resultado = ordenar(b, a, campo);
                    }
                    return resultado;
                }
        );
        return listaOrdenada;
    }

    public static int ordenar(Producto a, Producto b, String campo) {
        int resultado = 0;
        switch (campo) {
            case "id":
                resultado = b.getId().compareTo(a.getId());
                break;
            case "description":
                resultado = b.getDescription().compareTo(a.getDescription());
                break;
            case "precio":
                resultado = b.getPrecio().compareTo(a.getPrecio());
                break;
        }
        return resultado;
    }
}
