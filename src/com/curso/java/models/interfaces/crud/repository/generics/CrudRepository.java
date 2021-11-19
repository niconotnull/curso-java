package com.curso.java.models.interfaces.crud.repository.generics;

import java.util.List;

public interface CrudRepository<T> {

    List<T> listar();

    T porId(Integer id);

    void crear(T t);

    void editar(T t);

    void eliminar(Integer id);
}
