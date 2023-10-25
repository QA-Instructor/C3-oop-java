package com.qa.exceptions;

public class InvalidStateException extends Exception{

    public InvalidStateException(){
        super("Your object is in an invalid state");
    }

    public InvalidStateException(String customMessage){
        super(customMessage);
    }
}
