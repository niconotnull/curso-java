package com.curso.java.models.herencia;

public class Alumno extends Persona{

    private String institucion;
    private double notaMatematicas;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno() {
        System.out.println("Alumno inicializando constructor");
    }

    public Alumno(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public String getInstitucion() {
        return institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion, double notaMatematicas, double notaCastellano, double notaHistoria) {
        this(nombre, apellido, edad,institucion);
        this.notaMatematicas = notaMatematicas;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar(){
        return super.saludar()+ "I am student and My name is "+getNombre();
    }

    public double calcularPromedio(){
        return (notaHistoria + notaCastellano + notaMatematicas)/3;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String toString() {
        return super.toString() + "\n institucion='" + institucion + '\'' +
                ", notaMatematicas=" + notaMatematicas +
                ", notaCastellano=" + notaCastellano +
                ", notaHistoria=" + notaHistoria +
                ", promedio= "+ this.calcularPromedio();
    }
}
