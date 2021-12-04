package com.curso.java.models.patrones.abstracFactory1.producto;

import com.curso.java.models.patrones.abstracFactory1.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza california Vegetariana";
        masa = "Masa delgada ligth";
        salsa = "Salsa BBQ Light";
        addIngrediente("Queso mozarella").addIngrediente("Champinon")
                .addIngrediente("Aceitunas").addIngrediente("Verengena");

    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min. ");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas redondas.");
    }
}
