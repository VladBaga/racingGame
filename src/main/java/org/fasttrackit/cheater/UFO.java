package org.fasttrackit.cheater;

import org.fasttrackit.Vehicle;

public class UFO extends Vehicle {

    public double accelerate(double speed, double durationInHours){ //semnatura - actiune - parametrii

        System.out.println("Accelerating as UFO ");

        System.out.println(getName() + " accelerated with " + speed + " km/h " + durationInHours + " hours.");

        double traveledDistance = 2 * speed * durationInHours;

        System.out.println("Traveled distance:" + traveledDistance + " km.");

        return traveledDistance;
    }

    public void concealCheating(){
        System.out.println("I'm not cheating!");
    }

    //Example of co-variant return type
    //Example of extending acces privileges in overridden method
    @Override
    public UFO clone() {
        return new UFO();
    }
}
