package com.curso.java.models.interfaces.crud.repository.generics;

public interface OrdenablePaginableCrudRepository<T> extends OrdenableRepository<T>, PaginableRepository<T>, CrudRepository<T> {


}
