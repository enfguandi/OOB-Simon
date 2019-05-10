package com.company.Model;


import java.util.ArrayList;
import java.util.List;

public class Spiel {

    private int numberOfRounds;
    private List<Runde> previousRounds;
    private Runde currentRound;
    //    private List<Position> positions;
    private int pressedPosition;

    public Spiel(int numberOfRounds) {
//        this.positions = new ArrayList<>();
        this.previousRounds = new ArrayList<>();
        this.numberOfRounds = numberOfRounds;
/*        Position position = new Position(1);
        positions.add(position);
        position = new Position(2);
        positions.add(position);
        position = new Position(3);
        positions.add(position);
        position = new Position(4);
        positions.add(position);
        */
    }

    // Gives a List of the previous positions back
    public List getPreviosPositions() {
        return this.previousRounds;
    }

    // Gives the current position back
    public int getCurrentPosition() {
        return currentRound.getPositionNumber();
    }

    // Sets the position pressed by the user
    public void setPressedPosition(int position) {
        this.pressedPosition = position;

    }

    // Validates the previous and the new positions pressed by the user with a list
    public boolean checkPressedPosition(int round) {
        int r = --round;
        int pnr = previousRounds.get(r).getPosition().getPositionNummer();
        if (pnr != pressedPosition) {
            return false;
        }
        return true;
    }

    // Returns the position pressed by the user
    public int getPressedPosition() {
        return this.pressedPosition;
    }

    // returns the max number of rounds
    public int getNumberOfRounds() {
        return this.numberOfRounds;
    }

    // checks if the currend round is smaller than the max number of rounds
    public boolean hasNextRound() {
        try {
            return currentRound.getRundennummer() < numberOfRounds;
        } catch (NullPointerException e) {
            return true;
        }
    }

    // starts a new round
    public void generateNewRound() {
        try {
            int roundNumber = currentRound.getRundennummer();
            currentRound = new Runde(++roundNumber);
        } catch (NullPointerException e) {
            currentRound = new Runde(1);
        } finally {
            previousRounds.add(currentRound);
        }
    }

    // returns the currend round number
    public int getRoundNumber() {
        try {
            return currentRound.getRundennummer();
        } catch (NullPointerException e) {
            return 0;
        }
    }
}
