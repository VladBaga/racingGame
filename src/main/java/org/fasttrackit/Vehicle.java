package org.fasttrackit;


public class Vehicle {

    String name;
    String color;
    double mileage;
// public - toate clasele, private - doar clasa respectiva, protected - toate clasele din pachet sau subclase
//    public void    - nu returneaza nimic

    public double accelerate(double speed, double durationInHours){ //semnatura - actiune - parametrii

        System.out.println(name + " accelerated with " + speed + " km/h " + durationInHours + " hours.");

        double traveledDistance = speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance + " km.");

      return traveledDistance;
    }

}