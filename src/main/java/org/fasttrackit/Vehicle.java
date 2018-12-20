package org.fasttrackit;


public class Vehicle {

    private String name;
    private String color;
    private double mileage;
// public - toate clasele, private - doar clasa respectiva, protected - toate clasele din pachet sau subclase
//    public void    - nu returneaza nimic

    public double accelerate(double speed, double durationInHours){ //semnatura - actiune - parametrii

        System.out.println(name + " accelerated with " + speed + " km/h " + durationInHours + " hours.");

        double traveledDistance = speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance + " km.");

      return traveledDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
}