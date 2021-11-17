package com.curso.java.models.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements  Imprimible{

    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String persona, String carrera, String contenido) {
        super(contenido);
        this.carrera = carrera;
        this.persona= persona;
        this.experiencias = new ArrayList<>();
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesión : ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        this.experiencias.forEach(e-> {
            sb.append("- ").append(e).append("\n");
        });

        return sb.toString();
    }

    public Curriculum addExperiencia(String experiencia){
        this.experiencias.add(experiencia);
        return this;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<String> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(List<String> experiencias) {
        this.experiencias = experiencias;
    }
}
