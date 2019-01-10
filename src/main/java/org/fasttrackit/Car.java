package org.fasttrackit;

public class Car extends AutoVehicle {

    int doorcount;

    public Car(Engine engine) {
        super(engine);
    }

    public Car() {
        super();
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorcount=" + doorcount +
                '}';
    }
}
