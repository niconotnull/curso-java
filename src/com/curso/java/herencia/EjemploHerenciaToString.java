package com.curso.java.herencia;

import com.curso.java.models.herencia.Alumno;
import com.curso.java.models.herencia.AlumnoInternacional;
import com.curso.java.models.herencia.Persona;
import com.curso.java.models.herencia.Profesor;

public class EjemploHerenciaToString {

    public static void main(String[] args) {

        Alumno alumno = new Alumno("Nicolas", "Jimenez", 34, "UAEM");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaMatematicas(7.5);
        alumno.setNotaHistoria(9.5);
        alumno.setEmail("pruba@gamil.com");

        AlumnoInternacional alumnoInternacional = new AlumnoInternacional("Peter", "Gosling", "Canada");
        alumnoInternacional.setEdad(15);
        alumnoInternacional.setInstitucion("Harvard");
        alumnoInternacional.setNotaCastellano(9.5);
        alumnoInternacional.setNotaMatematicas(8.5);
        alumnoInternacional.setNotaHistoria(10.0);
        alumnoInternacional.setNotaIdioma(8.4);
        alumnoInternacional.setEmail("pruba@gamil.com");

        Profesor profesor = new Profesor("Hayden", "Cosme", "Matemáticas");
        profesor.setEdad(45);

        imprimir(alumnoInternacional);
        imprimir(profesor);
        imprimir(alumno);
    }

    public static void imprimir(Persona persona) {
        System.out.println(persona.toString());

    }
}
