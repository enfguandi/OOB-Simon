package com.company.Exception;

import com.company.Controller.Controller;
import com.company.Controller.Main;

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
