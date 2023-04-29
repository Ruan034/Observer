package org.example;

import java.util.Timer;
import java.util.TimerTask;

public class Test {
    static int i = 0;

    public static void main(String[] args) {

        Incendio incendio = new Incendio();
        Vizinho vizinho = new Vizinho();

        incendio.addlisternes(vizinho);


        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                i++;
                System.out.println(i);

                if (i == 10) {

                    for (Emergencia emergencia : incendio.listernes) {
                        emergencia.notificar();
                    }

                }
            }
        };

            ;
            Timer timer = new Timer();

        timer.scheduleAtFixedRate(timerTask,1000L,1000L);

        }
    }
