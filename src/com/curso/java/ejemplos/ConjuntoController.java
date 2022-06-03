package com.curso.java.ejemplos;

import com.curso.java.ejemplos.service.ConjuntoService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConjuntoController {

    public static void main(String[] args) throws IOException {

        int value = -1;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        ConjuntoService conjuntoService = new ConjuntoService();

        System.out.println("Sistema de conjuntos");

        do {
            System.out.println("1- Agregar un nuevo elemento...");
            System.out.println("2- Visualizar conjunto...");
            System.out.println("0- Salir del sistema...");
            value = Integer.parseInt(entrada.readLine());

            if (value != 0) {
                switch (value) {
                    case 1:
                        System.out.println("Agregar un  nuevo elemento...");
                        value = Integer.parseInt(entrada.readLine());
                        conjuntoService.agregarElemento(value);
                        break;
                    case 2:
                        conjuntoService.visualizar();
                }
            }

        } while (value != 0);



    }
}
