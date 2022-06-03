package com.curso.java.valoreferencia;

/**
 * Vamos a ver la diferencia entre pasar una variable por valor via un método vs pasar por referencia
 *
 * Pasar un variable por argumento a un método ese método va a modificar el valor de esa variable
 *
 * Pasar un valor por referencia, cuando pasamos un valor por referencia cuando se cambia un valor, algun
 * atributo de ese objeto este también cambia y mantiene ese mismo estado en el método principal, por lo
 * tanto si ese método modifica un objeto de referencia, también se ve afectado  en el método principal
 * por que es de referencia apunto al mismo objeto apunta al mismo espacio en memoria.
 *
 * Mientras cuando es por valor no afecta en alguna otra parte
 *
 */
public class Ejemplo1 {
    public static void main(String[] args) {

        // Toda variable primitiva siempre se pasa por valor por que no es un objeto es un primitivo
        // Cuando se pasa esta variable a otro método por argumento, se pasa por valor, por lo tanto
        // si otro método cambia este valor da lo mismo por que en el método principal se mantien intacto
        // con el valor original
        int i = 10;
        pasarPorValor(i);
        System.out.println("i = " + i);

    }

    public static void pasarPorValor(int n){
        System.out.println("n = " + n+1);
    }
}
