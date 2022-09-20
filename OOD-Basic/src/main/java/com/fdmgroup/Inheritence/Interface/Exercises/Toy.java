package com.fdmgroup.Inheritence.Interface.Exercises;

public class Toy implements BasketItem{

    private int minAge;

    private int maxAge;

    private double price;

    private String name;

    public Toy(int minAge, int maxAge, double price, String name) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.price = price;
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }


}
