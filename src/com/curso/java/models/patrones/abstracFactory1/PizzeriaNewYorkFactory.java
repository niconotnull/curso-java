package com.curso.java.models.patrones.abstracFactory1;

import com.curso.java.models.patrones.abstracFactory1.producto.PizzaNewYorkItaliana;
import com.curso.java.models.patrones.abstracFactory1.producto.PizzaNewYorkPeperoni;
import com.curso.java.models.patrones.abstracFactory1.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstracFactory {

    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo) {
            case "vegetariana":
                producto = new PizzaNewYorkVegetariana();
                break;
            case "peperoni":
                producto = new PizzaNewYorkPeperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;

        }
        return producto;
    }
}
