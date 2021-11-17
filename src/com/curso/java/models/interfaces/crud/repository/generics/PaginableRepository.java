package com.curso.java.models.interfaces.crud.repository.generics;

import java.util.List;

public interface  PaginableRepository<T> {

    List<T> listar(int desde, int hasta);
}
