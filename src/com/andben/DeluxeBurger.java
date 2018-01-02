package com.andben;

public class DeluxeBurger extends Burger {
    private Addition chips;
    private Addition soda;

    public DeluxeBurger(String typeOfRoll, String meat, double price) {
        super(typeOfRoll, meat, price);
        this.chips = new Addition("Chips", 1, 0);
        this.pushAddition(this.chips);
        this.incCounter();
        this.soda = new Addition("Soda", 1, 0);
        this.pushAddition(this.soda);
        this.incCounter();
    }

    @Override
    public void setLettuce(int lettuce) {
        System.out.println("Not able to add to this burger");
    }

    @Override
    public void setTomato(int tomato) {
        System.out.println("Not able to add to this burger");
    }

    @Override
    public void setOnions(int onions) {
        System.out.println("Not able to add to this burger");
    }

    @Override
    public void setPickle(int pickle) {
        System.out.println("Not able to add to this burger");
    }

}
