package com.curso.java.models.abstracto;

import com.curso.java.models.abstracto.validador.Validador;
import com.curso.java.models.abstracto.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract  public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadors;
    private List<String> errores;

    public ElementoForm() {
        this.validadors = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElementoForm(String nombre) {
        this(); // llamamos a este constructor ElementoForm()
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadors.add(validador);
        return this;
    }

    public boolean esValidado() {
        for (Validador v : this.validadors) {
            if (!v.esValidado(this.valor)) {
                if (v instanceof MensajeFormateable) {
                    this.errores.add(((MensajeFormateable) v).getMesanjeFormateado(nombre));
                } else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty();
    }

    abstract public String dibujarHtml();

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getErrores() {
        return errores;
    }


}
