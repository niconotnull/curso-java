package com.curso.java.models.interfaces.crud.repository;

import com.curso.java.models.interfaces.crud.model.Cliente;
import com.curso.java.util.Direccion;

import java.util.List;

public interface OrdenableRepository {

    List<Cliente> listar(String campo, Direccion dir);

}
