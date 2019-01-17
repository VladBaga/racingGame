package org.fasttrackit;

import org.fasttrackit.cheater.UFO;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Game game = new Game();
        game.start();

//        System.out.println(args[0]);
//        System.out.println(args[1]);
//      Engine engine = new Engine();
//      engine.manufacturer = "Renault";
//      engine.capacity = 1500;
//      engine.expiryDate = LocalDateTime.now().plusYears(10); //expira in 10 ani de acum

//      Car car = new Car(engine);
//      car.setName("Dacia");
//      car.setColor("White");
//      car.doorcount = 4;
//      car.setMileage(7.5);
//      car.running = true;

// System.out.println(car.getName());

// double carTravelDistance = car.accelerate(100, 2);


// System.out.println("Hello!");
// System.out.println(car.toString());


// car.engine.manufacturer = "BMW";

//   engine = null;

// car.engine = new Engine()

//      //Example of static variables unique for the whole application
//      Vehicle vehicle1 = new Vehicle();
//      vehicle1.vehicleCount++;

//      Vehicle vehicle2 = new Vehicle();
//      vehicle2.vehicleCount = 2;

//      Vehicle.vehicleCount = 3;

//      System.out.println("Value from vehicle 1:  " + vehicle1.vehicleCount);
//      System.out.println("Value from vehicle 2:  " + vehicle1.vehicleCount);
//      System.out.println("Value from vehicle class:  " + vehicle1.vehicleCount);

//      new AutoVehicle();
//      new AutoVehicle(new Engine());

//      vehicle1.accelerate(100);//am apelat o metoda din Vehicle, constructor overloading
//      vehicle2.accelerate(130, 0.8);

//      new UFO().accelerate(130, 0.8);

//      System.out.println(car);

//      //Polymorphism (an object can take multiple forms)
//      Vehicle ufo = new UFO();
//      //The type of the variable does NOT determine the object's behavior
//      ufo.accelerate(200,2);

//      //The type of the variable determines what methods can invoked
//      //We might need type casting (see below)
//      ((UFO) ufo).concealCheating();
    }
}
