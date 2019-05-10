package com.company.View;

import com.company.Controller.Controller;
import com.company.Exception.WrongInputException;
import com.company.Model.Position;
import com.company.Model.Runde;
import com.company.Model.Spiel;
import java.util.Scanner;

public class View {

    private Spiel spiel;
    // Muss View den Controller kennen? Übergabe erfolgt über get Methoden.
    private Controller controller;
    private Scanner scanner;


    public View(Spiel spiel, Controller controller) {
        this.controller = controller;
        this.spiel = spiel;
        scanner = new Scanner(System.in);
    }

    public void showPreviosRounds() {
        //ToDo: Es werden die Positionen angezeigt und nicht die abgespeicherten Zufallszahlen...
        if (spiel.getRoundNumber() > 0) {
            System.out.print("Previous Rounds:");
            for (int i = 0; i < spiel.getPreviosPositions().size(); i++) {
                Runde position = (Runde) spiel.getPreviosPositions().get(i);
                System.out.println(position.getPosition());
            }
        }
    }

    public void showNewRound() {
        System.out.print("New Round: ");

        System.out.println(spiel.getCurrentPosition());
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
}
