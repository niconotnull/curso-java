package com.curso.java.models.patrones.abstracFactory2;

public class Visa implements Card {

    @Override
    public String getCardType() {
        return "VISA";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 0000 VISA";
    }
}
