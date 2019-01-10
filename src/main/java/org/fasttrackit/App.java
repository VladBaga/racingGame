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

// Engine engine = new Engine();
// engine.manufacturer = "Renault";
// engine.capacity = 1500;
// engine.expiryDate = LocalDateTime.now().plusYears(10); //expira in 10 ani de acum

// Car car = new Car(engine);
// car.setName("Dacia");
// car.setColor("White");
// car.doorcount = 4;
// car.setMileage(7.5);
// car.running = true;

// System.out.println(car.getName());

// double carTravelDistance = car.accelerate(100, 2);



// System.out.println("Hello!");
// System.out.println(car.toString());


// car.engine.manufacturer = "BMW";

//   engine = null;

// car.engine = new Engine()

        //Example of static variables unique for the whole application
        Vehicle vehicle1 = new Vehicle();
        vehicle1.vehicleCount++;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.vehicleCount = 2;

        Vehicle.vehicleCount = 3;

        System.out.println("Value from vehicle 1:  " + vehicle1.vehicleCount);
        System.out.println("Value from vehicle 2:  " + vehicle1.vehicleCount);
        System.out.println("Value from vehicle class:  " + vehicle1.vehicleCount);
    }
}
