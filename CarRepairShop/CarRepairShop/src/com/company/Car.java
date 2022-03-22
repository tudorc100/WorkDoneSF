package com.company;

public class Car {
    private String plate;
    private Owner owner;
    private String state;

    public Car(String plate,Owner owner,String state)
    {
        this.plate=plate;
        this.owner=owner;
        this.state=state;
    }
    public String getPlate()
    {
        return plate;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getState() {
        return state;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void diagnose(Car car)
    {
        car.setState("Diagnosticat");
    }
    public void repair(Car car)
    {
        car.setState("Reparat");
    }

}
