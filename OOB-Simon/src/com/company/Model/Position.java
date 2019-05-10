package com.company.Model;


public class Position {

    private boolean lampeAn;
    private boolean tasteGedrueckt;
    private int positionNummer;

    public Position(int positionNummer) {
        this.positionNummer = positionNummer;
        this.tasteGedrueckt = false;
        this.lampeAn = false;
    }

    public void setLampeAn(boolean status) {
        this.lampeAn = status;
    }

    public boolean getLampeAn() {
        return this.lampeAn;
    }

    public void setTasteGedrueckt(boolean status) {
        this.tasteGedrueckt = status;
    }

    public boolean getTasteGedrueckt() {
        return this.tasteGedrueckt;
    }

    /* Nicht nötig!?
    public void setPositionNummer() {
        this.positionNummer = ThreadLocalRandom.current().nextInt(1, 4 + 1);
    }
*/

    public int getPositionNummer() {
        return this.positionNummer;
    }
}
