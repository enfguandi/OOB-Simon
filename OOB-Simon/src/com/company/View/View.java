package com.company.View;

import com.company.Exception.WrongInputException;
import com.company.Model.Round;
import com.company.Model.Game;
import java.util.Scanner;

public class View {

    private Game game;
    private Scanner scanner;


    public View(Game game) {
        this.game = game;
        scanner = new Scanner(System.in);
    }

    public void showPreviosRounds() {
        System.out.print("Previous Rounds:");
        for (Round previousRounds : game.getPreviousRounds()) {
            System.out.print(previousRounds.getPosition().getPositionNumber() + ", ");
        }
        System.out.println();
    }

    public void showNewRound() {
        System.out.print("New Round: ");
        System.out.println(game.getCurrentRound().getPosition().getPositionNumber());
    }

    public String getInput() {
        System.out.print("Please enter lamp number: ");
        return scanner.nextLine();
    }

    public int getPressedPosition() throws WrongInputException {
        int pressedPosition;

        try {
            pressedPosition = Integer.parseInt(getInput());

        } catch (Exception e) {
            throw new WrongInputException(e);
        }
        if (pressedPosition >= 1 && pressedPosition <= 4) {
            return pressedPosition;
        } else {
            throw new WrongInputException();
        }
    }

    public void restartGameMessage() {
        System.out.println("Wrong number! Restart...");
        System.out.println();
    }
}
