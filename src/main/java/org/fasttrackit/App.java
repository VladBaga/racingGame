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
        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        engine.expiryDate = LocalDateTime.now().plusYears(10); //expira in 10 ani de acum

        Car car = new Car(engine);
        car.setName("Dacia");
        car.setColor("White");
        car.doorcount = 4;
        car.setMileage(7.5);
        car.running = true;

        System.out.println(car.getName());

        double carTravelDistance = car.accelerate(100, 2);



        System.out.println("Hello!");
        System.out.println(car.toString());


        car.engine.manufacturer = "BMW";

//        engine = null;

        car.engine = new Engine();
    }
}
