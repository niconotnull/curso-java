package com.curso.java.models.herencia;

public class Profesor extends Persona{

    private String asignatura;

    public Profesor() {
        System.out.println("Profesor inicializando constructor");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        this(nombre, apellido);
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return super.saludar()+ " I am teacher the  "+getAsignatura()+ " My name is "  +getNombre();
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() + "\n asignatura='" + asignatura + '\'';
    }
}
