package com.curso.java;

import static com.curso.java.Brands.BND_DMN;
import static java.lang.String.format;


import java.io.IOException;
import java.util.regex.Pattern;


public class Eliminar2 {
    private static final String CASH_PAYMENT_ID = "1";

    private static final String INTERMEDIARY_PAYMENT_ID = "5";

    private static final String DEFAULT_PHONE_NUMBER = "1111111111";



    public static void main(String[] args) throws IOException  {


        String  itemId = "33333";
        Integer branchMenuId = 122;
        String orderId = "1212";
        String  branchId = "1212";

        String reason =  format(
                "No se encuentra el item %s en la sucursal %s, sursalmenu  %s ",
                itemId, orderId, branchId);

        System.out.println(reason);

    }


    static private String validarTipoMensaje(String a) {
        if (a.contains("{") && a.contains("}")) {
            return messageError(a);
        } else {
            if (a.length() > 140) {
                return a.substring(0, 140) + "...";
            } else {
                return a;
            }
        }
    }



   static private  String messageError(String a) {
        String message = "";
        try {
                String c = a.replace("{", "").replace("}", "").replace("\"", "");
                String[] value = c.split(",");

                for (String s : value) {
                    if (s.contains("message:")) {
                        message = s.replace("message:", "");
                    }
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }



    static String validMarca(final String paymentType, final Integer brandId){
       return paymentType.equals("cash") && brandId.equals(9) ? CASH_PAYMENT_ID : INTERMEDIARY_PAYMENT_ID;
    }

    static boolean valid(String str) {
        String subStr = "Tienda Cerrada";
        String subStr2 = "TieNdA respuesta";
        return str.toLowerCase().contains(subStr.toLowerCase()) || str.contains(subStr2.toLowerCase());
    }


    static int fibonnaciRecursivo(int n){
        if (n == 0 || n == 1) {
            return n;
        }else {
            return  fibonnaciRecursivo(n-1) +fibonnaciRecursivo(n-2);
        }
    }

    static int fibonnaci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
             int x;
             x = a;
             a = b;
             b = x+a;
        }
        return b;
    }


}


