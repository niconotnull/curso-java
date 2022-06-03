package com.curso.java.models.patrones.abstracFactory2;

public class FactoryProvider {

    public static AbtractFactory getFactory(String chooseFactory) {
        if ("CARD".equals(chooseFactory)) {
            return new CardFactory();
        } else if ("PaymentMethod".equals(chooseFactory)) {
            return new PaymentMethodFactory();
        }
        return null;
    }
}
