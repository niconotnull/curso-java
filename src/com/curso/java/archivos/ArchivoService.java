package com.curso.java.archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoService {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))) {
            buffer.append("Hola que tal").append("todo bien");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo1(String nombre){
        File archivo = new File(nombre);
        try(BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))) {
            buffer.append("Hola que tal").append("todo bien");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
