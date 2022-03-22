package com.company;

public class Owner {
    private String nrtel;
    private int budget;

    public Owner(String nrtel, int budget)
    {
        this.nrtel=nrtel;
        this.budget=budget;
    }
    public String getNrtel()
    {
        return nrtel;
    }

    public void setNrtel(String nrtel) {
        this.nrtel = nrtel;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
