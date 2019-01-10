package org.fasttrackit;


public class Vehicle {

    public static int vehicleCount; //daca adaugat o constanta "final" inainte de int, ii stabilim o valorea finala
    //conventia este sa se scrie cu snake-case intotdeauna numele unei constante "SNAKE_CASE".

    private String name;
    private String color;
    private double mileage;
// public - toate clasele, private - doar clasa respectiva, protected - toate clasele din pachet sau subclase
//    public void    - nu returneaza nimic


    public Vehicle() {
        vehicleCount++;
    }

    public double accelerate(double speed, double durationInHours){ //semnatura - actiune - parametrii

        System.out.println(name + " accelerated with " + speed + " km/h " + durationInHours + " hours.");

        double traveledDistance = speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance + " km.");

      return traveledDistance;
    }

  // public double accelerate(double speed){
  //     System.out.println(name + " accelerated with " + speed + " km/h for" + 1 + " hours ");
  //     double traveledDistance = speed * 1;
  //     System.out.println(" Traveled distance: " + traveledDistance + " km.");
  //     return traveledDistance;
   // }
    public double accelerate (double speed){
        return accelerate(speed, 1);
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

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}