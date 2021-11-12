package com.curso.java.models.abstracto.validador;

public class NoNuloValidador extends  Validador{

    protected   String mensaje = "El campo %s no puede ser nulo";


    @Override
    public boolean esValidado(String valor) {
        return (valor != null);
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
