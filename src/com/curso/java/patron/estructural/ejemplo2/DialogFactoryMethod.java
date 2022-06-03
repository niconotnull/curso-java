package com.curso.java.patron.estructural.ejemplo2;

public abstract class DialogFactoryMethod {

    public void renderWindow(){
        Button okButton = createButton();
        okButton.render();
    }

    abstract Button createButton();

}
