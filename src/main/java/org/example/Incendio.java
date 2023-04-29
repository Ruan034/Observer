package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Incendio {
    public final List<Emergencia> listernes = new ArrayList<>();

    public void  addlisternes(Emergencia toadd){
        listernes.add(toadd);
    }

    public Incendio() {
        this.addlisternes(new CorpoDeBombeiro());
        this.addlisternes(new DonoDaCasa());
    }
}
