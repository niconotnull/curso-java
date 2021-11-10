package com.curso.java.models.interfaces;

public class Informe extends Hoja{

    private String autor;
    private String revisor;

    public Informe(String contenido) {
        super(contenido);
    }

    @Override
    public String imprimir() {
        return null;
    }
}
