package com.curso.java.models.interfaces.crud.model;

import java.util.Objects;

public class GenericEntity {

    protected Integer id;
    private static int ultimoId;

    public GenericEntity() {
        this.id = ++ultimoId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericEntity base = (GenericEntity) o;
        return Objects.equals(id, base.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
