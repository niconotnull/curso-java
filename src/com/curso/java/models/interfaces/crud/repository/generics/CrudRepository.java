package com.curso.java.models.interfaces.crud.repository.generics;

import java.util.List;

public interface CrudRepository<T> {

    List<T> listar();

    T porId(Integer id);

    void crear(T cliente);

    void editar(T cliente);

    void eliminar(Integer id);
}
