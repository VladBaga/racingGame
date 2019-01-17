package org.fasttrackit;


public class Vehicle {

    public static int vehicleCount; //daca adaugat o constanta "final" inainte de int, ii stabilim o valorea finala
    //conventia este sa se scrie cu snake-case intotdeauna numele unei constante "SNAKE_CASE".

    private String name;
    private String color;
    private double mileage;
    private double fuelLevel;
    private double totalTraveledDistance;
// public - toate clasele, private - doar clasa respectiva, protected - toate clasele din pachet sau subclase
//    public void    - nu returneaza nimic


    public Vehicle() {
        vehicleCount++;
    }

    public double accelerate(double speed, double durationInHours) { //semnatura - actiune - parametrii

        System.out.println(name + " accelerated with " + speed + " km/h " + durationInHours + " hours.");

        double traveledDistance = speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance + " km.");

//        totalTraveledDistance = totalTraveledDistance + traveledDistance;
        totalTraveledDistance += traveledDistance; //prescurtare pentru afirmatia de mai sus

        System.out.println("Total traveled distance : " + totalTraveledDistance);

        double spentFuel = traveledDistance * mileage / 100;
        fuelLevel -= spentFuel;
        System.out.println("Remaining fuel : " + fuelLevel);

        return traveledDistance;
    }


    // public double accelerate(double speed){
    //     System.out.println(name + " accelerated with " + speed + " km/h for" + 1 + " hours ");
    //     double traveledDistance = speed * 1;
    //     System.out.println(" Traveled distance: " + traveledDistance + " km.");
    //     return traveledDistance;
    // }
    public double accelerate(double speed) {
        return accelerate(speed, 1);
    }

    protected Vehicle clone() {
        Vehicle vehicle = new Vehicle();
        //copy properties from current object or simply call this.clone();
        return vehicle;
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

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTotalTraveledDistance() {
        return totalTraveledDistance;
    }

    public void setTotalTraveledDistance(double totalTraveledDistance) {
        this.totalTraveledDistance = totalTraveledDistance;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}