package com.curso.java.models.patrones.abstracFactory2;

public class PaymentMethodFactory implements AbtractFactory<PaymenMethod>{

    @Override
    public PaymenMethod create(String type) {
        if("CREDIT".equals(type)){
            return  new Credit();
        }else if("DEBIT".equals(type)){
            return new Debit();
        }
        return null;
    }
}
