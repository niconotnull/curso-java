package com.curso.java.archivos;

public class CrearArchivoController {

    public static void main(String[] args) {
        String nombreArchivo = "src/resources/stringtoolong.txt";
        ArchivoService service  = new ArchivoService();
        service.crearArchivo(nombreArchivo);
    }
}
