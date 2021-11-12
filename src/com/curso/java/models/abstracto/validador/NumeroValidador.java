package com.curso.java.models.abstracto.validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "El campo %s debe ser un numero";

    @Override
    public boolean esValidado(String valor) {
        try {
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
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
