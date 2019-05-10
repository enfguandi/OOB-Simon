package com.company.View;

import com.company.Controller.Controller;
import com.company.Exception.WrongInputException;
import com.company.Model.Position;
import com.company.Model.Spiel;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    private Spiel spiel;
    private Controller controller;
    private Scanner scanner;
    private List previousRounds;


    public View(Spiel spiel, Controller controller) {
        this.controller = controller;
        this.spiel = spiel;
        scanner = new Scanner(System.in);
    }

    public void showPreviosRounds() {
        if (spiel.getRoundNumber() > 0) {
            System.out.print("Previous Rounds:");
            for (int i = 0; i < spiel.getPreviosPositions().size(); i++) {
                Position position = (Position) spiel.getPreviosPositions().get(i);
                System.out.println(position.getPositionNummer());

            }

        }

    }

    public void showNewRound() {
        System.out.print("New Round: ");
        System.out.println(spiel.getNewPosition());
    }

    public String getInput() {
        System.out.print("Please enter lamp number: ");
        return scanner.nextLine();
    }

    public boolean validateInput() {
        getInput();
        int pressedPosition = spiel.getPressedPosition();
        if (pressedPosition >= 1 && pressedPosition <= 4) {
        }
        return true;
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
}
