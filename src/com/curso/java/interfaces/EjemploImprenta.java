package com.curso.java.interfaces;

import com.curso.java.models.interfaces.*;
import com.curso.java.util.Genero;
import static com.curso.java.models.interfaces.Imprimible.imprimir;
import static com.curso.java.models.interfaces.Imprimible.TEXT;

public class EjemploImprenta {

    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Nicolas", "Ingeniero en Computación", "Resumen laboral");
        cv.addExperiencia("Java").addExperiencia("SQL").addExperiencia("Node").addExperiencia("React");


        Libro libro = new Libro("Erich Gamma", "Patrones de Diseño: Elementos Reusable POO", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron singleton"))
                .addPagina(new Pagina("Patron observador"))
                .addPagina(new Pagina("Patron factory"))
                .addPagina(new Pagina("Patron facade"));

        Informe informe = new Informe("Estudio de microservicios", "Elon Musk","Nicola tesla");
        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
        System.out.println(TEXT);

    }

}
