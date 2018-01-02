package com.andben;

public class HealthyBurger extends Burger {
    private Addition avocado;
    private Addition sprouts;

    public HealthyBurger(String meat, double price) {
        super("Rey roll", meat, price);
    }

    public void setAvocado(int avocado) {
        this.avocado = new Addition("Avocado", avocado, 0.75);
        this.pushAddition(this.avocado);
        this.incCounter();
        this.addItem(this.avocado);

    }

    public void setSprouts(int sprouts) {
        this.sprouts = new Addition("Sprouts", sprouts, 0.50);
        this.pushAddition(this.sprouts);
        this.incCounter();
        this.addItem(this.sprouts);
    }
}
