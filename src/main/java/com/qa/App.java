package com.qa;

import com.qa.exceptions.InvalidStateException;
import com.qa.exceptions.RanOutOfFuelException;
import com.qa.timepieces.Clock;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        oopWalkthrough();
//        staticMembers();
//        arrays();
//        generics();

//        methodPractice();

//        interfacePractice();

//        exceptionsPractice();
        try {
            Car c1 = new Car("Range Rover", "Evoque", COLOUR.Grey);
            c1.setGallonsOfFuel(5);
            methodA(c1);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void methodA(Vehicle v) throws InvalidStateException, RanOutOfFuelException {
        try {
            System.out.println(v.start("Key"));
            methodB(v);
        }
        catch(RanOutOfFuelException ex){
            System.out.println(ex.getMessage());
        }
//
//here
}

    private static void methodB(Vehicle v) throws InvalidStateException, RanOutOfFuelException {
//        declare conn var
            try {
//            open a connection
//            from that connection, create a command / cursor
//            execute that command
//            consume the results
            System.out.println(v.start());
//            !!!!Exception


        }
//        catch(InvalidStateException ex){
//            System.out.println(ex.getMessage());
//        }
        finally {
                //            release objects
//                check the status of the connection
//            connection.close()

            System.out.println("This is for tidying things up");
        }

    }
    private static void charles(){
//        Car charlesCar= new Car();
//        try {
//            charlesCar.start();
//        }
//        catch   (InvalidStateException x){
//
//        }
    }
    private static void exceptionsPractice() {
//        Car c1 = new Car("Range Rover", "Evoque", COLOUR.Grey);
//        Car c2 = new Car("Cupra", "Formentor", COLOUR.White);
//        List<Car> cars = new ArrayList<>();
//        cars.add(c1);
//        cars.add(c2);
//
//        try{
//            for (Car c : cars)
//            {
//                System.out.println(c.start());
//            }
//        }
//        catch (InvalidStateException ex){
//            System.out.println(ex.getMessage());
//        }
//
//        try {
//            System.out.println(c1.stop());
//            System.out.println(c2.start());
////            line 3
////            line 4
//        }
////        catch(InvalidStateException ex){
////            System.out.println("Custom exception was caught");
////        }
//        catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
//        finally {
//            System.out.println("This code always runs.");
//        }
//
//        try {
//            System.out.println(c2.stop());
//            System.out.println(c1.start("key"));
//        }
//        catch (Exception ex){
//            System.out.println(ex.getMessage());
//        }
//        finally {
//            System.out.println("This code always runs.");
//        }
    }

    public static void interfacePractice(){
        Car c1 = new Car("Range Rover", "Evoque", COLOUR.Grey);
        Car c2 = new Car("Cupra", "Formentor", COLOUR.White);
        Clock digitalClock = new Clock();

//        uses 'double brace initialization' (anonymous inner class)
//        A subclass of ArrayList which has an instance initializer, and that
//        class is created just to create one object
//        Vehicle aBus = new Bus();
//
//        List<Car> cars = new ArrayList<>();
//        cars.add(c1);
//        cars.add(c2);

        List<Alarmable> alarmsToSet = new ArrayList<>(){
            {add(c1); add(c2); add(digitalClock);}
        };
        setAlarms(alarmsToSet);
        pauseAlarms(alarmsToSet);
        setAlarmsOff(alarmsToSet);
    }

    public static void setAlarms(List<Alarmable> alarms){
        for(Alarmable a : alarms){
            System.out.println(a.turnAlarmOn());
        }
    }

    public static void pauseAlarms(List<Alarmable> alarms){
        for(Alarmable a : alarms){
            System.out.println(a.snoozeAlarm());
        }
    }

    public static void setAlarmsOff(List<Alarmable> alarms){
        for(Alarmable a : alarms){
            System.out.println(a.turnAlarmOff());
        }
    }

    public static void methodPractice() {
        Bus redBus = new Bus();
        System.out.println(redBus.getColour());
        redBus.setColour(COLOUR.Red);
        System.out.println(redBus.getColour());
        System.out.println(redBus.requestStop());
        redBus.setNumberOfDecks(2);
        System.out.println(redBus);
        System.out.println("Make is " + redBus.getMake());

        String message = redBus.concreteInheritedMethod("banana");
        System.out.println(message);

        System.out.println(redBus.concreteInheritedOverriddenMethod("plum"));

//        Vehicle v = new Vehicle();
//        System.out.println(v);

        System.out.println(redBus.abstractMethod("Satsuma"));
        Car c1 = new Car();
        Car c2 = new Car();
        System.out.println(c1.abstractMethod("Grapes"));
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);

        for (Car c : cars) {

        }

        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(c1);
        vehicles.add(redBus);
        vehicles.add(c2);

        Vehicle blueBus = new Bus();
        blueBus.setColour(COLOUR.Blue);

        if (blueBus instanceof Bus) {
            Bus actualBlueBus = (Bus) blueBus;
            actualBlueBus.setNumberOfDecks(1);
        }

        System.out.println("#######################################################");
//        polymorphism!!!!
        for (Vehicle v : vehicles) {
            System.out.println(v);
            System.out.println(v.concreteInheritedMethod("apple"));
            System.out.println(v.concreteInheritedOverriddenMethod("overridden pear"));
            System.out.println(v.abstractMethod("abstract melon"));
            washVehicle(v);
        }

    }
        public static void washVehicle(Vehicle dirtyVehicle){
            System.out.println(dirtyVehicle.abstractMethod("Soap"));
        }


    private static void oopWalkthrough() {
        // instantiate some car objects
        Car sheilasCar;
        sheilasCar = new Car();
        String makeOfSheilasCar = sheilasCar.getMake();
        System.out.println("The make of Sheila's car is: " + makeOfSheilasCar);
        System.out.println("The model of Sheila's car is: " + sheilasCar.getModel());
        System.out.println("Sheila's car is " + sheilasCar.getColour());

        Car gracesCar = new Car();
        System.out.println("Grace: " + gracesCar.getMake() + " " + gracesCar.getModel());
        System.out.println("Grace's car is " + gracesCar.getColour());
        sheilasCar.setAge(2);
        gracesCar.setAge(96);
        System.out.println("Sheila's car is " + sheilasCar.getAge() + " years old");
        System.out.println("Grace's car is " + gracesCar.getAge() + " years old");
        sheilasCar.setColour(COLOUR.Blue);
        gracesCar.setColour(COLOUR.Red);
        System.out.println("Sheila's car is " + sheilasCar.getColour());
        System.out.println("Grace's car is " + gracesCar.getColour());

        System.out.println(sheilasCar.toString());
        System.out.println(gracesCar.toString());
        System.out.println(gracesCar);

        String greeting = "Hello World";
//        String message =

        int x = 5;
        int y = 12;
//
//        System.out.println(x == y);
        String result = String.format("X: %d and Y: %d are the same: %b", x, y, x == y);
        System.out.println(result);
//
        y = 5;
        result = String.format("X: %d and: Y %d are the same: %b", x, y, x == y);
        System.out.println(result);

        int z = x;
//
        result = String.format("X: %d and Z: %d are the same: %b", x, z, x == z);
        System.out.println(result);
        System.out.println("X:" + x);
        System.out.println("Z:" + z);
        z++;
        System.out.println("X:" + x);
        System.out.println("Z:" + z);
//
        Car extraCar = gracesCar;
        System.out.println(gracesCar == extraCar);
        System.out.println(gracesCar);
        System.out.println(extraCar);
        gracesCar.setColour(COLOUR.White);
        System.out.println(gracesCar);
        System.out.println(extraCar);

//        sheilasCar = null;
//        System.out.println(sheilasCar.getMake());
//try {
//    System.out.println(sheilasCar.start());
//    System.out.println(gracesCar.stop());
//
////        method overloading
//    String started = gracesCar.start();
//    String startedAgain = gracesCar.start("Retina scan");
//    System.out.println(started);
//    System.out.println(startedAgain);
//
//    Car evelynsCar = new Car("Mini", "Cooper", COLOUR.Blue);
//    System.out.println(evelynsCar);
//    Car billsCar = new Car("Austin", "Allegro");
//    System.out.println(billsCar);
//}
//catch (InvalidStateException ex){
//    System.out.println(ex.getMessage() + " was handled");
//}
    }

    public static void staticMembers(){
        Car bertCar = new Car("Kia", "Sportage", COLOUR.White);
        Car ernieCar = new Car("Kia", "Sportage", COLOUR.White);
        bertCar.setRegNumber("Bert123");
        ernieCar.setRegNumber("Sesame99");
        System.out.println("Car tax is currently: " + Car.getCarTax());

        Car.setCarTax(195.00);
        System.out.println("Car tax is now: " + Car.getCarTax());

        String sameCar = Car.compare(bertCar, ernieCar)? "is " : "is not";
        System.out.println("Bert's car " + sameCar + " the same car as Ernie's");

        double carPrice = 14500;
        double priceIncludingVat = (carPrice * (100 + Car.VAT)/ 100);
        System.out.println("Price including VAT is: £" + Math.round(priceIncludingVat));
        System.out.println(String.format("Price including VAT is: £%,.2f", priceIncludingVat));

}

    public static void arrays(){

        int[] luckyNumbers = new int[4];

//        indexing or subscript notation
        luckyNumbers[0] = 7;
        luckyNumbers[1] = 13;
        luckyNumbers[2] = 21;
        luckyNumbers[3] = 1;

//        'for' loop
        for (int i = 0; i < luckyNumbers.length; i++){
            System.out.println(luckyNumbers[i]);
        }
//      'for each' loop: 'enhanced for loop'
        for (int number : luckyNumbers) {
            System.out.println(number);
        }

        String[] food = new String[3];
        food[0] = "Chicken";
        food[1] = "Kebabs";
        food[2] = "Spag Bol";
//        food[3] = "Sushi";

        for (String item : food){
            System.out.println(item);
        }

        Car[] muppetcars = new Car[2];
        Car kermitCar = new Car();
        Car missPiggyCar = new Car();
        muppetcars[0] = kermitCar;
        muppetcars[1] = missPiggyCar;
        Car[] muppets = {missPiggyCar, kermitCar};

//        object initialiser
        Car[] cars = {new Car(), new Car("Nissan", "Qashqai"),
                new Car("Vauxall", "Corsa", COLOUR.Red)};

//        try {
//            for (Car c : cars) {
//                c.setAge(2);
//                System.out.println(c.start());
//                System.out.println(c);
//            }
//        }
//        catch (InvalidStateException ex){
//            System.out.println(ex.toString());
//        }

        Car someCar = cars[2];
        System.out.println(someCar.getColour());
    }

    public static void generics(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car("BMW", "5-series", COLOUR.Red));
        cars.get(0).setAge(1);
        cars.get(1).setRegNumber("Speedy5");

//        try {
//            for (Car c : cars) {
//                System.out.println(c);
//                System.out.println(c.start());
//                System.out.println(c.stop());
//            }
//        }
//        catch (InvalidStateException ex){
//            System.out.println("Houston, we have a problem");
//        }

    }
}
