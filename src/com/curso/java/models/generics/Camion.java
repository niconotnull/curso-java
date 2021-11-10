package com.curso.java.models.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements  Iterable<T>{

    private List<T> objetos;
    private int max;


    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public List getObjetos() {
        return objetos;
    }

    public void setObjetos(List<T> objetos) {
        this.objetos = objetos;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void add(T objeto){
        if(this.objetos.size() <= max){
            this.objetos.add(objeto);
        }else{
            throw new RuntimeException("No hay más espacio.");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
