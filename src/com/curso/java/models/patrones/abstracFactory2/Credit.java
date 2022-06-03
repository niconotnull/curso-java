package com.curso.java.models.patrones.abstracFactory2;

public class Credit implements PaymenMethod{

    @Override
    public String doPayment() {
        return "Pago a crédito";
    }
}
