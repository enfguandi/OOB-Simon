package com.company.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Runde {
    private int rundenNummer;
    private Position position;

    public Runde(int rundenNummer){
        int zufaelligePosition = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        this.position = new Position(zufaelligePosition);
        this.rundenNummer = rundenNummer;
    }

    public int getRundennummer(){
        return this.rundenNummer;
    }

    public Position getPosition(){
        return this.position;
    }

    public int getPositionNumber(){
        return this.position.getPositionNummer();
    }
}
