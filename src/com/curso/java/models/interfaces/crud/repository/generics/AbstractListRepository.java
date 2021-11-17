package com.curso.java.models.interfaces.crud.repository.generics;

import com.curso.java.models.interfaces.crud.model.GenericEntity;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends GenericEntity> implements OrdenablePaginableCrudRepository<T>{

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();
    }

    protected List<T> dataSource;

    @Override
    public List<T> listar() {
        return dataSource;
    }


    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }


    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }


    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    @Override
    public T porId(Integer id) {
        T cliente = null;
        for(T a : this.dataSource ){
            if(a != null && a.getId().equals(id)){
                cliente = a;
                break;
            }
        }
        return cliente;
    }


}
