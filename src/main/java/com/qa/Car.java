package com.qa;

public class Car extends Vehicle implements Alarmable{
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    private int numberOfDoors;


    public static double getCarTax() {
        return carTax;
    }

    public static void setCarTax(double carTax) {
        Car.carTax = carTax;

    }

    //    class variables belong to a class and are common to all instances of that class
    private static double carTax = 180.00;

    public static final double VAT = 20.00;

//    class methods are shared by all instances of a class
//    typically used to manipulate class variables

//    static methods can only access instance methods they know about
    public static boolean compare(Car c1 , Car c2){
        return c1.getRegNumber().equals(c2.getRegNumber());
    }

//    CONSTRUCTOR
//    parameterless constructor
    public Car(){
        this("Ford", "Focus", COLOUR.Black);
//        this.make = "Ford";
//        this.model = "Focus";
//        this.colour = COLOUR.Black;
    }

    public Car(String make, String model, COLOUR colour){
        super(make,model, colour);
//        this.make= make;
//        this.model = model;
//        this.colour = colour;
    }

    @Override
    public String abstractMethod(String thing) {
        return "I am a car and this is an abstract method that I have overridden: " + thing;
    }

    public Car(String make, String model){
//        constructor chaining
        this(make, model, COLOUR.Black);
//        this.make = make;
//        this.model = model;
//        this.colour = COLOUR.Black;
    }

//    OVERLOADING -     methods

//    what is this class for?
//    how will it be used
//    DESIGN
//    create a good abstraction of a car
//    encapsulation
//    hide stuff / show stuff -> access modifiers
//    hide more stuff -> loose coupling
//    DATA & BEHAVIOUR
//    DATA
//    fields aka instance variables




//    public Car(COLOUR colour, int age) {
//        this.colour = colour;
//        this.age = age;
//    }
//    create a getter and setter for age and ensure the age is between 0 and 70


    @Override
    public String toString() {
//        return "Car make: " + this.make + " Car model: " + this.model + " Age: " + this.age + " Colour: " + this.colour;
//        StringBuilder
//        String.format()

        String output = String.format("This car is a %s %s and is %d years old and is %s in colour",this.getMake(), this.getModel(), this.getAge(), this.getColour().toString().toLowerCase());
        return output;
    }

    @Override
    public String turnAlarmOn() {
        return "Car " + this.getColour() + " " + this.getMake() + " has been alarmed";
    }
    @Override
    public String turnAlarmOff() {
        return "Car " + this.getColour() + " " + this.getMake() + " alarm has been turned off";
    }
    @Override
    public String snoozeAlarm() {
//        return Alarmable.super.snoozeAlarm();
        return "Car alarm (" + this.getMake() + " " + this.getModel() + ") has been paused";
    }

//    BEHAVIOURAL METHODS


}
