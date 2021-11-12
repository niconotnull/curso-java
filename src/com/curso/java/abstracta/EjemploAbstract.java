package com.curso.java.abstracta;

import com.curso.java.models.abstracto.*;
import com.curso.java.models.abstracto.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploAbstract {

    public static void main(String[] args) {

        // No es posible crear una instancia de una clase abstracta solo a través de una clase anónima para
        // poder utilizar el objeto elementoForm
        //ElementoForm elementoForm = new ElementoForm();

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name=\""+this.nombre+"\"  value=\""+this.valor+"\" >";
            }
        };
        saludar.setValor("Este campo esta deshabilitado");

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());



        TextAreaForm experiencia = new TextAreaForm("exp",5, 9);
        experiencia.addValidador(new RequeridoValidador());

        SelectForm lenguaje = new SelectForm("");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOption(java)
        .addOption(new Opcion("2", "C#"))
        .addOption(new Opcion("3", "JavaScript"))
        .addOption(new Opcion("4", "Flutter"));

        username.setValor("Nicolas");
        password.setValor("12");
        email.setValor("nicolas@gmail.com");
        edad.setValor("sdsd");
        experiencia.setValor("Hola mundo");
        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,password,email,edad,experiencia,lenguaje,saludar);

        elementos.forEach(e -> System.out.println(e.dibujarHtml()));

        elementos.forEach(e -> {
            if (!e.esValidado()) {
                e.getErrores().forEach(System.out::println);
            }
        });
    }
}
