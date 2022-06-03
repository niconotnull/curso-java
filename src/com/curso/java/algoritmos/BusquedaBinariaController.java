package com.curso.java.algoritmos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BusquedaBinariaController {


    public static void main(String[] args) throws IOException {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double v = -1;

        do {
            System.out.println("Búsqueda binaria, ingrese un valor para buscarlo...");
            v = Double.parseDouble(entrada.readLine());

            double r = busquedaBinaria(a, v, 0, a.length-1);

            if (r != -1) {
                System.out.println("Resultado: " + r);
            } else {
                System.out.println("No se encontró el valor  intente con otro número");
            }
        } while (v != -1);

    }


    static int busquedaBinaria(double[] a, double clave, int inferior, int superior) {

        if (inferior > superior) {
            return -1;
        } else {
            int central = (inferior + superior) / 2;
            if (a[central] == clave) {
                return central;
            } else if (a[central] < clave) {
                return busquedaBinaria(a, clave, central + 1, superior);
            } else {
                return busquedaBinaria(a, clave, inferior, central - 1);
            }
        }
    }
}
