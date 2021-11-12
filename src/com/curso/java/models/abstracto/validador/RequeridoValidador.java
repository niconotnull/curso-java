package com.curso.java.models.abstracto.validador;

public class RequeridoValidador extends Validador{

    protected String mensaje = "El campo %s es requerido";

    @Override
    public boolean esValidado(String valor) {
        return (valor != null && valor.length() > 0 );
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
