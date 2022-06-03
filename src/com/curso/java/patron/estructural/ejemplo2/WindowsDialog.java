package com.curso.java.patron.estructural.ejemplo2;

public class WindowsDialog extends DialogFactoryMethod{
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
