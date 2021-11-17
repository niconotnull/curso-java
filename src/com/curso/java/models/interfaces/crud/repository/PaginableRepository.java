package com.curso.java.models.interfaces.crud.repository;

import com.curso.java.models.interfaces.crud.model.Cliente;

import java.util.List;

public interface  PaginableRepository {

    List<Cliente> listar(int desde, int hasta);
}
