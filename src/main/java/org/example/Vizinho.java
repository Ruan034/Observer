package org.example;

public class Vizinho implements Emergencia{
    @Override
    public void notificar() {

        System.out.println("ei, vizinho tem um incendio em minha casa");

    }
}
