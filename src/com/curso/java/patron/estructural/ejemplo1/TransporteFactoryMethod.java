package com.curso.java.patron.estructural.ejemplo1;

public abstract class TransporteFactoryMethod {

    public static Transporte buildDelivery(TypeTransporte type){
        switch (type){
            case MARITIMO:
                return new Maritimo();
            case TERRESTRE:
                return  new Terrestre();
            case AEREO:
                return new Aereo();
        }
        return  null;
    }
}
