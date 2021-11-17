package com.curso.java.models.interfaces.crud.repository.generics;

import com.curso.java.util.Direccion;

import java.util.List;

public interface OrdenableRepository<T> {

    List<T> listar(String campo, Direccion dir);

}
