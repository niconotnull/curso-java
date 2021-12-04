package com.curso.java.models.patrones.abstracFactory1.producto;

import com.curso.java.models.patrones.abstracFactory1.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre= "Pizza vegetariana New York";
        masa= "Masa integral vegana";
        salsa ="Salsa de tomate";
        addIngrediente("Queso Vegano").addIngrediente("Toamte")
                .addIngrediente("Aceitunas").addIngrediente("Espinacas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. ");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}
