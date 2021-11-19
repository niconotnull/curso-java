package com.curso.java.excepciones;

import javax.swing.*;

public class EjemploExcepciones {

    public static void main(String[] args) {

        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador");

        Calculadora calculadora = new Calculadora();
        int divisor;
        double division;

        try {
//            division =calculadora.dividir(numerador,denominador);
//            System.out.println("Resultado : "+division);

            double division2 =  calculadora.dividir(numerador,denominador);
            System.out.println("Resultado : "+division2);

        }catch ( DivisionPorZeroException | FormatoNumeroException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        } finally {
            System.out.println("Se ejecuta si ocurre o no la excepción");
        }
    }
}
