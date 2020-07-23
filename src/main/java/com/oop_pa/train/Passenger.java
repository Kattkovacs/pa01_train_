package com.oop_pa.train;

public class Passenger extends Train {

    public final int MIN_PASSENGERS = 115;
    public final int MAX_PASSENGERS = 225;
    public final double TICKET_PRICE = 1.50;
    public final double TICKET_PRICE_ON_TRAIN = 2.00;
    public final int PERCENTAGE_WITHOUT_TICKET = 25;
    public final double FINE = 6.00;
    public final int FINE_CHANCE;
    public final int FINE_PERCENTAGE = 20;

    public Passenger() {
        this.FINE_CHANCE = setFineChance();
    }

    @Override
    public double calculateIncomingForDays(int days) {
        return 0;
    }

    @Override
    public double setCost() {
        return 1000;
    }

    public double calculateFines(int passengerCount){
        if ((int) Math.floor(Math.random()*(100/FINE_CHANCE)) == 0){
            return (passengerCount /100 * FINE_PERCENTAGE)*FINE;
        }
        return 0;
    }

    public int setFineChance(){
        return 10;
    }

    public int getCountOfPassengers(){
        return (int) Math.floor(Math.random()*(MAX_PASSENGERS-MIN_PASSENGERS)+MIN_PASSENGERS+1);
    }
}
