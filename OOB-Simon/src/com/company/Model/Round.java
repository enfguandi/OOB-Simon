package com.company.Model;

import java.util.concurrent.ThreadLocalRandom;

public class Round {
    private int roundNumber;
    private Position position;

    public Round(int roundNumber){
        int randomPosition = ThreadLocalRandom.current().nextInt(1, 4 + 1);
        this.position = new Position(randomPosition);
        this.roundNumber = roundNumber;
    }

    public int getRoundnumber(){
        return this.roundNumber;
    }

    public boolean checkPressedPosition(int positionsNummer) {
        return this.position.checkPressedPosition(positionsNummer);
    }

    public Position getPosition(){
        return this.position;
    }
}
