package com.curso.java.herencia;

import com.curso.java.models.herencia.Alumno;
import com.curso.java.models.herencia.AlumnoInternacional;
import com.curso.java.models.herencia.Persona;
import com.curso.java.models.herencia.Profesor;

public class EjemploHerenciaConstructores {

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
        System.out.println("-------Imprimiendo los datos en común de Persona-----------");
        System.out.println("Nombre: " + persona.getNombre()
                + ", Apellido: " + persona.getApellido()
                + ", Edad: " + persona.getEdad()
                + ", Email: " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("-------Imprimiendo los datos del Alumno-----------");
            System.out.println("Institucion: " + ((Alumno) persona).getInstitucion());
            System.out.println("Nota matematicas: " + ((Alumno) persona).getNotaMatematicas());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());


            if (persona instanceof AlumnoInternacional) {
                System.out.println("-------Imprimiendo los datos del AlumnoInternacional-----------");
                System.out.println("Nota Castellano: " + ((AlumnoInternacional) persona).getNotaIdioma());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("--Calcular Promedio--");
            System.out.println("Promedio : "+((Alumno) persona).calcularPromedio());

        }

        if(persona instanceof  Profesor){
            System.out.println("-------Imprimiendo los datos del Profesor-----------");
            System.out.println("Asignatura: "+((Profesor) persona).getAsignatura());
        }

        System.out.println("===Saludar sobreesctitura===");
        System.out.println(persona.saludar() );
        System.out.println("=================================================");

    }
}
