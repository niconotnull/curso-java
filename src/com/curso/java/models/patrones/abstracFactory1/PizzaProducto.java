package com.curso.java.models.patrones.abstracFactory1;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {


    protected String nombre; //Permite el acceso desde subclases y miembros del mismo paquete
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public PizzaProducto() {
        this.ingredientes = new ArrayList<>();
    }

    public PizzaProducto addIngrediente(String ingrediente){
        this.ingredientes.add(ingrediente);
        return  this;
    }

    public void  preparar(){
        System.out.println("Preparando : "+this.nombre);
        System.out.println("Seleccionado la masa : "+this.masa);
        System.out.println("Agregando la salsa : "+this.salsa);
        this.ingredientes.forEach(System.out::println);
    }

    public void empaquetar(){
        System.out.println("Poniendo la caja en un empaque...");
    }

    abstract public void cocinar();

    abstract public void cortar();

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingrediente=" + ingredientes +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getMasa() {
        return masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }
}
