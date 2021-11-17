package com.curso.java.models.interfaces.crud.repository;

import com.curso.java.models.interfaces.crud.model.Cliente;
import com.curso.java.util.Direccion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepository implements OrdenablePaginableCrudRepository{

    private List<Cliente> dataSource;

    public ClienteListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente cliente = new Cliente();
        for(Cliente a : this.dataSource ){
            if(a != null && a.getId().equals(id)){
                cliente = a;
               break;
            }
        }
       return cliente;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente cli = this.porId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());

    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
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

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
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
