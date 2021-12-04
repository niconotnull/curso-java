package com.curso.java.models.patrones.abstracFactory1.producto;

import com.curso.java.models.patrones.abstracFactory1.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {

    public PizzaNewYorkPeperoni() {
        super();
        nombre= "Pizza peperoni New York";
        masa= "Masa delgada a la piedra";
        salsa ="Salsa de tomate";
        addIngrediente("Queso mozarella").addIngrediente("Extra de peperoni")
                .addIngrediente("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. ");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas redondas.");
    }
}
