package com.oop.abstractpkg;

public abstract class Vehicle {
    private String color;
    int maxSpeed;

    public Vehicle(){
        color="red";
        System.out.println("Vehicle's construtor");
        maxSpeed=60;
    }

    public Vehicle(int maxSpeed){
        color="red";
        System.out.println("Vehicle's construtor");
        this.maxSpeed=maxSpeed;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public abstract boolean isMotorized();
    public abstract String getCompany();
}
