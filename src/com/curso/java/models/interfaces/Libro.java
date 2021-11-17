package com.curso.java.models.interfaces;

import com.curso.java.util.Genero;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    private List<Imprimible> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();

    }

    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return  this;
    }

    public String imprimir(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.titulo).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(genero).append("\n");
        this.paginas.forEach(p->{
            sb.append(p.imprimir()).append("\n");
        });
        return sb.toString();
    }

    public Libro(List<Imprimible> paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
