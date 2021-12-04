package com.curso.java.models.patrones.abstracFactory1.producto;

import com.curso.java.models.patrones.abstracFactory1.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        super();
        nombre= "Pizza italiana New York";
        masa= "Masa gruesa";
        salsa ="Salsa de tomate italiano";
        addIngrediente("Queso mozarella").addIngrediente("Champinon")
                .addIngrediente("Aceitunas").addIngrediente("Jamon");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. ");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas triangulares");
    }
}
