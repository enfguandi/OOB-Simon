package com.company.Model;


public class Position {


    private int positionNummer;

    public Position(int positionNummer) {
        this.positionNummer = positionNummer;
    }

    public boolean checkPressedPosition(int positionNummer) {
        return this.positionNummer == positionNummer;
    }

    public int getPositionNumber(){
        return this.positionNummer;
    }
}
