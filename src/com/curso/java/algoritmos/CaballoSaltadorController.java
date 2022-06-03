package com.curso.java.algoritmos;

import com.curso.java.algoritmos.service.CaballoSaltadorService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaballoSaltadorController {

    public static void main(String[] args) throws Exception {
        int x, y;
        boolean solucion;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Posición incial de callo.");
            System.out.print(" x = ");
            x = Integer.parseInt(entrada.readLine());
            System.out.print(" y = ");
            y = Integer.parseInt(entrada.readLine());
            CaballoSaltadorService miCaballo = new CaballoSaltadorService(x,y);
            solucion = miCaballo.resolverProblema();

            if (solucion){
                miCaballo.escribirTablero();
            }

        }catch (Exception m){
            System.out.println(m);
        }

    }
}
