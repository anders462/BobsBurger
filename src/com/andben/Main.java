package com.andben;

public class Main {

    public static void main(String[] args) {

        Burger myBurger = new Burger("kaiser", "beef", 10.00);

        myBurger.setLettuce(2);
        myBurger.setTomato(1);


        System.out.println("Base:  1 per unit " + myBurger.getPrice() + " dollars");
        for (int i = 0; i < myBurger.getCounter(); i++) {
            System.out.println("You added " + myBurger.getAddition()[i].getCount()
                    + " " + myBurger.getAddition()[i].getName() +
                    " unit price of " + myBurger.getAddition()[i].getPrice() + " dollars");
        }
        System.out.println("----------------------------------");
        System.out.println("Total: " + myBurger.getTotal() + " dollars\n");



        HealthyBurger myHealthyBurger = new HealthyBurger("Turkey", 4.00);
        myHealthyBurger.setAvocado(1);
        myHealthyBurger.setSprouts(2);


        System.out.println("Base:  1 per unit " + myHealthyBurger.getPrice() + " dollars");
        for (int i = 0; i < myHealthyBurger.getCounter(); i++) {
                System.out.println("You added " + myHealthyBurger.getAddition()[i].getCount()
                        + " " + myHealthyBurger.getAddition()[i].getName() +
                        " unit price of " + myHealthyBurger.getAddition()[i].getPrice() + " dollars");
        }
        System.out.println("----------------------------------");
        System.out.println("Total: " + myHealthyBurger.getTotal() + " dollars\n");


        DeluxeBurger myDeluxeBurger = new DeluxeBurger("Brioche", "Kobe", 6.00);
        myDeluxeBurger.setOnions(10);
        myDeluxeBurger.setLettuce(10);


        System.out.println("Base:  1 per unit " + myDeluxeBurger.getPrice() + " dollars");
        for (int i = 0; i < myDeluxeBurger.getCounter(); i++) {
            System.out.println("You added " + myDeluxeBurger.getAddition()[i].getCount()
                    + " " + myDeluxeBurger.getAddition()[i].getName() +
                    " unit price of " + myDeluxeBurger.getAddition()[i].getPrice() + " dollars");
        }
        System.out.println("----------------------------------");
        System.out.println("Total: " + myDeluxeBurger.getTotal() + " dollars\n");


    }
}
