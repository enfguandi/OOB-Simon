package com.company.Model;


import java.util.ArrayList;
import java.util.List;

public class Game {

    private int numberOfRounds;
    private List<Round> previousRounds;
    private Round currentRound;

    public Game(int numberOfRounds) {
        this.previousRounds = new ArrayList<>();
        this.numberOfRounds = numberOfRounds;
    }

    // Gives a List of the previous positions back
    public List<Round> getPreviousRounds() {
        return this.previousRounds;
    }

    // Gives the current position back
    public Round getCurrentRound() {
        return currentRound;
    }

    // checks if the currend round is smaller than the max number of rounds
    public boolean hasNextRound() {
        try {
            return currentRound.getRoundnumber() < numberOfRounds;
        } catch (NullPointerException e) {
            return true;
        }
    }

    // starts a new round
    public void generateNewRound() {
        if(currentRound == null) {
            currentRound = new Round(1);
        } else {
            int roundNumber = currentRound.getRoundnumber();
            currentRound = new Round(++roundNumber);
        }
        previousRounds.add(currentRound);
    }
}
