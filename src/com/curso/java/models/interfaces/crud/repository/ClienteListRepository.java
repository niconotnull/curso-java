package com.curso.java.models.interfaces.crud.repository;

import com.curso.java.models.interfaces.crud.model.Cliente;
import com.curso.java.models.interfaces.crud.repository.generics.AbstractListRepository;
import com.curso.java.util.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepository extends AbstractListRepository<Cliente> {

    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.porId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);

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

    public static int ordenar(Cliente a, Cliente b, String campo) {
        int resultado = 0;
        switch (campo) {
            case "id":
                resultado = b.getId().compareTo(a.getId());
                break;
            case "nombre":
                resultado = b.getNombre().compareTo(a.getNombre());
                break;
            case "apellido":
                resultado = b.getApellido().compareTo(a.getApellido());
                break;
        }
        return resultado;
    }
}
