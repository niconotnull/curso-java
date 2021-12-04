package com.curso.java.models.patrones.factoryMethod;

/**
 * Los Métodos de pago concretos  son distintas implementaciones de la interfaz de Payment.
 */

public class GooglePayment implements Payment{

    @Override
    public void doPayment() {
        System.out.println("Pagando con google payment");
    }
}
