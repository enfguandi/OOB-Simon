package com.company.Exception;

import com.company.Controller.Main;
import com.company.View.View;

public class WrongInputException extends Exception{
    String[] strings = new String[0];

    public WrongInputException(){
        System.out.println("Wrong Input Exception!!!");
        Main.main(strings);
    }

    public WrongInputException(Exception e){
        System.out.println("Wrong Input Exception: " + e);
    }

}
