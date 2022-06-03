package com.curso.java.patron.estructural.ejemplo2;

public class HtmlDialog extends DialogFactoryMethod{
    @Override
    Button createButton() {
        return new ButtonHtml();
    }
}
