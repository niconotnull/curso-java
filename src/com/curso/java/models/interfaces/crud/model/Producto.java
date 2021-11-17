package com.curso.java.models.interfaces.crud.model;

public class Producto extends GenericEntity {

    private String description;
    private Double precio;

    public Producto(String description, double precio) {
        super();
        this.description = description;
        this.precio = precio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "description='" + description + '\'' +
                ", precio=" + precio +
                '}';
    }
}
