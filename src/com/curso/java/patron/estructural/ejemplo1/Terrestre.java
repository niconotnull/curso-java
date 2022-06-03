package com.curso.java.patron.estructural.ejemplo1;

public class Terrestre implements Transporte{
    @Override
    public void entrega() {
        System.out.println("Logistic por tierra");
    }
}
