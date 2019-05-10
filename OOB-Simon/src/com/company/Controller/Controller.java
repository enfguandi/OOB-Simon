package com.company.Controller;

import com.company.Exception.WrongInputException;
import com.company.Model.Spiel;
import com.company.View.View;

public class Controller {

    private Spiel spiel;
    private View view;


    public Controller() {
        this.spiel = new Spiel(10);
        this.view = new View(spiel, this);

    }

    public void startGame() {

        int pressedPosition = 0;

        while (spiel.hasNextRound()) {
//            view.showPreviosRounds();
            spiel.generateNewRound();
            view.showNewRound();

            for (int i = 1; i <= spiel.getRoundNumber(); i++) {
                try {
                    pressedPosition = view.getPressedPosition();
                } catch (WrongInputException e) {
                    System.out.println("Wrong input Exception...");
                    startGame();
                }
                spiel.setPressedPosition(pressedPosition);
                if (!spiel.checkPressedPosition(i)){
                    break;
                }
            }
        }
    }
}
