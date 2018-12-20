package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car.color = "white";
        car.doorcount = 4;
        car.mileage = 7.5;
        car.running = true;

        double carTravelDistance = car.accelerate(100, 2);



        System.out.println("Hello!");
        System.out.println(car.toString());

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        engine.expiryDate = LocalDateTime.now().plusYears(10); //expira in 10 ani de acum

        car.engine = engine;

        car.engine.manufacturer = "BMW";

//        engine = null;

        car.engine = new Engine();
    }
}
