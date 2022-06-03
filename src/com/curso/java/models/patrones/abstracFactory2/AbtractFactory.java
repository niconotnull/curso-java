package com.curso.java.models.patrones.abstracFactory2;

/**
 * El abstract Factory es la interfaz para la creación de objetos de productos Abstractos
 * Los Productos Abstractos declaran interfaces para un grupo de productos diferentes pero
 * relacionados que forman una familia de productos.
 */
public interface AbtractFactory<T>  {

    T create(String type);
}
