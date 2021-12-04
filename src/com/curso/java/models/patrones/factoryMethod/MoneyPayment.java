package com.curso.java.models.patrones.factoryMethod;

public class MoneyPayment implements Payment{
    @Override
    public void doPayment() {
        System.out.println("Pagando con efectivo.");

    }
}
