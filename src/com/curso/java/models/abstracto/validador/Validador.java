package com.curso.java.models.abstracto.validador;

abstract  public class Validador {

    private String mensaje;

    abstract  public boolean esValidado(String  valor);

    abstract public String getMensaje();

   abstract public void setMensaje(String mensaje);
}
