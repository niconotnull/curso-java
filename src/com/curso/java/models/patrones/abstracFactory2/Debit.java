package com.curso.java.models.patrones.abstracFactory2;

public class Debit implements PaymenMethod{
    @Override
    public String doPayment() {
        return "Pago a debito";
    }
}
