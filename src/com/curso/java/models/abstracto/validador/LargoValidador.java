package com.curso.java.models.abstracto.validador;

import com.curso.java.models.abstracto.validador.mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable {

    protected String mensaje = "El campo %s  debe tener mínimo %d caracteres y máximo %d caracteres";
    private  int min;
    private  int max = Integer.MAX_VALUE;


    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean esValidado(String valor) {
//        this.mensaje = String.format(this.mensaje, this.min, this.max);
        if (valor == null) {
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <= max);
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public String getMesanjeFormateado(String campo) {
        return  String.format(this.mensaje, campo,this.min, this.max);
    }

}
