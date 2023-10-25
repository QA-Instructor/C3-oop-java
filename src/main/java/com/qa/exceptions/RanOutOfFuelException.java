package com.qa.exceptions;

public class RanOutOfFuelException extends Exception{
    public RanOutOfFuelException(){
        super("Your object is out of fuel");
    }

    public RanOutOfFuelException(String customMessage){
        super(customMessage);
    }
}
