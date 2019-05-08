package com.company.View;

import com.company.Controller.Controller;
import com.company.Model.Position;
import com.company.Model.Runde;
import com.company.Model.Spiel;
import java.util.List;
import java.util.Scanner;

public class View {

    private Spiel spiel;
    private Controller controller;
    private Scanner scanner;
    private List previousRounds;


    public View(Spiel spiel, Controller controller){
        this.controller = controller;
        this.spiel = spiel;
        scanner = new Scanner(System.in);
    }

    public void showPreviosRounds(){
        if (spiel.getPreviosPositions() != null){
            System.out.print("Previous Rounds:");
            for (int i = 0; i < spiel.getPreviosPositions().size(); i++) {
                Position position = (Position)  spiel.getPreviosPositions().get(i);
                System.out.println(position.getPositionNummer());

            }

        }

    }

    public void showNewRound(){
        System.out.print("New Round: " );
        System.out.println(spiel.getNewPosition());
    }

    public void waitForPressedPosition(){
        System.out.print("Please enter lamp number: ");
        String inputString = scanner.nextLine();

        spiel.setPressedPosition(Integer.parseInt(inputString));
    }

    public boolean validateInput(){
        waitForPressedPosition();
        int pressedPosition = spiel.getPressedPosition();
        if(pressedPosition>=1 && pressedPosition<=4){


        }


        return true;
    }
}
