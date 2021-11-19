package com.curso.java.excepciones;

public class DivisionPorZeroException extends  Exception{

    public DivisionPorZeroException(String mensaje) {
        super(mensaje);
    }
}
