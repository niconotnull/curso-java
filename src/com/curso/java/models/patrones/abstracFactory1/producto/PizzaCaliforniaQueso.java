package com.curso.java.models.patrones.abstracFactory1.producto;

import com.curso.java.models.patrones.abstracFactory1.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre= "Pizza de Queso California";
        masa= "Masa gruesa";
        salsa ="Salsa de tomate";
        addIngrediente("Queso").addIngrediente("Queso oaxaca")
                .addIngrediente("Queso parmesano").addIngrediente("Queso Mozarella");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. ");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas triangulares.");
    }
}
