package com.curso.java.models.patrones.abstracFactory2;

/**
 * Los Productos Concretos son implementaciones de productos abstractos agrupados por variantes.
 * Cada producto abstracto  debe implementarse en todas las variantes dadas.
 */
public class CardFactory implements AbtractFactory<Card>{
    @Override
    public Card create(String type) {
        if("VISA".equals(type)){
            return  new Visa();
        }else if("MASTERCARD".equals(type)){
            return  new MasterCard();
        }
        return null;
    }
}
