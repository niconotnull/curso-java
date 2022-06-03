package com.curso.java.patrones;

import com.curso.java.models.patrones.abstracFactory1.PizzaProducto;
import com.curso.java.models.patrones.abstracFactory1.PizzeriaCaliforniaFactory;
import com.curso.java.models.patrones.abstracFactory1.PizzeriaNewYorkFactory;
import com.curso.java.models.patrones.abstracFactory1.PizzeriaZonaAbstracFactory;
import com.curso.java.models.patrones.abstracFactory2.AbtractFactory;
import com.curso.java.models.patrones.abstracFactory2.Card;
import com.curso.java.models.patrones.abstracFactory2.FactoryProvider;
import com.curso.java.models.patrones.abstracFactory2.PaymenMethod;
import com.curso.java.models.patrones.factoryMethod.Payment;
import com.curso.java.models.patrones.factoryMethod.PaymentFactory;

public class AbstracFactory {

    /**
     * Es un patrón creacional para crear familias de objetos familias que estan realacionadas
     * mediante la herencia  o implementacion de interfaces, nos permite crear objetos que tienen un parentesco
     *
     */

    public static void main(String[] args) {
        PizzeriaZonaAbstracFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstracFactory california = new PizzeriaCaliforniaFactory();

//        PizzaProducto pizza = california.ordenarPizza("queso");
//        System.out.println("Nicolas ordena la pizza: "+pizza.getNombre());
//
//
//        pizza = ny.ordenarPizza("vegetariana");
//        System.out.println("Hayden ordena la pizza: "+pizza.getNombre());

        probarAbstractFactory2();



    }

    private static void probarAbstractFactory2(){
        AbtractFactory abtractFactory1 = FactoryProvider.getFactory("CARD");
        Card tarjeta = (Card) abtractFactory1.create("VISA");

        AbtractFactory abtractFactory2 = FactoryProvider.getFactory("PaymentMethod");
        PaymenMethod paymenMethod = (PaymenMethod) abtractFactory2.create("CREDIT");

        System.out.println("Una tarjeta de tipo : "+tarjeta.getCardType()+ " con el método de pago : "+ paymenMethod.doPayment());
    }
}
