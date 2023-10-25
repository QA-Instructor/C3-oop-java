package com.qa;

import com.qa.exceptions.InvalidStateException;
import com.qa.exceptions.RanOutOfFuelException;

public abstract class Vehicle {

    public Vehicle(){
        this("Unknown", "Unknown",COLOUR.White);
    }

    public Vehicle(String make, String model, COLOUR colour){
        this.make= make;
        this.model = model;
        this.colour = colour;
    }

//    ########################################

    private boolean isStarted = false;

//    #######################################

    public int getGallonsOfFuel() {
        return gallonsOfFuel;
    }

    public void setGallonsOfFuel(int gallonsOfFuel) {
        this.gallonsOfFuel = gallonsOfFuel;
    }

    private int gallonsOfFuel;
//    #####################################
    private String make;
    private String model;

    private COLOUR colour;

    private int age;

    private String regNumber;

    private int speed;


    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if (age >= 0 && age <=70) {
            this.age = age;
        }
//        needs validation in setter

    }

    //    getters and setters
//    special methods to safely allow reading (GETTER) and writing (SETTER) of private fields
    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public COLOUR getColour(){
        return this.colour;
    }

    public void setColour(COLOUR colour){
        this.colour = colour;
//        colour = _colour;
    }

    public String start() throws InvalidStateException, RanOutOfFuelException {
        if (isStarted == true){
            throw new InvalidStateException();
        }
        else if (this.getGallonsOfFuel() == 0){
            throw new RanOutOfFuelException("Your vehicle (" + this.getMake() + " " + this.getModel() + ") is out of fuel.");
        }
        else {
            isStarted = true;
            return "The " + this.getColour() + " " + this.getMake() + " car has started";
        }
    }
    //    overload the start method
    public String start(String means) throws InvalidStateException, RanOutOfFuelException {
        if (isStarted == true){
            throw new InvalidStateException("Trying to start a vehicle with '" + means + "' is not permitted as the vehicle is already started");
        }
        else if (this.getGallonsOfFuel() == 0){
            throw new RanOutOfFuelException("Your vehicle (" + this.getMake() + " " + this.getModel() + ") is out of fuel.");
        }
        else {
            isStarted = true;
            return "The " + this.getColour() + " car has started using a " + means;
        }
    }

    public String stop() throws InvalidStateException {
        if (isStarted == false){
            throw new InvalidStateException("Trying to stop a vehicle is not permitted as the vehicle is not started");
        }
        else {
            return "The " + this.getColour() + " car has stopped";
        }
    }

    public String concreteInheritedMethod(String thing){
        return "I am a concrete inherited method and my thing is: " + thing;
    }

    public String concreteInheritedOverriddenMethod(String thing){
        return "I am a concrete inherited overridden method and my thing is: " + thing;
    }

//    abstract methods do not contain implementation code
//    a single abstract member means your class must also be abstract
    public abstract String abstractMethod(String thing);
}
