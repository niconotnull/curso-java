package com.curso.java.patrones;

import com.curso.java.models.patrones.abstracFactory1.PizzaProducto;
import com.curso.java.models.patrones.abstracFactory1.PizzeriaCaliforniaFactory;
import com.curso.java.models.patrones.abstracFactory1.PizzeriaNewYorkFactory;
import com.curso.java.models.patrones.abstracFactory1.PizzeriaZonaAbstracFactory;

public class AbstracFactory {

    /**
     * Es un patrón creacional para crear familias de objetos familias que estan realacionadas
     * mediante la herencia  o implementacion de interfaces, nos permite crear objetos que tienen un parentesco
     *
     */

    public static void main(String[] args) {
        PizzeriaZonaAbstracFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstracFactory california = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza = california.ordenarPizza("queso");
        System.out.println("Nicolas ordena la pizza: "+pizza.getNombre());


        pizza = ny.ordenarPizza("vegetariana");
        System.out.println("Hayden ordena la pizza: "+pizza.getNombre());

    }
}
