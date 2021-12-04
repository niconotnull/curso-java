package com.curso.java.patrones;

import com.curso.java.models.patrones.factoryMethod.Payment;
import com.curso.java.models.patrones.factoryMethod.PaymentFactory;
import com.curso.java.models.patrones.factoryMethod.TypePayment;

public class FactoryMethod {

    public static void main(String[] args) {
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();

        payment = PaymentFactory.buildPayment(TypePayment.GOOGLEPAY);
        payment.doPayment();
    }
}
