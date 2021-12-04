package com.curso.java.models.patrones.factoryMethod;

/**
 * La clase Creadora declara el método fábrica que devuelve nuevos objetos de producto. Es importante que el tipo de retorno de este método coincida con la interfaz de producto.
 *
 * Puedes declarar el patrón Factory Method como abstracto para forzar a todas las subclases a implementar sus propias versiones del método. Como alternativa, el método fábrica base puede devolver algún tipo de producto por defecto.
 *
 * Observa que, a pesar de su nombre, la creación de producto no es la principal responsabilidad de la clase creadora. Normalmente, esta clase cuenta con alguna lógica de negocios central relacionada con los productos. El patrón Factory Method ayuda a desacoplar esta lógica de las clases concretas de producto. Aquí tienes una analogía: una gran empresa de desarrollo de software puede contar con un departamento de formación de programadores. Sin embargo, la principal función de la empresa sigue siendo escribir código, no preparar programadores.
 */
public class PaymentFactory {

    public static Payment buildPayment(TypePayment typePayment){
        switch (typePayment){
            case GOOGLEPAY:
                return  new GooglePayment();
            case CARD:
                return  new CardPayment();
            default:
                return new MoneyPayment();
        }
    }
}
