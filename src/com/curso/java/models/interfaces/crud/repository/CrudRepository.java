package com.curso.java.models.interfaces.crud.repository;

import com.curso.java.models.interfaces.crud.model.Cliente;

import java.util.List;

public interface CrudRepository {

    List<Cliente> listar();

    Cliente porId(Integer id);

    void crear(Cliente cliente);

    void editar(Cliente cliente);

    void eliminar(Integer id);
}
