package com.oop_pa.train;

import java.util.UUID;

public abstract class Train {
    private UUID serial;
    private double cost;

    public Train() {
        this.serial = UUID.randomUUID();

    }

    public double getCost() {
        return cost;
    }

    public abstract double setCost();

    public abstract double calculateIncomingForDays(int days);

}
