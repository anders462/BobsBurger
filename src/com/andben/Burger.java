package com.andben;

public class Burger {
    private String typeOfRoll;
    private String meat;
    private double price;
    private double total;
    private Addition lettuce;
    private Addition tomato;
    private Addition onions;
    private Addition pickle;
    private Addition[] addition = new Addition[10];
    private int counter = 0;

    public Burger(String typeOfRoll, String meat, double price) {
        this.typeOfRoll = typeOfRoll;
        this.meat = meat;
        this.price = price;
        this.total += price;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return total;
    }


    public int getCounter() {
        return counter;
    }

    public Addition[] getAddition() {
        return addition;
    }


    public void incCounter() {
        this.counter += 1;
    }

    public void pushAddition(Addition addition) {
        if (this.counter < 10) {
            this.addition[this.counter] = addition;
        } else {
            System.out.println("Sorry, a maximum of 10 Additions can be added");
        }
    }

    public void setLettuce(int lettuce) {
        this.lettuce = new Addition("Lettuce", lettuce, 0.50);
        this.addition[counter] = this.lettuce;
        counter++;
        this.addItem(this.lettuce);
    }

    public void setTomato(int tomato) {
        this.tomato = new Addition("Tomato", tomato, 0.30);
        this.addition[counter] = this.tomato;
        counter++;
        this.addItem(this.tomato);

    }

    public void setOnions(int onions) {
        this.onions = new Addition("Onions", onions, 0.10);
        this.addition[counter] = this.onions;
        counter++;
        this.addItem(this.onions);
    }

    public void setPickle(int pickle) {
        this.pickle = new Addition("Pickle", pickle, 0.50);
        this.addition[counter] = this.pickle;
        counter++;
        this.addItem(this.pickle);

    }

    public void addItem(Addition item) {
        this.total += item.getCount() * item.getPrice();
    }
}


