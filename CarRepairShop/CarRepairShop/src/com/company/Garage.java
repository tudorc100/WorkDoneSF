package com.company;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Car> cars= new ArrayList<>();
    private int money;
    private int nrcars;

    public Garage(int money, int nrcars)
    {
        this.money=money;
        this.nrcars=nrcars;
    }
    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNrcars() {
        return nrcars;
    }

    public void setNrcars(int nrcars) {
        this.nrcars = nrcars;
    }


}
