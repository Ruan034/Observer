package org.example;

public class CorpoDeBombeiro implements Emergencia{

    @Override
    public void notificar() {
        System.out.println("Existe um incendio em andamento");

    }
}
