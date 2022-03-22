package com.company;

import java.util.ArrayList;

public class Yard {
    private int nrCars;
    private ArrayList<Car> cars= new ArrayList<>();

    public Yard(int nrCars) {
        this.nrCars = nrCars;
    }
    public int getNrCars() {
        return nrCars;
    }

    public void setNrCars(int nrCars) {
        this.nrCars = nrCars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

}
