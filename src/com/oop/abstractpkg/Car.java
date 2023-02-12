package com.oop.abstractpkg;

public abstract class Car extends Vehicle{
    int numDoors;
    int numGears;

    public Car(){
        //super(100);
        System.out.println("Car's constructor");
        //numDoors=4;
        numGears=5;
    }

    public Car(int numDoors, int maxSpeed){
        super(maxSpeed);
        System.out.println("Car's constructor");
        this.numDoors=numDoors;
    }

    public void printMaxSpeed(){
        maxSpeed=150;
        System.out.println(maxSpeed);
    }

    @Override
    public boolean isMotorized() {
        return true;
    }


}
