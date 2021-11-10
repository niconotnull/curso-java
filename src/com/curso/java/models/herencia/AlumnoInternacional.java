package com.curso.java.models.herencia;

public class AlumnoInternacional extends Alumno{

    private String pais;
    private double notaIdioma;

    public AlumnoInternacional() {
        System.out.println("AlumnoInternacional inicializando constructor");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    @Override
    public String saludar() {
        return super.saludar()+ " my country is "+getPais();
    }

    @Override
    public double calcularPromedio() {
        return(( super.calcularPromedio() *3 ) + notaIdioma )/4;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdioma() {
        return notaIdioma;
    }

    public void setNotaIdioma(double notaIdioma) {
        this.notaIdioma = notaIdioma;
    }

    @Override
    public String toString() {
        return super.toString() + "\n pais='" + pais + '\'' +
                ", notaIdioma=" + notaIdioma;
    }
}
