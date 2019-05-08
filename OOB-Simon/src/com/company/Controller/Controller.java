package com.company.Controller;

import com.company.Exception.Exceptions;
import com.company.Model.Spiel;
import com.company.View.View;

public class Controller {

    private Spiel spiel;
    private View view;
    private Exceptions e;

    public Controller() {
        this.spiel = new Spiel(10);
        this.view = new View(spiel, this);
        this.e = new Exceptions();
    }

    public void startGame() {
        while (spiel.hasNextRound()) {
            view.showPreviosRounds();
            spiel.startNewRound();
            view.showNewRound();
            if (!view.validateInput()) {
                e.gameOverException();
            }
        }
    }


}
