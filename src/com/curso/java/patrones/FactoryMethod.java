package com.curso.java.patrones;

import com.curso.java.models.patrones.factoryMethod.Payment;
import com.curso.java.models.patrones.factoryMethod.PaymentFactory;
import com.curso.java.models.patrones.factoryMethod.TypePayment;
import com.curso.java.patron.estructural.ejemplo1.Transporte;
import com.curso.java.patron.estructural.ejemplo1.TransporteFactoryMethod;
import com.curso.java.patron.estructural.ejemplo1.TypeTransporte;
import com.curso.java.patron.estructural.ejemplo2.DialogFactoryMethod;
import com.curso.java.patron.estructural.ejemplo2.HtmlDialog;
import com.curso.java.patron.estructural.ejemplo2.WindowsDialog;

public class FactoryMethod {

    public static void main(String[] args) {

        payment(TypePayment.CARD);
        payment(TypePayment.GOOGLEPAY);
        payment(TypePayment.MONEY);

       transporte(TypeTransporte.MARITIMO);
       transporte(TypeTransporte.TERRESTRE);
       transporte(TypeTransporte.AEREO);

       buttons();
    }

    public static void payment(TypePayment type){
        Payment payment = PaymentFactory.buildPayment(type);
        payment.doPayment();
    }

    public static void transporte(TypeTransporte type){
        Transporte transporte = TransporteFactoryMethod.buildDelivery(type);
        assert transporte != null;
        transporte.entrega();
    }

    public static void buttons(){
        DialogFactoryMethod dialog;
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        }else {
            dialog = new HtmlDialog();
        }
        dialog.renderWindow();
    }

}
