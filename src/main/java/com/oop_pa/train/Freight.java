package com.oop_pa.train;

public class Freight extends Train {

    public final double REVENUE = 550;
    public final double REVENUE_ABROAD = 110;
    public final int ABROAD_CHANCE = 35;

    @Override
    public double calculateIncomingForDays(int days) {
        return 0;
    }

    @Override
    public double setCost() {
        return 1000;
    }
}
