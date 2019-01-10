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
}
