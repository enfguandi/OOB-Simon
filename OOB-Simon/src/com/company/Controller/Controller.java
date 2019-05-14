package com.company.Controller;

import com.company.Exception.WrongInputException;
import com.company.Model.Round;
import com.company.Model.Game;
import com.company.View.View;

public class Controller {

    private Game game;
    private View view;


    public Controller() {
        this.game = new Game(10);
        this.view = new View(game);
    }

    public void startGame() {

        int pressedPosition;
        try {
            while (game.hasNextRound()) {
                view.showPreviosRounds();
                game.generateNewRound();
                view.showNewRound();

                for (Round round : game.getPreviousRounds()) {
                    pressedPosition = view.getPressedPosition();
                    if (!round.checkPressedPosition(pressedPosition)) {
                        view.restartGameMessage();
                        Controller x = new Controller();
                        x.startGame();
                    }
                }
            }
        } catch (WrongInputException e) {
            System.out.println("Wrong input Exception... Restart!");
            System.out.println();
            Controller x = new Controller();
            x.startGame();
        }
    }
}
