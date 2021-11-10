package com.curso.java.herencia;

import com.curso.java.models.herencia.Alumno;
import com.curso.java.models.herencia.AlumnoInternacional;
import com.curso.java.models.herencia.Profesor;

public class EjemploHerencia {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Nicolas");
        alumno.setApellido("Jimenez");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaMatematicas(7.5);
        alumno.setNotaHistoria(9.5);

        System.out.println("------------------------------------");

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Peter");
        alumnoInternacional.setApellido("Gosling");
        alumnoInternacional.setPais("Canada");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Harvard");
        alumnoInternacional.setNotaCastellano(7.5);
        alumnoInternacional.setNotaMatematicas(8.5);
        alumnoInternacional.setNotaHistoria(10.0);

        System.out.println("------------------------------------");

        Profesor profesor = new Profesor();
        profesor.setNombre("Hayden");
        profesor.setApellido("Cosme");
        profesor.setAsignatura("Matemáticas");

        System.out.println("------------------------------------");


        Class clase = alumnoInternacional.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre =  clase.getSuperclass().getName();
            System.out.println(hija+" es una clase hija de la clase padre "+padre);
            clase = clase.getSuperclass();
        }

    }
}
