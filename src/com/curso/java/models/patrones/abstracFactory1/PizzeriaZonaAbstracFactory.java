package com.curso.java.models.patrones.abstracFactory1;

abstract  public class PizzeriaZonaAbstracFactory {

    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto pizza = crearPizza(tipo);
        System.out.println("--Fabricando la pizza: "+pizza.getNombre());
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;

    }

    abstract PizzaProducto crearPizza(String tipo);
}
