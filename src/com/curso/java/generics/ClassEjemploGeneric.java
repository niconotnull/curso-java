package com.curso.java.generics;

import com.curso.java.models.generics.Animal;
import com.curso.java.models.generics.Automovil;
import com.curso.java.models.generics.Camion;
import com.curso.java.models.generics.Maquinaria;

public class ClassEjemploGeneric {

    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Spirit", "Caballo"));
        transporteCaballos.add(new Animal("Grillo", "Caballo"));
        transporteCaballos.add(new Animal("Topo", "Caballo"));
        transporteCaballos.add(new Animal("Tomas", "Caballo"));
        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transporteMaquinaria = new Camion<>(5);
        transporteMaquinaria.add(new Maquinaria("Buldozer"));
        transporteMaquinaria.add(new Maquinaria("Perforadora"));
        transporteMaquinaria.add(new Maquinaria("Transcabo"));
        imprimirCamion(transporteMaquinaria);

        Camion<Automovil> automoviles = new Camion<>(3);
        automoviles.add(new Automovil("Ford"));
        automoviles.add(new Automovil("GMC"));
        automoviles.add(new Automovil("KYA"));
        imprimirCamion(automoviles);

    }


    public static <T> void imprimirCamion(Camion<T> camion){
        for(T a: camion){
            if(a instanceof  Animal){
                System.out.println(((Animal)a).getNombre()+ " tipo :"+((Animal)a).getTipo());
            }else  if(a instanceof  Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }else if(a instanceof  Automovil){
                System.out.println(((Automovil)a).getMarca());
            }
        }
    }
}
