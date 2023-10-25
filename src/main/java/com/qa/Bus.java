package com.qa;

public class Bus extends Vehicle{
    public Bus() {
        super("Bojo", "Olympian", COLOUR.Red);
        this.setNumberOfDecks(2);
    }

    public Bus (String make, String model, COLOUR colour, int decks){
        super(make, model, colour);
        this.setNumberOfDecks(decks);
    }

    public String requestStop(){
        return "Driver has received a request to stop at the next bus stop";
    }
    public int getNumberOfDecks() {
        return numberOfDecks;
    }
    public void setNumberOfDecks(int numberOfDecks) {
        this.numberOfDecks = numberOfDecks;
    }
    private int numberOfDecks;

    @Override
    public String concreteInheritedOverriddenMethod(String thing) {
        String base = super.concreteInheritedOverriddenMethod(thing);
        return base + " I am a bus and I overrode this method";

    }

    @Override
    public String abstractMethod(String thing) {
        return "BUS BUS BUS: " + thing;
    }
}
