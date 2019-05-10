package com.company.Model;


import java.util.ArrayList;
import java.util.List;

public class Spiel {

    private int numberOfRounds;
    private List<Runde> previousRounds;
    private Runde currentRound;
    private List<Position> positions;
    private int pressedPosition;

    public Spiel(int numberOfRounds) {
        this.positions = new ArrayList<>();
        this.previousRounds = new ArrayList<>();
        this.numberOfRounds = numberOfRounds;
        Position position = new Position(1);
        positions.add(position);
        position = new Position(2);
        positions.add(position);
        position = new Position(3);
        positions.add(position);
        position = new Position(4);
        positions.add(position);
    }

    public List getPreviosPositions() {
        return this.previousRounds;
    }

    public int getCurrentPosition() {
        return currentRound.getPositionNumber();
    }

    public void generateNewRound() {

    }

    public void setPressedPosition(int position) {
        this.pressedPosition  = position;

    }

    public boolean checkPressedPosition(){
        // ToDo: tut nicht!!!!!!!!!!!!!!!!!!!!!!!!!!!

        int rn = currentRound.getRundennummer();
        previousRounds.add(currentRound);
        rn--;
        int pnr = previousRounds.get(rn).getPosition().getPositionNummer();

        if (pnr == pressedPosition){
            return true;
        }else {
            return false;
        }
    }

    public int getPressedPosition() {
        return this.pressedPosition;
    }

    public int getNumberOfRounds() {
        return this.numberOfRounds;
    }

    public boolean hasNextRound() {
        try {
            return currentRound.getRundennummer() < numberOfRounds;
        } catch (NullPointerException e) {
            return true;
        }
    }

    public void startNewRound() {
        try {
            int roundNumber = currentRound.getRundennummer();
            currentRound = new Runde(++roundNumber);
        } catch (NullPointerException e) {
            currentRound = new Runde(1);

        }
    }


    public List getListOfRounds(){
        return previousRounds;
    }

    public int getRoundNumber(){
        try {
            return currentRound.getRundennummer();
        }catch (NullPointerException e){
            return 0;
        }

    }


}
