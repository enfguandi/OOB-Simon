package com.company.Model;


import java.util.ArrayList;
import java.util.List;

public class Spiel {
    private int anzahlRunden;
    private List<Runde> vorherigeRunden;
    private Runde aktuelleRunde;
    private List<Position> positionen;
    private int pressedPosition;

    public Spiel(int anzahlRunden){
        this.positionen = new ArrayList<>();
        this.anzahlRunden = anzahlRunden;
        Position position = new Position(1);
        positionen.add(position);
        position = new Position(2);
        positionen.add(position);
        position = new Position(3);
        positionen.add(position);
        position = new Position(4);
        positionen.add(position);
    }

    public List getPreviosPositions(){
        return this.positionen;
    }

    public int getNewPosition(){
        return positionen.get(1).getPositionNummer();
    }

    public void generateNewRound(){

    }

    public void setPressedPosition(int position){
        this.pressedPosition = position;
    }

    public int getPressedPosition(){
        return this.pressedPosition;
    }

    public int getAnzahlRunden(){
        return this.anzahlRunden;
    }

    public boolean hasNextRound(){
        try {
            return aktuelleRunde.getRundennummer() < anzahlRunden;
        }catch (NullPointerException e){
            return true;
        }


    }

    public void startNewRound(){
        try {
            vorherigeRunden.add(aktuelleRunde);
            int runde = aktuelleRunde.getRundennummer();
            aktuelleRunde = new Runde(++runde);
        }catch (NullPointerException e){
            aktuelleRunde = new Runde(1);
        }


    }


}
