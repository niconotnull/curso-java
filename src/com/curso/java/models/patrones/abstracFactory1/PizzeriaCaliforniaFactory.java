package com.curso.java.models.patrones.abstracFactory1;

import com.curso.java.models.patrones.abstracFactory1.producto.PizzaCaliforniaQueso;
import com.curso.java.models.patrones.abstracFactory1.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstracFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
       PizzaProducto producto= null;
       switch (tipo){
           case "vegetariana":
               producto = new PizzaCaliforniaVegetariana();
               break;
           case "queso":
               producto = new PizzaCaliforniaQueso();
               break;
       }
       return producto;
    }
}
